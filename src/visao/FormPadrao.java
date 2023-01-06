package visao;

import dominio.Aluno;
import dominio.Funcoes;
import static dominio.Funcoes.*;
import static dominio.ManipulaArquivo.*;
import static dominio.ValidaCPF.*;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.MaskFormatter;

/**
 * janela principal do projeto
 * entrada de dados, validação, permissões de acesso aos campos e botões
 * campos e botoes são habilitados conforme a ação do usuário
 * @author Sergio Avila
 */
public class FormPadrao extends javax.swing.JInternalFrame {
    
    public ArrayList<Aluno> aluno = new ArrayList<Aluno>();
    
    
    @SuppressWarnings("empty-statement")
    public FormPadrao() {
        initComponents();
        setTitle("COLÉGIO FICTÍCIO - CADASTRO DE ALUNOS");
        habilitaBotoes(true);
        habilitaCampos(false); 
        formataCampos();
        
        try {
            aluno = LeArquivo();
            DefaultTableModel dtm = (DefaultTableModel) jtAluno.getModel();
            for (int i = 0; i < aluno.size(); i++) {
                SimpleDateFormat converte = new SimpleDateFormat("dd/MM/yyyy");
                dtm.addRow(new Object[]{aluno.get(i).getMatricula(), aluno.get(i).getNome(),
                aluno.get(i).getIdade(), converte.format(aluno.get(i).getDataNascimento()),
                aluno.get(i).getTelefone(), aluno.get(i).getCpf()});
                
            }
        } catch (IOException ex) {
            Logger.getLogger(FormPadrao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(FormPadrao.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            aluno = LeArquivo();
        } catch (IOException | ParseException ex) {
            Logger.getLogger(FormPadrao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        DefaultTableModel modelo = (DefaultTableModel) jtAluno.getModel();
        jtAluno.setRowSorter(new TableRowSorter(modelo));
    }
    
    /**
     * mascara de entrada para o cpf e data de nascimento
     * @author Carlos Henrique
     */
    private void formataCampos(){
        try {
            MaskFormatter mascara = new MaskFormatter("(##)#####-####");
            mascara.install(jtfTelefone);
            MaskFormatter mascara2 = new MaskFormatter("###.###.###-##");
            mascara2.install(jtfCpf);
            MaskFormatter mascara3 = new MaskFormatter("##/##/####");
            mascara3.install(jtfDataNasc);
        } catch (ParseException ex) {
            Logger.getLogger(FormPadrao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpnBotoes = new javax.swing.JPanel();
        jbCancelar = new javax.swing.JButton();
        jbNovo = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbFechar = new javax.swing.JButton();
        jpnFormulario = new javax.swing.JPanel();
        jlAluno = new javax.swing.JLabel();
        jtfAluno = new javax.swing.JTextField();
        jlDataNasc = new javax.swing.JLabel();
        jlTelefone = new javax.swing.JLabel();
        jlCpf = new javax.swing.JLabel();
        jtfTelefone = new javax.swing.JFormattedTextField();
        jtfCpf = new javax.swing.JFormattedTextField();
        jtfDataNasc = new javax.swing.JFormattedTextField();
        jpnConsulta = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtfElementosQuant = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtPrimeiraMatricula = new javax.swing.JTextField();
        jtfTerceiroElemento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfUltimaMatricula = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAluno = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jtfAlunoMaisNovo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtfAlunoMaisVelho = new javax.swing.JTextField();
        jbGerar = new javax.swing.JButton();

        jpnTitulo.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro de Alunos");

        javax.swing.GroupLayout jpnTituloLayout = new javax.swing.GroupLayout(jpnTitulo);
        jpnTitulo.setLayout(jpnTituloLayout);
        jpnTituloLayout.setHorizontalGroup(
            jpnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTituloLayout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnTituloLayout.setVerticalGroup(
            jpnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jpnBotoes.setBackground(new java.awt.Color(255, 255, 255));

        jbCancelar.setBackground(new java.awt.Color(255, 255, 255));
        jbCancelar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jbCancelar.setMnemonic('C');
        jbCancelar.setText("CANCELAR");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbNovo.setBackground(new java.awt.Color(255, 255, 255));
        jbNovo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jbNovo.setMnemonic('N');
        jbNovo.setText("NOVO");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        jbAlterar.setBackground(new java.awt.Color(255, 255, 255));
        jbAlterar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jbAlterar.setMnemonic('A');
        jbAlterar.setText("ALTERAR");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jbExcluir.setBackground(new java.awt.Color(255, 255, 255));
        jbExcluir.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jbExcluir.setMnemonic('E');
        jbExcluir.setText("<html>EXCLUIR<br />ÚLTIMO</html>");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbSalvar.setBackground(new java.awt.Color(255, 255, 255));
        jbSalvar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jbSalvar.setMnemonic('S');
        jbSalvar.setText("SALVAR");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbFechar.setBackground(new java.awt.Color(255, 255, 255));
        jbFechar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jbFechar.setMnemonic('F');
        jbFechar.setText("FECHAR");
        jbFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnBotoesLayout = new javax.swing.GroupLayout(jpnBotoes);
        jpnBotoes.setLayout(jpnBotoesLayout);
        jpnBotoesLayout.setHorizontalGroup(
            jpnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBotoesLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jbNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jbFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jpnBotoesLayout.setVerticalGroup(
            jpnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jpnFormulario.setBackground(new java.awt.Color(255, 255, 255));

        jlAluno.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jlAluno.setText("Nome do Aluno");

        jtfAluno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtfAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfAlunoActionPerformed(evt);
            }
        });

        jlDataNasc.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jlDataNasc.setText("Data Nasc.:");

        jlTelefone.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jlTelefone.setText("Telefone");

        jlCpf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jlCpf.setText("CPF.:");

        jtfTelefone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtfTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTelefoneActionPerformed(evt);
            }
        });

        jtfCpf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jtfDataNasc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtfDataNasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDataNascActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnFormularioLayout = new javax.swing.GroupLayout(jpnFormulario);
        jpnFormulario.setLayout(jpnFormularioLayout);
        jpnFormularioLayout.setHorizontalGroup(
            jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnFormularioLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnFormularioLayout.createSequentialGroup()
                        .addComponent(jlAluno)
                        .addGap(0, 649, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnFormularioLayout.createSequentialGroup()
                        .addGroup(jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtfAluno, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnFormularioLayout.createSequentialGroup()
                                .addGroup(jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlDataNasc)
                                    .addComponent(jtfDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlTelefone)
                                    .addComponent(jtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(93, 93, 93)
                                .addGroup(jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlCpf))))
                        .addGap(66, 66, 66))))
        );
        jpnFormularioLayout.setVerticalGroup(
            jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnFormularioLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jlAluno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDataNasc)
                    .addComponent(jlTelefone)
                    .addComponent(jlCpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDataNasc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfTelefone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );

        jpnConsulta.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Qt.El.mLista");

        jtfElementosQuant.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("1a. matricula");

        jtPrimeiraMatricula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jtfTerceiroElemento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("3o. elemento");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Ultima Matrícula");

        jtfUltimaMatricula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jtAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matricula", "Nome", "Idade", "Data de nascimento", "Telefone", "CPF"
            }
        ));
        jScrollPane1.setViewportView(jtAluno);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Al. mais novo");

        jtfAlunoMaisNovo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Al. mais velho");

        jtfAlunoMaisVelho.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jbGerar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbGerar.setText("Gerar");
        jbGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGerarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnConsultaLayout = new javax.swing.GroupLayout(jpnConsulta);
        jpnConsulta.setLayout(jpnConsultaLayout);
        jpnConsultaLayout.setHorizontalGroup(
            jpnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jpnConsultaLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfTerceiroElemento, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpnConsultaLayout.createSequentialGroup()
                                .addGroup(jpnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfElementosQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jpnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtPrimeiraMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jpnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfUltimaMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jpnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpnConsultaLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7))
                                    .addGroup(jpnConsultaLayout.createSequentialGroup()
                                        .addComponent(jtfAlunoMaisNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtfAlunoMaisVelho, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(34, 34, 34)
                                .addComponent(jbGerar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 89, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jpnConsultaLayout.setVerticalGroup(
            jpnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnConsultaLayout.createSequentialGroup()
                .addGroup(jpnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnConsultaLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jpnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnConsultaLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfElementosQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpnConsultaLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtPrimeiraMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpnConsultaLayout.createSequentialGroup()
                                .addGroup(jpnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtfUltimaMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfAlunoMaisNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfAlunoMaisVelho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnConsultaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbGerar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jpnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfTerceiroElemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        habilitaBotoes(true);
        habilitaCampos(false);
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        habilitaBotoes(false);
        habilitaCampos(true);
        jtfAluno.requestFocus();
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        habilitaBotoes(false);
        // será modificado posteriormente pois, alterar requer dados carregados no form
        habilitaCampos(true);
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        UltimaRemove(aluno);
        JOptionPane.showMessageDialog(this, "EXCLUÍDO COM ÊXITO", "EXCLUIR REGISTRO", JOptionPane.ERROR_MESSAGE);
        DefaultTableModel dtm = (DefaultTableModel) jtAluno.getModel();
        dtm.removeRow(aluno.size());
    }//GEN-LAST:event_jbExcluirActionPerformed
    
    /**
     * valida cpf
     * evita a inserção de registro repetido de cpf
     * @param evt 
     */
    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        //IMPEDE O SALVAMENTO SE O CPF FOR INVÁLIDO
        if(!isCPF(formataCPF(jtfCpf.getText()))){
            JOptionPane.showMessageDialog(this, "CPF INVÁLIDO", "ERRO", JOptionPane.ERROR_MESSAGE);
            habilitaBotoes(false);
            habilitaCampos(true);
            return;
        }
        String nome = jtfAluno.getText();
        Integer matricula = criaMat(aluno);
        
        SimpleDateFormat convert = new SimpleDateFormat("dd/MM/yyyy");
        Date datanasc = null;
        String datinha = jtfDataNasc.getText();
        try {
            datanasc = convert.parse(datinha);
            datinha = convert.format(datanasc);
            datanasc = convert.parse(datinha);
        } catch (ParseException ex) {
            Logger.getLogger(FormPadrao.class.getName()).log(Level.SEVERE, null, ex);
        }
        Integer idade = atribuiIdade(datanasc);
        String telefone = jtfTelefone.getText();
        String cpf = jtfCpf.getText();
        
        final Aluno salvar = new Aluno(matricula, nome, idade, datanasc, telefone, cpf);
        final ArrayList<Aluno> comparar = new ArrayList(aluno);
        if (Funcoes.ExisteAluno(comparar, salvar)){
            if (ComparaCPF(cpf, aluno)) {
                JOptionPane.showMessageDialog(this, "ALUNO JÁ CADASTRADO", "  ERRO", JOptionPane.ERROR_MESSAGE);
                habilitaBotoes(true);
                habilitaCampos(false);
                limpaCampos();
                return;
            }
        }
        
        // condicional para salvar o registro
        aluno.add(salvar);
        DefaultTableModel tabela = (DefaultTableModel) jtAluno.getModel();
        Object[] dados = {matricula, nome, atribuiIdade(datanasc), datinha, 
            telefone, cpf};
        tabela.addRow(dados);
        
        for (Aluno aluno1 : aluno) {
            System.out.println(aluno1);
        }
        
        Integer idades[] = Funcoes.Idades(aluno);
        System.out.println("Maior idade: " + idades[0] + "\nMenor idade: " + idades[1]);        
        habilitaBotoes(true);
        habilitaCampos(false);
        limpaCampos();  
        JOptionPane.showMessageDialog(this, "SALVO COM SUCESSO", "  ", JOptionPane.INFORMATION_MESSAGE);        
    }//GEN-LAST:event_jbSalvarActionPerformed
    
    /**
     * o arquivo txt é criado/atualizado ao fechar o FormPadrao     * 
     * @param evt 
     */
    private void jbFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharActionPerformed
        try {
            EscreveArquivo(aluno);
        } catch (IOException ex) {
            Logger.getLogger(FormPadrao.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_jbFecharActionPerformed

    private void jtfAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfAlunoActionPerformed

    private void jtfTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTelefoneActionPerformed

    private void jtfDataNascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDataNascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfDataNascActionPerformed
    
    /**
     * retorna os valores pedidos no projeto para as suas respactivas caixas de texto
     * @param evt 
     */
    private void jbGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGerarActionPerformed
        
        System.out.println("Terceiro elemento: "  + aluno.get(2));  
        Integer func[] = new Integer[2];
        func = MatriculasFirstLast(aluno);
        // caixa de texto
        jtfElementosQuant.setText(Integer.toString(aluno.size()));
        jtPrimeiraMatricula.setText(Integer.toString(func[0]));
        jtfUltimaMatricula.setText(Integer.toString(func[1]));
        
        func = Idades(aluno);
        
        jtfAlunoMaisNovo.setText(Integer.toString(func[1]));
        jtfAlunoMaisVelho.setText(Integer.toString(func[0]));
        jtfTerceiroElemento.setText(aluno.get(2).toString());         
    }//GEN-LAST:event_jbGerarActionPerformed
    
    /**
     * controle de acesso aos botoes do FormPrincipal
     * @param estado 
     */
    private void habilitaBotoes(boolean estado){
        jbNovo.setEnabled(estado);
        jbAlterar.setEnabled(estado);                
        jbExcluir.setEnabled(estado);
        jbSalvar.setEnabled(!estado);        
        jbCancelar.setEnabled(!estado);
    }
    
    /**
     * controle de acesso aos campos do FormPrincipal
     * @param estado 
     */
    private void habilitaCampos(boolean estado){
        jtfAluno.setEditable(estado);
        jtfDataNasc.setEditable(estado);
        jtfTelefone.setEditable(estado);
        jtfCpf.setEditable(estado);
    }
    
    /**
     * limpa campos do form para uma nova entrada
     */
    public void limpaCampos(){
        jtfAluno.setText("");
        jtfDataNasc.setText("");
        jtfTelefone.setText("");
        jtfCpf.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbFechar;
    private javax.swing.JButton jbGerar;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JLabel jlAluno;
    private javax.swing.JLabel jlCpf;
    private javax.swing.JLabel jlDataNasc;
    private javax.swing.JLabel jlTelefone;
    public javax.swing.JPanel jpnBotoes;
    public javax.swing.JPanel jpnConsulta;
    public javax.swing.JPanel jpnFormulario;
    private javax.swing.JPanel jpnTitulo;
    private javax.swing.JTable jtAluno;
    private javax.swing.JTextField jtPrimeiraMatricula;
    private javax.swing.JTextField jtfAluno;
    private javax.swing.JTextField jtfAlunoMaisNovo;
    private javax.swing.JTextField jtfAlunoMaisVelho;
    private javax.swing.JFormattedTextField jtfCpf;
    private javax.swing.JFormattedTextField jtfDataNasc;
    private javax.swing.JTextField jtfElementosQuant;
    private javax.swing.JFormattedTextField jtfTelefone;
    private javax.swing.JTextField jtfTerceiroElemento;
    private javax.swing.JTextField jtfUltimaMatricula;
    // End of variables declaration//GEN-END:variables
}
