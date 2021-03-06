/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import javax.swing.JOptionPane;
import userinterface.MainJFrame;

/**
 *
 * @author Varakumar
 */
public class RestaurantJPanel extends javax.swing.JPanel {
    
    RestaurantDirectory restaurantlist;
    EcoSystem system;

    /**
     * Creates new form RestaurantJPanel
     */
    public RestaurantJPanel(RestaurantDirectory restaurantlist,EcoSystem system ) {
        this.system = system;
        
        if(system.getRestaurantdirectory()==null){
            
            
            system.setRestaurantdirectory(restaurantlist);
        }
        this.restaurantlist=system.getRestaurantdirectory();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtRestName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtRestAdd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblManagerName = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();

        jLabel1.setText("Enter Restaurant name:");

        jLabel2.setText("Enter Restaurant Address:");

        txtRestAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRestAddActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Welcome");

        lblManagerName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRestName, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRestAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSubmit))
                        .addContainerGap(246, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblManagerName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(101, 101, 101))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblManagerName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtRestName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtRestAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSubmit)
                .addContainerGap(82, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtRestAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRestAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRestAddActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        
        Restaurant res = system.getRestaurantdirectory().RetrieveRestaurant(MainJFrame.txtUsernameMain.getText());
        if(res==null){
            if(txtRestAdd.getText().isEmpty() || txtRestName.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Fields left blank!");
                return;
            }
            Restaurant rest = new Restaurant();
            rest.setManager(MainJFrame.txtUsernameMain.getText());
            system.getRestaurantdirectory().getRestaurantlist().add(rest);
        
            Restaurant restaurant = system.getRestaurantdirectory().RetrieveRestaurant(MainJFrame.txtUsernameMain.getText());
            restaurant.setName(txtRestName.getText());
            restaurant.setAddress(txtRestAdd.getText());
            //system.getRestaurantdirectory().getRestaurantlist().add(restaurant);
            
            String name = system.getEmployeeDirectory().iterateEmployees(MainJFrame.txtUsernameMain.getText()).getName();
            String restname = txtRestName.getText();
            lblManagerName.setText(name+" You are now the manager of " +restname);
            
            
        }
        else{
            
            
            if(txtRestAdd.getText().isEmpty() || txtRestName.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Fields left blank!");
                return;
            }
            
            Restaurant restaurant = system.getRestaurantdirectory().RetrieveRestaurant(MainJFrame.txtUsernameMain.getText());
            restaurant.setName(txtRestName.getText());
            restaurant.setAddress(txtRestAdd.getText());
            String name = system.getEmployeeDirectory().iterateEmployees(MainJFrame.txtUsernameMain.getText()).getName();
            String restname = txtRestName.getText();
            lblManagerName.setText(name+" You are now the manager of " +restname);
            JOptionPane.showMessageDialog(this, "Restaurant name and address updated!");
            
        }
        
    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblManagerName;
    private javax.swing.JTextField txtRestAdd;
    private javax.swing.JTextField txtRestName;
    // End of variables declaration//GEN-END:variables
}
