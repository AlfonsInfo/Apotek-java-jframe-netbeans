package view.viewCustomer;

import table.TableObatForCustomer;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import control.ObatControl;
import java.util.HashSet;
import java.util.List;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import model.Obat;
import view.viewKaryawan.KaryawanForm;
/**
 *
 * @author Alfonsus Setiawan Jacub
 */
public class CustomerForm extends javax.swing.JFrame {
    //Field : Atribut
    private ObatControl obatControl;
    String action = null;
    List<Obat> listobat;
    int selectedID = 0;
    int stat = 0;// status mouse untuk pencarian
    
    //Konstruktor
    public CustomerForm() {    
        initComponents();
        setComponent(false);
        obatControl = new ObatControl();
        showObat();
    }
    
    //Method-method
    public void setComponent(boolean value)
    {
        inputKode.setEnabled(value);
        inputNama.setEnabled(value);
        inputKhasiat.setEnabled(value);
        inputSediaan.setEnabled(value);
        inputHarga.setEnabled(value);
        inputQuantity.setEnabled(value);
        OutputHargaTotal.setEnabled(value);
        
        btnBeli.setEnabled(value);
        btnBatal.setEnabled(value);
        btnKonfirm.setEnabled(value);
        btnBayar.setEnabled(value);
    }
    
    
    public void clearText()
    {
        inputKode.setText("");
        inputNama.setText("");
        inputKhasiat.setText("");
        inputSediaan.setText("");
        inputHarga.setText("");
        inputQuantity.setText("");
        
        inputSearch.setText("");
    }
    
