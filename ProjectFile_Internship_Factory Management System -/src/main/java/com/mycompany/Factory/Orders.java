/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.Factory;

import java.util.LinkedList;
import javax.swing.JOptionPane;

class Orders_ {
    String orders_name;
    String orders_id;
    String orders_status;
    
    public Orders_ (){
        orders_name ="";
        orders_id ="";
        orders_status ="";
    }
    public Orders_ (String name , String  id , String status){
         this.orders_name=name;
         this.orders_id = id;
         this.orders_status = status;    
    }
    public String getOrders_name (){
        return orders_name ;
    }
    public String getOrders_id (){
        return orders_id ;
    }
    public String getOrders_status (){
        return orders_status ;
    }
    public void setOrders_name(String name){
        this.orders_name  = name;
    }
    public void setOrders_id(String id){
        this.orders_id  = id;
    }
    
    public void setOrders_status(String status){
        this.orders_status  = status;
    }
    
    public String toString (){
        return  orders_id + "\t" + orders_name + "\t" + orders_status;
    }
 }




public class Orders extends javax.swing.JFrame {
    
    
    
    
     LinkedList <Orders_> ordersll = new LinkedList<Orders_>();
     int index;

    public Orders() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        producttext = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        idtext = new javax.swing.JTextField();
        statustext = new javax.swing.JTextField();
        editbutton = new javax.swing.JButton();
        addbutton = new javax.swing.JButton();
        savebutton = new javax.swing.JButton();
        deletebutton = new javax.swing.JButton();
        exitbutton = new javax.swing.JButton();
        backbutton = new javax.swing.JButton();
        displaybutton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        displaytext = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setText("Order ID");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("Product");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setText("Status");

