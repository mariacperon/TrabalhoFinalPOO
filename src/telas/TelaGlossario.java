/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Categoria;
import model.Lugar;
import model.Obra;
import model.Personagem;
import model.Termo;
import model.TermoGeral;

/**
 *
 * @author Pichau
 */
public class TelaGlossario extends javax.swing.JFrame {

    /**
     * Creates new form TelaGlossario
     */
    public TelaGlossario() {
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
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaPersonagem = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabelaLugar = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelaGeral = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Glossário");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Glossário");

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("+ Adicionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/icons/lupa.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/icons/livro.png"))); // NOI18N

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        tabelaPersonagem.setModel(setListaTermos(new Personagem(), null));
        tabelaPersonagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaPersonagemMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabelaPersonagem);

        tabelaLugar.setModel(setListaTermos(new Lugar(), null));
        tabelaLugar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaLugarMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tabelaLugar);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Personagem");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Lugar");

        tabelaGeral.setModel(setListaTermos(new TermoGeral(), null));
        tabelaGeral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaGeralMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tabelaGeral);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("Geral");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(95, 95, 95)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(251, 251, 251)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(163, 163, 163))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(84, 84, 84)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(807, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField1)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(165, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(24, 24, 24)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public TelaCadastro telaCadastro = new TelaCadastro();
    
    private static Termo lConfig = new Lugar();
    private static Termo pConfig = new Personagem();
    private static Termo gConfig = new TermoGeral();
    
    private final String colunas[]={"Nome","Descricao"};
    
    private static List<Lugar> invisibleLugares = new ArrayList<>();
    private static List<Personagem> invisiblePersonagens = new ArrayList<>();
    private static List<TermoGeral> invisibleGerais = new ArrayList<>();
    
    private TableModel setListaTermos(Termo instance, List<? extends Termo> termosFiltrados){
        DefaultTableModel model = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                //Only the third column
                return false;
            }
        };
                
        model.isCellEditable(0, 0);
        model.setColumnIdentifiers(colunas);
        
        JTable table = new JTable();
        table.setModel(model);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setFillsViewportHeight(true);
        
        List<? extends Termo> termos;
        if (termosFiltrados == null) {
            if(instance instanceof Personagem) {
                invisiblePersonagens = new ArrayList<>();
                termos = pConfig.retornaTermos();
            } else if (instance instanceof Lugar) {
                invisibleLugares = new ArrayList<>();
                termos = lConfig.retornaTermos();
            } else {
                invisibleGerais = new ArrayList<>();
                termos = gConfig.retornaTermos();
            }
        } else {
            termos = termosFiltrados;
        }
        
        for (Termo termo : termos) {
            model.addRow(new Object[]{termo.getNome(), termo.getDescricao()});
            
            if(termo instanceof Personagem) {
                invisiblePersonagens.add((Personagem) termo);
            } else if (termo instanceof Lugar) {
                invisibleLugares.add((Lugar) termo);
            } else {
                invisibleGerais.add((TermoGeral) termo);
            }
        }
        
        return table.getModel();
    } 
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        telaCadastro.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
        tabelaLugar.setModel(setListaTermos(new Lugar(), 
                lConfig.filtrarTermos(jTextField1.getText())));
        tabelaPersonagem.setModel(setListaTermos(new Personagem(), 
                pConfig.filtrarTermos(jTextField1.getText())));
        tabelaGeral.setModel(setListaTermos(new TermoGeral(), 
                gConfig.filtrarTermos(jTextField1.getText())));
    }//GEN-LAST:event_jTextField1KeyTyped

    private void tabelaLugarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaLugarMouseClicked
        // TODO add your handling code here:
        int row = tabelaLugar.getSelectedRow();
        Lugar lugar = invisibleLugares.get(row);
        JOptionPane.showMessageDialog(null, lugar);
    }//GEN-LAST:event_tabelaLugarMouseClicked

    private void tabelaPersonagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaPersonagemMouseClicked
        // TODO add your handling code here:
        int row = tabelaPersonagem.getSelectedRow();
        Personagem personagem = invisiblePersonagens.get(row);
        JOptionPane.showMessageDialog(null, personagem);
    }//GEN-LAST:event_tabelaPersonagemMouseClicked

    private void tabelaGeralMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaGeralMouseClicked
        // TODO add your handling code here:
        int row = tabelaGeral.getSelectedRow();
        TermoGeral geral = invisibleGerais.get(row);
        JOptionPane.showMessageDialog(null, geral);
    }//GEN-LAST:event_tabelaGeralMouseClicked
    
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
            java.util.logging.Logger.getLogger(TelaGlossario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGlossario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGlossario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGlossario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //cadastraTermos();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGlossario().setVisible(true);
            }
        });
    }
    
    private static void cadastraTermos() {
        Lugar lugar = mockarLugar();
        Personagem personagem = mockarPersonagem();
        TermoGeral geral = mockarGeral();
        
        lConfig.cadastrarTermo(lugar);
        pConfig.cadastrarTermo(personagem);
        gConfig.cadastrarTermo(geral);
    }
    
    private static Lugar mockarLugar() {
        Lugar lugar = new Lugar("jardim", "teste teste", "testetestetestes");
        Obra obr1 = new Obra("teste", Categoria.JOGOS, 2023, 1, 1);
        Obra obr2 = new Obra("teste2", Categoria.FILME, 2024, 1, 1);
        
        lugar.setObras(List.of(obr1, obr2));
        
        return lugar;
    }
    
    private static Personagem mockarPersonagem() {
        Personagem personagem = new Personagem("Teste Silva", "teste teste", 
                "Loiro chato", List.of("Aquele loirinho la"), "Ser chato e feio");
        Obra obr1 = new Obra("Livro 1", Categoria.LIVRO, 2023, 1, 1);
        Obra obr2 = new Obra("Filme 1", Categoria.FILME, 2024, 1, 1);
        
        personagem.setObras(List.of(obr1, obr2));
        
        return personagem;
    }
    
    private static TermoGeral mockarGeral() {
        TermoGeral geral = new TermoGeral("Livro", "Livro grandao");
        
        Obra obr1 = new Obra("Livro 2", Categoria.LIVRO, 2023, 1, 1);
        Obra obr2 = new Obra("Filme 3", Categoria.FILME, 2024, 1, 1);
        
        geral.setObras(List.of(obr1, obr2));
        
        return geral;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tabelaGeral;
    private javax.swing.JTable tabelaLugar;
    private javax.swing.JTable tabelaPersonagem;
    // End of variables declaration//GEN-END:variables
}