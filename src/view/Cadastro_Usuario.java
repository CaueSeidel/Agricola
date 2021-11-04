/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.UsuarioConttroler;
import model.Usuario;
import tools.CaixaDeDialogo;

/**
 *
 * @author CauÊSeidel
 */
public class Cadastro_Usuario extends javax.swing.JFrame {

    /**
     * Creates new form TelaUsuarios
     */
    
    UsuarioConttroler objUsuarioConttroler;
    
    public Cadastro_Usuario() {
        initComponents();
        atualizarTabela();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtbUsuarios = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNome_tela_usuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtLogin_tela_usuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pass1_tela_usuario = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        pass2_tela_usuario = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtbUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtbUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtbUsuariosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtbUsuarios);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel6.setText("Cadastro de Usuários");

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setText("Nome");

        txtNome_tela_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNome_tela_usuarioActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel2.setText("Login");

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel4.setText("Senha");

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel5.setText("Confirmar Senha ");

        pass2_tela_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass2_tela_usuarioActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(136, 136, 136))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(268, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(pass1_tela_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pass2_tela_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(53, 53, 53))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtLogin_tela_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNome_tela_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel6)
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtNome_tela_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtLogin_tela_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel4)))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass1_tela_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass2_tela_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(288, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //botão de salvar novos usuarios    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean retorno = validarDados();
        
        if(retorno){
            
            Usuario usuario = guardarDados();
            
            UsuarioConttroler objController = new UsuarioConttroler();
            if(objController.incluir(usuario)){
            
            txtLogin_tela_usuario.setText("");
            txtNome_tela_usuario.setText("");
            pass1_tela_usuario.setText("");
            pass2_tela_usuario.setText("");
            atualizarTabela();
            CaixaDeDialogo.obterinstancia().exibirMensagem("Usuario criado com sucesso");
            }else {
                CaixaDeDialogo.obterinstancia().exibirMensagem("Não criado");
            }
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private Usuario guardarDados(){
        try{
            Usuario objeto = new Usuario();
            
            objeto.setLogin(txtLogin_tela_usuario.getText().trim());
            objeto.setNome(txtNome_tela_usuario.getText().trim());
            objeto.setSenha(pass1_tela_usuario.getText());
            return objeto;
        }catch(Exception e){
            return null;
        }
    }
    
    private void atualizarTabela() {
        try {


           UsuarioConttroler objUsuarioController = new UsuarioConttroler();
            
           
            objUsuarioController.preencher(jtbUsuarios);


        } catch (Exception ex) {
            CaixaDeDialogo.obterinstancia().exibirMensagem("ERRO:" + ex.getMessage());
        }
    }
    
    
    
    private void txtNome_tela_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNome_tela_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNome_tela_usuarioActionPerformed
    
    /*
    //BOTAO PARA EXCLUIR USUARIOS UTILIZANDO O ID    */
    private void pass2_tela_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass2_tela_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pass2_tela_usuarioActionPerformed

    private void jtbUsuariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbUsuariosMousePressed
        // TODO add your handling code here:
        try {


            //pega a linha selecionada
            int linhaSelecionada = jtbUsuarios.getSelectedRow();


            // Primeira coluna da linha
            String codigo = jtbUsuarios.getModel().getValueAt(linhaSelecionada, 0).toString();


            //Verifica se clicou na coluna 3 => EXCLUIR
            //buscar no banco de dados o registro e preencher nos campos da tela
            objUsuarioConttroler = new UsuarioConttroler();
            Usuario objeto = objUsuarioConttroler.buscar(codigo);
                
            if (jtbUsuarios.isColumnSelected(2)) {
                try {
                    boolean wPergunta = CaixaDeDialogo.obterinstancia()
                            .pedirConfirmacao("Tem certeza de que deseja excluir?", "", 'p');
                    if (wPergunta == true) {
                        //exclusão do registro selecionado
                        objUsuarioConttroler = new UsuarioConttroler();
                        boolean retorno = objUsuarioConttroler.excluir(codigo);
                        if(retorno){
                            atualizarTabela();
                            CaixaDeDialogo.obterinstancia().exibirMensagem("Registro excluído com sucesso");
                            
                        }else{
                            CaixaDeDialogo.obterinstancia().exibirMensagem("Erro ao excluir");
                        }
                    }


                    atualizarTabela();


                } catch (Exception ex) {
                    CaixaDeDialogo.obterinstancia().exibirMensagem("Erro: " + ex.getMessage());
                }
            } else {
                if (objeto != null) {
                    preencherCampos(objeto);
                }
            }


        } catch (Exception ex) {
            CaixaDeDialogo.obterinstancia().exibirMensagem(ex.getMessage(), 'e');
        }
    }//GEN-LAST:event_jtbUsuariosMousePressed
    
    private void preencherCampos(Usuario objeto){
        try{
            lblId.setText(String.valueOf(objeto.getId()));
            txtLogin_tela_usuario.setText(objeto.getLogin());
            txtNome_tela_usuario.setText(objeto.getNome());
        }catch(Exception e){
            
        }
    }
    
    private Usuario guardarId(){
        try{
        Usuario objeto = new Usuario();
           
        objeto.setId(Integer.parseInt(txtexcluirUsuarioById_tela_usuarios.getText()));
        return objeto;
        }catch(NumberFormatException e){
            System.out.println("guardarID ERRO: "+e.getMessage());
            return null;
        }
        
    }
    
    private boolean validarDados(){
        
        if(txtNome_tela_usuario.getText().trim().equals("")){
            CaixaDeDialogo.obterinstancia().exibirMensagem("Informe um Nome");
            return false;
        }
        if(txtLogin_tela_usuario.getText().trim().equals("")){
            CaixaDeDialogo.obterinstancia().exibirMensagem("Informe um Login");
            return false;
        }
        
        int indice = txtLogin_tela_usuario.getText().indexOf(" ");
       if(indice >= 0){
           CaixaDeDialogo.obterinstancia().exibirMensagem("Login sem espaços");
       }
       if(pass1_tela_usuario.getText().trim().equals("")){
            CaixaDeDialogo.obterinstancia().exibirMensagem("Senha 1 em branco");
            return false;
        }
       if(pass2_tela_usuario.getText().trim().equals("")){
            CaixaDeDialogo.obterinstancia().exibirMensagem("Senha 2 em branco");
            return false;
        }
       if(!pass1_tela_usuario.getText().trim().equals(pass2_tela_usuario.getText())){
            CaixaDeDialogo.obterinstancia().exibirMensagem("Senha 1 em branco");
            return false;
        }
       
       return true;
            
        
        
        /*if(txtLogin_tela_usuario.equals("")){
            CaixaDeDialogo.obterinstancia().exibirMensagem("Informe um Login");
            return false;
        }else if(txtNome_tela_usuario.equals("")){
            CaixaDeDialogo.obterinstancia().exibirMensagem("Informe um nome");
            return false;
        }else if(pass1_tela_usuario.equals("")){
            CaixaDeDialogo.obterinstancia().exibirMensagem("Informe uma senha");
            return false;
        }else if(pass2_tela_usuario.equals("")){
            CaixaDeDialogo.obterinstancia().exibirMensagem("Informe uma senha");
            return false;
        }else if(pass1_tela_usuario != pass2_tela_usuario){
            CaixaDeDialogo.obterinstancia().exibirMensagem("Senha um diferente da senha 2");
            return false;
        }
        
            return true;
        */
    }
        
    
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
            java.util.logging.Logger.getLogger(Cadastro_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Cadastro_Usuario().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbUsuarios;
    private javax.swing.JPasswordField pass1_tela_usuario;
    private javax.swing.JPasswordField pass2_tela_usuario;
    private javax.swing.JTextField txtLogin_tela_usuario;
    private javax.swing.JTextField txtNome_tela_usuario;
    // End of variables declaration//GEN-END:variables
}
