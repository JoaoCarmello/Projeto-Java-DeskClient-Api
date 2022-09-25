package View;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.MaskFormatter;
import javax.swing.text.PlainDocument;

public class frmCentralCalcados extends javax.swing.JFrame {

    public frmCentralCalcados() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        txtTamanho = new java.awt.TextField();
        label2 = new java.awt.Label();
        txtCategoria = new java.awt.TextField();
        label3 = new java.awt.Label();
        txtMarca = new java.awt.TextField();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        label7 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCalcados = new javax.swing.JTable();
        label6 = new java.awt.Label();
        btnAtualizar = new java.awt.Button();
        btnCadastrar = new java.awt.Button();
        btnLimpar = new java.awt.Button();
        btnAlterar = new java.awt.Button();
        btnSair = new java.awt.Button();
        btnExcluir = new java.awt.Button();
        btnPesquisar = new java.awt.Button();
        label8 = new java.awt.Label();
        ftxtPreco = new javax.swing.JFormattedTextField();
        cbFiltro = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        txtqt_estoque = new javax.swing.JFormattedTextField();
        txtpesquisarPor = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("frmCentralCalcados");
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        label1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label1.setText("Tamanho");

        txtTamanho.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtTamanho.setName("txtTamanho"); // NOI18N
        txtTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTamanhoActionPerformed(evt);
            }
        });

        label2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label2.setText("Categoria");

        txtCategoria.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtCategoria.setName("txtCategoria"); // NOI18N

        label3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label3.setText("Preço");

        txtMarca.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtMarca.setName("txtMarca"); // NOI18N

        label4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label4.setText("Marca");

        label5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label5.setText("Quantidade Estoque");

        label7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label7.setText("Descrição");

        tbCalcados.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tbCalcados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Tamanho", "Categoria", "Preço", "Marca", "Estoque", "Descrição", "DataCadastro"
            }
        ));
        tbCalcados.setName("tblCalcados"); // NOI18N
        jScrollPane1.setViewportView(tbCalcados);

        label6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        label6.setName(""); // NOI18N
        label6.setText("LOJA CALÇADOS");

        btnAtualizar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnAtualizar.setLabel("Atualizar");
        btnAtualizar.setName("btnAtualizar"); // NOI18N

        btnCadastrar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnCadastrar.setLabel("Cadastrar");
        btnCadastrar.setName("btnCadastrar"); // NOI18N
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnLimpar.setLabel("Limpar");
        btnLimpar.setName("btnLimpar"); // NOI18N
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnAlterar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnAlterar.setLabel("Alterar");
        btnAlterar.setName("btnAlterar"); // NOI18N
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnSair.setLabel("Sair");
        btnSair.setName("btnSair"); // NOI18N
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnExcluir.setLabel("Excluir");
        btnExcluir.setName("btnDeletar"); // NOI18N

        btnPesquisar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnPesquisar.setLabel("Pesquisar");
        btnPesquisar.setName("btnPesquisar"); // NOI18N
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        label8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label8.setText("Pesquisar por:");

        ftxtPreco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
        ftxtPreco.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        ftxtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtPrecoActionPerformed(evt);
            }
        });

        cbFiltro.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tamanho", "Categoria", "Cor", "Preço", "Marca", "Data Cadastro", "Descrição" }));
        cbFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFiltroActionPerformed(evt);
            }
        });

        txtDescricao.setColumns(20);
        txtDescricao.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtDescricao.setRows(5);
        jScrollPane2.setViewportView(txtDescricao);

        txtqt_estoque.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtqt_estoque.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtqt_estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtqt_estoqueActionPerformed(evt);
            }
        });

        txtpesquisarPor.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtpesquisarPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpesquisarPorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtTamanho, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                .addComponent(txtCategoria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ftxtPreco, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtqt_estoque, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(label5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(168, 168, 168)
                                .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtpesquisarPor, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 692, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTamanho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ftxtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(label5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtqt_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(label8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtpesquisarPor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        label1.getAccessibleContext().setAccessibleName("lblTamanho");
        label1.getAccessibleContext().setAccessibleDescription("");
        txtTamanho.getAccessibleContext().setAccessibleName("txtTamanho");
        label2.getAccessibleContext().setAccessibleName("lblCategoria");
        txtCategoria.getAccessibleContext().setAccessibleName("txtCategoria");
        label3.getAccessibleContext().setAccessibleName("lblPreco");
        label3.getAccessibleContext().setAccessibleDescription("");
        txtMarca.getAccessibleContext().setAccessibleName("txtMarca");
        label4.getAccessibleContext().setAccessibleName("lblMarca");
        label5.getAccessibleContext().setAccessibleName("lblqt_Estoque");
        label7.getAccessibleContext().setAccessibleName("lblDescricao");
        label6.getAccessibleContext().setAccessibleName("lblCalcado");
        btnAtualizar.getAccessibleContext().setAccessibleName("btnAtualizar");
        btnCadastrar.getAccessibleContext().setAccessibleName("btnCadastrar");
        btnLimpar.getAccessibleContext().setAccessibleName("btnLimpar");
        btnAlterar.getAccessibleContext().setAccessibleName("btnAlterar");
        btnSair.getAccessibleContext().setAccessibleName("btnSair");
        btnExcluir.getAccessibleContext().setAccessibleName("");
        btnPesquisar.getAccessibleContext().setAccessibleName("btnPesquisar");
        label8.getAccessibleContext().setAccessibleName("lblPesquisar");

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1020, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents
private JFrame frame;
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        SairAplicacao();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        Double.parseDouble(ftxtPreco.getText().replace(",", "."));
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtTamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTamanhoActionPerformed

    }//GEN-LAST:event_txtTamanhoActionPerformed

    private void ftxtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxtPrecoActionPerformed
    }//GEN-LAST:event_ftxtPrecoActionPerformed

    private void txtqt_estoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtqt_estoqueActionPerformed

    }//GEN-LAST:event_txtqt_estoqueActionPerformed

    private void cbFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFiltroActionPerformed
      mascaraPesquisar();
    }//GEN-LAST:event_cbFiltroActionPerformed

    private void txtpesquisarPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpesquisarPorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpesquisarPorActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarActionPerformed
   
    
    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCentralCalcados().setVisible(true);

            }
        });
    }

    private void limparCampos() {
        txtTamanho.setText("");
        txtCategoria.setText("");
        txtMarca.setText("");
        ftxtPreco.setText("");
        txtqt_estoque.setText("");
        txtDescricao.setText("");
        txtpesquisarPor.setText("");
    }

    private void SairAplicacao() {
        frame = new JFrame("Sair");
        if (JOptionPane.showConfirmDialog(frame, "Realmente deseja sair?", "Atenção", JOptionPane.YES_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    private void mascaraPesquisar() {
        var item = cbFiltro.getSelectedItem().toString();
        switch (item) {
            case "Tamanho":
                txtpesquisarPor.setDocument(new DefaultStyledDocument());
                txtpesquisarPor.setText("");
                txtpesquisarPor.requestFocus();
                break;
            case "Categoria":
                txtpesquisarPor.setDocument(new DefaultStyledDocument());
                txtpesquisarPor.setText("");
                txtpesquisarPor.requestFocus();
                break;
            case "Cor":
                txtpesquisarPor.setDocument(new DefaultStyledDocument());
                txtpesquisarPor.setText("");
                txtpesquisarPor.requestFocus();
                break;
            case "Preço":
                txtpesquisarPor.setText("");
                MaskFormatter Preco = null;
                txtpesquisarPor.setDocument(new InserirPreco());
                txtpesquisarPor.requestFocus();
                break;
            case "Marca":
                txtpesquisarPor.setDocument(new DefaultStyledDocument());
                txtpesquisarPor.setText("");
                txtpesquisarPor.requestFocus();
                break;
            case "Data Cadastro":
                txtpesquisarPor.setText("");
                MaskFormatter Data = null;
                txtpesquisarPor.setDocument(new InserirData());
                txtpesquisarPor.requestFocus();
                break;
            case "Descrição":
                 txtpesquisarPor.setDocument(new DefaultStyledDocument());
                txtpesquisarPor.setText("");
                txtpesquisarPor.requestFocus();
                break;
        }
        
    }
     public class InserirData extends PlainDocument {

    public void insertString(int offs, String str, AttributeSet a)
            throws BadLocationException
    {
        String texto = getText(0, getLength());
        if(texto.length() < 11) {
            remove(0, getLength());
            StringBuffer strBuf = new StringBuffer(texto.replaceAll("/", "")
                    + str);
            if(strBuf.length() < 7) strBuf.insert(0, "/");
            else {
                strBuf.insert(strBuf.length() - 4, "/");
                strBuf.insert(strBuf.length() - 7, "/");
                strBuf.insert(strBuf.length() - 8, "/");                
            }
            super.insertString(0, strBuf.toString(), a);
        }
    }
}
    public class InserirPreco extends PlainDocument {

    public void insertString(int offs, String str, AttributeSet a)
            throws BadLocationException
    {
        String texto = getText(0, getLength());
        if(texto.length() < 7) {
            remove(0, getLength());
            StringBuffer strBuf = new StringBuffer(texto.replaceAll(",", "")
                    + str);
            if(strBuf.length() < 3) strBuf.insert(0, ",");
            else strBuf.insert(strBuf.length() - 2, ",");
            super.insertString(0, strBuf.toString(), a);
        }
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnAlterar;
    private java.awt.Button btnAtualizar;
    private java.awt.Button btnCadastrar;
    private java.awt.Button btnExcluir;
    private java.awt.Button btnLimpar;
    private java.awt.Button btnPesquisar;
    private java.awt.Button btnSair;
    private javax.swing.JComboBox<String> cbFiltro;
    private javax.swing.JFormattedTextField ftxtPreco;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private javax.swing.JTable tbCalcados;
    private java.awt.TextField txtCategoria;
    private javax.swing.JTextArea txtDescricao;
    private java.awt.TextField txtMarca;
    private java.awt.TextField txtTamanho;
    private javax.swing.JFormattedTextField txtpesquisarPor;
    private javax.swing.JFormattedTextField txtqt_estoque;
    // End of variables declaration//GEN-END:variables
}
