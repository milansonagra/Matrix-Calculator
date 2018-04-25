package matrix.calculator;

import java.awt.Toolkit;
import java.util.StringTokenizer;

/**
 *
 * @author Milan Sonagra
 */
public class MatrixCalculatorDesign extends javax.swing.JFrame {

    public MatrixCalculatorDesign() {

        initComponents();
        screen.setEditable(true);
        setIcon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jProgressBar1 = new javax.swing.JProgressBar();
        jProgressBar2 = new javax.swing.JProgressBar();
        jSlider1 = new javax.swing.JSlider();
        jProgressBar3 = new javax.swing.JProgressBar();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPasswordField1 = new javax.swing.JPasswordField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        operationPanel = new javax.swing.JPanel();
        adj = new javax.swing.JButton();
        det = new javax.swing.JButton();
        basicPanel = new javax.swing.JPanel();
        additionButton = new javax.swing.JButton();
        multiplicationButton = new javax.swing.JButton();
        subtractionButton = new javax.swing.JButton();
        constantMultiplicationButton = new javax.swing.JButton();
        transposeButton = new javax.swing.JButton();
        squre = new javax.swing.JButton();
        inv = new javax.swing.JButton();
        equal = new javax.swing.JButton();
        info = new javax.swing.JButton();
        firstPanel = new javax.swing.JPanel();
        numaricPanel = new javax.swing.JPanel();
        B2 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B0 = new javax.swing.JButton();
        decimal = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        formatPanel = new javax.swing.JPanel();
        delete = new javax.swing.JButton();
        newElement = new javax.swing.JButton();
        newRow = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        initialize = new javax.swing.JButton();
        screenPanle = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        screen = new javax.swing.JTextArea();
        inst = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Matrix Calculator");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(75, 10));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setName("mainFrame"); // NOI18N
        setResizable(false);

        operationPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        adj.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        adj.setText("adj[]");
        adj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adjActionPerformed(evt);
            }
        });

        det.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        det.setText("|[ ]|");
        det.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detActionPerformed(evt);
            }
        });

        basicPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        additionButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        additionButton.setText("+");
        additionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additionButtonActionPerformed(evt);
            }
        });

        multiplicationButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        multiplicationButton.setText("x");
        multiplicationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicationButtonActionPerformed(evt);
            }
        });

        subtractionButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        subtractionButton.setText("-");
        subtractionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractionButtonActionPerformed(evt);
            }
        });

        constantMultiplicationButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        constantMultiplicationButton.setText("*");
        constantMultiplicationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                constantMultiplicationButtonActionPerformed(evt);
            }
        });

        transposeButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        transposeButton.setText("<html>[]<sup>T</sup></html>");
        transposeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transposeButtonActionPerformed(evt);
            }
        });

        squre.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        squre.setText("<html>[]<sup>2</sup></html>");
        squre.setToolTipText("");
        squre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout basicPanelLayout = new javax.swing.GroupLayout(basicPanel);
        basicPanel.setLayout(basicPanelLayout);
        basicPanelLayout.setHorizontalGroup(
            basicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basicPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(basicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(basicPanelLayout.createSequentialGroup()
                        .addComponent(additionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(subtractionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(multiplicationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(basicPanelLayout.createSequentialGroup()
                        .addComponent(transposeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(constantMultiplicationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(squre, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        basicPanelLayout.setVerticalGroup(
            basicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basicPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(basicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(additionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multiplicationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subtractionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(basicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(constantMultiplicationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transposeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(squre, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        inv.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        inv.setText("<html>[ ]<sup> -1</sup></html>");
        inv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invActionPerformed(evt);
            }
        });

        equal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        equal.setText("=");
        equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
            }
        });

        info.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        info.setText("Info");
        info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout operationPanelLayout = new javax.swing.GroupLayout(operationPanel);
        operationPanel.setLayout(operationPanelLayout);
        operationPanelLayout.setHorizontalGroup(
            operationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(operationPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(operationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(operationPanelLayout.createSequentialGroup()
                        .addComponent(basicPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(operationPanelLayout.createSequentialGroup()
                        .addGroup(operationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(operationPanelLayout.createSequentialGroup()
                                .addComponent(inv, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(adj, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(equal, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(operationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(operationPanelLayout.createSequentialGroup()
                                .addComponent(det, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, operationPanelLayout.createSequentialGroup()
                                .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        operationPanelLayout.setVerticalGroup(
            operationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(operationPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(basicPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(operationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inv, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adj, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(det, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(operationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equal, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        firstPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        numaricPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        B2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        B2.setText("2");
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        B1.setText("1");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        B3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        B3.setText("3");
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        B4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        B4.setText("4");
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        B5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        B5.setText("5");
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        B6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        B6.setText("6");
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });

        B7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        B7.setText("7");
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });

        B8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        B8.setText("8");
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });

        B0.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        B0.setText("0");
        B0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B0ActionPerformed(evt);
            }
        });

        decimal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        decimal.setText(".");
        decimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimalActionPerformed(evt);
            }
        });

        B9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        B9.setText("9");
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout numaricPanelLayout = new javax.swing.GroupLayout(numaricPanel);
        numaricPanel.setLayout(numaricPanelLayout);
        numaricPanelLayout.setHorizontalGroup(
            numaricPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(numaricPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(numaricPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(numaricPanelLayout.createSequentialGroup()
                        .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(numaricPanelLayout.createSequentialGroup()
                        .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(numaricPanelLayout.createSequentialGroup()
                        .addGroup(numaricPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(numaricPanelLayout.createSequentialGroup()
                                .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(B0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15)
                        .addGroup(numaricPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(decimal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(13, 13, 13))
        );
        numaricPanelLayout.setVerticalGroup(
            numaricPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(numaricPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(numaricPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(numaricPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(numaricPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(numaricPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(decimal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(numaricPanelLayout.createSequentialGroup()
                        .addComponent(B0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1)))
                .addGap(20, 20, 20))
        );

        formatPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        delete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        delete.setText("Backspace");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        newElement.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        newElement.setText("Tab");
        newElement.setToolTipText("");
        newElement.setActionCommand("<html>&#21B2;</html>");
        newElement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newElementActionPerformed(evt);
            }
        });

        newRow.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        newRow.setText("Enter");
        newRow.setToolTipText("");
        newRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newRowActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        initialize.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        initialize.setText("<html><center>Reset</center></html>");
        initialize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                initializeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formatPanelLayout = new javax.swing.GroupLayout(formatPanel);
        formatPanel.setLayout(formatPanelLayout);
        formatPanelLayout.setHorizontalGroup(
            formatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formatPanelLayout.createSequentialGroup()
                .addGroup(formatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(formatPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(newElement, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formatPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, formatPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(formatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newRow, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(initialize, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(15, 15, 15))
        );
        formatPanelLayout.setVerticalGroup(
            formatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formatPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(newElement, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(newRow, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(initialize, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout firstPanelLayout = new javax.swing.GroupLayout(firstPanel);
        firstPanel.setLayout(firstPanelLayout);
        firstPanelLayout.setHorizontalGroup(
            firstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(numaricPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(formatPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        firstPanelLayout.setVerticalGroup(
            firstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(firstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(formatPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(numaricPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        screenPanle.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        screen.setColumns(20);
        screen.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        screen.setRows(5);
        screen.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        screen.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        screen.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        screen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                screenMouseClicked(evt);
            }
        });
        screen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                screenKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(screen);

        inst.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inst.setText("<html>Push <b>Tab</b> for new element & Push <b>Enter</b> for new row</html>");
        inst.setToolTipText("");

        javax.swing.GroupLayout screenPanleLayout = new javax.swing.GroupLayout(screenPanle);
        screenPanle.setLayout(screenPanleLayout);
        screenPanleLayout.setHorizontalGroup(
            screenPanleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(screenPanleLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(screenPanleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(inst))
                .addGap(5, 5, 5))
        );
        screenPanleLayout.setVerticalGroup(
            screenPanleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, screenPanleLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(inst, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(screenPanle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(operationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(firstPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(screenPanle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(firstPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(operationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        screen.setText(screen.getText() + B1.getText());
    }//GEN-LAST:event_B1ActionPerformed

    private void multiplicationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicationButtonActionPerformed
        Mat1 = inputMatrix();
        screen.setText("");
        op = 3;
        ifSet = true;
        operationSign = "X";
    }//GEN-LAST:event_multiplicationButtonActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        if (!screen.getText().isEmpty()) {
            String data = screen.getText();
            if (data.charAt(data.length() - 1) == '.') {
                manageDot = true;
            }
            String UpdateString = data.substring(0, data.length() - 1);
            screen.setText(UpdateString);
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        screen.setText(screen.getText() + B6.getText());
    }//GEN-LAST:event_B6ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        screen.setText(screen.getText() + B2.getText());
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        screen.setText(screen.getText() + B3.getText());
    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        screen.setText(screen.getText() + B4.getText());
    }//GEN-LAST:event_B4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        screen.setText(screen.getText() + B5.getText());
    }//GEN-LAST:event_B5ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        screen.setText(screen.getText() + B7.getText());
    }//GEN-LAST:event_B7ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        screen.setText(screen.getText() + B8.getText());
    }//GEN-LAST:event_B8ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
        screen.setText(screen.getText() + B9.getText());
    }//GEN-LAST:event_B9ActionPerformed

    private void B0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B0ActionPerformed
        screen.setText(screen.getText() + B0.getText());
    }//GEN-LAST:event_B0ActionPerformed

    private void newRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newRowActionPerformed
        screen.setText(screen.getText() + "\n");
        manageDot = true;
    }//GEN-LAST:event_newRowActionPerformed

    private void newElementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newElementActionPerformed
        screen.setText(screen.getText() + "\t");
        manageDot = true;
    }//GEN-LAST:event_newElementActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        screen.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void additionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_additionButtonActionPerformed
        Mat1 = inputMatrix();
        screen.setText("");
        op = 1;
        ifSet = true;
        operationSign = "+";
    }//GEN-LAST:event_additionButtonActionPerformed

    private void decimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decimalActionPerformed
        if (manageDot) {
            screen.setText(screen.getText() + decimal.getText());
        }
        manageDot = false;
    }//GEN-LAST:event_decimalActionPerformed

    private void transposeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transposeButtonActionPerformed

        /*      TRANSPOSE       */
        Mat1 = inputMatrix();
        screen.setText("");
        Answer = Mat1.transpose();
        setAnswer();
        ifSet = true;
        biOperation = false;
        operationSign = "Transpose";
    }//GEN-LAST:event_transposeButtonActionPerformed

    private void subtractionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtractionButtonActionPerformed
        Mat1 = inputMatrix();
        screen.setText("");
        op = 2;
        ifSet = true;
        operationSign = "-";
    }//GEN-LAST:event_subtractionButtonActionPerformed

    private void equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalActionPerformed

        switch (op) {
            case 1:
                /*          Addition        */

                Mat2 = inputMatrix();
                Answer = Mat1.addition(Mat2);
                setAnswer();
                break;

            case 2:
                /*          Subtraction         */

                Mat2 = inputMatrix();
                Answer = Mat1.subtraction(Mat2);
                setAnswer();
                break;

            case 3:
                /*          Multiplication      */

                Mat2 = inputMatrix();
                Answer = Mat1.multiplication(Mat2);
                setAnswer();
                break;

            case 4:
                /*          Multiplication with constant    */

                constant = Double.parseDouble(screen.getText());
                Answer = Mat1.constantMultiplication(constant);
                setAnswer();
                break;

            default:
                /*      FOR THE USER WHO CANN'T FOLLOW THE FLOW !*/
                new InValidInput().setVisible(true);
        }

    }//GEN-LAST:event_equalActionPerformed

    private void adjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adjActionPerformed
        Mat1 = inputMatrix();
        Answer = Mat1.adjoint();
        operationSign = "adjoint";
        ifSet = true;
        biOperation = false;
        setAnswer();
    }//GEN-LAST:event_adjActionPerformed

    private void squreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squreActionPerformed
        Mat1 = inputMatrix();
        Answer = Mat1.multiplication(Mat1);
        operationSign = "squr";
        ifSet = true;
        setAnswer();
    }//GEN-LAST:event_squreActionPerformed

    private void constantMultiplicationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_constantMultiplicationButtonActionPerformed
        Mat1 = inputMatrix();
        op = 4;
        operationSign = "multiply with const";
        ifSet = true;
        biOperation = false;
    }//GEN-LAST:event_constantMultiplicationButtonActionPerformed

    private void infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoActionPerformed
        screen.setText("");
        if (ifSet) {
            for (int i = 0; i < Mat1.getRow(); i++) {
                for (int j = 0; j < Mat1.getColumn(); j++) {
                    screen.setText(screen.getText() + Double.toString(Mat1.M[i][j]) + "\t");
                }
                screen.setText(screen.getText() + "\n");
            }

            if (biOperation) {
                screen.setText(screen.getText() + "\n\t" + operationSign + "\n\n");
                for (int i = 0; i < Mat2.getRow(); i++) {
                    for (int j = 0; j < Mat2.getColumn(); j++) {
                        screen.setText(screen.getText() + Double.toString(Mat2.M[i][j]) + " \t");
                    }
                    screen.setText(screen.getText() + "\n");
                }
                screen.setText(screen.getText() + "\n\t=\n\n");
                for (int i = 0; i < Answer.getRow(); i++) {
                    for (int j = 0; j < Answer.getColumn(); j++) {
                        screen.setText(screen.getText() + Double.toString(Answer.M[i][j]) + "\t");
                    }
                    screen.setText(screen.getText() + "\n");
                }
            }

            if (operationSign == "Transpose" || operationSign == "squr" || operationSign == "adjoint" || operationSign == "inverse") {
                screen.setText(screen.getText() + "\n\t" + operationSign + "\n\n");

                for (int i = 0; i < Answer.getRow(); i++) {
                    for (int j = 0; j < Answer.getColumn(); j++) {
                        screen.setText(screen.getText() + Double.toString(Answer.M[i][j]) + "\t");
                    }
                    screen.setText(screen.getText() + "\n");
                }

            }

            if (operationSign == "determinant") {
                screen.setText(screen.getText() + "\n\t" + operationSign + "\n\n");

                screen.setText(screen.getText() + Double.toString(constant));
            }
            if (operationSign == "multiply with const") {
                screen.setText(screen.getText() + "\n\t" + operationSign + "\n\n");

                for (int i = 0; i < Answer.getRow(); i++) {
                    for (int j = 0; j < Answer.getColumn(); j++) {
                        screen.setText(screen.getText() + Double.toString(Answer.M[i][j]) + "\t");
                    }
                    screen.setText(screen.getText() + "\n");
                }
            }

        }
    }//GEN-LAST:event_infoActionPerformed

    private void detActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detActionPerformed
        Mat1 = inputMatrix();
        constant = Mat1.determinant(Mat1.M, Mat1.getRow());
        operationSign = "determinant";
        ifSet = true;
        screen.setText(screen.getText() + Double.toString(constant));
        biOperation = false;
    }//GEN-LAST:event_detActionPerformed

    private void invActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invActionPerformed
        Mat1 = inputMatrix();
        Answer = Mat1.inverce();
        operationSign = "inverse";
        ifSet = true;
        biOperation = false;
        setAnswer();
    }//GEN-LAST:event_invActionPerformed

    private void initializeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_initializeActionPerformed
        /*      set the initial values for all the variables & constant     */
        screen.setText("");
        setScreen = true;
        manageDot = true;
        biOperation = true;
        ifSet = false;
        operationSign = null;
        constant = '\0';
        op = 0;
        Mat1 = null;
        Mat2 = null;
        Answer = null;
    }//GEN-LAST:event_initializeActionPerformed

    private void screenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_screenMouseClicked


    }//GEN-LAST:event_screenMouseClicked

    private void screenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_screenKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == '.' || c == '\t' || c == '\n')) {
            evt.consume();
        }
        
        if (c == '\t' || c == '\n') {
            manageDot = true;
        }
        
        if (!manageDot && c == '.') {
            evt.consume();
        }
        
        if (c == '.') {
            manageDot = false;
        }
        
        String temp = screen.getText();
        if (c == '\b' && temp.charAt(temp.length() - 1) == '.') {
            manageDot = true;
        }

    }//GEN-LAST:event_screenKeyTyped

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
            java.util.logging.Logger.getLogger(MatrixCalculatorDesign.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MatrixCalculatorDesign.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MatrixCalculatorDesign.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MatrixCalculatorDesign.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new MatrixCalculatorDesign().setVisible(true);
        });

    }

    Matrix inputMatrix() {
        /*      SET THE INPUTE TO THE STRUCTURE OF A MATRIX     */
 /*          i.e.--> SET THE INPUT BY USER IN 2x2 ARRAY OF CLASS "Matrix"    */

        String rawtext = screen.getText();

        StringTokenizer rows = new StringTokenizer(rawtext, "\n");

        float matrix[][] = new float[rows.countTokens()][];

        StringTokenizer cols;
        int no_row = 0;
        int k = 0, no_col = 0;

        while (rows.hasMoreTokens()) {
            cols = new StringTokenizer(rows.nextToken(), "\t");

            matrix[no_row] = new float[cols.countTokens()];
            while (cols.hasMoreElements()) {
                matrix[no_row][k++] = Float.parseFloat(cols.nextToken());
            }
            no_row++;

            no_col = k;
            k = 0;
        }

        Matrix rM = new Matrix(no_row, no_col);
        for (int i = 0; i < no_row; i++) {
            for (int j = 0; j < no_col; j++) {
                rM.M[i][j] = matrix[i][j];
            }
        }
        screen.setText("");

        return rM;
    }

    private void setAnswer() {

        /*      SET ANSWER ON SCREEN        */
        screen.setText("");
        if (setScreen) {
            for (int i = 0; i < Answer.getRow(); i++) {
                for (int j = 0; j < Answer.getColumn(); j++) {
                    screen.setText(screen.getText() + Double.toString(Answer.M[i][j]) + "\t");
                }
                screen.setText(screen.getText() + "\n");
            }
        }
    }

    public void clear() {
        screen.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B0;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JButton additionButton;
    private javax.swing.JButton adj;
    private javax.swing.JPanel basicPanel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clear;
    private javax.swing.JButton constantMultiplicationButton;
    private javax.swing.JButton decimal;
    private javax.swing.JButton delete;
    private javax.swing.JButton det;
    private javax.swing.JButton equal;
    private javax.swing.JPanel firstPanel;
    private javax.swing.JPanel formatPanel;
    private javax.swing.JButton info;
    private javax.swing.JButton initialize;
    private javax.swing.JLabel inst;
    private javax.swing.JButton inv;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton multiplicationButton;
    private javax.swing.JButton newElement;
    private javax.swing.JButton newRow;
    private javax.swing.JPanel numaricPanel;
    private javax.swing.JPanel operationPanel;
    private javax.swing.JTextArea screen;
    private javax.swing.JPanel screenPanle;
    private javax.swing.JButton squre;
    private javax.swing.JButton subtractionButton;
    private javax.swing.JButton transposeButton;
    // End of variables declaration//GEN-END:variables

    public static boolean setScreen = true;
    public static boolean manageDot = true;
    private boolean biOperation = true;
    private boolean ifSet = false;
    private String operationSign;
    private double constant;
    private int op;
    /*      opcode TO DESIDE THE OPERATION      */

    private Matrix Mat1;
    /*  Matrix 1    */
    private Matrix Mat2;
    /*  Matrix 2    */
    private Matrix Answer;

    /*  Stor the answer of Matrix   */
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("mainicon.png")));
    }

}
