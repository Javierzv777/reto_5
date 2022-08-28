/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.example.inventariosappspring.vista;

import java.util.List;

// import java.awt.*;

// import javax.swing.*;


import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import com.example.inventariosappspring.modelo.Producto;
import com.example.inventariosappspring.modelo.*;

/**
 *
 * @author javier
 */


public class VistaPrincipal extends javax.swing.JFrame {
   
    // private ProductoControlador controlador;
    private DefaultTableModel modelo;
    static JFrame f;
    private VistaPrincipal vista = this;
    private AgregarVista agregar ;
    ProductoRepositorio repositorio;
    // List<Producto> listaProductos = (List<Producto>) repositorioProducto.findAll();
    
    /**
     * Creates new form formulario
     */
    public VistaPrincipal(ProductoRepositorio repositorio) {
        this.repositorio = repositorio;
        this.agregar = new AgregarVista(this.vista);
        initComponents();
        setLocationRelativeTo(null);
        setTitle("caja de productos");
        setVisible(true);
        
    }

    public AgregarVista getAgregar() {
        return agregar;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
    // 

      
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bottonBorrar = new javax.swing.JButton();
        bottonActualizar = new javax.swing.JButton();
        bottonInforme = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 15)); // NOI18N
        jLabel1.setText("Bienvenido a la App de Inventario !!");
        //set table
        modelo = new DefaultTableModel();
        String[] header = { "Código", "Nombre", "Precio", "Inventario" };        
        modelo.setColumnIdentifiers(header);
        jTable1.setModel(modelo);
        jScrollPane1.setViewportView(jTable1);
        
       
        cargar();
        bottonBorrar.setText("Eliminar Producto");

        bottonActualizar.setText("Actualizar Producto");
    

        bottonInforme.setText("Generar Informe");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bottonBorrar)
                                .addGap(34, 34, 34)
                                .addComponent(bottonActualizar)
                                .addGap(32, 32, 32)
                                .addComponent(bottonInforme))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGap(30, 30, 30)
                .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bottonBorrar)
                    .addComponent(bottonActualizar)
                    .addComponent(bottonInforme))
                .addContainerGap(145, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>     
    
    
    public javax.swing.JButton getBottonActualizar() {
        return bottonActualizar;
    }

    public javax.swing.JButton getBottonBorrar() {
        return bottonBorrar;
    }

    public javax.swing.JButton getBottonInforme() {
        return bottonInforme;
    }

    public void cargar (){
        
        modelo.setNumRows(0);
        for (Producto producto : (List<Producto>) repositorio.findAll() ) {
            String[] fila = {producto.getCodigo()+"", producto.getNombre(), producto.getPrecio()+"", producto.getInventario()+""};
            modelo.addRow(fila);
        }
        agregar.jTextNombre.setText("");
        agregar.jTextPrecio.setText("");
        agregar.jTextInventario.setText("");
    }
                                            
                                              

                                            

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify 
    private javax.swing.JButton bottonActualizar;
    private javax.swing.JButton bottonBorrar;
    private javax.swing.JButton bottonInforme;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;


    // End of variables declaration                   
}