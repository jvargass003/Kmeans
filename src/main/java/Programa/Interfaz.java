/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Programa;

import javax.swing.JOptionPane;
import Programa.Punto;
import Programa.KMeans;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JTextArea;
/**
 *
 * @author jessi
 */
public class Interfaz extends javax.swing.JFrame implements MouseListener {
        ArrayList<Punto> puntos = new ArrayList<Punto>();
        ArrayList<Punto> atractores = new ArrayList<Punto>();
        Random ramdon = new Random();
        int size,x,y,ancho,largo,clases,click;
        
       
 
    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
        textClases.setEnabled(false);
        btnSeleccionarClases.setEnabled(false);
        btnClasificar.setEnabled(false);
        x = panelGrafica.getX();
        y = panelGrafica.getY();
        ancho = (int) panelGrafica.getSize().getWidth();
        largo = (int) panelGrafica.getSize().getHeight();
        
        
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGrafica = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();
        labelPuntos = new javax.swing.JLabel();
        textPuntos = new javax.swing.JTextField();
        btnGeneraPuntos = new javax.swing.JButton();
        labelClases = new javax.swing.JLabel();
        textClases = new javax.swing.JTextField();
        btnClasificar = new javax.swing.JButton();
        btnSeleccionarClases = new javax.swing.JButton();
        iteraciones = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        panelGrafica.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelGraficaLayout = new javax.swing.GroupLayout(panelGrafica);
        panelGrafica.setLayout(panelGraficaLayout);
        panelGraficaLayout.setHorizontalGroup(
            panelGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1032, Short.MAX_VALUE)
        );
        panelGraficaLayout.setVerticalGroup(
            panelGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnReiniciar.setText("REINICIAR");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        labelPuntos.setText("NO. PUNTOS ");

        textPuntos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textPuntosKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textPuntosKeyTyped(evt);
            }
        });

        btnGeneraPuntos.setText("GENERAR PUNTOS");
        btnGeneraPuntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeneraPuntosActionPerformed(evt);
            }
        });

        labelClases.setText("NO. CLASES");

        textClases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textClasesActionPerformed(evt);
            }
        });
        textClases.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textClasesKeyTyped(evt);
            }
        });

        btnClasificar.setText("INICIAR CLASIFICACIÓN");
        btnClasificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClasificarActionPerformed(evt);
            }
        });

        btnSeleccionarClases.setText("SELECCIONAR CLASES");
        btnSeleccionarClases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarClasesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelGrafica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnGeneraPuntos)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(textClases, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)))
                            .addGap(23, 23, 23))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(textPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(38, 38, 38))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(labelPuntos)
                            .addGap(56, 56, 56))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(labelClases)
                            .addGap(53, 53, 53))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btnSeleccionarClases)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(iteraciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnReiniciar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnSalir)))
                            .addContainerGap()))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnClasificar)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelGrafica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(labelPuntos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGeneraPuntos)
                        .addGap(18, 18, 18)
                        .addComponent(labelClases)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textClases, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSeleccionarClases)
                        .addGap(18, 18, 18)
                        .addComponent(btnClasificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 270, Short.MAX_VALUE)
                        .addComponent(iteraciones, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalir)
                            .addComponent(btnReiniciar))))
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        textPuntos.setText(null);
        textPuntos.setEnabled(true);
        textClases.setText(null);
        btnGeneraPuntos.setEnabled(true);
        textClases.setEnabled(false);
        btnSeleccionarClases.setEnabled(false);
        btnClasificar.setEnabled(false);
        puntos.clear();
        atractores.clear();
        iteraciones.setText("");
        
        panelGrafica.setBackground(new java.awt.Color(255, 255, 255));
        javax.swing.GroupLayout panelGraficaLayout = new javax.swing.GroupLayout(panelGrafica);
        panelGrafica.setLayout(panelGraficaLayout);
        panelGraficaLayout.setHorizontalGroup(
            panelGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 885, Short.MAX_VALUE));
        panelGraficaLayout.setVerticalGroup(
            panelGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE));

        // TODO add your handling code here:
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void btnClasificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClasificarActionPerformed
        Graphics g = this.getGraphics();
        KMeans km = new KMeans(puntos,clases,atractores,g,iteraciones);
        btnClasificar.setEnabled(false);
    }//GEN-LAST:event_btnClasificarActionPerformed

    private void textPuntosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textPuntosKeyPressed

        // TODO add your handling code here:
    }//GEN-LAST:event_textPuntosKeyPressed

    private void textPuntosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textPuntosKeyTyped
        //Se devuelve lo que esta escrito en el cuadro de texto
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        //Se verifica que no se ingresen letras
        if (!numeros)
            {
                evt.consume();
            }
    }//GEN-LAST:event_textPuntosKeyTyped

    private void btnGeneraPuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeneraPuntosActionPerformed
        //Se valida se a ingresado un número o si el número ingresado es 0 
        if(!"".equals(textPuntos.getText()) && Integer.parseInt(textPuntos.getText())!=0){
            Graphics g = this.getGraphics();
            g.drawLine((ancho/2)+x,y,(ancho/2)+x,y+largo);
            g.drawLine(x,y+(largo/2),ancho+x,y+(largo/2));    
            textPuntos.setEnabled(false);
            //Se crean los puntos 
            size = Integer.parseInt(textPuntos.getText());
            System.out.print("\nCantidad de puntos: " + size);
            
            for(int i=0;i<size;i++){
                int coordenada[] = new int[2];
                //Se crea un punto
                Punto pt = new Punto();
                //Se crean las coordenadas de los puntos
                coordenada[0] = ramdon.nextInt(ancho-3)+x;
                coordenada[1] = ramdon.nextInt(largo-3)+y;
                //Se grafican los puntos
                System.out.print("\n"+coordenada[0]+","+coordenada[1]);
                g.drawRect(coordenada[0], coordenada[1], 3, 3);
                //Se agrega la coordenada al punto
                pt.setCoordenada(coordenada);
                //Se agregan a la lista de puntos
                puntos.add(pt);
            }
            textClases.setEnabled(true);
            btnSeleccionarClases.setEnabled(true);
            btnGeneraPuntos.setEnabled(false);
        }
        else{
            JOptionPane.showMessageDialog(null, "Error: No se a ingresado el número de puntos a graficar");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGeneraPuntosActionPerformed

    private void textClasesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textClasesKeyTyped
        //Se devuelve lo que esta escrito en el cuadro de texto
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        //Se verifica que no se ingresen letras
        if (!numeros)
            {
                evt.consume();
            }
    }//GEN-LAST:event_textClasesKeyTyped

    private void btnSeleccionarClasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarClasesActionPerformed
        //Validación de que las clases no sean más que las cantidad de puntos
        if(!"".equals(textClases.getText()) && Integer.parseInt(textClases.getText())!=0){
            //Se imprimen los valores 
            //Se valida se a ingresado un número o si el número ingresado es 0 
            if(!(Integer.parseInt(textClases.getText())>size)){
                textClases.setEnabled(false);
                clases = Integer.parseInt(textClases.getText());
                JOptionPane.showMessageDialog(null, "Indica los "+ clases +" detractores en la grafica");
                //Se pueden inciar a seleccionar atractores
                addMouseListener(this);
                btnSeleccionarClases.setEnabled(false);
                
            }
            else {
                JOptionPane.showMessageDialog(null, "No hay suficientes puntos a clasificar"); 
                textClases.setText(null);
            }
            
        }
        else JOptionPane.showMessageDialog(null, "Error: No se han ingresado clases");
        
    }//GEN-LAST:event_btnSeleccionarClasesActionPerformed

    private void textClasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textClasesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textClasesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClasificar;
    private javax.swing.JButton btnGeneraPuntos;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSeleccionarClases;
    private javax.swing.JLabel iteraciones;
    private javax.swing.JLabel labelClases;
    private javax.swing.JLabel labelPuntos;
    private javax.swing.JPanel panelGrafica;
    private javax.swing.JTextField textClases;
    private javax.swing.JTextField textPuntos;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
        //Se obtinen las coordenadas el punto seleccionado
        int atractorX = e.getX();
        int atractorY = e.getY();
        //Se realiza una validación del punto
        if(atractorX>x && atractorX<ancho && atractorY>y && atractorY<largo && click == 1024 && atractores.size()<clases &&verificarPunto(atractores,atractorX,atractorY) ){
            int coordenada[] = new int[2];
            coordenada[0] = atractorX;
            coordenada[1] = atractorY;
            //Se crea un nuevo punto
            Punto pt = new Punto();
            //Se asigna la coordenada
            pt.setCoordenada(coordenada);
            //Agrega a la lista de atractores
            atractores.add(pt);
            //Graficar atractor
            Graphics g = this.getGraphics();
            g.setColor(Color.RED);
            g.drawRect(coordenada[0], coordenada[1], 6, 6);
            if(atractores.size()==clases){
                btnClasificar.setEnabled(true);
            }
        }
        else System.out.print("\nInvalido");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        click = e.getModifiersEx();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
    public boolean verificarPunto(ArrayList<Punto> atractores,int x,int y){
    for(int i=0;i<atractores.size();i++){
        if(atractores.get(i).getCoordenada()[0]==x && atractores.get(i).getCoordenada()[1] ==y){
            return false;
        }
    }
        return true;
    }


    void graficar(int x, int y, int a, int l, Color color) {
        Graphics g = this.getGraphics();
        g.setColor(color);
        g.drawRect(x, y, a, l);
    
    }


}
