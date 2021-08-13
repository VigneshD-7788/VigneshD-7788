import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import javax.swing.JOptionPane;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import Hello.Home;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;




public class Login {

	protected Shell shell;
	private Text Username;
	private Text Password;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Login window = new Login();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(442, 300);
		shell.setText("SWT Application");
		shell.setLayout(null);
		
		Label lblUsername = new Label(shell, SWT.NONE);
		lblUsername.setBounds(68, 70, 77, 15);
		lblUsername.setText("Username");
		
		
		Label lblPassword = new Label(shell, SWT.NONE);
		lblPassword.setBounds(68, 112, 77, 15);
		lblPassword.setText("Password");
		
		Username = new Text(shell, SWT.BORDER);
		Username.setBounds(186, 64, 152, 21);
		
		Password = new Text(shell, SWT.BORDER);
		Password.setText("\r\n");
		Password.setBounds(186, 122, 160, 21);
		
		Button btnLogin = new Button(shell, SWT.NONE);
		btnLogin.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String  uname=Username.getText();
				String  psd=Password.getText();
				
				if(uname.equals("Vignesh") && psd.equals("Vign@123"))
				{
					JOptionPane.showMessageDialog(null, "you are successfully logined");
					Home info=new Home();
					Home.main(null);

				}
				else
				{
					JOptionPane.showMessageDialog(null, "Invalid username or password");
				}
			}
		});
		btnLogin.setBounds(155, 176, 75, 25);
		btnLogin.setText("Login");
		
		
	}
}
