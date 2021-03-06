/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Conexoes.ConexaoMySql;
import Controller.ControllerProdutos;
import Model.ModelProdutos;
import Util.Formatador;
import Util.LiveMascaras;
import java.awt.Toolkit;
import java.io.File;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Live Digital Center
 */
public class TelaProduto extends javax.swing.JFrame {

    ArrayList<ModelProdutos> listaModelProdutos = new ArrayList<>();
    ControllerProdutos controllerProdutos = new ControllerProdutos();
    ModelProdutos modelProduto = new ModelProdutos();
    String SalvaAltera;
    Formatador formatador = new Formatador();
    LiveMascaras mascaras = new LiveMascaras();

    /**
     * Creates new form NewJFrame
     */
    public TelaProduto() {
        initComponents();
        carregarProdutos();
        setLocationRelativeTo(null);
        inhabilitar();
        setIcon();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldEstoque = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldFornecedor = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldCodProduto = new javax.swing.JTextField();
        jFormattedTextFieldValor = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProdutos = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButtonNovo = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonRelCliente = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Produtos ?? Live Vendas Vers??o 01.019");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de Produtos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("C??digo:");

        jTextFieldCodigo.setEditable(false);
        jTextFieldCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nome:");

        jTextFieldNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Valor:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Estoque");

        jTextFieldEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEstoqueActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Fornecedor:");

        jTextFieldFornecedor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFornecedorActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("C??digo do Produto:");

        jTextFieldCodProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldCodProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodProdutoActionPerformed(evt);
            }
        });

        jFormattedTextFieldValor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldCodigo))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jFormattedTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(29, 29, 29)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jTextFieldEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel5)
                        .addComponent(jTextFieldFornecedor))
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Produtos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jTableProdutos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "C??d. Produto", "Nome", "Qtd.", "Valor", "Fornecedor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableProdutos);
        if (jTableProdutos.getColumnModel().getColumnCount() > 0) {
            jTableProdutos.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTableProdutos.getColumnModel().getColumn(1).setPreferredWidth(90);
            jTableProdutos.getColumnModel().getColumn(2).setPreferredWidth(350);
            jTableProdutos.getColumnModel().getColumn(3).setPreferredWidth(20);
            jTableProdutos.getColumnModel().getColumn(4).setPreferredWidth(40);
            jTableProdutos.getColumnModel().getColumn(5).setPreferredWidth(80);
        }

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Pesquisa:");

        jTextFieldPesquisar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButtonPesquisar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/icons8_Search_16.png"))); // NOI18N
        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPesquisar)
                .addGap(18, 18, 18)
                .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jButtonNovo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/icons8_Plus_16.png"))); // NOI18N
        jButtonNovo.setText("Novo");
        jButtonNovo.setPreferredSize(new java.awt.Dimension(100, 35));
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonNovo);

        jButtonGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/icons8_Save_16.png"))); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.setPreferredSize(new java.awt.Dimension(110, 35));
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonGuardar);

        jButtonEditar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/icons8_Refresh_16.png"))); // NOI18N
        jButtonEditar.setText("Editar");
        jButtonEditar.setPreferredSize(new java.awt.Dimension(100, 35));
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonEditar);

        jButtonExcluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/eliminar.png"))); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setPreferredSize(new java.awt.Dimension(110, 35));
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonExcluir);

        jButtonCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/icons8_Cancel_16.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setPreferredSize(new java.awt.Dimension(110, 35));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonCancelar);

        jButtonRelCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonRelCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/icons8_Print_16.png"))); // NOI18N
        jButtonRelCliente.setText("Rel Produtos");
        jButtonRelCliente.setPreferredSize(new java.awt.Dimension(140, 35));
        jButtonRelCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRelClienteActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonRelCliente);

        jPanel5.setBackground(new java.awt.Color(0, 70, 121));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setBackground(new java.awt.Color(51, 153, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("CADASTRO DE PRODUTOS");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 1029, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 54, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel6.setBackground(new java.awt.Color(0, 70, 121));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        // TODO add your handling code here:
        habilitar();
        SalvaAltera = "guardar";
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        // TODO add your handling code here:

        if (SalvaAltera.equals("guardar")) {
            this.salvarProduto();
        } else if (SalvaAltera.equals("editar")) {
            this.alteraProduto();
        }


    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        // TODO add your handling code here:
        SalvaAltera = "editar";
        int linha = this.jTableProdutos.getSelectedRow();

        try {
            int codProduto = (int) this.jTableProdutos.getValueAt(linha, 0);
            //Recupera os dados do banco
            modelProduto = controllerProdutos.retornaProdutoController(codProduto);
            //setando na interface
            this.jTextFieldCodigo.setText(String.valueOf(modelProduto.getIdProduto()));
            this.jTextFieldCodProduto.setText(modelProduto.getCodProduto());
            this.jTextFieldNome.setText(modelProduto.getProNome());
            this.jFormattedTextFieldValor.setText(String.valueOf(modelProduto.getProValor()));
            this.jTextFieldEstoque.setText(String.valueOf(modelProduto.getProEstoque()));
            this.jTextFieldFornecedor.setText(modelProduto.getProFornecedor());
//                    habilitar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "C??digo inv??lido ou nenhum registro selecionado", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // TODO add your handling code here:
        int linha = jTableProdutos.getSelectedRow();
        int codProduto = (int) jTableProdutos.getValueAt(linha, 0);
        Object[] opcoes = {"Sim", "N??o"};
        int confirma = JOptionPane.showOptionDialog(rootPane, "Deseja realmente excluir o produto?", "Confirmar", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

        if (confirma == 0) {
            controllerProdutos.excluirProdutoController(codProduto);
            JOptionPane.showMessageDialog(this, "Produto excluido com sucesso!", "Informa????o", JOptionPane.INFORMATION_MESSAGE);
            this.carregarProdutos();
            inhabilitar();
        } else {
            //JOptionPane.showMessageDialog(this, "Erro ao excluir o produto!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        inhabilitar();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) this.jTableProdutos.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter<>(modelo);
        this.jTableProdutos.setRowSorter(classificador);
        String texto = jTextFieldPesquisar.getText();

        classificador.setRowFilter(RowFilter.regexFilter(texto, 1));
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
        jFormattedTextFieldValor.requestFocus();
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jTextFieldEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEstoqueActionPerformed
        // TODO add your handling code here:
        jTextFieldFornecedor.requestFocus();
    }//GEN-LAST:event_jTextFieldEstoqueActionPerformed

    private void jTextFieldFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFornecedorActionPerformed
        // TODO add your handling code here:
        jTextFieldCodProduto.requestFocus();
    }//GEN-LAST:event_jTextFieldFornecedorActionPerformed

    private void jTextFieldCodProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodProdutoActionPerformed
        // TODO add your handling code here:
        jButtonGuardar.requestFocus();
        salvarProduto();
    }//GEN-LAST:event_jTextFieldCodProdutoActionPerformed
     private Connection connection = new ConexaoMySql().conectar();
    private void jButtonRelClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRelClienteActionPerformed
        // TODO add your handling code here:
        
        Map p = new HashMap();
        JasperReport report;
        JasperPrint print;

        try {
            report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
                    + "/src/Relatorios/relProduto.jrxml");
            print = JasperFillManager.fillReport(report, p, connection);
            JasperViewer view = new JasperViewer(print, false);

            view.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Logos/log.png")));
            view.setTitle("Relat??rio de Produtos");
            view.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButtonRelClienteActionPerformed

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
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProduto().setVisible(true);
            }
        });
    }

    private void salvarProduto() {

        if (jTextFieldCodProduto.getText().isEmpty()) {
            JOptionPane.showConfirmDialog(rootPane, "Deves inserir um c??digo para o produto", "Alerta", JOptionPane.WARNING_MESSAGE);
            jTextFieldCodProduto.requestFocus();
            return;
        }

        if (jTextFieldNome.getText().isEmpty()) {
            JOptionPane.showConfirmDialog(rootPane, "Deves inserir um nome para o produto", "Alerta", JOptionPane.WARNING_MESSAGE);
            jTextFieldNome.requestFocus();
            return;
        }

        if (jFormattedTextFieldValor.getText().isEmpty()) {
            JOptionPane.showConfirmDialog(rootPane, "Deves inserir um valor para o produto", "Alerta", JOptionPane.WARNING_MESSAGE);
            jFormattedTextFieldValor.requestFocus();
            return;
        }

        if (jTextFieldEstoque.getText().isEmpty()) {
            JOptionPane.showConfirmDialog(rootPane, "Deves inserir uma quantidade para o produto", "Alerta", JOptionPane.WARNING_MESSAGE);
            jTextFieldEstoque.requestFocus();
            return;
        }

        if (jTextFieldFornecedor.getText().isEmpty()) {
            JOptionPane.showConfirmDialog(rootPane, "Deves inserir um fornecedor para o produto", "Alerta", JOptionPane.WARNING_MESSAGE);
            jTextFieldFornecedor.requestFocus();
            return;
        }

        modelProduto.setCodProduto(this.jTextFieldCodProduto.getText());
        modelProduto.setProNome(this.jTextFieldNome.getText());
        modelProduto.setProValor(Double.parseDouble(this.jFormattedTextFieldValor.getText()));
        modelProduto.setProEstoque(Integer.parseInt(this.jTextFieldEstoque.getText()));
        modelProduto.setProFornecedor(this.jTextFieldFornecedor.getText());
        if (controllerProdutos.salvarProdutoController(modelProduto) > 0) {
            JOptionPane.showMessageDialog(this, "Produto cadastrado com sucesso!", "Informa????o", JOptionPane.INFORMATION_MESSAGE);
            carregarProdutos();
            inhabilitar();
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar o produto!", "Erro", JOptionPane.ERROR_MESSAGE);
            carregarProdutos();
        }
    }

    private void alteraProduto() {
        modelProduto.setCodProduto(this.jTextFieldCodProduto.getText());
        modelProduto.setProNome(this.jTextFieldNome.getText());
        modelProduto.setProValor(Double.parseDouble(this.jFormattedTextFieldValor.getText()));
        
        modelProduto.setProEstoque(Integer.parseInt(this.jTextFieldEstoque.getText()));
        modelProduto.setProFornecedor(this.jTextFieldFornecedor.getText());

        if (controllerProdutos.alterarProdutoController(modelProduto)) {
            JOptionPane.showMessageDialog(this, "Produto alterado com sucesso!", "Informa????o", JOptionPane.INFORMATION_MESSAGE);
            carregarProdutos();
            inhabilitar();
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao alterar o produto!", "Erro", JOptionPane.ERROR_MESSAGE);
            carregarProdutos();
        }
    }

    void inhabilitar() {
        jTextFieldCodProduto.setEnabled(false);
        jTextFieldCodigo.setEnabled(false);
        jTextFieldNome.setEnabled(false);
        jTextFieldEstoque.setEnabled(false);
        jFormattedTextFieldValor.setEnabled(false);
        jTextFieldFornecedor.setEnabled(false);

        jButtonGuardar.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonExcluir.setEnabled(false);

        jTextFieldCodProduto.setText("");
        jTextFieldCodigo.setText("");
        jTextFieldNome.setText("");
        jTextFieldEstoque.setText("");
        jFormattedTextFieldValor.setText("");
        jTextFieldFornecedor.setText("");

    }

    void habilitar() {
        jTextFieldCodProduto.setEnabled(true);
        jTextFieldCodigo.setEnabled(false);
        jTextFieldNome.setEnabled(true);
        jTextFieldEstoque.setEnabled(true);
        jFormattedTextFieldValor.setEnabled(true);
        jTextFieldFornecedor.setEnabled(true);

        jButtonGuardar.setEnabled(true);
        jButtonEditar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonExcluir.setEnabled(true);

        jTextFieldCodigo.setText("");
        jTextFieldNome.setText("");
        jTextFieldEstoque.setText("");
        jFormattedTextFieldValor.setText("");
        jTextFieldFornecedor.setText("");
    }

    /**
     * Preenche a tabela de produtos com os produtos cadastrado no banco
     */
    private void carregarProdutos() {

        listaModelProdutos = controllerProdutos.retornarListaProdutoController();
        DefaultTableModel modelo = (DefaultTableModel) jTableProdutos.getModel();
        modelo.setNumRows(0);

        //Inserir os produtos na tabela
        int cont = listaModelProdutos.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelProdutos.get(i).getIdProduto(),
                listaModelProdutos.get(i).getCodProduto(),
                listaModelProdutos.get(i).getProNome(),
                listaModelProdutos.get(i).getProEstoque(),
                listaModelProdutos.get(i).getProValor(),
                listaModelProdutos.get(i).getProFornecedor()

            }
            );
            habilitar();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonRelCliente;
    private javax.swing.JTextField jFormattedTextFieldValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProdutos;
    private javax.swing.JTextField jTextFieldCodProduto;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldEstoque;
    private javax.swing.JTextField jTextFieldFornecedor;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPesquisar;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Logos/shopping-cart.png"))); //To change body of generated methods, choose Tools | Templates.
    }
}
