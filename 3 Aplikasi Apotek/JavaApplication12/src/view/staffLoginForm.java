package view;

import java.awt.Component;
import java.awt.Image;
//import java.awt.MouseInfo;
//import java.awt.Point;
//import java.awt.Rectangle;
import javax.swing.ImageIcon;
import connection.DbConnection;

/**
 *
 * @author Alfonsus Setiawan Jacub
 */
public class staffLoginForm extends javax.swing.JFrame {

    int usernameState = 0;
    int passwordState = 0;
    
    public staffLoginForm() {
        initComponents();
        scaleIcon();
        PasswordField();
        
    }
    
    public void scaleIcon()
    {
        ImageIcon icon  = new ImageIcon(getClass().getResource("/assets/Customer.png")); // alamatnya dependen atau independen
        
        Image img  = icon.getImage();
        Image imgScale = img.getScaledInstance(LabelApotek.getWidth(), LabelApotek.getHeight(),Image.SCALE_SMOOTH );
        ImageIcon ScaledIcon = new ImageIcon(imgScale);
        LabelApotek.setIcon(ScaledIcon);
       
    }
    
    public void PasswordField()
    {
        inputPassword.setEchoChar((char)0);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jTextField1 = new javax.swing.JTextField();
        jScrollBar1 = new javax.swing.JScrollBar();
        ContainerPanel = new javax.swing.JPanel();
        AppBarPanel = new javax.swing.JPanel();
        AppBarLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        inputUsername = new javax.swing.JTextField();
        inputLogin = new javax.swing.JButton();
        LabelApotek = new javax.swing.JLabel();
        inputPassword = new javax.swing.JPasswordField();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ContainerPanel.setBackground(new java.awt.Color(255, 255, 255));

        AppBarPanel.setBackground(new java.awt.Color(0, 0, 153));

        AppBarLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AppBarLabel.setForeground(new java.awt.Color(255, 255, 255));
        AppBarLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AppBarLabel.setText("SMART APOTEK");

        javax.swing.GroupLayout AppBarPanelLayout = new javax.swing.GroupLayout(AppBarPanel);
        AppBarPanel.setLayout(AppBarPanelLayout);
        AppBarPanelLayout.setHorizontalGroup(
            AppBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AppBarLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
        );
        AppBarPanelLayout.setVerticalGroup(
            AppBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AppBarLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setToolTipText("");

        inputUsername.setBackground(new java.awt.Color(204, 204, 255));
        inputUsername.setForeground(new java.awt.Color(0, 0, 0));
        inputUsername.setText("NIP atau Username");
        inputUsername.setToolTipText("");
        inputUsername.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        inputUsername.setDoubleBuffered(true);
        inputUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inputUsernameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inputUsernameMouseEntered(evt);
            }
        });
        inputUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputUsernameActionPerformed(evt);
            }
        });

        inputLogin.setBackground(new java.awt.Color(0, 0, 153));
        inputLogin.setForeground(new java.awt.Color(255, 255, 255));
        inputLogin.setText("Sign in");
        inputLogin.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        inputLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputLoginActionPerformed(evt);
            }
        });

        inputPassword.setBackground(new java.awt.Color(204, 204, 255));
        inputPassword.setForeground(new java.awt.Color(51, 51, 51));
        inputPassword.setText("Password");
        inputPassword.setAutoscrolls(false);
        inputPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inputPasswordMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout ContainerPanelLayout = new javax.swing.GroupLayout(ContainerPanel);
        ContainerPanel.setLayout(ContainerPanelLayout);
        ContainerPanelLayout.setHorizontalGroup(
            ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerPanelLayout.createSequentialGroup()
                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContainerPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AppBarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ContainerPanelLayout.createSequentialGroup()
                        .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContainerPanelLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ContainerPanelLayout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(inputLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(inputUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                    .addComponent(inputPassword))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LabelApotek, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        ContainerPanelLayout.setVerticalGroup(
            ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AppBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(inputUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(inputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(inputLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(LabelApotek, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(322, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ContainerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ContainerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputUsernameActionPerformed

    private void inputLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputLoginActionPerformed

    private void inputUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputUsernameMouseClicked
        
    }//GEN-LAST:event_inputUsernameMouseClicked

    private void inputUsernameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputUsernameMouseEntered
        if(usernameState==0)
        {
            inputUsername.setText("");
            usernameState++;
        }else
        {
            
        }
    }//GEN-LAST:event_inputUsernameMouseEntered

    private void inputPasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputPasswordMouseEntered
        if(passwordState==0)
        {
            inputPassword.setText("");
            inputPassword.setEchoChar('*');
            passwordState++;
        }else{
            inputPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_inputPasswordMouseEntered
/*
public static boolean isMouseWithinComponent(Component c)
{
    Point mousePos = MouseInfo.getPointerInfo().getLocation();
    Rectangle bounds = c.getBounds();
    bounds.setLocation(c.getLocationOnScreen());
    return bounds.contains(mousePos);
}*/
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
            java.util.logging.Logger.getLogger(staffLoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(staffLoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(staffLoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(staffLoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new staffLoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AppBarLabel;
    private javax.swing.JPanel AppBarPanel;
    private javax.swing.JPanel ContainerPanel;
    private javax.swing.JLabel LabelApotek;
    private javax.swing.JButton inputLogin;
    private javax.swing.JPasswordField inputPassword;
    private javax.swing.JTextField inputUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}