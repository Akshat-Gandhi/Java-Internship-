/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.Factory;

import java.util.LinkedList;
import javax.swing.*;


 class hello {
    public  static  final  String email =" @gmail.com";
    private String name  ;
    private String id;
    public hello(){
        name = "";
        id  = "";
    }
    public hello(String name , String id){
        this.name = name ;
        this.id  = id;
    }
    public  String getName (){
        return  name ;
    }
    public String getId(){
        return  id;
    }
        
    public void setName(String name){
        this.name = name;
    }
        
    public void setId(String id){
        this.id = id;
    }
    @Override
    public String toString (){
        return id + "\t" + name +  email;
    }

}



public class Workers extends javax.swing.JFrame {

    private LinkedList<hello> workersLinkedlist  = new LinkedList<hello>();
    private int index;

    public Workers() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addbutton = new javax.swing.JButton();
        editbutton = new javax.swing.JButton();
        savebutton = new javax.swing.JButton();
        displaybutton = new javax.swing.JButton();
        exitbutton = new javax.swing.JButton();
        namelabel = new javax.swing.JLabel();
        idtextfield = new javax.swing.JTextField();
        idlabel = new javax.swing.JLabel();
        nametextfield = new javax.swing.JTextField();
        backbutton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        workertextarea = new javax.swing.JTextArea();
        deletebutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addbutton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        addbutton.setText("Add");
        addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbuttonActionPerformed(evt);
            }
        });

        editbutton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        editbutton.setText("Edit");
        editbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbuttonActionPerformed(evt);
            }
        });

        savebutton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        savebutton.setText("Save");
        savebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebuttonActionPerformed(evt);
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

        namelabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        namelabel.setText("Name ");

        idtextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idtextfieldActionPerformed(evt);
            }
        });

        idlabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        idlabel.setText("ID");

        nametextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametextfieldActionPerformed(evt);
            }
        });

        backbutton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        backbutton.setText("Back");
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });

        workertextarea.setColumns(20);
        workertextarea.setRows(5);
        jScrollPane1.setViewportView(workertextarea);

        deletebutton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        deletebutton.setText("Delete");
        deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(displaybutton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exitbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(backbutton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addbutton)
                        .addGap(18, 18, 18)
                        .addComponent(editbutton)
                        .addGap(18, 18, 18)
                        .addComponent(deletebutton)
                        .addGap(18, 18, 18)
                        .addComponent(savebutton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(namelabel)
                        .addGap(18, 18, 18)
                        .addComponent(nametextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(idlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(idtextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(412, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nametextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namelabel)
                    .addComponent(idlabel)
                    .addComponent(idtextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbutton)
                    .addComponent(editbutton)
                    .addComponent(deletebutton)
                    .addComponent(savebutton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displaybutton)
                    .addComponent(exitbutton)
                    .addComponent(backbutton))
                .addContainerGap(158, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    private boolean isworkerIdInLinkedlist(String idstr){
        boolean inlist  = false;


        for (hello worker : workersLinkedlist){
            if (worker.getId().compareToIgnoreCase(idtextfield.getText())==0){
                inlist = true;
            }
        }
        return inlist;
    }
    private void addWorker(){
        if (isworkerIdInLinkedlist(idtextfield.getText()) == true){
           JOptionPane.showMessageDialog(null,"Error: This id already Exists");

        }
        else {


            workersLinkedlist.add(new hello(nametextfield.getText(), idtextfield.getText()));
            idtextfield.setText("");
            nametextfield.setText("");
            JOptionPane.showMessageDialog(null, "Record Added Successfully");
        }
    }
    private void  displayall(){
        workertextarea.setText("ID\tName\tEmail\n");
        for (hello worker : workersLinkedlist){
            
            workertextarea.append(worker.toString()+ "\n");
        }
    }
     private void exit(){
        System.exit(0);
    }
    private void deleteWorker (){

        if (workersLinkedlist.size()==0){
            JOptionPane.showMessageDialog(null,"Error: Database is Empty");
        }
        else if (isworkerIdInLinkedlist(idtextfield.getText()) == false){
            JOptionPane.showMessageDialog(null,"Error: Worker ID does not Exists ");

        }
        else{
            for (int s = 0 ; s<workersLinkedlist.size();s++){
                String currentid = workersLinkedlist.get(s).getId();
                if (currentid.compareToIgnoreCase(idtextfield.getText())==0){
                    workersLinkedlist.remove(s);
                    idtextfield.setText("");
                    nametextfield.setText("");
                    JOptionPane.showMessageDialog(null,"Record Deleted Successfully");


                }
            }
        }

    }
    private void editWorker(){
        if (workersLinkedlist.size()==0){
            JOptionPane.showMessageDialog(null,"Error: List is Empty");
        }
        else if (isworkerIdInLinkedlist(idtextfield.getText()) == false){
            JOptionPane.showMessageDialog(null,"Error: Worker ID does not Exists ");

        }
        else{
            index = -1 ;
            for (int s = 0 ; s<workersLinkedlist.size();s++){
                String currentid = workersLinkedlist.get(s).getId();
                if (currentid.compareToIgnoreCase(idtextfield.getText())==0){
                   index =s;
                    s=workersLinkedlist.size(); // exit loop

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
                       
                nametextfield.setText(workersLinkedlist.get(index).getName());
                idtextfield.setText(workersLinkedlist.get(index).getId());
            }


        }

    }
     private void save(){
        //This code will preserve the changes that the user made
        //they were editing and saving in ll
        workersLinkedlist.get(index).setName(nametextfield.getText());
        workersLinkedlist.get(index).setId(idtextfield.getText());
        displayall();
        idtextfield.setText("");
        nametextfield.setText("");
        addbutton.setEnabled(true);
        savebutton.setEnabled(false);
        editbutton.setEnabled(true);
        deletebutton.setEnabled(true);
        displaybutton.setEnabled(true);
        exitbutton.setEnabled(true);
        backbutton.setEnabled(true);
    }
     
    

    private void editbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbuttonActionPerformed
        // TODO add your handling code here:
        editWorker();
        workertextarea.setEditable(false);
    }//GEN-LAST:event_editbuttonActionPerformed

    private void savebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebuttonActionPerformed
        // TODO add your handling code here:
        save();
    }//GEN-LAST:event_savebuttonActionPerformed

    private void nametextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nametextfieldActionPerformed

    private void idtextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idtextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idtextfieldActionPerformed

    private void addbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbuttonActionPerformed
        // TODO add your handling code here:
        addWorker();
        displayall();
        
    }//GEN-LAST:event_addbuttonActionPerformed

    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed
        // TODO add your handling code here:
        deleteWorker();
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
            java.util.logging.Logger.getLogger(Workers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Workers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Workers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Workers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Workers().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbutton;
    private javax.swing.JButton backbutton;
    private javax.swing.JButton deletebutton;
    private javax.swing.JButton displaybutton;
    private javax.swing.JButton editbutton;
    private javax.swing.JButton exitbutton;
    private javax.swing.JLabel idlabel;
    private javax.swing.JTextField idtextfield;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel namelabel;
    private javax.swing.JTextField nametextfield;
    private javax.swing.JButton savebutton;
    private javax.swing.JTextArea workertextarea;
    // End of variables declaration//GEN-END:variables
}
