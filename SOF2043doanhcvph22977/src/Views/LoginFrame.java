package Views;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author cvdoa
 */
public class LoginFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginFrame
     */
    public LoginFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        txt_UserName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_PassWork = new javax.swing.JPasswordField();
        chk_ShowPass = new javax.swing.JCheckBox();
        pn_Login = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BackGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng nhập vào hệ thống");
        setPreferredSize(new java.awt.Dimension(1000, 550));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(88, 76, 204));

        txt_UserName.setBackground(new java.awt.Color(88, 76, 204));
        txt_UserName.setToolTipText("");
        txt_UserName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txt_UserName.setName(""); // NOI18N
        txt_UserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_UserNameActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Microsoft Uighur", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Username :");

        jLabel4.setFont(new java.awt.Font("Microsoft Uighur", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Login To Your Account");

        jLabel2.setFont(new java.awt.Font("Microsoft Uighur", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Passwork :");

        jLabel3.setFont(new java.awt.Font("Microsoft Uighur", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Welcome !");

        jLabel7.setFont(new java.awt.Font("Microsoft Uighur", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login_Account.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Microsoft Uighur", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login_pass.png"))); // NOI18N

        txt_PassWork.setBackground(new java.awt.Color(88, 76, 204));
        txt_PassWork.setToolTipText("");
        txt_PassWork.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txt_PassWork.setName(""); // NOI18N
        txt_PassWork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PassWorkActionPerformed(evt);
            }
        });

        chk_ShowPass.setBackground(new java.awt.Color(88, 76, 204));
        chk_ShowPass.setForeground(new java.awt.Color(255, 255, 255));
        chk_ShowPass.setText("Show passwork");
        chk_ShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_ShowPassActionPerformed(evt);
            }
        });

        pn_Login.setBackground(new java.awt.Color(91, 40, 177));
        pn_Login.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pn_LoginMouseMoved(evt);
            }
        });
        pn_Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_LoginMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pn_LoginMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));

        javax.swing.GroupLayout pn_LoginLayout = new javax.swing.GroupLayout(pn_Login);
        pn_Login.setLayout(pn_LoginLayout);
        pn_LoginLayout.setHorizontalGroup(
            pn_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pn_LoginLayout.setVerticalGroup(
            pn_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(txt_UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel4))
                            .addComponent(txt_PassWork, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(chk_ShowPass)
                            .addComponent(pn_Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(109, 109, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(jLabel7)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_PassWork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chk_ShowPass)
                .addGap(18, 18, 18)
                .addComponent(pn_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 400, 540));

        BackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login_Background.png"))); // NOI18N
        getContentPane().add(BackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, -1));

        setSize(new java.awt.Dimension(1014, 577));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_UserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_UserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_UserNameActionPerformed

    private void txt_PassWorkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PassWorkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PassWorkActionPerformed

    private void chk_ShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_ShowPassActionPerformed
        // TODO add your handling code here:
        if (chk_ShowPass.isSelected()) {
            txt_PassWork.setEchoChar((char) 0); //password = JPasswordField
        } else {
            txt_PassWork.setEchoChar('*');
        }
    }//GEN-LAST:event_chk_ShowPassActionPerformed
    public boolean check() {
        if (txt_UserName.getText().trim().isBlank() || txt_PassWork.getText().trim().isBlank()) {
            JOptionPane.showMessageDialog(this, "Nhập không được để trống !!");
            return false;
        }
        return true;
    }
    private void pn_LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_LoginMouseClicked
        // TODO add your handling code here:
//        if (check()) {
//            if (txt_UserName.getText().trim().equals("Doanh") && txt_PassWork.getText().trim().equals("123")) {
                new ManagerFrame().setVisible(true);
                dispose();
//            } else {
//                JOptionPane.showMessageDialog(this, "Tài khoản hoặc mật khẩu sai !!!");
//            }
//        }
    }//GEN-LAST:event_pn_LoginMouseClicked

    private void pn_LoginMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_LoginMouseMoved
        // TODO add your handling code here:
        pn_Login.setBackground(new Color(148, 76, 216));
    }//GEN-LAST:event_pn_LoginMouseMoved

    private void pn_LoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_LoginMouseExited
        // TODO add your handling code here:
        pn_Login.setBackground(new Color(90, 40, 177));
    }//GEN-LAST:event_pn_LoginMouseExited

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackGround;
    private javax.swing.JCheckBox chk_ShowPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pn_Login;
    private javax.swing.JPasswordField txt_PassWork;
    private javax.swing.JTextField txt_UserName;
    // End of variables declaration//GEN-END:variables
}