        editbutton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        editbutton.setText("Edit");
        editbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbuttonActionPerformed(evt);
            }
        });

        addbutton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        addbutton.setText("Add");
        addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbuttonActionPerformed(evt);
            }
        });

        savebutton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        savebutton.setText("Save");
        savebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebuttonActionPerformed(evt);
            }
        });

        deletebutton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        deletebutton.setText("Delete");
        deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttonActionPerformed(evt);
            }
        });

        exitbutton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        exitbutton.setText("Exit");
        exitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbuttonActionPerformed(evt);
            }
        });

        backbutton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        backbutton.setText("Back");
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });

        displaybutton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        displaybutton.setText("Display");
        displaybutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displaybuttonActionPerformed(evt);
            }
        });

        displaytext.setColumns(20);
        displaytext.setRows(5);
        jScrollPane1.setViewportView(displaytext);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(idtext, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(producttext, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(statustext, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(editbutton)
                        .addGap(18, 18, 18)
                        .addComponent(savebutton)
                        .addGap(18, 18, 18)
                        .addComponent(deletebutton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(displaybutton)
                        .addGap(18, 18, 18)
                        .addComponent(exitbutton)
                        .addGap(18, 18, 18)
                        .addComponent(backbutton)))
                .addContainerGap(272, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(producttext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(statustext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbutton)
                    .addComponent(editbutton)
                    .addComponent(savebutton)
                    .addComponent(deletebutton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displaybutton)
                    .addComponent(exitbutton)
                    .addComponent(backbutton))
                .addContainerGap(130, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbuttonActionPerformed
        // TODO add your handling code here:
        addorder();
        displayall();
    }//GEN-LAST:event_addbuttonActionPerformed

    private void editbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbuttonActionPerformed
        // TODO add your handling code here:
        editorder();
    }//GEN-LAST:event_editbuttonActionPerformed

    private void savebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebuttonActionPerformed
        // TODO add your handling code here:
        save();
    }//GEN-LAST:event_savebuttonActionPerformed

    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed
        // TODO add your handling code here:
        deleteorder();
        displayall();
    }//GEN-LAST:event_deletebuttonActionPerformed

    private void displaybuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displaybuttonActionPerformed
        // TODO add your handling code here:
        displayall();
    }//GEN-LAST:event_displaybuttonActionPerformed

    private void exitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbuttonActionPerformed
        // TODO add your handling code here:
        exit();
    }//GEN-LAST:event_exitbuttonActionPerformed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
      
         
        Main op = new Main();
        op.setVisible(true);
        dispose();

    }//GEN-LAST:event_backbuttonActionPerformed

    
   private void exit(){
        System.exit(0);
    }
    private boolean isorderIdInLinkedlist(String idstr){
        boolean inlist  = false;


        for (Orders_ oo : ordersll){
            if (oo.orders_id.compareToIgnoreCase(idtext.getText())==0){
                inlist = true;
            }
        }
        return inlist;
    }
    
 private void addorder(){
     if(isorderIdInLinkedlist(idtext.getText())==true){
         JOptionPane.showMessageDialog(null,"Error: This id already Exists");
     }
     else{
         ordersll.add(new Orders_(producttext.getText(),idtext.getText(),statustext.getText()));
         producttext.setText("");
         idtext.setText("");
         statustext.setText("");
         JOptionPane.showMessageDialog(null,"Added Successfully");
     }

            
    }
    
    private void  displayall(){
       displaytext.setText("ID\tName\tStatus\n");
        for (Orders_ oo :ordersll){
            //workertextarea.append(String.valueOf(worker+"\n"));
            displaytext.append(oo.toString()+ "\n");
        }
    }private void deleteorder (){

        if (ordersll.size()==0){
            JOptionPane.showMessageDialog(null,"Error: Database is Empty");
        }
        else if (isorderIdInLinkedlist(idtext.getText()) == false){
            JOptionPane.showMessageDialog(null,"Error: Order ID does not Exists ");

        }
        else{
            for (int s = 0 ; s<ordersll.size();s++){
                String currentid =ordersll.get(s).getOrders_id();
                if (currentid.compareToIgnoreCase(idtext.getText())==0){
                   ordersll.remove(s);
                    idtext.setText("");
                    producttext.setText("");
                    JOptionPane.showMessageDialog(null,"Record Deleted Successfully");


                }
            }
        }

    }
    private void editorder(){
         if (ordersll.size()==0){
            JOptionPane.showMessageDialog(null,"Error: List is Empty");
            
        }
         else if (isorderIdInLinkedlist(idtext.getText()) == false){
            JOptionPane.showMessageDialog(null,"Error: Order ID does not Exists ");

        }
         else{
            index = -1 ;
            for (int s = 0 ; s<ordersll.size();s++){
                String currentid = ordersll.get(s).getOrders_id();
                if (currentid.compareToIgnoreCase(idtext.getText())==0){
                   index =s;
                    s=ordersll.size(); // exit loop

                }
            }
            if(index>=0){
               addbutton.setEnabled(false);
               savebutton.setEnabled(true);
               editbutton.setEnabled(false);
               deletebutton.setEnabled(false);
               displaybutton.setEnabled(false);
               exitbutton.setEnabled(false);
               backbutton.setEnabled(false);
                producttext.setText(ordersll.get(index).getOrders_name());
                idtext.setText(ordersll.get(index).getOrders_id());
                statustext.setText(ordersll.get(index).getOrders_status());
            }


        }
    }
    
     private void save(){
        //This code will preserve the changes that the user made
        //they were editing and saving in ll
       ordersll.get(index).setOrders_name(producttext.getText());
       ordersll.get(index).setOrders_id(idtext.getText());
       ordersll.get(index).setOrders_status(statustext.getText());
     
        displayall();
        idtext.setText("");
        producttext.setText("");
        statustext.setText("");
        addbutton.setEnabled(true);
        savebutton.setEnabled(false);
        editbutton.setEnabled(true);
        deletebutton.setEnabled(true);
        displaybutton.setEnabled(true);
        exitbutton.setEnabled(true);
        backbutton.setEnabled(true);
    }
     
    
    
    
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
            java.util.logging.Logger.getLogger(Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Orders().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbutton;
    private javax.swing.JButton backbutton;
    private javax.swing.JButton deletebutton;
    private javax.swing.JButton displaybutton;
    private javax.swing.JTextArea displaytext;
    private javax.swing.JButton editbutton;
    private javax.swing.JButton exitbutton;
    private javax.swing.JTextField idtext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField producttext;
    private javax.swing.JButton savebutton;
    private javax.swing.JTextField statustext;
    // End of variables declaration//GEN-END:variables
}
