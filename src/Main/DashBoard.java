package Main;

/**
 *
 * @author bns-Team
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Login.login;

public class DashBoard extends JFrame {
	 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private JLabel dashboard;
    private JLabel exit;
    private JPanel jPanel1;
    private JLabel logout;
    private JLabel options;
    private JLabel payment;
    private Component frame;

    /**
     * Creates new form DashBoard
     */
    public DashBoard() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void initComponents() {

        jPanel1 = new JPanel();
        exit = new JLabel();
        logout = new JLabel();
        payment = new JLabel();
        options = new JLabel();
        dashboard = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        exit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        exit.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel1.add(exit);
        exit.setBounds(770, 460, 30, 30);

        logout.setIcon(new ImageIcon(getClass().getResource("/images/logoutD.png"))); // Tombol logout
        logout.setCursor(new Cursor(Cursor.HAND_CURSOR));
        logout.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        jPanel1.add(logout);
        logout.setBounds(10, 460, 110, 30);

        payment.setCursor(new Cursor(Cursor.HAND_CURSOR));
        payment.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                paymentMouseClicked(evt);
            }
        });
        jPanel1.add(payment);
        payment.setBounds(520, 200, 100, 100);

        options.setIcon(new ImageIcon(getClass().getResource("/images/options1.png")));
        jPanel1.add(options);
        options.setBounds(500, 70, 800, 380);

        dashboard.setIcon(new ImageIcon(getClass().getResource("/images/Dashboard_1.png")));
        jPanel1.add(dashboard);
        dashboard.setBounds(0, 0, 811, 499);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 808, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(MouseEvent evt) {
       if (JOptionPane.showConfirmDialog(frame, "Matikan Sistem.?", "Close", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        {    
        System.exit(0);
        }
    }

    @SuppressWarnings("deprecation")
	private void logoutMouseClicked(MouseEvent evt) {
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Apakah kamu yakin untuk Logout !", "Logout", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            login log = new login();
            this.dispose();
            log.show();
        }
    }
    

   
	@SuppressWarnings("deprecation")
	private void paymentMouseClicked(MouseEvent evt) {
        home hm = new home();
            this.dispose();
            hm.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        /*
         * Create and display the form
         */
        EventQueue.invokeLater(new Runnable() {

            public void run() {
                new DashBoard().setVisible(true);
            }
        });
    }
}
