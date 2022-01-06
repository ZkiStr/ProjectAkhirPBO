package Main;

/**
 *
 * @author bns-Team
 */

import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import javax.swing.*;
import Login.login;

public class home extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int Xmouse;
    int Ymouse;
    /**
     * Creates new form home
     */
    public home() {
        initComponents();
        this.setLocationRelativeTo(null);
     
    }
 // Variables declaration 
    private JPanel body;
    private JPanel jPanel1;
    private JPanel items;
    private JPanel taskbar;
    private JButton getrecipt;
    private JButton Reset;
    private JButton printrecipt;
    private JButton total;
    private JLabel NIM;
    private JLabel Departement;
    private JLabel Smtr;
    private JLabel Jurusan;
    private JLabel Student_Name;
    private JLabel developer;
    private JLabel jLabel1;
    private JLabel logout;
    private JLabel minimize;
    private JLabel x;
    private JLabel text;
    private JTextField ad;
    private JTextField labf;
    private JTextField lb;
    private JTextField bn;
    private JTextField ef;
    private JTextField ff;
    private JTextField d;
    private JTextField im;
    private JTextField msf;
    private JTextField rad;
    private JTextField rln;
    private JTextField rn;
    private JTextField sm;
    private JTextField sn;
    private JTextField tc;
    private JTextField totalcost;
    private JCheckBox jCheckBox1;
    private JCheckBox jCheckBox18;
    private JCheckBox jCheckBox19;
    private JCheckBox jCheckBox20;
    private JCheckBox jCheckBox21;
    private JCheckBox jCheckBox22;
    private JCheckBox jCheckBox23;
    private JCheckBox jCheckBox24;
    private JCheckBox jCheckBox25;
    private JTextArea area;
    private JScrollPane print_area;
    private JScrollPane Bg_ScrollPane2;
    private ScrollPane scrollPane1;
    // End of variables declaration
    
 // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new JPanel();
        taskbar = new JPanel();
        body = new JPanel();
        items = new JPanel();
        logout = new JLabel();
        developer = new JLabel();
        Student_Name = new JLabel();
        NIM = new JLabel();
        Smtr = new JLabel();
        Jurusan = new JLabel();
        Departement = new JLabel();
        minimize = new JLabel();
        x = new JLabel();
        text = new JLabel();
        jLabel1 = new JLabel();
        scrollPane1 = new ScrollPane();
        print_area = new JScrollPane();
        Bg_ScrollPane2 = new JScrollPane();
        jCheckBox1 = new JCheckBox();
        jCheckBox18 = new JCheckBox();
        jCheckBox19 = new JCheckBox();
        jCheckBox20 = new JCheckBox();
        jCheckBox21 = new JCheckBox();
        jCheckBox22 = new JCheckBox();
        jCheckBox23 = new JCheckBox();
        jCheckBox24 = new JCheckBox();
        jCheckBox25 = new JCheckBox();
        rad = new JTextField();
        sm = new JTextField();
        labf = new JTextField();
        lb = new JTextField();
        ef = new JTextField();
        im = new JTextField();
        msf = new JTextField();
        ff = new JTextField();
        ad = new JTextField();
        sn = new JTextField();
        rn = new JTextField();
        bn = new JTextField();
        d = new JTextField();
        rln = new JTextField();
        totalcost = new JTextField();
        tc = new JTextField();
        Reset = new JButton();
        total = new JButton();
        getrecipt = new JButton();
        printrecipt = new JButton();
        area = new JTextArea();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new Color(0, 0, 0));
        setUndecorated(false);
        setVisible(true);
        setLocationRelativeTo(null);

        jPanel1.setBackground(new Color(192, 192, 192));
        jPanel1.setBorder(BorderFactory.createLineBorder(new Color(0, 142, 142), 5));
        jPanel1.setLayout(null);

        taskbar.setBackground(new Color(192, 192, 192));
        taskbar.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                taskbarMousePressed(evt);
            }
        });
        taskbar.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent evt) {
                taskbarMouseDragged(evt);
            }
        });
        taskbar.setLayout(null);

        minimize.setIcon(new ImageIcon(getClass().getResource("/images/-.png")));
        minimize.setCursor(new Cursor(Cursor.HAND_CURSOR));
        minimize.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        taskbar.add(minimize);
        minimize.setBounds(1102, 0, 30, 60);

        x.setIcon(new ImageIcon(getClass().getResource("/images/x.png")));
        x.setCursor(new Cursor(Cursor.HAND_CURSOR));
        x.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                xMouseClicked(evt);
            }
        });
        taskbar.add(x);
        x.setBounds(1150, 0, 30, 60);

        text.setFont(new Font("Arial Rounded MT Bold", 0, 24));
        text.setText("Sistem Pembayaran Mahasiswa UMS");
        taskbar.add(text);
        text.setBounds(31, 0, 468, 60);

        jLabel1.setIcon(new ImageIcon(getClass().getResource("/images/gotoback.png")));
        jLabel1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        taskbar.add(jLabel1);
        jLabel1.setBounds(1050, 0, 50, 60);

        jPanel1.add(taskbar);
        taskbar.setBounds(0, 0, 1200, 60);

        body.setBackground(new Color(78, 0, 130));

        items.setBackground(new Color(255, 255, 255));

        jCheckBox1.setBackground(new Color(255, 255, 255));
        jCheckBox1.setFont(new Font("Arial Rounded MT Bold", 1, 18)); //af
        jCheckBox1.setForeground(new Color(51, 51, 51));
        jCheckBox1.setText("Admission Fee");
        jCheckBox1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox18.setBackground(new Color(255, 255, 255));
        jCheckBox18.setFont(new Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jCheckBox18.setForeground(new Color(51, 51, 51));
        jCheckBox18.setText("Re-Admission Fee");
        jCheckBox18.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jCheckBox18ActionPerformed(evt);
            }
        });

        jCheckBox19.setBackground(new Color(255, 255, 255));
        jCheckBox19.setFont(new Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jCheckBox19.setForeground(new Color(51, 51, 51));
        jCheckBox19.setText("Semester Fee");
        jCheckBox19.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jCheckBox19ActionPerformed(evt);
            }
        });

        jCheckBox20.setBackground(new Color(255, 255, 255));
        jCheckBox20.setFont(new Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jCheckBox20.setForeground(new Color(51, 51, 51));
        jCheckBox20.setText("Lab Fee");
        jCheckBox20.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jCheckBox20ActionPerformed(evt);
            }
        });

        jCheckBox21.setBackground(new Color(255, 255, 255));
        jCheckBox21.setFont(new Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jCheckBox21.setForeground(new Color(51, 51, 51));
        jCheckBox21.setText("Library Fee");
        jCheckBox21.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jCheckBox21ActionPerformed(evt);
            }
        });

        jCheckBox22.setBackground(new Color(255, 255, 255));
        jCheckBox22.setFont(new Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jCheckBox22.setForeground(new Color(51, 51, 51));
        jCheckBox22.setText("Examinatiom Fee");
        jCheckBox22.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jCheckBox22ActionPerformed(evt);
            }
        });

        jCheckBox23.setBackground(new Color(255, 255, 255));
        jCheckBox23.setFont(new Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jCheckBox23.setForeground(new Color(51, 51, 51));
        jCheckBox23.setText("Improvement Fee");
        jCheckBox23.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jCheckBox23ActionPerformed(evt);
            }
        });

        jCheckBox24.setBackground(new Color(255, 255, 255));
        jCheckBox24.setFont(new Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jCheckBox24.setForeground(new Color(51, 51, 51));
        jCheckBox24.setText("Marks Sheet Fee ");
        jCheckBox24.setActionCommand(" Chicken BBQ");
        jCheckBox24.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jCheckBox24ActionPerformed(evt);
            }
        });

        jCheckBox25.setBackground(new Color(255, 255, 255));
        jCheckBox25.setFont(new Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jCheckBox25.setForeground(new Color(51, 51, 51));
        jCheckBox25.setText("Fine/ Late Fee");
        jCheckBox25.setActionCommand("");
        jCheckBox25.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jCheckBox25ActionPerformed(evt);
            }
        });

        rad.setEditable(false);
        rad.setFont(new Font("Arial Rounded MT Bold", 0, 18)); // re-adm
        rad.setHorizontalAlignment(JTextField.CENTER);
        rad.setText("0");
        rad.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                radActionPerformed(evt);
            }
        });

        sm.setEditable(false);
        sm.setFont(new Font("Arial Rounded MT Bold", 0, 18)); // semester
        sm.setHorizontalAlignment(JTextField.CENTER);
        sm.setText("0");
        sm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                smActionPerformed(evt);
            }
        });

        labf.setEditable(false);
        labf.setFont(new Font("Arial Rounded MT Bold", 0, 18)); 
        labf.setHorizontalAlignment(JTextField.CENTER);
        labf.setText("0");
        labf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                labfActionPerformed(evt);
            }
        });

        lb.setEditable(false);
        lb.setFont(new Font("Arial Rounded MT Bold", 0, 18));
        lb.setHorizontalAlignment(JTextField.CENTER);
        lb.setText("0");
        lb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                lbActionPerformed(evt);
            }
        });

        ef.setEditable(false);
        ef.setFont(new Font("Arial Rounded MT Bold", 0, 18)); 
        ef.setHorizontalAlignment(JTextField.CENTER);
        ef.setText("0");
        ef.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                efActionPerformed(evt);
            }
        });

        im.setEditable(false);
        im.setFont(new Font("Arial Rounded MT Bold", 0, 18)); 
        im.setHorizontalAlignment(JTextField.CENTER);
        im.setText("0");
        im.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                imActionPerformed(evt);
            }
        });

        msf.setEditable(false);
        msf.setFont(new Font("Arial Rounded MT Bold", 0, 18));
        msf.setHorizontalAlignment(JTextField.CENTER);
        msf.setText("0");
        msf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                msfActionPerformed(evt);
            }
        });

        ff.setEditable(false);
        ff.setFont(new Font("Arial Rounded MT Bold", 0, 18));
        ff.setHorizontalAlignment(JTextField.CENTER);
        ff.setText("0");
        ff.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ffActionPerformed(evt);
            }
        });

        ad.setEditable(false);
        ad.setFont(new Font("Arial Rounded MT Bold", 0, 18));
        ad.setHorizontalAlignment(JTextField.CENTER);
        ad.setText("0");
        ad.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                adActionPerformed(evt);
            }
        });

        GroupLayout itemsLayout = new GroupLayout(items);
        items.setLayout(itemsLayout);
        itemsLayout.setHorizontalGroup(
            itemsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(itemsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(itemsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(itemsLayout.createSequentialGroup()
                        .addGroup(itemsLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                           .addComponent(jCheckBox1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                           .addComponent(jCheckBox18, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(161, 161, 161)
                        .addGroup(itemsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(ad)
                           .addComponent(rad)))
                    .addGroup(itemsLayout.createSequentialGroup()
                        .addGroup(itemsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(itemsLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jCheckBox21, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBox19, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBox20, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jCheckBox22)
                            .addComponent(jCheckBox23)
                            .addComponent(jCheckBox24)
                            .addComponent(jCheckBox25, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE))
                        .addGap(167, 167, 167)
                        .addGroup(itemsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(ff, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(msf, GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(im, GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(ef, GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(labf, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(sm, GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(lb, GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))))
                .addContainerGap())
        );
        itemsLayout.setVerticalGroup(
            itemsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(itemsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(itemsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addGroup(GroupLayout.Alignment.TRAILING, itemsLayout.createSequentialGroup()
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 1, GroupLayout.PREFERRED_SIZE)
                        .addComponent(ad, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(itemsLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox18)
                    .addComponent(rad, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(itemsLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox19)
                    .addComponent(sm, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(itemsLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox20)
                    .addComponent(labf, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(itemsLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox21)
                    .addComponent(lb, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(itemsLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox22)
                    .addComponent(ef, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(itemsLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox23)
                    .addComponent(im, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(itemsLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox24)
                    .addComponent(msf, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(itemsLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox25)
                    .addComponent(ff, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        Bg_ScrollPane2.setViewportView(items);

        logout.setIcon(new ImageIcon(getClass().getResource("/images/L_O 1.png"))); 
        logout.setCursor(new Cursor(Cursor.HAND_CURSOR));
        logout.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        developer.setForeground(new Color(255, 255, 255));
        developer.setText("© Custom by bns-Team");

        Student_Name.setFont(new Font("Arial Rounded MT Bold", 1, 20));
        Student_Name.setForeground(new Color(255, 255, 255));
        Student_Name.setText("Student Name :");

        NIM.setFont(new Font("Arial Rounded MT Bold", 1, 20));
        NIM.setForeground(new Color(255, 255, 255));
        NIM.setText("NIM :");

        Smtr.setFont(new Font("Arial Rounded MT Bold", 1, 20));
        Smtr.setForeground(new Color(255, 255, 255));
        Smtr.setText("Semester :");

	    Jurusan.setFont(new Font("Arial Rounded MT Bold", 1, 20));
        Jurusan.setForeground(new Color(255, 255, 255));
        Jurusan.setText("Jurusan :");

        Departement.setFont(new Font("Arial Rounded MT Bold", 1, 20));
        Departement.setForeground(new Color(255, 255, 255));
        Departement.setText("Fakultas :");

        sn.setFont(new Font("Arial Rounded MT Bold", 0, 18));
        sn.setHorizontalAlignment(JTextField.CENTER);
        sn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                snActionPerformed(evt);
            }
        });

        rn.setFont(new Font("Arial Rounded MT Bold", 0, 18));
        rn.setHorizontalAlignment(JTextField.CENTER);
        rn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                rnActionPerformed(evt);
            }
        });

        bn.setFont(new Font("Arial Rounded MT Bold", 0, 18));
        bn.setHorizontalAlignment(JTextField.CENTER);
        bn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bnActionPerformed(evt);
            }
        });

        d.setFont(new Font("Arial Rounded MT Bold", 0, 18));
        d.setHorizontalAlignment(JTextField.CENTER);
        d.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                dActionPerformed(evt);
            }
        });

        rln.setFont(new Font("Arial Rounded MT Bold", 0, 18));
        rln.setHorizontalAlignment(JTextField.CENTER);
        rln.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                rlnActionPerformed(evt);
            }
        });

        totalcost.setEditable(false);
        totalcost.setFont(new Font("Arial Rounded MT Bold", 1, 18));
        totalcost.setText(" Total Cost");
        totalcost.setBorder(null);
        totalcost.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                totalcostActionPerformed(evt);
            }
        });

        tc.setEditable(false);
        tc.setFont(new Font("Arial Rounded MT Bold", 0, 18));
        tc.setHorizontalAlignment(JTextField.CENTER);
        tc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                tcActionPerformed(evt);
            }
        });

        Reset.setFont(new Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Reset.setText("Reset");
        Reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        total.setFont(new Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        total.setText("Total");
        total.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });

        getrecipt.setFont(new Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        getrecipt.setText("Get Receipt");
        getrecipt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                getreciptActionPerformed(evt);
            }
        });

        printrecipt.setFont(new Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        printrecipt.setText("Print Receipt");
        printrecipt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                printreciptActionPerformed(evt);
            }
        });

        area.setColumns(20);
        area.setFont(new Font("Monospaced", 0, 18)); // print nota
        area.setRows(8);
        print_area.setViewportView(area);

        GroupLayout bodyLayout = new GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(// Horizontal setting
            bodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addGap(15, 26, 45)
                .addGroup(bodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGroup(bodyLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addGroup(bodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(bodyLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(NIM, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Student_Name, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Smtr, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE))
                                .addComponent(Bg_ScrollPane2, GroupLayout.PREFERRED_SIZE, 520, GroupLayout.PREFERRED_SIZE)
                                .addGroup(bodyLayout.createSequentialGroup()
                                    .addGroup(bodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(Jurusan, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Departement, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(bodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(sn)
                                        .addComponent(rn)
                                        .addComponent(bn)
                                        .addComponent(rln)
                                        .addComponent(d, GroupLayout.PREFERRED_SIZE, 330, GroupLayout.PREFERRED_SIZE))))
                            .addGroup(bodyLayout.createSequentialGroup()
                                .addComponent(Reset)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(total, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
                            .addGroup(GroupLayout.Alignment.LEADING, bodyLayout.createSequentialGroup()
                                .addComponent(totalcost, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tc, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)))
                        .addGap(98, 98, 98)
                        .addGroup(bodyLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(logout)
                            .addGroup(bodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(print_area, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
                                .addGroup(bodyLayout.createSequentialGroup()
                                    .addComponent(getrecipt)
                                    .addGap(100, 100, 100)
                                    .addComponent(printrecipt, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                        .addComponent(developer, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        bodyLayout.setVerticalGroup(//vertical setting
            bodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(bodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGroup(bodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(bodyLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(Student_Name))
                            .addComponent(sn, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(bodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(rn, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                            .addComponent(Smtr))
                        .addGap(22, 22, 22)
                        .addGroup(bodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(bn, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                            .addComponent(NIM))
                        .addGap(18, 18, 18)
                        .addGroup(bodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(Jurusan)
                            .addComponent(rln, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(bodyLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(Departement)
                            .addComponent(d, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(Bg_ScrollPane2, GroupLayout.PREFERRED_SIZE, 331, GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(bodyLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(tc, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalcost, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(bodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(Reset)
                            .addGroup(bodyLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(total))))
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addComponent(print_area, GroupLayout.PREFERRED_SIZE, 562, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bodyLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(printrecipt, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                            .addComponent(getrecipt, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logout, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(developer)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        // </editor-fold>//GEN-END:initComponents
        scrollPane1.add(body);

        jPanel1.add(scrollPane1);
        scrollPane1.setBounds(0, 60, 1195, 860);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 1195, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 860, GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rlnActionPerformed(ActionEvent evt) {
    	
    }
    private void bnActionPerformed(ActionEvent evt) {

    }
    private void rnActionPerformed(ActionEvent evt) {
    	
    }
    private void snActionPerformed(ActionEvent evt) {
        
    }
    private void tcActionPerformed(ActionEvent evt) {
       
    }
    private void ResetActionPerformed(ActionEvent evt) {// reset
        //area null
        area.setText(null);
        bn.setText(null);
        rln.setText(null);
        sn.setText(null);
        d.setText(null);        
        rn.setText(null);        
        ff.setText("0");
        ef.setText("0");
        lb.setText("0");
        rad.setText("0");  
        im.setText("0");
        msf.setText("0");
        ad.setText("0");
        sm.setText("0");
        labf.setText("0");
        tc.setText(null);
        //checkbox null
        jCheckBox1.setSelected(false);
        jCheckBox18.setSelected(false);
        jCheckBox19.setSelected(false);
        jCheckBox20.setSelected(false);
        jCheckBox21.setSelected(false);
        jCheckBox22.setSelected(false);
        jCheckBox23.setSelected(false);
        jCheckBox24.setSelected(false);
        jCheckBox25.setSelected(false);
    }//GEN-LAST:event_ResetActionPerformed

    private void totalActionPerformed(ActionEvent evt) {
        double EFR = Double.parseDouble(ad.getText());
        double BM = Double.parseDouble(ff.getText());
        double CC = Double.parseDouble(ef.getText());
        double CF = Double.parseDouble(lb.getText());
        double CFR = Double.parseDouble(rad.getText());
        double CS = Double.parseDouble(im.getText());
        double CSK = Double.parseDouble(msf.getText());
        double PFR = Double.parseDouble(sm.getText());
        double SFR = Double.parseDouble(labf.getText()); 

        //.................calculation.................................

        double total =BM +CC+CF+CFR+CS+CSK+EFR+PFR+SFR ;
        

        //.................show values in text fild...................

        String item_total = String.format("%3f", total);
        tc.setText((String) item_total);

    }//GEN-LAST:event_totalActionPerformed

    @SuppressWarnings("deprecation")
	private void logoutMouseClicked(MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Are you sure you want to Logout !", "Logout", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            login log = new login();
            this.dispose();
            log.show();
        }
    }//GEN-LAST:event_logoutMouseClicked

    private void printreciptActionPerformed(ActionEvent evt) {//GEN-FIRST:event_printreciptActionPerformed
        try {
            area.print();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_printreciptActionPerformed

    private void getreciptActionPerformed(ActionEvent evt) {//GEN-FIRST:event_getreciptActionPerformed

        // decoration
        area.setText("*********************************\n");
        area.setText(area.getText() + "******   Payment Recipt   *******\n");
        area.setText(area.getText() + "*********************************\n");

        //Date
        Date obj = new Date();
        String date = obj.toString();
        area.setText(area.getText() + "" + date + "\n");
        
        area.setText(area.getText() + "---------------------------------\n");

        area.setText(area.getText() + "---------------------------------\n");
        // items
        
        area.setText(area.getText() + " Name     : " + sn.getText() + "\n");
        area.setText(area.getText() + " Fakultas : " + d.getText() + "\n");
        area.setText(area.getText() + " NIM      : " + bn.getText() + "\n");
        area.setText(area.getText() + " Semester : " + rn.getText() + "\n");
        area.setText(area.getText() + " Jurusan  : " + rln.getText() + "\n\n");
        area.setText(area.getText() + " Discriptation         Amounts\n");
        area.setText(area.getText() + "---------------------------------\n");        
        if (jCheckBox1.isSelected()) {
            area.setText(area.getText() + " Admission Fee............" + ad.getText() + "\n");
        }
        
        if (jCheckBox18.isSelected()) {
            area.setText(area.getText() + " Re-Admission Fee........." + rad.getText() + "\n");
        }
        if (jCheckBox19.isSelected()) {
            area.setText(area.getText() + " Semester Fee............." + sm.getText() + "\n");
        }
        if (jCheckBox20.isSelected()) {
            area.setText(area.getText() + " Lab Fee.................." + labf.getText() + "\n");
        }
        if (jCheckBox21.isSelected()) {
            area.setText(area.getText() + " Library Fee.............." + lb.getText() + "\n");
        }
        if (jCheckBox22.isSelected()) {
            area.setText(area.getText() + " Examination Fee.........." + ef.getText() + "\n");
        }
        if (jCheckBox23.isSelected()) {
            area.setText(area.getText() + " Improvement Fee.........." + im.getText() + "\n");
        }
        if (jCheckBox24.isSelected()) {
            area.setText(area.getText() + " Marks Sheet Fee.........." + msf.getText() + "\n");
        }
        if (jCheckBox25.isSelected()) {
            area.setText(area.getText() + " Fine/Late fee............" + ff.getText() + "\n");
        }
  
        area.setText(area.getText() + "---------------------------------\n");

        //bill
     
        area.setText(area.getText() + " Total Cost       " + "Rp."+ tc.getText() + "\n");
        area.setText(area.getText() + "---------------------------------\n\n");
        area.setText(area.getText() + "       Custom by bns-Team\n");
    }//GEN-LAST:event_getreciptActionPerformed

    private void dActionPerformed(ActionEvent evt) {//GEN-FIRST:event_dActionPerformed
        // TODO add your handling code here:
    }

    private void adActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jCheckBox25ActionPerformed(ActionEvent evt) {
        if (jCheckBox25.isSelected()) {
            ff.setEditable(true);
            ff.setText("10000");
            ff.requestFocus();
        } else {
            ff.setEditable(false);
            ff.setText("0");
        }
    }

    private void ffActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jCheckBox24ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jCheckBox24ActionPerformed
        if (jCheckBox24.isSelected()) {
            msf.setEditable(true);
            msf.setText("50000");
            msf.requestFocus();
        } else {
            msf.setEditable(false);
            msf.setText("0");
        }
    }//GEN-LAST:event_jCheckBox24ActionPerformed

    private void msfActionPerformed(ActionEvent evt) {//GEN-FIRST:event_msfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_msfActionPerformed

    private void jCheckBox23ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jCheckBox23ActionPerformed
        if (jCheckBox23.isSelected()) {
            im.setEditable(true);
            im.setText("35000");
            im.requestFocus();
        } else {
            im.setEditable(false);
            im.setText("0");
        }
    }//GEN-LAST:event_jCheckBox23ActionPerformed

    private void imActionPerformed(ActionEvent evt) {

    }

    private void efActionPerformed(ActionEvent evt) {//GEN-FIRST:event_efActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_efActionPerformed

    private void jCheckBox22ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jCheckBox22ActionPerformed
        if (jCheckBox22.isSelected()) {
            ef.setEditable(true);
            ef.setText("500000");
            ef.requestFocus();
        } else {
            ef.setEditable(false);
            ef.setText("0");
        }
    }//GEN-LAST:event_jCheckBox22ActionPerformed

    private void jCheckBox21ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jCheckBox21ActionPerformed
        if (jCheckBox21.isSelected()) {
            lb.setEditable(true);
            lb.setText("100000");
            lb.requestFocus();
        } else {
            lb.setEditable(false);
            lb.setText("0");
        }
    }//GEN-LAST:event_jCheckBox21ActionPerformed

    private void lbActionPerformed(ActionEvent evt) {//GEN-FIRST:event_lbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbActionPerformed

    private void labfActionPerformed(ActionEvent evt) {//GEN-FIRST:event_labfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labfActionPerformed

    private void jCheckBox20ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jCheckBox20ActionPerformed
        if (jCheckBox20.isSelected()) {
            labf.setEditable(true);
            labf.setText("450000");
            labf.requestFocus();
        } else {
            labf.setEditable(false);
            labf.setText("0");
        }
    }

    private void jCheckBox19ActionPerformed(ActionEvent evt) {
        if (jCheckBox19.isSelected()) {
            sm.setEditable(true);
            sm.setText("2700000");
            sm.requestFocus();
        } else {
            sm.setEditable(false);
            sm.setText("0");
        }
    }

    private void smActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void radActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jCheckBox18ActionPerformed(ActionEvent evt) {
        if (jCheckBox18.isSelected()) {
            rad.setEditable(true);
            rad.setText("20000");
            rad.requestFocus();
        } else {
            rad.setEditable(false);
            rad.setText("0");
        }
    }//GEN-LAST:event_jCheckBox18ActionPerformed

    private void jCheckBox1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
            ad.setEditable(true);
            ad.setText("20000");
            ad.requestFocus();
        } else {
            ad.setEditable(false);
            ad.setText("0");
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void xMouseClicked(MouseEvent evt) {
        if (JOptionPane.showConfirmDialog(frame, "Do you want to exit?", "Exit", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        {    
        System.exit(0);
        }
    }

    private void minimizeMouseClicked(MouseEvent evt) {
        this.setState(JFrame.ICONIFIED);
    }

    private void totalcostActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void taskbarMouseDragged(MouseEvent evt) {
        int x = evt.getXOnScreen();
        int y = evt.getXOnScreen();
        //System.out.println(x+","+y);
        this.setLocation(x /*- Xmouse*/, y /*-Ymouse*/);
    }

    private void taskbarMousePressed(MouseEvent evt) {
//        Xmouse = evt.getX();
//        Ymouse = evt.getY();
    }//GEN-LAST:event_taskbarMousePressed

    @SuppressWarnings("deprecation")
	private void jLabel1MouseClicked(MouseEvent evt) {
       DashBoard db = new DashBoard();
       this.dispose();
       db.show();
    }
    
    private JFrame frame;   //cofirm exit yes no
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
   
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Optimus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        EventQueue.invokeLater(new Runnable() {

            public void run() {
                new home().setVisible(true);
            }
        });
    }
}
