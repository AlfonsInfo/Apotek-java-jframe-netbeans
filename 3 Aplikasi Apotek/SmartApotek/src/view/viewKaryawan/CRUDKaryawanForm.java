package view.viewKaryawan;

import view.viewKaryawan.KaryawanForm;
import java.util.List;
import control.ManajerControl;
import control.DepartemenControl;
import control.StafControl;
import control.AkunKaryawanControl;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import model.karyawan.*;
import model.Departemen; // untuk dropDown


public class CRUDKaryawanForm extends javax.swing.JFrame {
    //Field
    private ManajerControl manajerControl;
    private DepartemenControl departemenControl;
    private AkunKaryawanControl akunKaryawanControl;
    private StafControl stafControl;
    String action = null;
    List<Manajer> listManajer;
    List<Staf> listStaf;
    List<Departemen> listDepartemen;
    List<AkunKaryawan> listAkunKaryawan;
    int selectedId = 0 ;
    
    //Konstruktor
    public CRUDKaryawanForm()
    {
        //Init Form
        initComponents();
        setComponent(false);
        setEditDeleteBtn(false);
        
        //Control Sebagai Interface
        manajerControl = new ManajerControl();
        stafControl = new StafControl();
        departemenControl = new DepartemenControl();
        akunKaryawanControl = new AkunKaryawanControl();        
        //Output Tabel dan Drop down untuk dipilih
        setDepartemenToDropDown();        
        showGroup();
    }
    
    //Method
    public void setComponent(boolean value)
    {
        inputIDKaryawan.setEnabled(value);
        inputNamaK.setEnabled(value);
        inputGaji.setEnabled(value);
        NamaDepartemenDropDown.setEnabled(value);
        InputUser.setEnabled(value);
        inputPW.setEnabled(value);
        inputEmail.setEnabled(value);
        InputTunjangan.setEnabled(value);
        inputBidang.setEnabled(value);
        
        SaveBtn.setEnabled(value);
        CancelBtn.setEnabled(value);
    }
    
    public void setEditDeleteBtn(boolean value)
    {
        UpdateBtn.setEnabled(value);
        DeleteBtn.setEnabled(value);
    }
    
    public void clearText()
    {
        inputIDKaryawan.setText("");
        inputNamaK.setText("");
        inputGaji.setText("");
        NamaDepartemenDropDown.setSelectedItem(false);
        InputUser.setText("");
        inputPW.setText("");
        inputEmail.setText("");
        InputTunjangan.setText("");
        inputBidang.setText("");   
    }
   
    public void setDepartemenToDropDown()
    {
        listDepartemen = departemenControl.showListAllDepartemen();
        for(int i = 0 ;i<listDepartemen.size();i++)
        {
            NamaDepartemenDropDown.addItem(listDepartemen.get(i));
        }
    }
    
    public void showManajer()
    {
        
        tableManajer.setModel(manajerControl.showManajer(""));
    }
    
    public  void showStaf()
    {
        tableStaf.setModel(stafControl.showStaf(""));
    }
    
    public void showGroup()
    {
        showManajer();
        showStaf();
    }
    
   

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jScrollPane2 = new javax.swing.JScrollPane();
        ContainerPanel = new javax.swing.JPanel();
        AppBarPanel = new javax.swing.JPanel();
        AppBarLabel = new javax.swing.JLabel();
        tabelManajer = new javax.swing.JScrollPane();
        tableManajer = new javax.swing.JTable();
        inputEmail = new javax.swing.JTextField();
        inputIDKaryawan = new javax.swing.JTextField();
        SaveBtn = new javax.swing.JButton();
        CancelBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        idLabel = new javax.swing.JLabel();
        NamaLabel = new javax.swing.JLabel();
        UpdateBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        tabelKaryawan = new javax.swing.JScrollPane();
        tableStaf = new javax.swing.JTable();
        inputNamaK = new javax.swing.JTextField();
        inputPW = new javax.swing.JTextField();
        inputGaji = new javax.swing.JTextField();
        InputTunjangan = new javax.swing.JTextField();
        InputUser = new javax.swing.JTextField();
        lblNama = new javax.swing.JLabel();
        lblGaji = new javax.swing.JLabel();
        idLabel3 = new javax.swing.JLabel();
        idLabel4 = new javax.swing.JLabel();
        idLabel5 = new javax.swing.JLabel();
        NamaLabel1 = new javax.swing.JLabel();
        NamaLabel2 = new javax.swing.JLabel();
        inputBidang = new javax.swing.JTextField();
        idLabel6 = new javax.swing.JLabel();
        idLabel7 = new javax.swing.JLabel();
        btnManajer = new javax.swing.JButton();
        btnStaf = new javax.swing.JButton();
        NamaDepartemenDropDown = new javax.swing.JComboBox<>();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        ContainerPanel.setBackground(new java.awt.Color(255, 255, 255));

