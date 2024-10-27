package customerApplication;
import javax.swing.*;

public class CustomerMainApp {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				new customerApplication().setVisible(true);
			}
			
		});
	}
}
