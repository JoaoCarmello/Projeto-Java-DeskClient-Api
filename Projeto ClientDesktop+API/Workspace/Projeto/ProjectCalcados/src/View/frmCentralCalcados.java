package View;

import Controller.controllerCalcados;
import Model.Calcado;
import java.awt.HeadlessException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.PlainDocument;

public class frmCentralCalcados extends javax.swing.JFrame {

    public frmCentralCalcados() {
        initComponents();
        setLocationRelativeTo(null);
        ftxtPreco.setDocument(new inserirPreco());
    }
    controllerCalcados controle = new controllerCalcados();
    DefaultTableModel tabelaCalcados;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpCentral = new javax.swing.JPanel();
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
        cbFiltro = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        txtqt_estoque = new javax.swing.JFormattedTextField();
        txtpesquisarPor = new javax.swing.JFormattedTextField();
        txtCor = new java.awt.TextField();
        label9 = new java.awt.Label();
        btnAlterar1 = new java.awt.Button();
        txtID = new java.awt.TextField();
        label10 = new java.awt.Label();
        ftxtPreco = new javax.swing.JFormattedTextField();
        lblDataCadastro = new java.awt.Label();
        txtDataCadastro = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("frmCentralCalcados");
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpCentral.setBackground(new java.awt.Color(204, 204, 204));

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

