package Load;

/**
 *
 * @author bns-Team
 */

import javax.swing.*;
import Login.login;

public class start extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("deprecation")
	public static void main (String[] args) {
		start1 sp = new start1();
		sp.setVisible(true);
		try{
			for(int i=0; i<=100; i+=2){
				Thread.sleep(200);
				sp.loadingnumber.setText(Integer.toString(i)+"%");
				login log = new login();                        
				if(i==100){      
					sp.dispose();//mengeluarkan dari frame saja
					log.show(); 
				}
			}
		}
		catch(Exception e){  //mengurung hasil eksekusi error sehingga program tidak dihentikan secara langsung
		
		}
    }
}
