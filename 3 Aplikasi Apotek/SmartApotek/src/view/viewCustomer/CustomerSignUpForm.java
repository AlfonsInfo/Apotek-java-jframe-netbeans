package view.viewCustomer;

import java.awt.Component;
import java.awt.Image;
import javax.swing.ImageIcon;
import connection.DbConnection;

import model.karyawan.AkunKaryawan;
import model.karyawan.Karyawan;
import control.AkunCustomerControl;
import dao.AkunCustomerDAO;
import java.awt.Color;
import model.AkunCustomer;


/**
 *
 * @author Alfonsus Setiawan Jacub
 */
public class CustomerSignUpForm extends javax.swing.JFrame {
    
    //Field
    int usernameState = 0;
    int passwordState = 0;
    int EmailState=0;
    int alamatState=0;
    private AkunCustomerControl akunCustomerControl;
    
    //Konstruktor
    public CustomerSignUpForm() {
        initComponents();
        scaleIcon("/assets/Customer.png", LabelApotek);
        PasswordField();
        akunCustomerControl = new AkunCustomerControl();
        
    }
    
    
    
    //Method untuk melakukan pengskalaan pada label icon. agar bisa digunakan kembali pada ssetlainnya, digunakan parameter input assets dan javax.swing.Jlabel
    public void scaleIcon(String assets, javax.swing.JLabel c) 
    {
        ImageIcon icon  = new ImageIcon(getClass().getResource(assets)); // alamatnya dependen atau independen
        
        Image img  = icon.getImage();
        Image imgScale = img.getScaledInstance(c.getWidth(), c.getHeight(),Image.SCALE_SMOOTH );
        ImageIcon ScaledIcon = new ImageIcon(imgScale);
        c.setIcon(ScaledIcon);
       
    }
    
    //Method ini digunakan agar setting default dari passwordnya tidak disembunyikan
    public void PasswordField()
    {
        inputPassword.setEchoChar((char)0);
    }
  
    //Method untuk pindah form 
    private void pindahForm()
    {
        
    }
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
        btnBackToLogin = new javax.swing.JButton();
        LabelApotek = new javax.swing.JLabel();
        inputPassword = new javax.swing.JPasswordField();
        Message = new javax.swing.JLabel();
        btnSignup = new javax.swing.JButton();
        inputEmail = new javax.swing.JTextField();
        inputAlamat = new javax.swing.JTextField();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        ContainerPanel.setBackground(new java.awt.Color(255, 255, 255));

        AppBarPanel.setBackground(new java.awt.Color(51, 153, 0));

        AppBarLabel.setBackground(new java.awt.Color(153, 204, 0));
        AppBarLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AppBarLabel.setForeground(new java.awt.Color(255, 255, 255));
        AppBarLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AppBarLabel.setText("SMART APOTEK");

        javax.swing.GroupLayout AppBarPanelLayout = new javax.swing.GroupLayout(AppBarPanel);
        AppBarPanel.setLayout(AppBarPanelLayout);
        AppBarPanelLayout.setHorizontalGroup(
            AppBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AppBarLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        AppBarPanelLayout.setVerticalGroup(
            AppBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AppBarLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setToolTipText("");

        inputUsername.setBackground(new java.awt.Color(153, 255, 153));
        inputUsername.setForeground(new java.awt.Color(0, 0, 0));
        inputUsername.setText("Username");
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

        btnBackToLogin.setBackground(new java.awt.Color(0, 153, 0));
        btnBackToLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnBackToLogin.setText("Back To Login Menu");
        btnBackToLogin.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnBackToLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackToLoginActionPerformed(evt);
            }
        });

        inputPassword.setBackground(new java.awt.Color(204, 255, 204));
        inputPassword.setForeground(new java.awt.Color(51, 51, 51));
        inputPassword.setText("Password");
        inputPassword.setAutoscrolls(false);
        inputPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inputPasswordMouseEntered(evt);
            }
        });

        Message.setForeground(new java.awt.Color(204, 0, 51));

        btnSignup.setBackground(new java.awt.Color(255, 255, 255));
        btnSignup.setForeground(new java.awt.Color(0, 153, 0));
        btnSignup.setText("Sign  up");
        btnSignup.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });

        inputEmail.setBackground(new java.awt.Color(153, 255, 153));
        inputEmail.setForeground(new java.awt.Color(0, 0, 0));
        inputEmail.setText("email");
        inputEmail.setToolTipText("");
        inputEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        inputEmail.setDoubleBuffered(true);
        inputEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inputEmailMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inputEmailMouseEntered(evt);
            }
        });
        inputEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputEmailActionPerformed(evt);
            }
        });

        inputAlamat.setBackground(new java.awt.Color(153, 255, 153));
        inputAlamat.setForeground(new java.awt.Color(0, 0, 0));
        inputAlamat.setText("alamat");
        inputAlamat.setToolTipText("");
        inputAlamat.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        inputAlamat.setDoubleBuffered(true);
        inputAlamat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inputAlamatMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inputAlamatMouseEntered(evt);
            }
        });
        inputAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputAlamatActionPerformed(evt);
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
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LabelApotek, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addGroup(ContainerPanelLayout.createSequentialGroup()
                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ContainerPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Message, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ContainerPanelLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBackToLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(inputAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inputUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        ContainerPanelLayout.setVerticalGroup(
            ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AppBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(inputUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Message, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBackToLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(LabelApotek, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(315, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ContainerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ContainerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputUsernameActionPerformed

    }//GEN-LAST:event_inputUsernameActionPerformed

    private void btnBackToLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToLoginActionPerformed
            CustomerLoginForm dv = new CustomerLoginForm();
            this.dispose();
            dv.setVisible(true);
    }//GEN-LAST:event_btnBackToLoginActionPerformed

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

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
        AkunCustomer ac = new AkunCustomer(inputUsername.getText(),inputPassword.getText(),inputEmail.getText(),inputAlamat.getText());
        akunCustomerControl.insertAkunCustomer(ac);
        Message.setText("Daftar Akun Berhasil !!");
            Message.setForeground(Color.GREEN); // Ubah warna font dari defualt
            Message.setText("Login Berhasil !! ");
    }//GEN-LAST:event_btnSignupActionPerformed

    private void inputEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputEmailMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_inputEmailMouseClicked

    private void inputEmailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputEmailMouseEntered
        if(EmailState==0)
        {
            inputEmail.setText("");
            EmailState++;
        }else
        {
            
        }    }//GEN-LAST:event_inputEmailMouseEntered

    private void inputEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputEmailActionPerformed

    private void inputAlamatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputAlamatMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_inputAlamatMouseClicked

    private void inputAlamatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputAlamatMouseEntered
     if(alamatState==0)
        {
            inputAlamat.setText("");
            alamatState++;
        }else
        {
            
        }  
    }//GEN-LAST:event_inputAlamatMouseEntered

    private void inputAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputAlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputAlamatActionPerformed
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
            java.util.logging.Logger.getLogger(CustomerSignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerSignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerSignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerSignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerSignUpForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AppBarLabel;
    private javax.swing.JPanel AppBarPanel;
    private javax.swing.JPanel ContainerPanel;
    private javax.swing.JLabel LabelApotek;
    private javax.swing.JLabel Message;
    private javax.swing.JButton btnBackToLogin;
    private javax.swing.JButton btnSignup;
    private javax.swing.JTextField inputAlamat;
    private javax.swing.JTextField inputEmail;
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
