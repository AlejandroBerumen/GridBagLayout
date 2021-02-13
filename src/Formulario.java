import javax.swing.*;
import java.awt.*;
class Ventana extends JFrame{
	
	GridBagLayout gbl = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();
	
	public Ventana() {
		getContentPane().setLayout(gbl);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Formulario");
		setLocationRelativeTo(null);
		setVisible(true);
		JTextArea izq = new JTextArea("        ");
		agregarComponente(izq, 0, 0, 1, 50, GridBagConstraints.BOTH);
		JTextArea arriba = new JTextArea("        ");
		agregarComponente(arriba, 1, 0, 50, 1, GridBagConstraints.BOTH);
		JTextArea der = new JTextArea("        ");
		agregarComponente(der, 8, 0, 1, 50, GridBagConstraints.BOTH);
		JTextArea abajo = new JTextArea("        ");
		agregarComponente(abajo, 0, 21, 50, 1, GridBagConstraints.BOTH);
		JTextArea medio = new JTextArea("            ");
		agregarComponente(medio, 3, 0, 1, 50, GridBagConstraints.BOTH);
		JTextArea txt1 = new JTextArea("The classic Form includes all visible fields for this list");
		agregarComponente(txt1, 1, 1, 2, 1, GridBagConstraints.BOTH);
		JTextArea espacioVacio = new JTextArea("        ");
		agregarComponente(espacioVacio, 1, 2, 2, 1, GridBagConstraints.BOTH);
		JTextArea txt2 = new JTextArea("Form options");
		agregarComponente(txt2, 1, 3, 2, 1, GridBagConstraints.BOTH);
		JTextArea txt3 = new JTextArea("Include the following:");
		agregarComponente(txt3, 1, 4, 2, 1, GridBagConstraints.BOTH);
		JCheckBox cb1 = new JCheckBox();
		agregarComponente(cb1, 1, 5, 1, 1, 0);
		JTextArea txt4 = new JTextArea("a title for your form");
		agregarComponente(txt4, 2, 5, 1, 1, GridBagConstraints.BOTH);
		JTextArea espacioVacio2 = new JTextArea("        ");
		agregarComponente(espacioVacio2, 1, 6, 2, 1, GridBagConstraints.BOTH);
		JRadioButton rb = new JRadioButton();
		agregarComponente(rb, 1, 7, 1, 1, 0);
		JTextArea txt5 = new JTextArea("only required fields");
		agregarComponente(txt5, 2, 7, 1, 1, GridBagConstraints.BOTH);
		JRadioButton rb2 = new JRadioButton();
		agregarComponente(rb2, 1, 8, 1, 1, 0);
		JTextArea txt6 = new JTextArea("all fields");
		agregarComponente(txt6, 2, 8, 1, 1, GridBagConstraints.BOTH);
		JTextArea txt7 = new JTextArea("(edit required fields in the form builder)");
		agregarComponente(txt7, 2, 9, 2, 1, GridBagConstraints.BOTH);
		JTextArea espacioVacio3 = new JTextArea("        ");
		agregarComponente(espacioVacio3, 1, 10, 2, 1, GridBagConstraints.BOTH);
		JCheckBox cb2 = new JCheckBox();
		agregarComponente(cb2, 1, 11, 1, 1, 0);
		JTextArea txt8 = new JTextArea("interest groups fields");
		agregarComponente(txt8, 2, 11, 1, 1, GridBagConstraints.BOTH);
		JCheckBox cb3 = new JCheckBox();
		agregarComponente(cb3, 1, 12, 1, 1, 0);
		JTextArea txt9 = new JTextArea("required fields indicators");
		agregarComponente(txt9, 2, 12, 1, 1, GridBagConstraints.BOTH);
		JTextArea espacioVacio4 = new JTextArea("        ");
		agregarComponente(espacioVacio4, 1, 13, 2, 1, GridBagConstraints.BOTH);
		JTextArea txt10 = new JTextArea("Set form width");
		agregarComponente(txt10, 1, 14, 2, 1, GridBagConstraints.BOTH);
		JTextField tf1 = new JTextField();
		agregarComponente(tf1, 1, 15, 2, 1, GridBagConstraints.BOTH);
		JTextArea txt11 = new JTextArea("Enhace your form");
		agregarComponente(txt11, 1, 16, 2, 1, GridBagConstraints.BOTH);
		JCheckBox cb4 = new JCheckBox();
		agregarComponente(cb4, 1, 17, 1, 1, 0);
		JTextArea txt12 = new JTextArea("enable evil popup mode");
		agregarComponente(txt12, 2, 17, 1, 1, GridBagConstraints.BOTH);
		JCheckBox cb5 = new JCheckBox();
		agregarComponente(cb5, 1, 18, 1, 1, 0);
		JTextArea txt13 = new JTextArea("disable all JavaScript");
		agregarComponente(txt13, 2, 18, 1, 1, GridBagConstraints.BOTH);
		JCheckBox cb6 = new JCheckBox();
		agregarComponente(cb6, 1, 19, 1, 1, 0);
		JTextArea txt14 = new JTextArea("include archive link");
		agregarComponente(txt14, 2, 19, 1, 1, GridBagConstraints.BOTH);
		JCheckBox cb7 = new JCheckBox();
		agregarComponente(cb7, 1, 20, 1, 1, 0);
		JTextArea txt15 = new JTextArea("include MonkeyRewards link");
		agregarComponente(txt15, 2, 20, 1, 1, GridBagConstraints.BOTH);
		JPanel pan1 = new JPanel();
		pan1.setPreferredSize(new Dimension(260, 210));
		pan1.setBorder(BorderFactory.createTitledBorder("Preview"));
		agregarComponentePanel(pan1, new JTextArea("E-Mail Adress:"));
		agregarComponentePanel(pan1, new JTextField(18));
		agregarComponentePanel(pan1, new JTextArea("First Name:"));
		agregarComponentePanel(pan1, new JTextField(18));
		agregarComponentePanel(pan1, new JTextArea("Last Name:"));
		agregarComponentePanel(pan1, new JTextField(18));
		ImageIcon boton = new ImageIcon("icono.png");
		agregarComponentePanel(pan1, new JButton(boton));
		agregarComponente(pan1, 4, 1, 2, 12, 0);
		JPanel pan2 = new JPanel();
		pan2.setPreferredSize(new Dimension(260, 135));
		pan2.setBorder(BorderFactory.createTitledBorder("Copy/paste onto your site"));
		JTextArea txtf = new JTextArea("Lorem ipsum dolor sit amet, consectetur adipiscing elit.\nProin volutpatsuscipit blandit. Nunc cursus efficitur\n turpis nec egestas. Nam justoenim, pulvinar sodales \nornare non, accumsan nec lacus. Pellentesquesit amet \nluctus lectus. Mauris vitae dolor nibh. Praesent et leo \ntempus, consequat lacus id, aliquet eros. Pellentesque porttitor.");
		agregarComponentePanel(pan2, txtf);
		agregarComponente(pan2, 4, 14, 2, 6, 0);
		pack();
	}
	public void agregarComponente(JComponent c, int gx, int gy, int gw, int gh, int f) {
		gbc.gridx = gx;
		gbc.gridy = gy;
		gbc.gridheight = gh;
		gbc.gridwidth = gw;
		gbc.fill = f;
		gbl.setConstraints(c, gbc);
		add(c);
	}
	public void agregarComponentePanel(JPanel panel, JComponent c) {
		gbl.setConstraints(c, gbc);
		panel.add(c);
	}
}
public class Formulario {

	public static void main(String[] args) {
		Ventana v1 = new Ventana();

	}

}
