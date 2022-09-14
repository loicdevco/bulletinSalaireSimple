package bulletinSalaireSimple;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame {
	public Fenetre() {
		// Définit un titre pour notre fenêtre
		this.setTitle("Bulletin de salaire");
		// Définit sa taille : 400 pixels de large et 100 pixels de haut
		this.setSize(650, 800);
		// Nous demandons maintenant à notre objet de se positionner au centre
		this.setLocationRelativeTo(null);
		// Termine le processus lorsqu'on clique sur la croix rouge
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Instanciation d'un objet JPanel
		JPanel pan = new JPanel();
		// Définition de sa couleur de fond
		pan.setBackground(Color.ORANGE);
		// On prévient notre JFrame que notre JPanel sera son content pane
		this.setContentPane(new Panneau());

		// Et enfin, la rendre visible
		getContentPane().setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
	}

}
