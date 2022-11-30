import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

class MyFrame extends JFrame implements ActionListener
{
	Container c;
	JLabel cc_title;
	JLabel enter_amt;
	JTextField amount;
	JComboBox<String> curr1;
	String currency1[]={"Rupee","Dollar","Yen","Dirham","Peso"}; 
	JComboBox<String> curr2;
	String currency2[]={"Rupee","Dollar","Yen","Dirham","Peso"};
	JButton output_button;
	JLabel output_title;
	JTextField output_text;
	Double output_num;
	String output_string;

	public MyFrame()
	{
		setTitle("Currency Convertor");
		setBounds(300, 90, 900, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

		c = getContentPane();
		c.setLayout(null);

		cc_title = new JLabel("Currency Convertor");
		cc_title.setFont(new Font("Arial", Font.PLAIN, 30));
		cc_title.setSize(300, 30);
		cc_title.setLocation(300, 30);
		c.add(cc_title);

		enter_amt = new JLabel("Enter Amount: ");
		enter_amt.setFont(new Font("Arial", Font.PLAIN,20));
		enter_amt.setSize(170, 30);
		enter_amt.setLocation(200, 100);
		c.add(enter_amt);

		amount = new JTextField();
		amount.setFont(new Font("Arial", Font.PLAIN, 20));
		amount.setSize(400,30);
		amount.setLocation(360,100);
		c.add(amount);

		curr1 = new JComboBox<String>(currency1);
		curr1.setFont(new Font("Arial", Font.PLAIN, 20));
		curr1.setSize(200, 30);
		curr1.setLocation(230, 160);
		c.add(curr1);

		curr2 = new JComboBox<String>(currency2);
		curr2.setFont(new Font("Arial", Font.PLAIN, 20));
		curr2.setSize(200, 30);
		curr2.setLocation(460, 160);
		c.add(curr2);

		output_button = new JButton("Convert");
		output_button.setFont(new Font("Arial", Font.PLAIN, 20));
		output_button.setSize(170, 30);
		output_button.setLocation(365, 220);
		output_button.addActionListener(this);
		c.add(output_button);

		output_title = new JLabel("Output: ");
		output_title.setFont(new Font("Arial", Font.PLAIN, 20));
		output_title.setSize(170,30);
		output_title.setLocation(400, 310);
		c.add(output_title);

		output_text = new JTextField();
		output_text.setFont(new Font("Arial", Font.PLAIN, 20));
		output_text.setSize(400, 30);
		output_text.setLocation(250, 350);
		c.add(output_text);

		setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		output_string = amount.getText();
		output_num = Double.parseDouble(output_string);

		if(curr1.getSelectedItem() == "Rupee" && curr2.getSelectedItem() == "Dollar")
		{
			output_num = output_num*0.012;
			output_string = output_num.toString();
			output_text.setText(output_string);
		}
		
		else if(curr1.getSelectedItem() == "Rupee" && curr2.getSelectedItem() == "Yen")
		{
			output_num = output_num*1.77;
			output_string = output_num.toString();
			output_text.setText(output_string);
		}

		else if(curr1.getSelectedItem() == "Rupee" && curr2.getSelectedItem() == "Dirham")
		{
			output_num = output_num*0.045;
			output_string = output_num.toString();
			output_text.setText(output_string);
		}

		else if(curr1.getSelectedItem() == "Rupee" && curr2.getSelectedItem() == "Peso")
		{
			output_num = output_num*0.71;
			output_string = output_num.toString();
			output_text.setText(output_string);
		}

		else if(curr1.getSelectedItem() == "Dollar" && curr2.getSelectedItem() == "Rupee")
		{
			output_num = output_num*82.40;
			output_string = output_num.toString();
			output_text.setText(output_string);
		}

		else if(curr1.getSelectedItem() == "Dollar" && curr2.getSelectedItem() == "Yen")
		{
			output_num = output_num*146.12;
			output_string = output_num.toString();
			output_text.setText(output_string);
		}

		else if(curr1.getSelectedItem() == "Dollar" && curr2.getSelectedItem() == "Dirham")
		{
			output_num = output_num*3.67;
			output_string = output_num.toString();
			output_text.setText(output_string);
		}

		else if(curr1.getSelectedItem() == "Dollar" && curr2.getSelectedItem() == "Peso")
		{
			output_num = output_num*58.20;
			output_string = output_num.toString();
			output_text.setText(output_string);
		}

		else if(curr1.getSelectedItem() == "Yen" && curr2.getSelectedItem() == "Rupee")
		{
			output_num = output_num*0.56;
			output_string = output_num.toString();
			output_text.setText(output_string);
		}

		else if(curr1.getSelectedItem() == "Yen" && curr2.getSelectedItem() == "Dollar")
		{
			output_num = output_num*0.0068;
			output_string = output_num.toString();
			output_text.setText(output_string);
		}

		else if(curr1.getSelectedItem() == "Yen" && curr2.getSelectedItem() == "Dirham")
		{
			output_num = output_num*0.025;
			output_string = output_num.toString();
			output_text.setText(output_string);
		}

		else if(curr1.getSelectedItem() == "Yen" && curr2.getSelectedItem() == "Peso")
		{
			output_num = output_num*0.40;
			output_string = output_num.toString();
			output_text.setText(output_string);
		}

		else if(curr1.getSelectedItem() == "Dirham" && curr2.getSelectedItem() == "Rupee")
		{
			output_num = output_num*22.43;
			output_string = output_num.toString();
			output_text.setText(output_string);
		}

		else if(curr1.getSelectedItem() == "Dirham" && curr2.getSelectedItem() == "Dollar")
		{
			output_num = output_num*0.27;
			output_string = output_num.toString();
			output_text.setText(output_string);
		}

		else if(curr1.getSelectedItem() == "Dirham" && curr2.getSelectedItem() == "Yen")
		{
			output_num = output_num*39.79;
			output_string = output_num.toString();
			output_text.setText(output_string);
		}

		else if(curr1.getSelectedItem() == "Dirham" && curr2.getSelectedItem() == "Peso")
		{
			output_num = output_num*15.84;
			output_string = output_num.toString();
			output_text.setText(output_string);
		}

		else if(curr1.getSelectedItem() == "Peso" && curr2.getSelectedItem() == "Rupee")
		{
			output_num = output_num*1.42;
			output_string = output_num.toString();
			output_text.setText(output_string);
		}

		else if(curr1.getSelectedItem() == "Peso" && curr2.getSelectedItem() == "Dollar")
		{
			output_num = output_num*0.017;
			output_string = output_num.toString();
			output_text.setText(output_string);
		}

		else if(curr1.getSelectedItem() == "Peso" && curr2.getSelectedItem() == "Yen")
		{
			output_num = output_num*2.51;
			output_string = output_num.toString();
			output_text.setText(output_string);
		}

		else if(curr1.getSelectedItem() == "Peso" && curr2.getSelectedItem() == "Dirham")
		{
			output_num = output_num*0.063;
			output_string = output_num.toString();
			output_text.setText(output_string);
		}
		
		else
		{
			output_text.setText(output_string);
		}
	}
}

class Currency_Convertor 
{

	public static void main(String[] args)
	{
		MyFrame f = new MyFrame();
	}
}
