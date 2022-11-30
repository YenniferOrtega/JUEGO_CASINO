
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.Random;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
*/

public class RULETA extends javax.swing.JFrame {
    

    public int N;
    public int cantt;
    public int cont = 0;
    public int doc1 = 0;
    public int doc2 = 0;
    public int doc3 = 0;
    public int fil1 = 0;
    public int fil2 = 0;
    public int fil3 = 0;

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private boolean BONUMEROActionPerformed(String num) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private boolean BODOC1ActionPerformed(String doc1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private boolean BODOC2ActionPerformed(String doc2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private boolean BODOC3ActionPerformed(String doc3) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private boolean BOFIL1ActionPerformed(String fil1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private boolean BOFIL2ActionPerformed(String fil2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private boolean BOFIL3ActionPerformed(String fil3) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    

    public int giraRuleta (){
        
        int posicion;
        Random random = new Random();
        int CUADRADOS = 0;
        //Calcular una posicion aleatoria de la ruleta
        posicion = random.nextInt(CUADRADOS);
        return posicion;
    }

    public RULETA() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("CASINO ECCI");
   

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CAGANANCIA = new javax.swing.JLabel();
        CAGANANCIA1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BODOC1 = new javax.swing.JButton();
        BODOC2 = new javax.swing.JButton();
        BODOC3 = new javax.swing.JButton();
        BOFIL1 = new javax.swing.JButton();
        BOFIL2 = new javax.swing.JButton();
        BOFIL3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        BOJUGAR = new javax.swing.JButton();
        BONUMERO = new javax.swing.JComboBox<>();
        CADOC2 = new javax.swing.JLabel();
        CADOC1 = new javax.swing.JLabel();
        CADOC3 = new javax.swing.JLabel();
        CAFILAS = new javax.swing.JLabel();
        CADOC4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        BOAPOS = new javax.swing.JButton();
        BOINGRESAR = new javax.swing.JButton();
        BOINFO = new javax.swing.JButton();
        BOSALIR5 = new javax.swing.JButton();
        BOAPOS1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 153, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jPanel3.setBackground(new java.awt.Color(255, 0, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel1.setText("RULETA");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(287, 287, 287)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 204, 0)));

        jLabel5.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NUMERO GANADOR");

        jLabel7.setBackground(new java.awt.Color(255, 204, 0));
        jLabel7.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 0));
        jLabel7.setText("GANANCIA OBTENIDA");

        CAGANANCIA.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        CAGANANCIA.setForeground(new java.awt.Color(255, 255, 255));
        CAGANANCIA.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));

        CAGANANCIA1.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        CAGANANCIA1.setForeground(new java.awt.Color(255, 255, 255));
        CAGANANCIA1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 204, 0)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addComponent(CAGANANCIA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CAGANANCIA1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(84, 84, 84))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CAGANANCIA, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CAGANANCIA1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        jPanel5.setForeground(new java.awt.Color(255, 204, 0));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RULETACUADROS.PNG"))); // NOI18N

        BODOC1.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        BODOC1.setText("DOC1");
        BODOC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BODOC1ActionPerformed(evt);
            }
        });

        BODOC2.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        BODOC2.setText("DOC2");
        BODOC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BODOC2ActionPerformed(evt);
            }
        });

        BODOC3.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        BODOC3.setText("DOC3");
        BODOC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BODOC3ActionPerformed(evt);
            }
        });

        BOFIL1.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        BOFIL1.setText("FIL1");
        BOFIL1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOFIL1ActionPerformed(evt);
            }
        });

        BOFIL2.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        BOFIL2.setText("FIL2");
        BOFIL2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOFIL2ActionPerformed(evt);
            }
        });

        BOFIL3.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        BOFIL3.setText("FIL3");
        BOFIL3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOFIL3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("INGRESE EL NUMERO");

        BOJUGAR.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        BOJUGAR.setText("JUGAR");
        BOJUGAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOJUGARActionPerformed(evt);
            }
        });

        BONUMERO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36" }));
        BONUMERO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BONUMEROActionPerformed(evt);
            }
        });

        CADOC2.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        CADOC2.setForeground(new java.awt.Color(255, 255, 255));
        CADOC2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));

        CADOC1.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        CADOC1.setForeground(new java.awt.Color(255, 255, 255));
        CADOC1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));

        CADOC3.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        CADOC3.setForeground(new java.awt.Color(255, 255, 255));
        CADOC3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));

        CAFILAS.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        CAFILAS.setForeground(new java.awt.Color(255, 255, 255));
        CAFILAS.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));

        CADOC4.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        CADOC4.setForeground(new java.awt.Color(255, 255, 255));
        CADOC4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));

        jLabel8.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("APOSTADO");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BOFIL1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BOFIL2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BOFIL3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CAFILAS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CADOC1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(177, 177, 177)
                        .addComponent(BONUMERO, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BOJUGAR))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(CADOC4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(BODOC1)
                                .addGap(68, 68, 68)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(BODOC2)
                                .addGap(109, 109, 109)
                                .addComponent(BODOC3))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(CADOC2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(CADOC3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(22, 22, 22))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(BOFIL1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BOFIL2)
                        .addGap(9, 9, 9)
                        .addComponent(BOFIL3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CAFILAS, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(CADOC4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BODOC1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(BOJUGAR))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CADOC1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13, 13, 13))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(CADOC2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BODOC2))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(CADOC3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BODOC3)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BONUMERO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ruleta1.gif"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 204, 0)));
        jPanel6.setForeground(new java.awt.Color(102, 0, 0));

        BOAPOS.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        BOAPOS.setText("APOSTAR");
        BOAPOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOAPOSActionPerformed(evt);
            }
        });

        BOINGRESAR.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        BOINGRESAR.setText("INGRESAR DINERO");

        BOINFO.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        BOINFO.setText("INFO JUEGO");
        BOINFO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOINFOActionPerformed(evt);
            }
        });

        BOSALIR5.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        BOSALIR5.setText("SALIR");
        BOSALIR5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOSALIR5ActionPerformed(evt);
            }
        });

        BOAPOS1.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        BOAPOS1.setText("INFO USUARIO");
        BOAPOS1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOAPOS1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BOAPOS)
                .addGap(18, 18, 18)
                .addComponent(BOAPOS1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BOINGRESAR)
                .addGap(29, 29, 29)
                .addComponent(BOINFO)
                .addGap(18, 18, 18)
                .addComponent(BOSALIR5)
                .addGap(33, 33, 33))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BOAPOS)
                    .addComponent(BOINGRESAR)
                    .addComponent(BOINFO)
                    .addComponent(BOSALIR5)
                    .addComponent(BOAPOS1))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

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

    private void BOAPOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOAPOSActionPerformed
        String apostar;
        apostar = JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que desea apostar", "CASINO ECCI", JOptionPane.PLAIN_MESSAGE);

    }//GEN-LAST:event_BOAPOSActionPerformed

    private void BOINFOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOINFOActionPerformed
        JOptionPane.showMessageDialog(null, "!!VUELVE PRONTO¡¡", "CASINO ECCI", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/salir.gif"));
        System.exit(0);
    }//GEN-LAST:event_BOINFOActionPerformed

    private void BONUMEROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BONUMEROActionPerformed

        int i = BONUMERO.getSelectedIndex();
        switch (i) {
            case 1:
                N = 1;
                break;
            case 2:
                N = 2;
                break;
            case 3:
                N = 3;
                break;
            case 4:
                N = 4;
                break;
            case 5:
                N = 5;
                break;
            case 6:
                N = 6;
                break;
            case 7:
                N = 7;
                break;
            case 8:
                N = 8;
                break;
            case 9:
                N = 9;
                break;
            case 10:
                N = 10;
                break;
            case 11:
                N = 11;
                break;
            case 12:
                N = 12;
                break;
            case 13:
                N = 13;
                break;
            case 14:
                N = 14;
                break;
            case 15:
                N = 15;
                break;
            case 16:
                N = 16;
                break;
            case 17:
                N = 17;
                break;
            case 18:
                N = 18;
                break;
            case 19:
                N = 19;
                break;
            case 20:
                N = 20;
                break;
            case 21:
                N = 1;
                break;
            case 22:
                N = 22;
                break;
            case 23:
                N = 23;
                break;
            case 24:
                N = 24;
                break;
            case 25:
                N = 25;
                break;
            case 26:
                N = 26;
                break;
            case 27:
                N = 27;
                break;
            case 28:
                N = 28;
                break;
            case 29:
                N = 29;
                break;
            case 30:
                N = 30;
                break;
            case 31:
                N = 31;
                break;
            case 32:
                N = 32;
                break;
            case 33:
                N = 33;
                break;
            case 34:
                N = 34;
                break;
            case 35:
                N = 35;
                break;
            case 36:
                N = 36;
                break;
            default:
                JOptionPane.showMessageDialog(null, "** Seleccione una Opcion **");
                break;
        }
    }//GEN-LAST:event_BONUMEROActionPerformed

    private void BODOC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BODOC1ActionPerformed
        cont = cont + 1;
        doc1 = doc1 + 1;
    }//GEN-LAST:event_BODOC1ActionPerformed

    private void BODOC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BODOC2ActionPerformed
        cont = cont + 1;
        doc2 = doc2 + 1;
    }//GEN-LAST:event_BODOC2ActionPerformed

    private void BODOC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BODOC3ActionPerformed
        cont = cont + 1;
        doc3 = doc3 + 1;
    }//GEN-LAST:event_BODOC3ActionPerformed

    private void BOFIL3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOFIL3ActionPerformed
        cont = cont + 1;
        fil3 = fil3 + 1;
    }//GEN-LAST:event_BOFIL3ActionPerformed

    private void BOFIL1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOFIL1ActionPerformed
        cont = cont + 1;
        fil1 = fil1 + 1;
    }//GEN-LAST:event_BOFIL1ActionPerformed

    private void BOFIL2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOFIL2ActionPerformed
        cont = cont + 1;
        fil2 = fil2 + 1;
    }//GEN-LAST:event_BOFIL2ActionPerformed

    private void BOJUGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOJUGARActionPerformed
        String num = null, doc1 = null, doc2 = null, doc3 = null, fil1 = null, fil2 = null, fil3 = null;
        if(BONUMEROActionPerformed(num) && BODOC1ActionPerformed(doc1) && BODOC2ActionPerformed(doc2) && BODOC3ActionPerformed(doc3) 
                && BOFIL1ActionPerformed(fil1) && BOFIL2ActionPerformed(fil2) && BOFIL3ActionPerformed(fil3)){
        dispose();
        
        }else {
            JOptionPane.showMessageDialog(this, "Inserte alguna de la opciones");
        }

    }//GEN-LAST:event_BOJUGARActionPerformed

    private void BOSALIR5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOSALIR5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BOSALIR5ActionPerformed

    private void BOAPOS1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOAPOS1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BOAPOS1ActionPerformed

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
            java.util.logging.Logger.getLogger(RULETA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RULETA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RULETA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RULETA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RULETA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOAPOS;
    private javax.swing.JButton BOAPOS1;
    private javax.swing.JButton BODOC1;
    private javax.swing.JButton BODOC2;
    private javax.swing.JButton BODOC3;
    private javax.swing.JButton BOFIL1;
    private javax.swing.JButton BOFIL2;
    private javax.swing.JButton BOFIL3;
    private javax.swing.JButton BOINFO;
    private javax.swing.JButton BOINGRESAR;
    private javax.swing.JButton BOJUGAR;
    private javax.swing.JComboBox<String> BONUMERO;
    private javax.swing.JButton BOSALIR5;
    private javax.swing.JLabel CADOC1;
    private javax.swing.JLabel CADOC2;
    private javax.swing.JLabel CADOC3;
    private javax.swing.JLabel CADOC4;
    private javax.swing.JLabel CAFILAS;
    private javax.swing.JLabel CAGANANCIA;
    private javax.swing.JLabel CAGANANCIA1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
}