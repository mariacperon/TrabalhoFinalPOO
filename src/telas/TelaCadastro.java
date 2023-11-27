/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Lugar;
import model.Obra;
import model.Personagem;
import model.Termo;
import model.TermoGeral;

/**
 *
 * @author Pichau
 */
public class TelaCadastro extends javax.swing.JFrame {

    public TelaCadastro(TelaGlossario telaGlossario) {
        initComponents();
        //this.telaGlossario = telaGlossario;
        tabsTipos.setVisible(false);
        this.telaGlossario = telaGlossario;
        setFrameSize();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        buttonSalvarTermo = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        selectTipo = new javax.swing.JComboBox<>();
        fieldNome = new javax.swing.JTextField();
        fieldDescricao = new javax.swing.JTextField();
        tabsTipos = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        fieldFeitos = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listAtores = new javax.swing.JList<>();
        fieldAtor = new javax.swing.JTextField();
        buttonAdicionarAtores = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        fieldCaracteristicas = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        fieldDescricaoDetalhada = new javax.swing.JTextArea();
        buttonVncularObras = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelaObras = new javax.swing.JTable();

        setTitle("Novo Termo");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Novo Termo");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/icons/adicionar-ficheiro.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Nome:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Descrição:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        buttonSalvarTermo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buttonSalvarTermo.setText("Salvar");
        buttonSalvarTermo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarTermoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Classificação:");

        selectTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Geral", "Lugar", "Personagem" }));
        selectTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectTipoActionPerformed(evt);
            }
        });

        tabsTipos.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Características:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Feitos:");

        fieldFeitos.setColumns(20);
        fieldFeitos.setRows(5);
        jScrollPane1.setViewportView(fieldFeitos);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Atores:");

        listAtores.setModel(montaListaAtores());
        listAtores.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                listAtoresKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(listAtores);

        buttonAdicionarAtores.setText("Adicionar ator");
        buttonAdicionarAtores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarAtoresActionPerformed(evt);
            }
        });

        fieldCaracteristicas.setColumns(20);
        fieldCaracteristicas.setRows(5);
        jScrollPane5.setViewportView(fieldCaracteristicas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAdicionarAtores)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(fieldAtor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(fieldAtor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonAdicionarAtores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabsTipos.addTab("Personagem", jPanel1);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Descrição Detalhada:");

        fieldDescricaoDetalhada.setColumns(20);
        fieldDescricaoDetalhada.setRows(5);
        jScrollPane3.setViewportView(fieldDescricaoDetalhada);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabsTipos.addTab("Lugar", jPanel2);

        buttonVncularObras.setText("Adicionar Obra");
        buttonVncularObras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVncularObrasActionPerformed(evt);
            }
        });

        tabelaObras.setModel(setListaObras());
        jScrollPane4.setViewportView(tabelaObras);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addGap(32, 32, 32))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel5))
                                            .addGap(59, 59, 59)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(selectTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(fieldNome)
                                        .addComponent(fieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(buttonSalvarTermo, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(buttonVncularObras)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(tabsTipos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(25, 25, 25)
                .addComponent(buttonSalvarTermo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(selectTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(fieldNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonVncularObras)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(tabsTipos, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public List<String> atores = new ArrayList<>();
    public String tipoSelect = "Geral";
    
    private final String colunas[]={"Nome","Ano lancamento", "Categoria"};
    
    private static List<Obra> obras = new ArrayList<>();
    
    TelaCadastroObra tco = new TelaCadastroObra(this);
    
    TelaGlossario telaGlossario = null;
    
    private void buttonSalvarTermoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarTermoActionPerformed
        // TODO add your handling code here:
        Termo termo = null;
        if(validaCamposTermo()) {
            switch (tipoSelect) {
                case "Geral":
                    termo = retornaNovoGeral();
                    break;
                case "Personagem":
                    termo = retornaNovoPersonagem();
                    break;
                case "Lugar":
                    termo = retornaNovoLugar();
                    break;
                default:
                    break;
            }
            
            if (termo != null) {
                termo.setObras(obras);
                termo.cadastrarTermo(termo);
                setVisible(false);
                telaGlossario.atualizaTabela(termo);
            }
        }
    }//GEN-LAST:event_buttonSalvarTermoActionPerformed

    private void buttonAdicionarAtoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarAtoresActionPerformed
        // TODO add your handling code here:
        String ator = fieldAtor.getText();
        if (!ator.isEmpty() && !ator.isBlank()) {
            atores.add(ator);
        }
        
        montaListaAtores();
    }//GEN-LAST:event_buttonAdicionarAtoresActionPerformed

    private void listAtoresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listAtoresKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
            atores.removeIf(a -> a == listAtores.getSelectedValue());
            montaListaAtores();
        }
    }//GEN-LAST:event_listAtoresKeyReleased

    private void selectTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectTipoActionPerformed
        // TODO add your handling code here:
        if (selectTipo.getSelectedItem() == "Geral") {
            tabsTipos.setVisible(false);
            tipoSelect = "Geral";
        } else {
            if (selectTipo.getSelectedItem() == "Personagem"){
                tabsTipos.setSelectedIndex(0);
                tipoSelect = "Personagem";
            } else {
                tabsTipos.setSelectedIndex(1);
                tipoSelect = "Lugar";
            }
            
            tabsTipos.setVisible(true);
        }
        
        setFrameSize();
    }//GEN-LAST:event_selectTipoActionPerformed

    private void buttonVncularObrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVncularObrasActionPerformed
        // TODO add your handling code here:
        tco = new TelaCadastroObra(this);
        tco.setVisible(true);
    }//GEN-LAST:event_buttonVncularObrasActionPerformed

    private Lugar retornaNovoLugar() {
        if(fieldDescricaoDetalhada.getText().isBlank() || fieldDescricaoDetalhada.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Características não pode estar vazio");
            return null;
        }
        
        return new Lugar(fieldNome.getText(), fieldDescricao.getText(),
          fieldDescricaoDetalhada.getText());
    }
    
    private Personagem retornaNovoPersonagem() {
        if(fieldCaracteristicas.getText().isBlank() || fieldCaracteristicas.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Características não pode estar vazio");
            return null;
        }
        if(atores.isEmpty()){
            JOptionPane.showMessageDialog(null, "O campo Atores não pode estar vazio");
            return null;
        }
        if(fieldFeitos.getText().isBlank() || fieldFeitos.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Feitos não pode estar vazio");
            return null;
        }
        
        return new Personagem(fieldNome.getText(), fieldDescricao.getText(),
          fieldCaracteristicas.getText(), atores, fieldFeitos.getText());
    }
    
    private TermoGeral retornaNovoGeral() {
        return new TermoGeral(fieldNome.getText(), fieldDescricao.getText());

    }
    
    private boolean validaCamposTermo() {
        if(fieldNome.getText().isBlank() || fieldNome.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Nome inválido");
            return false;
        }
        if (fieldDescricao.getText().isBlank() || fieldDescricao.getText().isBlank()){
            JOptionPane.showMessageDialog(null, "Descriçãp inválida");
            return false;
        }
        
        return true;
    }
    
    public TableModel setListaObras(){
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
        
        if (!tco.isVisible() && tco.obra != null) {
            obras.add(tco.obra);
        }
        
        for (Obra obra : obras) {
            if(obra.getNome() != null && obra.getAnoLancamento()!= null) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
                String ano = sdf.format(obra.getAnoLancamento());
                model.addRow(new Object[]{obra.getNome(), ano, obra.getCategoria()});
            }
        }
        
        tabelaObras.setModel(table.getModel());
        
        return table.getModel();
    }
    
    private ListModel montaListaAtores() {
        DefaultListModel model = new DefaultListModel();
        for (String ator : atores) {
            model.addElement(ator);
        }
        
        JList lista = new JList(model);
        
        listAtores.setModel(lista.getModel());
        
        return lista.getModel();
    }
    
    private void setFrameSize() {
        if (!tipoSelect.equals("Geral")) {
            setSize(900, 700);
        } else {
            setSize(474, 700);
        }
    }
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionarAtores;
    private javax.swing.JButton buttonSalvarTermo;
    private javax.swing.JButton buttonVncularObras;
    private javax.swing.JTextField fieldAtor;
    private javax.swing.JTextArea fieldCaracteristicas;
    private javax.swing.JTextField fieldDescricao;
    private javax.swing.JTextArea fieldDescricaoDetalhada;
    private javax.swing.JTextArea fieldFeitos;
    private javax.swing.JTextField fieldNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JList<String> listAtores;
    private javax.swing.JComboBox<String> selectTipo;
    private javax.swing.JTable tabelaObras;
    private javax.swing.JTabbedPane tabsTipos;
    // End of variables declaration//GEN-END:variables
}
