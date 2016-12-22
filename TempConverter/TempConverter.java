import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TempConverter extends JFrame implements ActionListener{
    private Container pane;
    private JLabel j,j2,j3;
    private JTextField t;
    
    public TempConverter() {
	this.setTitle("Temp Converter");
	this.setSize(800,100);
	this.setLocation(200,200);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	pane = this.getContentPane();
	pane.setLayout(new FlowLayout());
	JButton b = new JButton("FtoC");
	b.addActionListener(this);
	b.setActionCommand("C");
	JButton b2 = new JButton("CtoF");
	b2.addActionListener(this);
	b2.setActionCommand("F");
	t = new JTextField(4);
        j = new JLabel("Convert Your Temps Here! -->");
        j2 = new JLabel("Equals:");
        j3 = new JLabel("_");
	pane.add(j);
	pane.add(t);
	pane.add(j2);
	pane.add(j3);
	pane.add(b);
	pane.add(b2);
    }
    
    public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();
	if(event.equals("F")){
	    String s = "" + cToF(Integer.parseInt(t.getText()))+" Degrees Fahrenheit";
	    j3.setText(s);
	}
	if(event.equals("C")){
	    String s = "" + fToC(Integer.parseInt(t.getText()))+" Degrees Celsius";
	    j3.setText(s);
	}
    }
    
    
    public double fToC(int T){
	return (T - 32)*(5.0/9);
    }
    
    public double cToF(int T){
	return (T *(9.0 / 5)) + 32;
    }
    
    public static void main(String[] args) {
	TempConverter g = new TempConverter();
	g.setVisible(true);
    }
}

