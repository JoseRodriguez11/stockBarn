
package vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;


public class VentanaGrafico extends javax.swing.JFrame {

   
    public VentanaGrafico() {
        initComponents();
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelFondo.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelFondoLayout = new javax.swing.GroupLayout(jPanelFondo);
        jPanelFondo.setLayout(jPanelFondoLayout);
        jPanelFondoLayout.setHorizontalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jPanelFondoLayout.setVerticalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 501, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void graficar(int semana1,int semana2,int semana3,int semana4,String nombreProducto){
        DefaultPieDataset datos=new DefaultPieDataset();
        datos.setValue("TOTAL SACADO SEMANA 1: "+semana1,semana1 );
        datos.setValue("TOTAL SACADO SEMANA 2: "+semana2,semana2 );
        datos.setValue("TOTAL SACADO SEMANA 3: "+semana3,semana3 );
        datos.setValue("TOTAL SACADO SEMANA 4: "+semana4,semana4 );
        
        JFreeChart grafico=ChartFactory.createPieChart(
        "VENTAS POR SEMANA DEl PRODUCTO ( "+nombreProducto+" )",
        datos,
        true,
        true,
        false
        
        );
        
        ChartPanel panel=new ChartPanel(grafico);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(600,500));
        
        jPanelFondo.setLayout(new BorderLayout());
        jPanelFondo.add(panel,BorderLayout.NORTH);
        
        pack();
        repaint();
    }
   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanelFondo;
    // End of variables declaration//GEN-END:variables
}
