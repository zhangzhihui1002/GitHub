package SRP;
import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class LoginForm extends JFrame {
	private UserDAO dao;
	private JButton btnLogin=null;
	private JButton btnClear=null;
	private JTextField txtId=null;
	private JTextField txtPwd=null;
	private JLabel lblId=null;
	private JLabel lblPwd=null;
	public LoginForm(){
		setVisible(true);
	}



public void initControls()
{btnLogin=new JButton("��¼");
btnClear=new JButton("���");
lblId=new JLabel("�˺ţ�");
lblPwd=new JLabel("���룺");
txtId=new JTextField();
txtPwd=new JTextField();

lblId.setBounds(80,50,40,20);
lblPwd.setBounds(80,80,40,20);
txtId.setBounds(130,50,100,20);
txtPwd.setBounds(130,80,100,20);
btnLogin.setBounds(80,110,70,20);
btnClear.setBounds(160,110,70,20);
//����¼�
btnLogin.addActionListener(new ActionListener() {
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
          Validate();
    }
});
btnClear.addActionListener(new ActionListener() {
    
    @Override
    public void actionPerformed(ActionEvent e) {
         txtId.setText("");
         txtPwd.setText("");
        
    }
});
}
public void showControls()//�����ӿؼ�
{

Container container=this.getContentPane();
setTitle("��¼");
setLayout(null);//���Բ���
setSize(300,250);

setVisible(true);
setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//���ùرմ���Ĭ�Ϸ�ʽ
setBackground(Color.yellow);

container.add(btnClear);
container.add(btnLogin);
container.add(lblId);
container.add(lblPwd);
container.add(txtId);
container.add(txtPwd);

}

public void Validate()//��֤�û�   
{

dao=new UserDAO();
String userId=txtId.getText().trim();
String password=txtPwd.getText().trim();
if(dao.findUser(userId, password)==true) 
{
    JOptionPane.showMessageDialog(null, "��¼�ɹ�");
}
    
else 
{
     JOptionPane.showMessageDialog(null, "��¼ʧ��");
}
    
}

}