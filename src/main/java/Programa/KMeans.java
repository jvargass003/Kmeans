/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programa;
import Programa.Punto;
import Programa.Clase;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.copy;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author jessi
 */
public class KMeans extends Interfaz{
    ArrayList<Punto> centroidesActuales = new ArrayList<Punto>();

    ArrayList<Clase> clases = new ArrayList<Clase>(); 
    Random random = new Random();
    int k,ite;


    public KMeans(ArrayList<Punto> puntos,int k,ArrayList<Punto> atractores,Graphics g,JLabel area){
        this.k = k;
        boolean diferentes = true;
        centroidesActuales.addAll(atractores);
        //Se crean las clases y a cada una de ella se le asigna un color distintos
        for(int n=0;n<k;n++){
            //Se almacena en un lista de clases 
            clases.add(new Clase());
            clases.get(n).setColor(asignarColor());
        }
        int r = 0;
        try {
        while(diferentes){
            r++;
            ArrayList<Punto> centroidesAnteriores = new ArrayList<Punto>();
            System.out.print("\nNumero de iteracion"+r+"\n");
            //Realizamos un recorrido de todos los puntos, de tal manera que que asignen a una clase
            for(int u=0;u<k;u++){
                area.setToolTipText("\nCentroide de clase "+u+": ["+centroidesActuales.get(u).getCoordenada()[0]+","+centroidesActuales.get(u).getCoordenada()[1]+"]");
                g.setColor(Color.white);
                g.drawRect(centroidesActuales.get(u).getCoordenada()[0], centroidesActuales.get(u).getCoordenada()[1], 6, 6);
            }
            for(int i=0;i<puntos.size();i++){
                ArrayList<Float> distancias = new ArrayList<Float>();
                //Se mide la distancia a cada uno de los puntos atractores
                for(int m = 0;m<k;m++){
                    distancias = calcularDistancias(puntos.get(i).getCoordenada(),centroidesActuales);
                }
                //Se obtine la distancia más pequeña y el indice en donde se encuentra
                int indx = obtenerIndiceMin(distancias);
                //El punto es asignada a la clase con el indice encontrado
                clases.get(indx).agregarPunto(puntos.get(i));
                //Se grafican las coordenadas, se obtiene el color que tomara el punto 
                int coordenada[] = puntos.get(i).getCoordenada();
                g.setColor(clases.get(indx).getColor());
                g.drawRect(coordenada[0], coordenada[1], 3, 3);
            }
            g.setColor(Color.black);
            g.drawLine((ancho/2)+x,y,(ancho/2)+x,y+largo);
            g.drawLine(x,y+(largo/2),ancho+x,y+(largo/2));
            
            //Se almanecena actuales centroides en los anteriores
            centroidesAnteriores.addAll(centroidesActuales);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
            //Se eliminan los centroides actuales
           centroidesActuales.clear();
            //Calculamos los nuevos centroides
            for(int c=0;c<k;c++){
                Punto centro = new Punto();
                //Se calcula el centroide
                //En caso que la clase no contenga individuos se toman las coordenadas del centroide Anterior 
                if(clases.get(c).calcularCentroide()==null) centro.setCoordenada(centroidesAnteriores.get(c).getCoordenada());
                //Si contiene puntos la clase entonces se calcula el centroide
                else centro.setCoordenada(clases.get(c).calcularCentroide());
                //Se agregan los nuevos centroides
                centroidesActuales.add(c,centro);
                //Se deben visualizar los nuevos cetroides, se grafican
                g.setColor(Color.RED);
                g.drawRect(centro.getCoordenada()[0], centro.getCoordenada()[1], 6, 6);
            }
            //Relizamos una comparación para saber si los centroides actuales son iguales a los anteriores 
            for(int a=0;a<k;a++){
                System.out.print("\nCentroides anteriores: "+a+ "["+centroidesAnteriores.get(a).getCoordenada()[0]+","+centroidesAnteriores.get(a).getCoordenada()[1]+"]");
                System.out.print("\nCentroides actuales:  "+a+ "["+centroidesActuales.get(a).getCoordenada()[0]+","+centroidesActuales.get(a).getCoordenada()[1]+"]");
                System.out.print("\n");
                //Si las coordenadas son iguales quiere decir que tendrá que ser falso y tendrá que salir del ciclo  
                if(centroidesAnteriores.get(a).getCoordenada()[0] == centroidesActuales.get(a).getCoordenada()[0] && centroidesAnteriores.get(a).getCoordenada()[1] == centroidesActuales.get(a).getCoordenada()[1]) diferentes = false;
                else diferentes = true;
            }
            Thread.sleep(10);
        }
        }catch(Exception e) {
        
        
        }
        
        area.setText(("Numero iteraciones: " + r));
    }
    
    
    
    public void asignarClase(Punto pt){
        
    }
    
    public int obtenerIndiceMin(ArrayList distancias){
        return  distancias.indexOf(Collections.min(distancias));
    
    }
    
    public Color asignarColor(){
        Color colorNuevo = new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255));
        return colorNuevo;
    }

    public ArrayList calcularDistancias(int[] punto, ArrayList<Punto> atractores){
        ArrayList<Float> distancias = new ArrayList<Float>();
        for(int i=0;i<k;i++){
            float x = (float) Math.pow((atractores.get(i).getCoordenada()[0]-punto[0]), 2);
            float y = (float) Math.pow((atractores.get(i).getCoordenada()[1]-punto[1]), 2);
            float dis = (float) Math.sqrt(x+y);
            distancias.add(dis);
            
        }
        
        return distancias;
    }
    
    
}
