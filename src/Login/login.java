package Login;
/*
 * 
 */
import Main.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author bns-Team
 */
public class login extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel background;
    private JLabel developer;
    private JLabel exit;
    private JPanel jPanel1;
    private JLabel loinbuttton;
    private JLabel minimize;
    private static JPasswordField password;
    private static JTextField userid;
    
    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
   
    private void initComponents() {

        jPanel1 = new JPanel();
        userid = new JTextField();
        password = new JPasswordField();
        exit = new JLabel();
        minimize = new JLabel();
        loinbuttton = new JLabel();
        developer = new JLabel();
        background = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        userid.setFont(new Font("Arial Rounded MT Bold", 0, 20)); // User ID
        userid.setBorder(null);
        userid.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                useridActionPerformed(evt);
            }
        });
        jPanel1.add(userid);
        userid.setBounds(580, 190, 250, 30);
        
        password.setFont(new Font("Arial Rounded MT Bold", 2, 20)); // Password
        password.setBorder(null);
        password.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                passwordKeyPressed(evt);
            }
        });
        jPanel1.add(password);
        password.setBounds(580, 304, 250, 30);

        exit.setBackground(new Color(255, 255, 255));
        exit.setIcon(new ImageIcon(getClass().getResource("/images/x.png"))); // Exit
        exit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        exit.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel1.add(exit);
        exit.setBounds(840, 0, 30, 40);

        minimize.setBackground(new Color(255, 255, 255));
        minimize.setIcon(new ImageIcon(getClass().getResource("/images/-.png"))); // Minimize 
        minimize.setCursor(new Cursor(Cursor.HAND_CURSOR));
        minimize.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        jPanel1.add(minimize);
        minimize.setBounds(800, 0, 30, 40);

        loinbuttton.setBackground(new Color(255, 255, 255));
        loinbuttton.setIcon(new ImageIcon(getClass().getResource("/images/login button 2.png"))); // Login
        loinbuttton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        loinbuttton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                loinbutttonMouseClicked(evt);
            }
        });
        loinbuttton.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                loinbutttonKeyPressed(evt);
            }
        });
        jPanel1.add(loinbuttton);
        loinbuttton.setBounds(620, 370, 160, 40);

        developer.setForeground(new Color(0, 153, 153));
        developer.setText("© Custom by bns-Team");
        jPanel1.add(developer);
        developer.setBounds(10, 460, 240, 30);

        background.setIcon(new ImageIcon(getClass().getResource("/images/log_img.png"))); // Bg Login
        jPanel1.add(background);
        background.setBounds(0, 0, 880, 500);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 885, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void useridActionPerformed(ActionEvent evt) {
       
    }

    private void exitMouseClicked(MouseEvent evt) {
        System.exit(0);
    }

    private void minimizeMouseClicked(MouseEvent evt) {
        this.setState(JFrame.ICONIFIED);
    }
    @SuppressWarnings("deprecation")
    private void loinbutttonMouseClicked(MouseEvent evt) {
                //set default password
        String usrid = userid.getText();
		String pass = password.getText();
        if (usrid.equals("admin") && pass.equals("1234")) {
            
            new DashBoard().setVisible(true);
            this.dispose();
            userid.setText(null);
            password.setText(null);          
           
        } else {
            JOptionPane.showMessageDialog(null, "ID atau Password Tidak Valid");
            userid.setText(null);
            password.setText(null);

        }
    }
    private void loinbutttonKeyPressed(KeyEvent evt) {

    }
// untuk key enter
    @SuppressWarnings("deprecation")
	private void passwordKeyPressed(KeyEvent evt) {
        String usrid = userid.getText();
        String pass = password.getText();
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){  
        	if (usrid.equals("admin") && pass.equals("1234")) {            
            new DashBoard().setVisible(true);
            this.dispose();
            userid.setText(null);
            password.setText(null); 
           
        } else {
            JOptionPane.showMessageDialog(null, "ID atau Password Tidak Valid");
            userid.setText(null);
            password.setText(null);

             }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /*
         * Create and display the form
         */
        EventQueue.invokeLater(new Runnable() {

            public void run() {
                new login().setVisible(true);
            }
        });
    }
    
}