    public void showObat()
    {
        tableObatForCustomer.setModel(obatControl.showObatToCustomer(""));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jScrollPane3 = new javax.swing.JScrollPane();
        ContainerPanel = new javax.swing.JPanel();
        AppBarPanel = new javax.swing.JPanel();
        AppBarLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableObatForCustomer = new javax.swing.JTable();
        labelDataObat = new javax.swing.JLabel();
        labelKodeObat = new javax.swing.JLabel();
        labelInputData = new javax.swing.JLabel();
        labelNamaObat = new javax.swing.JLabel();
        labelSediaanObat = new javax.swing.JLabel();
        labelKhasiat = new javax.swing.JLabel();
        labelHarga = new javax.swing.JLabel();
        labelStok = new javax.swing.JLabel();
        inputSearch = new javax.swing.JTextField();
        inputKode = new javax.swing.JTextField();
        inputNama = new javax.swing.JTextField();
        inputSediaan = new javax.swing.JTextField();
        inputKhasiat = new javax.swing.JTextField();
        inputHarga = new javax.swing.JTextField();
        inputQuantity = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnBeli = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();
        labelStok1 = new javax.swing.JLabel();
        OutputHargaTotal = new javax.swing.JTextField();
        btnBayar = new javax.swing.JButton();
        btnKonfirm = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        ContainerPanel.setBackground(new java.awt.Color(255, 255, 255));

        AppBarPanel.setBackground(new java.awt.Color(51, 153, 0));

        AppBarLabel.setForeground(new java.awt.Color(255, 255, 255));
        AppBarLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AppBarLabel.setText("SMART APOTEK");

        javax.swing.GroupLayout AppBarPanelLayout = new javax.swing.GroupLayout(AppBarPanel);
        AppBarPanel.setLayout(AppBarPanelLayout);
        AppBarPanelLayout.setHorizontalGroup(
            AppBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AppBarLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        AppBarPanelLayout.setVerticalGroup(
            AppBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AppBarLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setViewportBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jScrollPane2.setColumnHeaderView(null);
        jScrollPane2.setViewportView(null);

        tableObatForCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "null"
            }
        ));
        tableObatForCustomer.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tableObatForCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableObatForCustomerMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableObatForCustomer);
        if (tableObatForCustomer.getColumnModel().getColumnCount() > 0) {
            tableObatForCustomer.getColumnModel().getColumn(0).setMinWidth(50);
            tableObatForCustomer.getColumnModel().getColumn(0).setPreferredWidth(50);
            tableObatForCustomer.getColumnModel().getColumn(1).setResizable(false);
            tableObatForCustomer.getColumnModel().getColumn(1).setPreferredWidth(300);
            tableObatForCustomer.getColumnModel().getColumn(2).setResizable(false);
            tableObatForCustomer.getColumnModel().getColumn(2).setPreferredWidth(200);
            tableObatForCustomer.getColumnModel().getColumn(3).setPreferredWidth(500);
            tableObatForCustomer.getColumnModel().getColumn(4).setPreferredWidth(200);
            tableObatForCustomer.getColumnModel().getColumn(5).setPreferredWidth(200);
            tableObatForCustomer.getColumnModel().getColumn(6).setPreferredWidth(200);
        }

        labelDataObat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelDataObat.setForeground(new java.awt.Color(0, 0, 0));
        labelDataObat.setText("DATA OBAT");

        labelKodeObat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelKodeObat.setForeground(new java.awt.Color(0, 0, 0));
        labelKodeObat.setText("Kode Obat : ");

        labelInputData.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelInputData.setForeground(new java.awt.Color(0, 0, 0));
        labelInputData.setText("PEMBELIAN");

        labelNamaObat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelNamaObat.setForeground(new java.awt.Color(0, 0, 0));
        labelNamaObat.setText("Nama Obat :");

        labelSediaanObat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelSediaanObat.setForeground(new java.awt.Color(0, 0, 0));
        labelSediaanObat.setText("Sediaan Obat :");

        labelKhasiat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelKhasiat.setForeground(new java.awt.Color(0, 0, 0));
        labelKhasiat.setText("Khasiat :");

        labelHarga.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelHarga.setForeground(new java.awt.Color(0, 0, 0));
        labelHarga.setText("Harga : ");

        labelStok.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelStok.setForeground(new java.awt.Color(0, 0, 0));
        labelStok.setText("Jumlah :");

        inputSearch.setBackground(new java.awt.Color(204, 204, 255));
        inputSearch.setForeground(new java.awt.Color(0, 0, 0));
        inputSearch.setText("Cari Disini");
        inputSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inputSearchMouseEntered(evt);
            }
        });
        inputSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputSearchActionPerformed(evt);
            }
        });

        inputKode.setBackground(new java.awt.Color(204, 204, 255));
        inputKode.setForeground(new java.awt.Color(0, 0, 0));
        inputKode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputKodeActionPerformed(evt);
            }
        });

        inputNama.setBackground(new java.awt.Color(204, 204, 255));
        inputNama.setForeground(new java.awt.Color(0, 0, 0));
        inputNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNamaActionPerformed(evt);
            }
        });

        inputSediaan.setBackground(new java.awt.Color(204, 204, 255));
        inputSediaan.setForeground(new java.awt.Color(0, 0, 0));
        inputSediaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputSediaanActionPerformed(evt);
            }
        });

        inputKhasiat.setBackground(new java.awt.Color(204, 204, 255));
        inputKhasiat.setForeground(new java.awt.Color(0, 0, 0));
        inputKhasiat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputKhasiatActionPerformed(evt);
            }
        });

        inputHarga.setBackground(new java.awt.Color(204, 204, 255));
        inputHarga.setForeground(new java.awt.Color(0, 0, 0));
        inputHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputHargaActionPerformed(evt);
            }
        });

        inputQuantity.setBackground(new java.awt.Color(204, 204, 255));
        inputQuantity.setForeground(new java.awt.Color(0, 0, 0));
        inputQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputQuantityActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(255, 255, 0));
        btnSearch.setForeground(new java.awt.Color(0, 0, 0));
        btnSearch.setText("Cari");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnBeli.setBackground(new java.awt.Color(0, 0, 204));
        btnBeli.setForeground(new java.awt.Color(255, 255, 255));
        btnBeli.setText("BELI");
        btnBeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBeliActionPerformed(evt);
            }
        });

        btnBatal.setBackground(new java.awt.Color(255, 255, 255));
        btnBatal.setForeground(new java.awt.Color(0, 0, 204));
        btnBatal.setText("batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        btnKembali.setBackground(new java.awt.Color(255, 255, 255));
        btnKembali.setForeground(new java.awt.Color(0, 0, 204));
        btnKembali.setText("Keluar");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        labelStok1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelStok1.setForeground(new java.awt.Color(0, 0, 0));
        labelStok1.setText("Harga : ");

        OutputHargaTotal.setBackground(new java.awt.Color(204, 204, 255));
        OutputHargaTotal.setForeground(new java.awt.Color(0, 0, 0));
        OutputHargaTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OutputHargaTotalActionPerformed(evt);
            }
        });

        btnBayar.setBackground(new java.awt.Color(0, 0, 204));
        btnBayar.setForeground(new java.awt.Color(255, 255, 255));
        btnBayar.setText("BAYAR");
        btnBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBayarActionPerformed(evt);
            }
        });

        btnKonfirm.setBackground(new java.awt.Color(0, 0, 204));
        btnKonfirm.setForeground(new java.awt.Color(255, 255, 255));
        btnKonfirm.setText("KONFIRMASI");
        btnKonfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKonfirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContainerPanelLayout = new javax.swing.GroupLayout(ContainerPanel);
        ContainerPanel.setLayout(ContainerPanelLayout);
        ContainerPanelLayout.setHorizontalGroup(
            ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerPanelLayout.createSequentialGroup()
                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContainerPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AppBarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ContainerPanelLayout.createSequentialGroup()
                        .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContainerPanelLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(labelStok)
                                .addGap(29, 29, 29)
                                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnKonfirm)
                                    .addComponent(inputQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(labelStok1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBayar)
                                    .addComponent(btnBeli)
                                    .addComponent(OutputHargaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ContainerPanelLayout.createSequentialGroup()
                                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ContainerPanelLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(ContainerPanelLayout.createSequentialGroup()
                                                    .addComponent(labelSediaanObat, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(inputSediaan, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(ContainerPanelLayout.createSequentialGroup()
                                                    .addComponent(labelKhasiat, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(inputKhasiat, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(ContainerPanelLayout.createSequentialGroup()
                                                    .addComponent(labelKodeObat, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(inputKode, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(ContainerPanelLayout.createSequentialGroup()
                                                    .addComponent(labelNamaObat, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(inputNama, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(labelInputData, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(ContainerPanelLayout.createSequentialGroup()
                                                    .addComponent(labelHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(inputHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(ContainerPanelLayout.createSequentialGroup()
                                                .addComponent(labelDataObat, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(inputSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(ContainerPanelLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ContainerPanelLayout.createSequentialGroup()
                                        .addComponent(btnKembali)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBatal)))
                                .addGap(0, 13, Short.MAX_VALUE)))
                        .addGap(0, 51, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ContainerPanelLayout.setVerticalGroup(
            ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AppBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDataObat)
                    .addComponent(inputSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(50, 50, 50)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelInputData, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelKodeObat)
                    .addComponent(inputKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNamaObat)
                    .addComponent(inputNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSediaanObat)
                    .addComponent(inputSediaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelKhasiat)
                    .addComponent(inputKhasiat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelHarga)
                    .addComponent(inputHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBeli)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelStok)
                    .addComponent(inputQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelStok1)
                    .addComponent(OutputHargaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBayar)
                    .addComponent(btnKonfirm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKembali)
                    .addComponent(btnBatal))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(ContainerPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        CustomerLoginForm dv = new CustomerLoginForm();
        this.dispose();
        dv.setVisible(true);
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void btnBeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeliActionPerformed
       
        inputQuantity.setEnabled(true);
        btnKonfirm.setEnabled(true);
      //  Float TotalHarga;
      // TotalHarga = Float.parseFloat(inputQuantity.getText())*Float.parseFloat(inputQuantity.getText());
        
       // inputHarga.setText(TotalHarga.toString());
       /*
        try{
            if(action.equals("Tambah"))
            {
                Obat o = new Obat(inputKode .getText(), inputNama.getText(), inputSediaan.getText(),inputKhasiat.getText(),Float.parseFloat(inputHarga.getText()),Integer.parseInt(inputQuantity.getText()) );
                obatControl.insertObat(o);
            }else
            {
                 Obat o = new Obat(inputKode.getText(), inputNama.getText(), inputSediaan.getText(),inputKhasiat.getText(),Float.parseFloat(inputHarga.getText()),Integer.parseInt(inputQuantity.getText()) );
                 obatControl.updateObat(o,inputKode.getText());
            }
            clearText();
            showObat();
            setComponent(false);
        }catch(Exception e)
        {
            System.out.println(e);
        }*/
    }//GEN-LAST:event_btnBeliActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        setComponent(false);
        btnBatal.setEnabled(true);
        
        try{
             TableObatForCustomer tblObat = obatControl.showObatToCustomer(inputSearch.getText()); 
           if(tblObat.getRowCount() == 0){
                clearText();
                JOptionPane.showConfirmDialog(null, "Data tidak ditemukan", "Konfirmasi", JOptionPane.DEFAULT_OPTION);
            }else{
               System.out.println(tblObat.getRowCount());
                tableObatForCustomer.setModel(tblObat);
            }
            clearText();
        }catch(Exception e){
         System.out.println("Error : "+e.getMessage());
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void inputQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputQuantityActionPerformed

    private void inputHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputHargaActionPerformed

    private void inputKhasiatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputKhasiatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputKhasiatActionPerformed

    private void inputSediaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSediaanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputSediaanActionPerformed

    private void inputNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNamaActionPerformed

    private void inputKodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputKodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputKodeActionPerformed

    private void inputSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputSearchActionPerformed

    private void inputSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputSearchMouseEntered
       if(stat==0)
       {
        inputSearch.setText("");
        stat=1;
       }
    }//GEN-LAST:event_inputSearchMouseEntered

    private void tableObatForCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableObatForCustomerMouseClicked
        setComponent(false);
        
        int clickedRow = tableObatForCustomer.getSelectedRow();
        TableModel tableModel = tableObatForCustomer.getModel();
        
       
        inputNama.setText(tableModel.getValueAt(clickedRow,0).toString());
        inputSediaan.setText(tableModel.getValueAt(clickedRow, 1).toString());
        inputKhasiat.setText(tableModel.getValueAt(clickedRow, 2).toString());
        inputHarga.setText(tableModel.getValueAt(clickedRow, 3).toString());
        inputKode.setText(tableModel.getValueAt(clickedRow, 5).toString());
        btnBeli.setEnabled(true);
    }//GEN-LAST:event_tableObatForCustomerMouseClicked

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        setComponent(false);
        clearText();
        showObat();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void OutputHargaTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OutputHargaTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OutputHargaTotalActionPerformed

    private void btnBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBayarActionPerformed
       Obat O = new Obat(Integer.parseInt(inputQuantity.getText()), inputKode.getText(), inputNama.getText(), inputSediaan.getText(),inputKhasiat.getText(),Float.parseFloat(inputHarga.getText()));
    }//GEN-LAST:event_btnBayarActionPerformed

    private void btnKonfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKonfirmActionPerformed
       
        btnBayar.setEnabled(true);
        Float TotalHarga;
       TotalHarga = Float.parseFloat(inputQuantity.getText())*Float.parseFloat(inputHarga.getText());
        
       OutputHargaTotal.setText(TotalHarga.toString());
       OutputHargaTotal.setEditable(false);
       OutputHargaTotal.setEnabled(true);
    }//GEN-LAST:event_btnKonfirmActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AppBarLabel;
    private javax.swing.JPanel AppBarPanel;
    private javax.swing.JPanel ContainerPanel;
    private javax.swing.JTextField OutputHargaTotal;
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnBayar;
    private javax.swing.JButton btnBeli;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnKonfirm;
    private javax.swing.JButton btnSearch;
    private javax.swing.JTextField inputHarga;
    private javax.swing.JTextField inputKhasiat;
    private javax.swing.JTextField inputKode;
    private javax.swing.JTextField inputNama;
    private javax.swing.JTextField inputQuantity;
    private javax.swing.JTextField inputSearch;
    private javax.swing.JTextField inputSediaan;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelDataObat;
    private javax.swing.JLabel labelHarga;
    private javax.swing.JLabel labelInputData;
    private javax.swing.JLabel labelKhasiat;
    private javax.swing.JLabel labelKodeObat;
    private javax.swing.JLabel labelNamaObat;
    private javax.swing.JLabel labelSediaanObat;
    private javax.swing.JLabel labelStok;
    private javax.swing.JLabel labelStok1;
    private javax.swing.JTable tableObatForCustomer;
    // End of variables declaration//GEN-END:variables
}