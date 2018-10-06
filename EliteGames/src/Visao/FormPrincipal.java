

package Visao;


public class FormPrincipal extends javax.swing.JFrame {


    public FormPrincipal() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemMenuVendas = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuItemGames = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuItemClientes = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        menuItemFuncionarios = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        menuItemPlataformas = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        menuItemCategorias = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        menuItemSubcategorias = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Ações");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        itemMenuVendas.setText("Vendas");
        itemMenuVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuVendasActionPerformed(evt);
            }
        });
        jMenu1.add(itemMenuVendas);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cadastro");

        menuItemGames.setText("Games");
        menuItemGames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemGamesActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemGames);
        jMenu2.add(jSeparator2);

        menuItemClientes.setText("Clientes");
        menuItemClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemClientesActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemClientes);
        jMenu2.add(jSeparator3);

        menuItemFuncionarios.setText("Funcionários");
        menuItemFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemFuncionariosActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemFuncionarios);
        jMenu2.add(jSeparator4);

        menuItemPlataformas.setText("Plataformas");
        menuItemPlataformas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemPlataformasActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemPlataformas);
        jMenu2.add(jSeparator5);

        menuItemCategorias.setText("Categorias");
        menuItemCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCategoriasActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemCategorias);
        jMenu2.add(jSeparator6);

        menuItemSubcategorias.setText("Subcategorias");
        menuItemSubcategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSubcategoriasActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemSubcategorias);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ajuda");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemGamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemGamesActionPerformed
        FormGame form = new FormGame();
        form.setVisible(true);
    }//GEN-LAST:event_menuItemGamesActionPerformed

    private void menuItemClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemClientesActionPerformed
        FormCliente form = new FormCliente();
        form.setVisible(true);
    }//GEN-LAST:event_menuItemClientesActionPerformed

    private void menuItemFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemFuncionariosActionPerformed
        FormFuncionario form = new FormFuncionario();
        form.setVisible(true);
    }//GEN-LAST:event_menuItemFuncionariosActionPerformed

    private void menuItemCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCategoriasActionPerformed
        FormCategoria form = new FormCategoria();
        form.setVisible(true);
    }//GEN-LAST:event_menuItemCategoriasActionPerformed

    private void menuItemPlataformasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemPlataformasActionPerformed
        FormPlataforma form = new FormPlataforma();
        form.setVisible(true);
    }//GEN-LAST:event_menuItemPlataformasActionPerformed

    private void menuItemSubcategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSubcategoriasActionPerformed
        FormSubcategoria form = new FormSubcategoria();
        form.setVisible(true);
    }//GEN-LAST:event_menuItemSubcategoriasActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void itemMenuVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuVendasActionPerformed
        FormVenda form = new FormVenda();
        form.setVisible(true);
    }//GEN-LAST:event_itemMenuVendasActionPerformed


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
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemMenuVendas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JMenuItem menuItemCategorias;
    private javax.swing.JMenuItem menuItemClientes;
    private javax.swing.JMenuItem menuItemFuncionarios;
    private javax.swing.JMenuItem menuItemGames;
    private javax.swing.JMenuItem menuItemPlataformas;
    private javax.swing.JMenuItem menuItemSubcategorias;
    // End of variables declaration//GEN-END:variables

}
