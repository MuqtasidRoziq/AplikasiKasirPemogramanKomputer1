/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uiAdmin;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import kasirapk.connectData;


/**
 *
 * @author muqta
 */
public class UiEditData extends javax.swing.JFrame {
    /**
     * Creates new form UiEditData
     */
    private String idUser;

    
    public UiEditData(String idUser, String nama, String email, String role, String username, String password) {
        initComponents();
        
                
        // Simpan ID pengguna dan data lainnya
        this.idUser = idUser;
        
        
        // Isi field dengan data pengguna
        inputIdUser.setText(idUser);
        inputNama.setText(nama);
        inputEmail.setText(email);
        SelectRole.setSelectedItem(role);
        inputUsername.setText(username);
        inputPassword.setText(password);
    }

    private UiEditData() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_email = new javax.swing.JLabel();
        inputEmail = new javax.swing.JTextField();
        lb_role = new javax.swing.JLabel();
        inputUsername = new javax.swing.JTextField();
        lb_username = new javax.swing.JLabel();
        inputPassword = new javax.swing.JTextField();
        lb_pasword = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        lb_id = new javax.swing.JLabel();
        inputIdUser = new javax.swing.JTextField();
        cancel = new javax.swing.JButton();
        inputNama = new javax.swing.JTextField();
        lb_nama = new javax.swing.JLabel();
        SelectRole = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lb_email.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb_email.setText("Email");

        lb_role.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb_role.setText("Role");

        lb_username.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb_username.setText("Username");

        lb_pasword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb_pasword.setText("Password");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Edit User");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabel1)
                .addContainerGap(152, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        lb_id.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb_id.setText("Nama");

        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        lb_nama.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb_nama.setText("Nama");

        SelectRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- pilih role anda -", "owner", "admin", "kasir" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cancel)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lb_username)
                            .addComponent(lb_id)
                            .addComponent(inputIdUser, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                            .addComponent(lb_email)
                            .addComponent(inputEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                            .addComponent(lb_role)
                            .addComponent(inputUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                            .addComponent(inputPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                            .addComponent(lb_pasword)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(save))
                            .addComponent(inputNama, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                            .addComponent(lb_nama)
                            .addComponent(SelectRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(47, 47, 47))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(lb_id)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputIdUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(lb_nama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_email)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_role)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SelectRole, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_username, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_pasword, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(save)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancel)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        // Ambil data dari input
        String IDUserLama = this.idUser;
        String IDUserBaru = inputIdUser.getText();
        String nama = inputNama.getText();
        String email = inputEmail.getText();
        String role = (String) SelectRole.getSelectedItem();
        String username = inputUsername.getText();
        String password = inputPassword.getText();

        // Cek jika ada kolom yang kosong
        if (IDUserBaru.isEmpty() || nama.isEmpty() || email.isEmpty() || role.isEmpty() || username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            Connection con = connectData.getConnection();

            // 1. Cek jika ID user ada di dalam database
            PreparedStatement checkUser = con.prepareStatement("SELECT * FROM tb_user WHERE id_user = ?");
            checkUser.setString(1, IDUserLama);
            ResultSet rs;
            rs = checkUser.executeQuery();
            if (!rs.next()) {
                JOptionPane.showMessageDialog(this, "ID User tidak ditemukan di database.", "Error", JOptionPane.ERROR_MESSAGE);
                return;  // Berhenti di sini jika ID tidak ada
            }

            // 2. Lakukan update data
            String updateQuery = "UPDATE tb_user SET id_user = ?, nama_user = ?, email_user = ?, role = ?, username_user = ?, password_user = ? WHERE id_user = ?";
            PreparedStatement pst = con.prepareStatement(updateQuery);

            pst.setString(1, IDUserBaru);
            pst.setString(2, nama);
            pst.setString(3, email);
            pst.setString(4, role);
            pst.setString(5, username);
            pst.setString(6, password);
            pst.setString(7, IDUserLama); // WHERE clause menggunakan id_user

            int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Data user berhasil diperbarui.");
            } else {
                JOptionPane.showMessageDialog(this, "Data user gagal diperbarui.");
            }

            // Kembali ke tampilan data user
            UiDataUser dataUserForm = new UiDataUser();
            dataUserForm.setVisible(true);
            this.dispose();

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat memperbarui data.");
        }
    }//GEN-LAST:event_saveActionPerformed
    
    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        UiDataUser datauser = new UiDataUser();
        datauser.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelActionPerformed

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
            java.util.logging.Logger.getLogger(UiEditData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UiEditData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UiEditData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UiEditData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UiEditData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> SelectRole;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JTextField inputIdUser;
    private javax.swing.JTextField inputNama;
    private javax.swing.JTextField inputPassword;
    private javax.swing.JTextField inputUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_email;
    private javax.swing.JLabel lb_id;
    private javax.swing.JLabel lb_nama;
    private javax.swing.JLabel lb_pasword;
    private javax.swing.JLabel lb_role;
    private javax.swing.JLabel lb_username;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
