package Load;

/**
 *
 * @author bns-Team
 */

import javax.swing.*;
import java.awt.*;

public class start1 extends javax.swing.JFrame {
  
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public start1() {		//constructor
        initComponents();
        this.setLocationRelativeTo(null);
        
    }
    private javax.swing.JLabel background;
    private javax.swing.JLabel circleloading;
    private javax.swing.JLabel developer1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel loading;
    public javax.swing.JLabel loadingnumber;
    private javax.swing.JLabel pw;
   
    //GEN-STR:initComponents
    private void initComponents() {
    	background = new JLabel();
    	circleloading = new JLabel();
    	developer1 = new JLabel();
        jPanel1 = new JPanel();
        loading = new JLabel();
        loadingnumber = new JLabel();
        pw = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new Color(244, 244, 244));
        jPanel1.setLayout(null);

        loadingnumber.setFont(new Font("Arial Rounded MT Bold", 1, 30));
        loadingnumber.setForeground(new Color(0, 204, 204));
        loadingnumber.setText("0%");
        jPanel1.add(loadingnumber);
        loadingnumber.setBounds(390, 210, 110, 90);

        circleloading.setIcon(new ImageIcon(getClass().getResource("/images/circle loading.gif")));
        circleloading.setText("jLabel1");
        jPanel1.add(circleloading);
        circleloading.setBounds(320, 170, 200, 170);

        pw.setFont(new Font("Arial Rounded MT Bold", 1, 50));
        pw.setForeground(new Color(0, 204, 204));
        pw.setText("Okay OTW");
        jPanel1.add(pw);
        pw.setBounds(250, 30, 430, 130);

        loading.setIcon(new ImageIcon(getClass().getResource("/images/loaging_1.gif")));
        jPanel1.add(loading);
        loading.setBounds(570, 90, 110, 30);

        developer1.setForeground(new Color(0, 153, 153));
        developer1.setText("© Custom by bns-Team");
        jPanel1.add(developer1);
        developer1.setBounds(10, 460, 180, 30);

        background.setBackground(new Color(192, 192, 192));
        background.setBorder(BorderFactory.createLineBorder(new Color(0, 204, 204), 4));
        jPanel1.add(background);
        background.setBounds(0, 0, 881, 499);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 881, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 499, GroupLayout.PREFERRED_SIZE)
        );
        pack();
    } //GEN-END:initComponents

    public static void main(String args[]) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Optimus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(start1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(start1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(start1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(start1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     
        /*
         * Create and display the form
         */
        EventQueue.invokeLater(new Runnable() {

            public void run() {
            new start1().setVisible(true);
 
            }
        });
    }
}
