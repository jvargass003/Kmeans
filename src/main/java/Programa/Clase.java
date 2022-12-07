/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programa;
import Programa.Punto;
import java.awt.Color;
import java.util.ArrayList;
/**
 *
 * @author jessi
 */
public class Clase {
    ArrayList<Punto> puntos = new ArrayList<Punto>();
    Color color;
    public Clase(){

    }
    
    public void agregarPunto(Punto pt){
        puntos.add(pt);
    }
    public ArrayList getPuntos(){
        return puntos;
    }

    public void setColor(Color color){
        this.color = color;
    
    }
    public Color getColor(){
        return color;
    }
    
    public int[] calcularCentroide(){
       
        int nuevas []=new int[2];
        int sumaX=0, sumaY=0;
        for(int i=0;i<puntos.size();i++){
            sumaX = (int) puntos.get(i).getCoordenada()[0]+sumaX;
            sumaY = (int) puntos.get(i).getCoordenada()[1]+sumaY;
        }
        if(sumaX!=0 && sumaY!=0){
            
            nuevas[0] = (int) (sumaX/puntos.size());
            nuevas[1] = (int) (sumaY/puntos.size());
        }
        else nuevas =null;
            
        return nuevas;
    }
    
    
    
    
}
