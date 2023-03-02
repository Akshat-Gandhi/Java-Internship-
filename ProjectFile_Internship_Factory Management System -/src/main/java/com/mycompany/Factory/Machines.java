/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package com.mycompany.Factory;

import java.util.LinkedList;
import javax.swing.JOptionPane;

class Machine {
    String machine_name;
    String machine_id;
    String machine_status;
    
    public Machine (){
        machine_name ="";
        machine_id ="";
        machine_status ="";
    }
    public Machine (String name , String  id , String status){
         this.machine_name=name;
         this.machine_id = id;
         this.machine_status = status;    
    }
    public String getMachine_name (){
        return machine_name ;
    }
    public String getMachine_id (){
        return machine_id ;
    }
    public String getMachine_status (){
        return machine_status ;
    }
    public void setMachine_name(String name){
        this.machine_name  = name;
    }
    public void setMachine_id(String id){
        this.machine_id  = id;
    }
    
    public void setMachine_status(String status){
        this.machine_status  = status;
    }
    
    public String toString (){
        return  machine_id + "\t" + machine_name + "\t" + machine_status;
    }
 }



public class Machines extends javax.swing.JFrame {

   LinkedList <Machine> machinelinkedlist = new LinkedList<Machine>();
   int index;
   
    public Machines() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addbutton = new javax.swing.JButton();
        deletebutton = new javax.swing.JButton();
        displaybutton = new javax.swing.JButton();
        exitbutton = new javax.swing.JButton();
        backbutton = new javax.swing.JButton();
        display = new javax.swing.JScrollPane();
        dispaly = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        statustext = new javax.swing.JTextField();
        nametext = new javax.swing.JTextField();
        idtext = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addbutton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        addbutton.setText("Add");
        addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbuttonActionPerformed(evt);
            }
        });

        deletebutton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        deletebutton.setText("Delete");
        deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttonActionPerformed(evt);
            }
        });

        displaybutton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        displaybutton.setText("Display");
        displaybutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displaybuttonActionPerformed(evt);
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

        dispaly.setColumns(20);
        dispaly.setRows(5);
        display.setViewportView(dispaly);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setText("Machine ID");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("Machine Name");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setText("Machine Status");

        idtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idtextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(idtext, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(nametext, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(statustext, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addbutton)
                                .addGap(18, 18, 18)
                                .addComponent(deletebutton)
                                .addGap(18, 18, 18)
                                .addComponent(displaybutton)
                                .addGap(18, 18, 18)
                                .addComponent(exitbutton)
                                .addGap(18, 18, 18)
                                .addComponent(backbutton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(176, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(nametext, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(statustext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbutton)
                    .addComponent(deletebutton)
                    .addComponent(displaybutton)
                    .addComponent(exitbutton)
                    .addComponent(backbutton))
                .addContainerGap(206, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idtextActionPerformed

    private void addbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbuttonActionPerformed
        // TODO add your handling code here:
        
        addmachine();
        displayall();
    }//GEN-LAST:event_addbuttonActionPerformed

    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed
        // TODO add your handling code here:
        deleteMachine();
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
        // TODO add your handling code here:
        
        Main op = new Main();
        op.setVisible(true);
        dispose();
    }//GEN-LAST:event_backbuttonActionPerformed
    private void exit(){
        System.exit(0);
    }
    private boolean ismachineIdInLinkedlist(String idstr){
        boolean inlist  = false;


        for (Machine machine : machinelinkedlist){
            if (machine.getMachine_id().compareToIgnoreCase(idtext.getText())==0){
                inlist = true;
            }
        }
        return inlist;
    }
    
    private void addmachine(){
         if (ismachineIdInLinkedlist(idtext.getText()) == true){
           JOptionPane.showMessageDialog(null,"Error: This id already Exists");

        }
         else {


            machinelinkedlist.add(new Machine(nametext.getText(), idtext.getText(),statustext.getText()));
            idtext.setText("");
            nametext.setText("");
            statustext.setText("");
            
            JOptionPane.showMessageDialog(null, "Record Added Successfully");
        }
            
    }
    
    private void  displayall(){
       dispaly.setText("ID\tName\tStatus\n");
        for (Machine m1 :machinelinkedlist){
            //workertextarea.append(String.valueOf(worker+"\n"));
            dispaly.append(m1.toString()+ "\n");
        }
    }
    private void deleteMachine (){

        if (machinelinkedlist.size()==0){
            JOptionPane.showMessageDialog(null,"Error: Database is Empty");
        }
        else if (ismachineIdInLinkedlist(idtext.getText()) == false){
            JOptionPane.showMessageDialog(null,"Error: Worker ID does not Exists ");

        }
        else{
            for (int s = 0 ; s<machinelinkedlist.size();s++){
                String currentid =machinelinkedlist.get(s).getMachine_id();
                if (currentid.compareToIgnoreCase(idtext.getText())==0){
                   machinelinkedlist.remove(s);
                    idtext.setText("");
                    nametext.setText("");
                    JOptionPane.showMessageDialog(null,"Record Deleted Successfully");


                }
            }
        }

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
            java.util.logging.Logger.getLogger(Machines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Machines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Machines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Machines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Machines().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbutton;
    private javax.swing.JButton backbutton;
    private javax.swing.JButton deletebutton;
    private javax.swing.JTextArea dispaly;
    private javax.swing.JScrollPane display;
    private javax.swing.JButton displaybutton;
    private javax.swing.JButton exitbutton;
    private javax.swing.JTextField idtext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField nametext;
    private javax.swing.JTextField statustext;
    // End of variables declaration//GEN-END:variables

}
