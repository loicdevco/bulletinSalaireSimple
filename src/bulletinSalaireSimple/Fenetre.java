package bulletinSalaireSimple;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame {
	public Fenetre() {
		// D�finit un titre pour notre fen�tre
		this.setTitle("Bulletin de salaire");
		// D�finit sa taille : 400 pixels de large et 100 pixels de haut
		this.setSize(650, 800);
		// Nous demandons maintenant � notre objet de se positionner au centre
		this.setLocationRelativeTo(null);
		// Termine le processus lorsqu'on clique sur la croix rouge
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Instanciation d'un objet JPanel
		JPanel pan = new JPanel();
		// D�finition de sa couleur de fond
		pan.setBackground(Color.ORANGE);
		// On pr�vient notre JFrame que notre JPanel sera son content pane
		this.setContentPane(new Panneau());

		// Et enfin, la rendre visible
		getContentPane().setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
	}

}
