import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
/**
 * @author junior
 * Executa a segunda tela, que tem a lista jframe e o botão para remover o aluno selecionado
 */
public class listaSalvos extends javax.swing.JFrame {

    private DefaultListModel<String> listModel;
    private String filePath;

    public listaSalvos(String filePath) {
        initComponents();
        this.filePath = filePath;
        listModel = new DefaultListModel<>();
        CarregarAlunos();
    }
    /** metodo que remove os alunos diretamente no arquivo CSV
     * 
     */
    private void removeAlunoDoCSV(String aluno) {
        try {
            Path source = Path.of(filePath);
            Path tempFile = Files.createTempFile("temp", ".csv");
            try (BufferedReader br = new BufferedReader(new FileReader(filePath));
                    BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile.toFile()))) {
                String line;
                while ((line = br.readLine()) != null) {
                    if (!line.equals(aluno)) {
                        bw.write(line);
                        bw.newLine();
                    }
                }
            }
            Files.move(tempFile, source, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            System.out.println("Error removing aluno from CSV: " + e.getMessage());
        }
    }

    private void CarregarAlunos() {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                listModel.addElement(line);
            }
            jListAlunos.setModel(listModel);
        } catch (IOException e) {
            System.out.println("Error loading saved alunos: " + e.getMessage());
        }
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnRemover = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListAlunos = new javax.swing.JList<>();
        btnAbrir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel1.setText("Lista");

        btnRemover.setBackground(new java.awt.Color(240, 0, 0));
        btnRemover.setFont(new java.awt.Font("Arial", 1, 12));
        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnVoltar.setFont(new java.awt.Font("Arial", 1, 11));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jListAlunos.setFont(new java.awt.Font("Arial", 0, 12));
        jScrollPane1.setViewportView(jListAlunos);

        btnAbrir.setFont(new java.awt.Font("Arial", 1, 11));
        btnAbrir.setText("Abrir");
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                .createSequentialGroup()
                                                .addComponent(btnVoltar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnRemover)
                                                .addContainerGap())
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                layout.createSequentialGroup()
                                                        .addGap(0, 152, Short.MAX_VALUE)
                                                        .addComponent(jLabel1)
                                                        .addGap(147, 147, 147))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                .createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(79, 79, 79))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                layout.createSequentialGroup()
                                                        .addComponent(btnAbrir)
                                                        .addContainerGap()))));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18,
                                        Short.MAX_VALUE)
                                .addComponent(btnAbrir)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnRemover)
                                        .addComponent(btnVoltar))
                                .addContainerGap()));

        pack();
    }

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {
        TelaCadastro frame = new TelaCadastro();
        frame.setVisible(true);
        dispose();
    }

    /** 
     * Botão que executa o removeAlunoFromCSV
     */
    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {
        if (jListAlunos.getSelectedIndex() != -1) {
            int confirm = JOptionPane.showConfirmDialog(this, "Deseja remover o aluno selecionado?", "Remover Aluno",
                    JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                int selectedIndex = jListAlunos.getSelectedIndex();
                String alunoRemovido = listModel.getElementAt(selectedIndex);
                listModel.remove(selectedIndex);
                jListAlunos.setModel(listModel);
                removeAlunoDoCSV(alunoRemovido);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um aluno para remover.", "Nenhum Aluno Selecionado",
                    JOptionPane.WARNING_MESSAGE);
        }
    }

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {

        String caminhoDoArquivo = "data.csv";

    listaSalvos frame = new listaSalvos(caminhoDoArquivo);
    frame.setVisible(true);
    dispose();

        
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                String caminhoDoArquivo = "data.csv";

                listaSalvos frame = new listaSalvos(caminhoDoArquivo);
                frame.setVisible(true);
                


            }
        });
    }

    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jListAlunos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton btnAbrir;

}