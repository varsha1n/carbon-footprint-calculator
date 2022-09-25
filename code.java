
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
	
public abstract class second implements ActionListener{

		
	public static void main(String args[]) {
	
JFrame jf=new JFrame();															//frame
		
		JPanel jp1=new JPanel();														//first panel
		JLabel jl1=new JLabel("carbon footprint calculator");
	
		jl1.setFont(new Font("Serif", Font. BOLD, 20));
		jl1.setBounds(20,-150,300,400);
		
		jp1.setVisible(true);
		jp1.setSize(400,500);
		jp1.setLayout(null);
		
		jf.add(jp1);
		jp1.add(jl1);
		
		JTabbedPane tp=new JTabbedPane(); 
		
		tp.setBounds(10,100,300,300);  
		
		JPanel jp2=new JPanel();
		JPanel jp3=new JPanel();
		JPanel jp4=new JPanel();
		
		tp.add(jp2,"Household");
		tp.add(jp3,"Car");
		tp.add(jp4,"Donation");
		
		JTextField jt1=new JTextField(7);				
		JLabel jl2=new JLabel("distance travelled in km :");
	
		JLabel jl4=new JLabel("type of fuel consumed by vehicle :");
		DefaultListModel<String> l1 = new DefaultListModel<>(); 
		 l1.addElement("petrol");  
         l1.addElement("diesel");  
         JList<String> list = new JList<>(l1); 
		
		JTextField jt2=new JTextField(7);	
		JLabel jl3=new JLabel("fuel consumed in liters/100kg :");
		
		JTextField jt3=new JTextField(7);	
		JLabel jl5=new JLabel("country :");
		
		JTextField jt4=new JTextField(7);	
		JLabel jl6=new JLabel("electricity consumption in kWh :");
		
		JTextField jt5=new JTextField(7);	
		JLabel jl7=new JLabel("fuel consumed in liters/100kg :");
		
		JButton jb1=new JButton("Calculate");
		
		JButton jb2=new JButton("Calculate");
		
		JTextField jt6=new JTextField(7);	
		JLabel jl8=new JLabel(" your carbon consumption for household:");
		
		JTextField jt7=new JTextField(7);	
		JLabel jl9=new JLabel("      your carbon consumption for car:");
		
		jb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x=Integer.parseInt(jt5.getText());
				double y=x*2.32;
				jt6.setText(""+y);
			}
		});
		
		jb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String y = jt2.getText();
				Double.valueOf(y);
				jt7.setText(y);
			}
		});
		
		jp3.add(jt7);
		jp3.add(jl9);
		
		jp2.add(jl5);
		jp2.add(jt3);
		
		jp2.add(jl6);
		jp2.add(jt4);
		
		jp2.add(jl7);
		jp2.add(jt5);
		
		jp2.add(jb2);
		
		jp2.add(jl8);
		jp2.add(jt6);
		
		
		jp3.add(jl2);
		jp3.add(jt1);
		
		jp3.add(jl4);
		jp3.add(list);
		
		jp3.add(jl3);
		jp3.add(jt2);
		
		jp3.add(jb1);
		
		jp3.add(jl9);
		jp3.add(jt7);
	
		jp1.add(tp);
		
		tp.add(jp2,"Household");
		tp.add(jp3,"Car");
		tp.add(jp4,"Donation");
		
		jf.pack();
		
		jf.setSize(400,500);
		jf.setVisible(true);
		jf.setLayout(new BorderLayout());
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		