        AppBarPanel.setBackground(new java.awt.Color(0, 0, 153));

        AppBarLabel.setForeground(new java.awt.Color(255, 255, 255));
        AppBarLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AppBarLabel.setText("SMART APOTEK");

        javax.swing.GroupLayout AppBarPanelLayout = new javax.swing.GroupLayout(AppBarPanel);
        AppBarPanel.setLayout(AppBarPanelLayout);
        AppBarPanelLayout.setHorizontalGroup(
            AppBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AppBarPanelLayout.createSequentialGroup()
                .addComponent(AppBarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 401, Short.MAX_VALUE))
        );
        AppBarPanelLayout.setVerticalGroup(
            AppBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AppBarLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        tabelManajer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelManajerMouseClicked(evt);
            }
        });

        tableManajer.setForeground(new java.awt.Color(0, 0, 0));
        tableManajer.setModel(new javax.swing.table.DefaultTableModel(
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
        tableManajer.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                tableManajerComponentAdded(evt);
            }
        });
        tableManajer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableManajerMouseClicked(evt);
            }
        });
        tabelManajer.setViewportView(tableManajer);

        inputEmail.setBackground(new java.awt.Color(255, 255, 255));
        inputEmail.setForeground(new java.awt.Color(0, 0, 0));
        inputEmail.setCaretColor(new java.awt.Color(0, 0, 0));
        inputEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputEmailKeyReleased(evt);
            }
        });

        inputIDKaryawan.setBackground(new java.awt.Color(255, 255, 255));
        inputIDKaryawan.setForeground(new java.awt.Color(0, 0, 0));
        inputIDKaryawan.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        inputIDKaryawan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputIDKaryawanKeyReleased(evt);
            }
        });

        SaveBtn.setBackground(new java.awt.Color(0, 0, 255));
        SaveBtn.setForeground(new java.awt.Color(255, 255, 255));
        SaveBtn.setText("Save");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });

        CancelBtn.setBackground(new java.awt.Color(255, 255, 255));
        CancelBtn.setForeground(new java.awt.Color(0, 0, 255));
        CancelBtn.setText("Cancel");
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setBackground(new java.awt.Color(255, 51, 0));
        DeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        idLabel.setForeground(new java.awt.Color(0, 0, 0));
        idLabel.setText("ID :");

        NamaLabel.setForeground(new java.awt.Color(0, 0, 0));
        NamaLabel.setText("Email :");

        UpdateBtn.setBackground(new java.awt.Color(255, 255, 255));
        UpdateBtn.setForeground(new java.awt.Color(255, 0, 51));
        UpdateBtn.setText("Update");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });

        BackBtn.setBackground(new java.awt.Color(255, 255, 255));
        BackBtn.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        BackBtn.setForeground(new java.awt.Color(0, 0, 204));
        BackBtn.setText("<<<");
        BackBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackBtnMouseClicked(evt);
            }
        });
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        tableStaf.setForeground(new java.awt.Color(0, 0, 0));
        tableStaf.setModel(new javax.swing.table.DefaultTableModel(
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
        tableStaf.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                tableStafComponentAdded(evt);
            }
        });
        tableStaf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableStafMouseClicked(evt);
            }
        });
        tabelKaryawan.setViewportView(tableStaf);

        inputNamaK.setBackground(new java.awt.Color(255, 255, 255));
        inputNamaK.setForeground(new java.awt.Color(0, 0, 0));
        inputNamaK.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputNamaKKeyReleased(evt);
            }
        });

        inputPW.setBackground(new java.awt.Color(255, 255, 255));
        inputPW.setForeground(new java.awt.Color(0, 0, 0));
        inputPW.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputPWKeyReleased(evt);
            }
        });

        inputGaji.setBackground(new java.awt.Color(255, 255, 255));
        inputGaji.setForeground(new java.awt.Color(0, 0, 0));
        inputGaji.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputGajiKeyReleased(evt);
            }
        });

        InputTunjangan.setBackground(new java.awt.Color(255, 255, 255));
        InputTunjangan.setForeground(new java.awt.Color(0, 0, 0));

        InputUser.setBackground(new java.awt.Color(255, 255, 255));
        InputUser.setForeground(new java.awt.Color(0, 0, 0));
        InputUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputUserActionPerformed(evt);
            }
        });
        InputUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                InputUserKeyReleased(evt);
            }
        });

        lblNama.setForeground(new java.awt.Color(0, 0, 0));
        lblNama.setText("Nama :");

        lblGaji.setForeground(new java.awt.Color(0, 0, 0));
        lblGaji.setText("Gaji :");

        idLabel3.setForeground(new java.awt.Color(0, 0, 0));
        idLabel3.setText("Departemen :");

        idLabel4.setForeground(new java.awt.Color(0, 0, 0));
        idLabel4.setText("Nama Pengguna :");

        idLabel5.setForeground(new java.awt.Color(0, 0, 0));
        idLabel5.setText("Password :");

        NamaLabel1.setForeground(new java.awt.Color(0, 0, 0));
        NamaLabel1.setText("Tunjangan :");

        NamaLabel2.setForeground(new java.awt.Color(0, 0, 0));
        NamaLabel2.setText("Bidang :");

        inputBidang.setBackground(new java.awt.Color(255, 255, 255));
        inputBidang.setForeground(new java.awt.Color(0, 0, 0));
        inputBidang.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        inputBidang.setSelectionColor(new java.awt.Color(0, 0, 0));
        inputBidang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputBidangActionPerformed(evt);
            }
        });
        inputBidang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputBidangKeyReleased(evt);
            }
        });

        idLabel6.setForeground(new java.awt.Color(0, 0, 0));
        idLabel6.setText("Input  Data : ");

        idLabel7.setForeground(new java.awt.Color(0, 0, 0));
        idLabel7.setText("Kelengkapan Akun Pengguna Aplikasi");

        btnManajer.setBackground(new java.awt.Color(102, 255, 102));
        btnManajer.setForeground(new java.awt.Color(0, 0, 0));
        btnManajer.setText("Manajer");
        btnManajer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManajerActionPerformed(evt);
            }
        });

        btnStaf.setBackground(new java.awt.Color(255, 255, 0));
        btnStaf.setForeground(new java.awt.Color(0, 0, 0));
        btnStaf.setText("Staf");
        btnStaf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStafActionPerformed(evt);
            }
        });

        NamaDepartemenDropDown.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N

        javax.swing.GroupLayout ContainerPanelLayout = new javax.swing.GroupLayout(ContainerPanel);
        ContainerPanel.setLayout(ContainerPanelLayout);
        ContainerPanelLayout.setHorizontalGroup(
            ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContainerPanelLayout.createSequentialGroup()
                        .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tabelManajer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(tabelKaryawan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE))
                            .addComponent(AppBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idLabel7)
                            .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(ContainerPanelLayout.createSequentialGroup()
                                    .addComponent(idLabel4)
                                    .addGap(9, 9, 9)
                                    .addComponent(InputUser, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))
                                .addGroup(ContainerPanelLayout.createSequentialGroup()
                                    .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(NamaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(idLabel5))
                                    .addGap(48, 48, 48)
                                    .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(inputEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                                        .addComponent(inputPW))))
                            .addGroup(ContainerPanelLayout.createSequentialGroup()
                                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(idLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblGaji, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(ContainerPanelLayout.createSequentialGroup()
                                        .addComponent(inputGaji, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(idLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NamaDepartemenDropDown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(ContainerPanelLayout.createSequentialGroup()
                                        .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(ContainerPanelLayout.createSequentialGroup()
                                                .addComponent(inputIDKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(60, 60, 60))
                                            .addComponent(lblNama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inputNamaK, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(817, Short.MAX_VALUE))
                    .addGroup(ContainerPanelLayout.createSequentialGroup()
                        .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContainerPanelLayout.createSequentialGroup()
                                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ContainerPanelLayout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(DeleteBtn))
                                    .addComponent(NamaLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NamaLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ContainerPanelLayout.createSequentialGroup()
                                        .addComponent(UpdateBtn)
                                        .addGap(18, 18, 18)
                                        .addComponent(CancelBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(SaveBtn))
                                    .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(inputBidang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                                        .addComponent(InputTunjangan, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addGroup(ContainerPanelLayout.createSequentialGroup()
                                .addComponent(idLabel6)
                                .addGap(20, 20, 20)
                                .addComponent(btnManajer)
                                .addGap(18, 18, 18)
                                .addComponent(btnStaf)))
                        .addGap(0, 1254, Short.MAX_VALUE))))
        );
        ContainerPanelLayout.setVerticalGroup(
            ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AppBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel6)
                    .addComponent(btnStaf)
                    .addComponent(btnManajer))
                .addGap(18, 18, 18)
                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(idLabel)
                        .addComponent(inputIDKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNama)
                        .addComponent(inputNamaK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContainerPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputGaji, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGaji)
                            .addComponent(idLabel3)
                            .addComponent(NamaDepartemenDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(idLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel4)
                    .addComponent(InputUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputPW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NamaLabel)
                    .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NamaLabel1)
                    .addComponent(InputTunjangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NamaLabel2)
                    .addComponent(inputBidang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveBtn)
                    .addComponent(CancelBtn)
                    .addComponent(UpdateBtn)
                    .addComponent(DeleteBtn))
                .addGap(37, 37, 37)
                .addComponent(tabelManajer, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(tabelKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(ContainerPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 906, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        setComponent(false);
        clearText();
    }//GEN-LAST:event_CancelBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
    if(InputTunjangan.getText().length() > 0)
    {
        int getAnswer = JOptionPane.showConfirmDialog(rootPane, "Apakah yakin ingin menghapus data ?","Konfirmasi",JOptionPane.YES_NO_OPTION);
        switch (getAnswer) {
            case 0:
            try {
                manajerControl.deleteManajer(String.valueOf(inputIDKaryawan.getText()));
                akunKaryawanControl.deleteAkunKaryawan(String.valueOf(InputUser.getText()));
                clearText();
                showGroup();
                setComponent(false);
                setEditDeleteBtn(false);
            } catch (Exception e) {
                System.out.println("Error : " + e.getMessage());
            }
                break;

            case 1:
                break;
            default:
                throw new AssertionError();
        }
    }else if(inputBidang.getText().length() > 0)        
    {
        int getAnswer = JOptionPane.showConfirmDialog(rootPane, "Apakah yakin ingin menghapus data ?","Konfirmasi",JOptionPane.YES_NO_OPTION);
        switch (getAnswer) {
            case 0:
            try {
                stafControl.deleteStaf(String.valueOf(inputIDKaryawan.getText()));
                akunKaryawanControl.deleteAkunKaryawan(InputUser.getText());
                clearText();
                showGroup();
                setComponent(false);
                setEditDeleteBtn(false);
            } catch (Exception e) {
                System.out.println("Error : " + e.getMessage());
            }
                break;

            case 1:
                break;
            default:
                throw new AssertionError();
        }           
          
    }
    clearText();
    showGroup();
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        JOptionPane.showConfirmDialog(rootPane,"Fitur belum Tersedia");
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void tableManajerComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_tableManajerComponentAdded

    }//GEN-LAST:event_tableManajerComponentAdded

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        if(action.equals("TambahManajer"))
        {   
            int i =NamaDepartemenDropDown.getSelectedIndex();
            Departemen d = new Departemen(listDepartemen.get(i).getIdDepartemen(),listDepartemen.get(i).getNamaDepartemen());
            AkunKaryawan ak = new AkunKaryawan(InputUser.getText(), inputPW.getText());
            
            Manajer m = new Manajer(Double.parseDouble(InputTunjangan.getText()), inputIDKaryawan.getText(), inputNamaK.getText(),Double.parseDouble(inputGaji.getText()), ak, d);
            manajerControl.insertManajer(m);
            akunKaryawanControl.insertAkunKaryawan(ak);
        }else if(action.equals("TambahStaf"))
        {
            int i =NamaDepartemenDropDown.getSelectedIndex();
            Departemen d = new Departemen(listDepartemen.get(i).getIdDepartemen(),listDepartemen.get(i).getNamaDepartemen());
            AkunKaryawan ak = new AkunKaryawan(InputUser.getText(), inputPW.getText());
            
           Staf staff = new Staf(inputBidang.getText(), inputIDKaryawan.getText(), inputNamaK.getText(),Double.parseDouble(inputGaji.getText()), ak, d);
            stafControl.insertStaf(staff);
            akunKaryawanControl.insertAkunKaryawan(ak);
        }
        
        showGroup();      
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void tableManajerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableManajerMouseClicked
       int indexDepartemen = -1;
        setEditDeleteBtn(true);
        setComponent(false);
        
        int clickedRow = tableManajer.getSelectedRow();
        TableModel tableModel1 = tableManajer.getModel();
        inputIDKaryawan.setText(tableModel1.getValueAt(clickedRow, 0).toString());
        inputNamaK.setText(tableModel1.getValueAt(clickedRow, 1).toString());
        inputGaji.setText(tableModel1.getValueAt(clickedRow, 2).toString());
        InputTunjangan.setText(tableModel1.getValueAt(clickedRow, 3).toString());
        InputUser.setText(tableModel1.getValueAt(clickedRow,4).toString());
      
        String namaDepartemen = tableManajer.getValueAt(clickedRow,5).toString();
        for(Departemen departemen : listDepartemen)
        {
            if(namaDepartemen.equals(departemen.getNamaDepartemen())){
                indexDepartemen = listDepartemen.indexOf(departemen);   
            }
        }
        NamaDepartemenDropDown.setSelectedIndex(indexDepartemen);
    }//GEN-LAST:event_tableManajerMouseClicked

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackBtnActionPerformed

    private void BackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBtnMouseClicked
       // Choice dv = new Choice();
        KaryawanForm dv = new KaryawanForm();
        this.dispose();
        dv.setVisible(true);
    }//GEN-LAST:event_BackBtnMouseClicked

    private void inputIDKaryawanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputIDKaryawanKeyReleased

    }//GEN-LAST:event_inputIDKaryawanKeyReleased

    private void inputEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputEmailKeyReleased

    }//GEN-LAST:event_inputEmailKeyReleased

    private void tableStafMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableStafMouseClicked
       int indexDepartemen = -1;
        setEditDeleteBtn(true);
        setComponent(false);
        
        int clickedRow = tableStaf.getSelectedRow();
        TableModel tableModel2 = tableStaf.getModel();
        inputIDKaryawan.setText(tableModel2.getValueAt(clickedRow, 0).toString());
        inputNamaK.setText(tableModel2.getValueAt(clickedRow, 1).toString());
        inputGaji.setText(tableModel2.getValueAt(clickedRow, 2).toString());
        inputBidang.setText(tableModel2.getValueAt(clickedRow, 3).toString());
        InputUser.setText(tableModel2.getValueAt(clickedRow,4).toString());
      
        String namaDepartemen = tableManajer.getValueAt(clickedRow,5).toString();
        for(Departemen departemen : listDepartemen)
        {
            if(namaDepartemen.equals(departemen.getNamaDepartemen())){
                indexDepartemen = listDepartemen.indexOf(departemen);   
            }
        }
        NamaDepartemenDropDown.setSelectedIndex(indexDepartemen);
    }//GEN-LAST:event_tableStafMouseClicked

    private void tableStafComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_tableStafComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tableStafComponentAdded

    private void inputNamaKKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputNamaKKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNamaKKeyReleased

    private void inputPWKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputPWKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPWKeyReleased

    private void inputGajiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputGajiKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_inputGajiKeyReleased

    private void InputUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InputUserKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_InputUserKeyReleased

    private void inputBidangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputBidangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputBidangActionPerformed

    private void inputBidangKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputBidangKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_inputBidangKeyReleased

    private void btnManajerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManajerActionPerformed
        setComponent(true);
        clearText();
        inputBidang.setEnabled(false);
        action = "TambahManajer";
    }//GEN-LAST:event_btnManajerActionPerformed

    private void btnStafActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStafActionPerformed
        setComponent(true);
        clearText();
        InputTunjangan.setEnabled(false);
        action = "TambahStaf";
    }//GEN-LAST:event_btnStafActionPerformed

    private void InputUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputUserActionPerformed

    private void tabelManajerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelManajerMouseClicked
 
    }//GEN-LAST:event_tabelManajerMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUDKaryawanForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AppBarLabel;
    private javax.swing.JPanel AppBarPanel;
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton CancelBtn;
    private javax.swing.JPanel ContainerPanel;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JTextField InputTunjangan;
    private javax.swing.JTextField InputUser;
    private javax.swing.JComboBox<Departemen> NamaDepartemenDropDown;
    private javax.swing.JLabel NamaLabel;
    private javax.swing.JLabel NamaLabel1;
    private javax.swing.JLabel NamaLabel2;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JButton btnManajer;
    private javax.swing.JButton btnStaf;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel idLabel3;
    private javax.swing.JLabel idLabel4;
    private javax.swing.JLabel idLabel5;
    private javax.swing.JLabel idLabel6;
    private javax.swing.JLabel idLabel7;
    private javax.swing.JTextField inputBidang;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JTextField inputGaji;
    private javax.swing.JTextField inputIDKaryawan;
    private javax.swing.JTextField inputNamaK;
    private javax.swing.JTextField inputPW;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblGaji;
    private javax.swing.JLabel lblNama;
    private javax.swing.JScrollPane tabelKaryawan;
    private javax.swing.JScrollPane tabelManajer;
    private javax.swing.JTable tableManajer;
    private javax.swing.JTable tableStaf;
    // End of variables declaration//GEN-END:variables
   
}