        txtMarca.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtMarca.setName("txtMarca"); // NOI18N
        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });

        label4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label4.setText("Marca");

        label5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label5.setText("Qtd. Estoque");

        label7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label7.setText("Descrição");

        tbCalcados.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tbCalcados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tamanho", "Categoria", "Cor", "Preço", "Marca", "Estoque", "Descrição", "DataCadastro"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbCalcados.setName("tblCalcados"); // NOI18N
        jScrollPane1.setViewportView(tbCalcados);

        label6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        label6.setName(""); // NOI18N
        label6.setText("LOJA CALÇADOS");

        btnAtualizar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnAtualizar.setLabel("Atualizar");
        btnAtualizar.setName("btnAtualizar"); // NOI18N
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

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
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

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

        txtCor.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtCor.setName("txtCategoria"); // NOI18N
        txtCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorActionPerformed(evt);
            }
        });

        label9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label9.setText("Cor");

        btnAlterar1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnAlterar1.setLabel("Salvar");
        btnAlterar1.setName("btnSalvar"); // NOI18N
        btnAlterar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        txtID.setEnabled(false);
        txtID.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtID.setName("txtID"); // NOI18N
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        label10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label10.setText("ID");

        ftxtPreco.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        ftxtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtPrecoActionPerformed(evt);
            }
        });

        lblDataCadastro.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblDataCadastro.setText("Data Cadastro");

        txtDataCadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtDataCadastro.setEnabled(false);
        txtDataCadastro.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtDataCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpCentralLayout = new javax.swing.GroupLayout(jpCentral);
        jpCentral.setLayout(jpCentralLayout);
        jpCentralLayout.setHorizontalGroup(
            jpCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCentralLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(416, 416, 416))
            .addGroup(jpCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCentralLayout.createSequentialGroup()
                        .addGroup(jpCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jpCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCentralLayout.createSequentialGroup()
                                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(103, 103, 103))
                                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtTamanho, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtMarca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ftxtPreco, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtqt_estoque, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDataCadastro))
                        .addGap(23, 23, 23)
                        .addGroup(jpCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 935, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCentralLayout.createSequentialGroup()
                                .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtpesquisarPor, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCentralLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAlterar1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addGap(114, 114, 114))
        );
        jpCentralLayout.setVerticalGroup(
            jpCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCentralLayout.createSequentialGroup()
                        .addComponent(label10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(txtTamanho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(label9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(ftxtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(label5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txtqt_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(lblDataCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(txtDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(label7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpCentralLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(label8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jpCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtpesquisarPor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(2, 2, 2)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
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
        lblDataCadastro.getAccessibleContext().setAccessibleName("Data Cadastro");

        getContentPane().add(jpCentral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ftxtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxtPrecoActionPerformed
        
    }//GEN-LAST:event_ftxtPrecoActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        SalvarDados();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorActionPerformed

    private void txtpesquisarPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpesquisarPorActionPerformed

    }//GEN-LAST:event_txtpesquisarPorActionPerformed

    private void txtqt_estoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtqt_estoqueActionPerformed

    }//GEN-LAST:event_txtqt_estoqueActionPerformed

    private void cbFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFiltroActionPerformed
        mascaraPesquisar();
    }//GEN-LAST:event_cbFiltroActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        pesquisaCalcados();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        deleteCalcados();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        SairAplicacao();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        alteraCalcados();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        CadastrarDados();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        atualizaCalcados();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed

    }//GEN-LAST:event_txtMarcaActionPerformed

    private void txtTamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTamanhoActionPerformed

    }//GEN-LAST:event_txtTamanhoActionPerformed

    private void txtDataCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataCadastroActionPerformed
    private JFrame frame;

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new frmCentralCalcados().setVisible(true);  
        });
        //ftxtPreco.setDocument(new inserirPreco());
    }
    
///////////////////////////////////////////////////////////////////////////////////////////////////// 
    //Responsavel por mandar os dados do front para a Controller realizar a requisição POST do Cadastro do produto
    public void CadastrarDados(){
        try {
            controle.cadastrar(Integer.parseInt(txtTamanho.getText()),txtCategoria.getText(),txtCor.getText(), ftxtPreco.getText(),txtMarca.getText(), Integer.parseInt(txtqt_estoque.getText()), txtDescricao.getText());
            limparCampos();
            atualizaCalcados();
        } catch (Exception e) {
             JOptionPane.showConfirmDialog(null, "Houve um erro, tente novamente", "Atenção", JOptionPane.PLAIN_MESSAGE, JOptionPane.WARNING_MESSAGE);
             limparCampos();
             atualizaCalcados();
        }      
    }
///////////////////////////////////////////////////////////////////////////////////////////////////// 
     //Responsavel por mandar os dados do front para a Controller realizar a requisição PUT dos dados existentes do produto
    public void SalvarDados(){    
        try {
            controle.salvar(Integer.parseInt(txtID.getText()), Integer.parseInt(txtTamanho.getText()), txtCategoria.getText(), txtCor.getText(), ftxtPreco.getText(), txtMarca.getText(), Integer.parseInt(txtqt_estoque.getText()), txtDescricao.getText());
      
        limparCampos();
        atualizaCalcados();
        
        } catch (Exception e) {
             JOptionPane.showConfirmDialog(null, "Houve um erro, tente novamente"+ e, "Atenção", JOptionPane.PLAIN_MESSAGE, JOptionPane.WARNING_MESSAGE);
             limparCampos();
             atualizaCalcados();
        }    
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////
     //Responsavel por apresentar os dados no front que foi obtido pela Controller que fez a requisição GET na API
    private void atualizaCalcados() {
        SimpleDateFormat fd = new SimpleDateFormat("dd-MM-yyyy");
        if (tbCalcados.getRowCount() == 0) {
            try {
                List<Calcado> listaController = controle.listar();
                listaController.forEach(c -> {
                    tabelaCalcados = (DefaultTableModel) tbCalcados.getModel();
                    tabelaCalcados.addRow(new Object[]{
                        c.getId(),
                        c.getTamanho(),
                        c.getCategoria(),
                        c.getCor(),
                        c.getPreco(),
                        c.getMarca(),
                        c.getqtdestoque(),
                        c.getDescricao(),
                        fd.format(c.getdatacadastro())
                    });
                });
            } catch (Exception e) {
                 JOptionPane.showConfirmDialog(null, "Houve um erro, tente novamente", "Atenção", JOptionPane.PLAIN_MESSAGE, JOptionPane.WARNING_MESSAGE);
            }
        } else {
            tabelaCalcados.setRowCount(0);
            atualizaCalcados();
        }
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////
    //Responsavel por mandar O ID do front para a Controller realizar a requisição DELETE do Cadastro do produto
    private void deleteCalcados() {
        int indice = tbCalcados.getSelectedRowCount();
        int selecao = tbCalcados.getSelectedRow();
        String id = tbCalcados.getValueAt(selecao, 0).toString();

        if (indice == -1) {
            JOptionPane.showConfirmDialog(null, "Selecione um registro para realizar a exclusão. ", "Atenção", JOptionPane.PLAIN_MESSAGE, JOptionPane.WARNING_MESSAGE);
        } else if (indice > 1) {
            JOptionPane.showConfirmDialog(null, "Selecione apenas um registro para realizar a exclusão. ", "Atenção", JOptionPane.PLAIN_MESSAGE, JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                if (JOptionPane.showConfirmDialog(frame, "Realmente deseja excluir?", "Atenção", JOptionPane.YES_OPTION) == JOptionPane.YES_OPTION) {
                    controle.excluir(Integer.parseInt(id));
                    ((DefaultTableModel) tbCalcados.getModel()).removeRow(selecao);
                    JOptionPane.showConfirmDialog(null, "Excluído com sucesso", "Sucesso", JOptionPane.PLAIN_MESSAGE, JOptionPane.WARNING_MESSAGE);
                }

            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, "Houve um erro, tente novamente", "Atenção", JOptionPane.PLAIN_MESSAGE, JOptionPane.WARNING_MESSAGE);
            }

        }
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////
    //Responsavel por pegar os dados do Jtable e passar para os TXT
    private ArrayList alteraCalcados() {

        int indice = tbCalcados.getSelectedRowCount();
        int selecao = tbCalcados.getSelectedRow();
        
        if (indice == 0 || indice > 1) {
            JOptionPane.showConfirmDialog(null, "Selecione apenas um registro para realizar a alteração. ", "Atenção", JOptionPane.PLAIN_MESSAGE, JOptionPane.WARNING_MESSAGE);
        } else {
            txtID.setText(tbCalcados.getValueAt(selecao, 0).toString());
            txtTamanho.setText(tbCalcados.getValueAt(selecao, 1).toString());
            txtCategoria.setText(tbCalcados.getValueAt(selecao, 2).toString());
            txtCor.setText(tbCalcados.getValueAt(selecao, 3).toString());
            ftxtPreco.setText(tbCalcados.getValueAt(selecao, 4).toString().replace(".", ""));
            txtMarca.setText(tbCalcados.getValueAt(selecao, 5).toString());
            txtqt_estoque.setText(tbCalcados.getValueAt(selecao, 6).toString());
            txtDescricao.setText(tbCalcados.getValueAt(selecao, 7).toString());
            txtDataCadastro.setText(tbCalcados.getValueAt(selecao, 8).toString());
        }
        ArrayList<String> dados = new ArrayList();
        dados.add(txtID.getText());
        dados.add(txtTamanho.getText());
        dados.add(txtCategoria.getText());
        dados.add(txtCor.getText());
        dados.add(ftxtPreco.getText());
        dados.add(txtMarca.getText());
        dados.add(txtqt_estoque.getText());
        dados.add(txtDescricao.getText());
        dados.add(txtDataCadastro.getText());
        return (dados);
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////
   //Responsavel por mandar o texto de pesquisa do front para a Controller realizar a requisição de GET dos dados existentes do produto 
    private void pesquisaCalcados() {
        var opcao = cbFiltro.getSelectedItem().toString();
        var pesquisa = txtpesquisarPor.getText();

        if (pesquisa.equals("")) {
            JOptionPane.showConfirmDialog(null, "Favor preencher o campo de pesquisa", "Atenção", JOptionPane.PLAIN_MESSAGE, JOptionPane.WARNING_MESSAGE);
        }
        try {
            SimpleDateFormat fd = new SimpleDateFormat("dd-MM-yyyy");
            if (tbCalcados.getRowCount() == 0) {
                try {
                    List<Calcado> listaController = controle.pesquisar(opcao, pesquisa);
                    listaController.forEach(c -> {
                        tabelaCalcados = (DefaultTableModel) tbCalcados.getModel();
                        tabelaCalcados.addRow(new Object[]{
                            c.getId(),
                            c.getTamanho(),
                            c.getCategoria(),
                            c.getCor(),
                            c.getPreco(),
                            c.getMarca(),
                            c.getqtdestoque(),
                            c.getDescricao(),
                            fd.format(c.getdatacadastro())
                        });
                    });
                } catch (Exception e) {
                    JOptionPane.showConfirmDialog(null, "Houve um erro, tente novamente", "Atenção", JOptionPane.PLAIN_MESSAGE, JOptionPane.WARNING_MESSAGE);
                }
            } else {
                tabelaCalcados.setRowCount(0);
                pesquisaCalcados();
            }
        } catch (HeadlessException e) {
            JOptionPane.showConfirmDialog(null, "Houve um erro: " + e, "Atenção", JOptionPane.PLAIN_MESSAGE, JOptionPane.WARNING_MESSAGE);
        }
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////
   //Responsavel por limpar os caracteres dos campos 
    private void limparCampos() {
        txtID.setText("");
        txtTamanho.setText("");
        txtCategoria.setText("");
        txtMarca.setText("");
        ftxtPreco.setText("");
        txtqt_estoque.setText("");
        txtDescricao.setText("");
        txtpesquisarPor.setText("");
        txtCor.setText("");
        txtDataCadastro.setText("");
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////

    private void SairAplicacao() {
        frame = new JFrame("Sair");
        if (JOptionPane.showConfirmDialog(frame, "Realmente deseja sair?", "Atenção", JOptionPane.YES_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////

    private void mascaraPesquisar() {
        var item = cbFiltro.getSelectedItem().toString();
        switch (item) {
            case "Preço":
                txtpesquisarPor.setText("");
                txtpesquisarPor.setDocument(new inserirPreco());
                txtpesquisarPor.requestFocus();
                break;
            case "Data Cadastro":
                txtpesquisarPor.setText("");
                txtpesquisarPor.setDocument(new inserirData());
                txtpesquisarPor.requestFocus();
                break;
            default:
                txtpesquisarPor.setDocument(new DefaultStyledDocument());
                txtpesquisarPor.setText("");
                txtpesquisarPor.requestFocus();
                break;

        }
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////

    public class inserirData extends PlainDocument {

        @Override
        public void insertString(int offs, String str, AttributeSet a)
                throws BadLocationException {
            String texto = getText(0, getLength());
            if (texto.length() < 10) {
                remove(0, getLength());
                StringBuffer strBuf = new StringBuffer(texto.replaceAll("-", "")
                        + str);
                if (strBuf.length() < 7) {
                    strBuf.insert(0, "-");
                } else {
                    strBuf.insert(strBuf.length() - 4, "-");
                    strBuf.insert(strBuf.length() - 7, "-");
                }
                super.insertString(0, strBuf.toString(), a);
            }
        }
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////

    public class inserirPreco extends PlainDocument {

        @Override
        public void insertString(int offs, String str, AttributeSet a)
                throws BadLocationException {
            String texto = getText(0, getLength());
            if (texto.length() < 7) {
                remove(0, getLength());
                StringBuffer strBuf = new StringBuffer(texto.replaceAll(",", "")
                        + str);
                if (strBuf.length() < 3) {
                    strBuf.insert(0, ",");
                } else {
                    strBuf.insert(strBuf.length() - 2, ",");
                }
                super.insertString(0, strBuf.toString(), a);
            }
        }
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnAlterar;
    private java.awt.Button btnAlterar1;
    private java.awt.Button btnAtualizar;
    private java.awt.Button btnCadastrar;
    private java.awt.Button btnExcluir;
    private java.awt.Button btnLimpar;
    private java.awt.Button btnPesquisar;
    private java.awt.Button btnSair;
    private javax.swing.JComboBox<String> cbFiltro;
    private javax.swing.JFormattedTextField ftxtPreco;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpCentral;
    private java.awt.Label label1;
    private java.awt.Label label10;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private java.awt.Label lblDataCadastro;
    private javax.swing.JTable tbCalcados;
    private java.awt.TextField txtCategoria;
    private java.awt.TextField txtCor;
    private javax.swing.JFormattedTextField txtDataCadastro;
    private javax.swing.JTextArea txtDescricao;
    private java.awt.TextField txtID;
    private java.awt.TextField txtMarca;
    private java.awt.TextField txtTamanho;
    private javax.swing.JFormattedTextField txtpesquisarPor;
    private javax.swing.JFormattedTextField txtqt_estoque;
    // End of variables declaration//GEN-END:variables
}
