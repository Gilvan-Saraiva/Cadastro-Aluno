import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
import java.io.*;
import java.nio.file.Files;

/**
 *
 * @author luise
 */

public class TelaCadastro extends javax.swing.JFrame {

    public TelaCadastro() {
        initComponents();
        formatarCpf();
        formatarData();
        formatarTel();
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    public void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Aluno.txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Aluno.txtMatricula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Aluno.txtCPF = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        Aluno.txtDataNascimento = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        Aluno.txtIdade = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        btnSalvar = new javax.swing.JButton();
        Aluno.txtTelefone = new javax.swing.JFormattedTextField();
        Aluno.textField = new JTextField(10);
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Cadastro");

        jLabel2.setText("Nome:");

        Aluno.txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel3.setText("N° de matrícula:");

        jLabel4.setText("Sexo:");

        jLabel5.setText("Data Nascimento:");

        Aluno.txtDataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataNascimentoActionPerformed(evt);
            }
        });

        jLabel6.setText("Idade:");

        Aluno.txtIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdadeActionPerformed(evt);
            }
        });

        jLabel7.setText("Telefone:");

        jLabel8.setText("CPF:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "M", "F" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
                String selecao = (String) jComboBox1.getSelectedItem();
                Aluno.textField.setText(selecao);

            }

        });

        btnSalvar.setBackground(new java.awt.Color(20, 240, 20));
        btnSalvar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSalvar.setText("SALVAR");
        btnEditar.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Aluno.txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 234,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5)
                                        .addComponent(Aluno.txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 101,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3)
                                        .addComponent(Aluno.txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 101,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(Aluno.txtDataNascimento,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                101,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel8))
                                                                .addGap(51, 51, 51)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel7)
                                                                        .addComponent(jLabel6)
                                                                        .addComponent(Aluno.txtIdade,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                32,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel4)
                                                                        .addComponent(jComboBox1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(Aluno.txtTelefone,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                103,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(146, 146, 146)
                                                                .addComponent(jLabel1))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel2)))
                                                .addGap(0, 80, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                .createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(btnEditar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnSalvar)))
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Aluno.txtNome, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Aluno.txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34,
                                        Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Aluno.txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Aluno.txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Aluno.txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Aluno.txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnSalvar)
                                        .addComponent(btnEditar))
                                .addContainerGap())

        );

        btnSalvar.addActionListener(executetodos);

        pack();
    }

    public void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {

        String nomeCliente = Aluno.txtNome.getText();
        JOptionPane.showMessageDialog(rootPane, "Nome do cliente: " + nomeCliente, "Informação",
                JOptionPane.INFORMATION_MESSAGE);

    }

    private void txtIdadeActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void txtDataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {

    }
    
    

    public void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) throws IOException {

        String nome = Aluno.txtNome.getText();
        String matricula = Aluno.txtMatricula.getText();
        String sexo = (String) jComboBox1.getSelectedItem();
        String dataNascimento = Aluno.txtDataNascimento.getText();
        String idade = Aluno.txtIdade.getText();
        String cpf = Aluno.txtCPF.getText();
        String telefone = Aluno.txtTelefone.getText();

        List<String> data = new ArrayList<>();

        data.add(nome);
        data.add(matricula);
        data.add(sexo);
        data.add(dataNascimento);
        data.add(idade);
        data.add(cpf);
        data.add(telefone);

        Map<String, String> dataMap = new HashMap<>();
        dataMap.put("nome", nome);
        dataMap.put("matricula", matricula);
        dataMap.put("sexo", sexo);
        dataMap.put("dataNascimento", dataNascimento);
        dataMap.put("idade", idade);
        dataMap.put("cpf", cpf);
        dataMap.put("telefone", telefone);
        File file = new File("data.csv");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file,true))) {

            for (Map.Entry<String, String> entry : dataMap.entrySet()) {

                String valor = entry.getValue();
                String chave = entry.getKey();

                writer.write(chave + ": " + valor + ";");
            
            }
             writer.newLine();
            System.out.println("Arquivo CSV criado com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao criar o arquivo CSV: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println(data);
        System.out.println(dataMap);
        JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!");
    }

    ActionListener executetodos = new ActionListener() {

        public void actionPerformed(ActionEvent e) {
            try {
                btnSalvarActionPerformed(e);
            } catch (IOException e1) {

                e1.printStackTrace();
            }
            executarCamposDeTexto(Aluno.txtNome, Aluno.txtMatricula, Aluno.textField, Aluno.txtDataNascimento,
                    Aluno.txtIdade, Aluno.txtCPF, Aluno.txtTelefone);
        }

    };

    private static void executarCamposDeTexto(JTextField... campos) {
        for (JTextField campo : campos) {
            // Realize a ação desejada em cada campo de texto
            String texto = campo.getText();
            System.out.println(texto);
        }
    }

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {
        listaSalvos frame = new listaSalvos("C:\\Users\\junio\\OneDrive\\Documentos\\trabalho final\\data.csv");
        frame.setVisible(true);
        dispose();
    }

    public void formatarCpf() {
        try {
            MaskFormatter maskcpf = new MaskFormatter("###.###.###-##");
            maskcpf.install((JFormattedTextField) Aluno.txtCPF);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "erro ao entrar com os dados ", "erro", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void formatarData() {
        try {
            MaskFormatter maskdata = new MaskFormatter("##/##/####");
            maskdata.install((JFormattedTextField) Aluno.txtDataNascimento);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "erro ao entrar com os dados ", "erro", JOptionPane.ERROR_MESSAGE);
        }

    }


    public void formatarTel() {
        try {
            MaskFormatter masktel = new MaskFormatter("(##)#####-####");
            masktel.install((JFormattedTextField) Aluno.txtTelefone);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "erro ao entrar com os dados ", "erro", JOptionPane.ERROR_MESSAGE);
        }

    }
   private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {
    TelaCadastro telaCadastro = new TelaCadastro();

  
    String nome = Aluno.txtNome.getText();
    String matricula = Aluno.txtMatricula.getText();
    String sexo = (String) telaCadastro.jComboBox1.getSelectedItem();
    String dataNascimento = Aluno.txtDataNascimento.getText();
    String idade = Aluno.txtIdade.getText();
    String cpf = Aluno.txtCPF.getText();
    String telefone = Aluno.txtTelefone.getText();

    File file = new File("data.csv");
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {

        // Iterate through the data in the file and remove the data that matches the data entered in "btnSalvar"
        for (String line : Files.readAllLines(file.toPath())) {
            String[] data = line.split(";");
            if (!data[0].equals(nome) || !data[1].equals(matricula) || !data[2].equals(sexo) || !data[3].equals(dataNascimento) || !data[4].equals(idade) || !data[5].equals(cpf) || !data[6].equals(telefone)) {
                writer.write(line + "\n");
            }
        }
    } catch (IOException e) {
        System.err.println("Erro ao remover o registro: " + e.getMessage());
        e.printStackTrace();
    }

    // Show a message to the user
    JOptionPane.showMessageDialog(null, "Registro removido com sucesso!");
}

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });

    }

    public class Aluno {

        private static javax.swing.JTextField txtCPF;
        private static javax.swing.JTextField txtDataNascimento;
        private static javax.swing.JTextField txtIdade;
        private static javax.swing.JTextField txtMatricula;
        private static javax.swing.JTextField txtNome;
        private static javax.swing.JTextField txtTelefone;
        private static JTextField textField;

    }

    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;

}