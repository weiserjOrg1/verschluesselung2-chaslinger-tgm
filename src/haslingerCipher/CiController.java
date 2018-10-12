package haslingerCipher;
import java.awt.*;
import java.awt.event.*;
public class CiController implements ActionListener {
	private CiModel m1;
	private CiView v1;
	public CiController() {
		this.m1 = new CiModel();
		this.v1 = new CiView(this, this.m1);
	}
	@Override
	public void actionPerformed(ActionEvent e) {

	}
}
