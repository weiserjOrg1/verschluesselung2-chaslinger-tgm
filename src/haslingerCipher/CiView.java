package haslingerCipher;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CiView extends JFrame{
	private CiModel m1;
	private CiController c1;
	private CiPanel p1;
	private JButton enc, dec;
	private JRadioButton shift, subst;
	private JTextField text, secretAlphabet;
	private JTextField value;
	private JPanel south, north, radio;
	private JLabel iT, iV, iA;
	private Container co1, co2, co3;
	
	public CiView(CiController c, CiModel m) {
		this.m1 = m;
		this.c1 = c;
		this.p1 = new CiPanel(this.m1);
		this.setSize(500, 500);
		
		this.enc = new JButton("encrypt");
		this.dec = new JButton("decrypt");
		this.subst = new JRadioButton("SubstitutionCipher", true);
		this.shift = new JRadioButton("ShiftCipher");
		this.text = new JTextField();
		this.secretAlphabet = new JTextField();
		this.value = new JTextField();
		this.south = new JPanel();
		this.north = new JPanel();
		this.radio = new JPanel();
		this.iT = new JLabel("Message: ");
		this.iV = new JLabel("Value: ");
		this.iA = new JLabel("secretAlphabet: ");
		this.co1 = new Container();
		this.co2 = new Container();
		this.co3 = new Container();
		
		
		this.enc.addActionListener(this.c1);
		this.dec.addActionListener(this.c1);
		this.subst.addActionListener(this.c1);
		this.shift.addActionListener(this.c1);
		
		
		this.setLayout(new BorderLayout());
		this.south.setLayout(new BorderLayout());
		this.north.setLayout(new BorderLayout());
		this.radio.setLayout(new GridLayout());
		this.co1.setLayout(new GridLayout());
		this.co2.setLayout(new GridLayout());
		this.co3.setLayout(new GridLayout());
		
		
		this.co1.add(this.iT);
		this.co1.add(this.text);
		this.co2.add(this.iV);
		this.co2.add(this.value);
		this.co3.add(this.iA);
		this.co3.add(this.secretAlphabet);
		
		this.radio.add(this.shift);
		this.radio.add(this.subst);
		
		this.north.add(this.radio, BorderLayout.NORTH);
		this.north.add(this.co1, BorderLayout.SOUTH);
		
		this.south.add(this.co3, BorderLayout.NORTH);
		this.south.add(this.co2, BorderLayout.SOUTH);
		
		this.add(this.p1);
		this.add(this.north, BorderLayout.NORTH);
		this.add(this.south, BorderLayout.SOUTH);
		this.add(this.enc, BorderLayout.WEST);
		this.add(this.dec, BorderLayout.EAST);
		
		
		if(this.m1.getNumber() == 1) {
			this.co2.setVisible(false);
			this.co3.setVisible(true);
		}else {
			this.co2.setVisible(true);
			this.co3.setVisible(false);
		}
		
		this.setVisible(true);
	}
	public void refresh() {
		this.p1.repaint();
	}
}