/**
 * 
 */
package com.objis.cameroun.ab.presentation;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import AppPackage.AnimationClass;
import java.awt.Toolkit;

/**
 * @author Menguele
 *
 */
public class Administrateur extends JFrame {
	public Administrateur(){
		super("AnimalBreed");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\israel\\Desktop\\Le site du geant 2\\photos\\a.jpg"));
		this.setSize(new Dimension(1256, 680));//on a dimensionner la fenetre graphique
		this.setLocationRelativeTo(null); //null correspond au desktop, donc
		//on a centrer la fenetre en plein milieu de l'ecran
		this.setDefaultCloseOperation(EXIT_ON_CLOSE );//on definit le comportement en cas 
		//de clic sur la croix.
		//dispose on close pour liberer l'ensemble des ressources de la fenetre graphique
		setVisible(true);
		getContentPane().setBackground(new Color(75, 0, 130));
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(112, 128, 144));
		panel.setBounds(67, 27, 198, 304);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblBovins = new JLabel("BOVINS");
		lblBovins.setHorizontalAlignment(SwingConstants.CENTER);
		lblBovins.setBounds(60, 11, 64, 29);
		panel.add(lblBovins);
		
		JLabel lblEnSavoirPlus = new JLabel("En Savoir plus...");
		lblEnSavoirPlus.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnSavoirPlus.setBounds(24, 243, 141, 29);
		panel.add(lblEnSavoirPlus);
		
		JLabel label = new JLabel(" ");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon("C:\\Users\\israel\\Desktop\\bov.PNG"));
		label.setBounds(6, 11, 186, 287);
		panel.add(label);
		
		JLabel liste = new JLabel(" ");
		liste.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) {
				AnimationClass enregistrer1 = new AnimationClass();
				JLabel enregistrer = new JLabel(" ");
				enregistrer1.jLabelXRight(-33, 11, 10, 5, enregistrer);
				
				//<---
				AnimationClass enregistrer3 = new AnimationClass();
				enregistrer3.jLabelXLeft(11, -33, 10, 5, enregistrer);
			}
		});
		liste.setHorizontalAlignment(SwingConstants.CENTER);
		liste.setIcon(new ImageIcon("C:\\Users\\israel\\Desktop\\icons\\icons8_Menu_32px.png"));
		liste.setBounds(8, 24, 46, 30);
		getContentPane().add(liste);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 215, 0));
		panel_1.setBounds(273, 202, 183, 319);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblEquins = new JLabel("EQUINS");
		lblEquins.setHorizontalAlignment(SwingConstants.CENTER);
		lblEquins.setBounds(58, 27, 64, 29);
		panel_1.add(lblEquins);
		
		JLabel label_7 = new JLabel("En Savoir plus...");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setBounds(21, 279, 141, 29);
		panel_1.add(label_7);
		
		JLabel label_6 = new JLabel(" ");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setIcon(new ImageIcon("C:\\Users\\israel\\Desktop\\Le Site du Geant 1\\web\\images\\g3.jpg"));
		label_6.setBounds(6, 6, 171, 307);
		panel_1.add(label_6);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(124, 252, 0));
		panel_2.setBounds(466, 27, 183, 294);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblAsins = new JLabel("ASINS");
		lblAsins.setHorizontalAlignment(SwingConstants.CENTER);
		lblAsins.setBounds(58, 21, 64, 29);
		panel_2.add(lblAsins);
		
		JLabel label_8 = new JLabel("En Savoir plus...");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setBounds(20, 254, 141, 29);
		panel_2.add(label_8);
		
		JLabel label_11 = new JLabel(" ");
		label_11.setIcon(new ImageIcon("C:\\Users\\israel\\Desktop\\An.PNG"));
		label_11.setBounds(6, 6, 171, 282);
		panel_2.add(label_11);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(192, 192, 192));
		panel_3.setBounds(659, 202, 183, 319);
		getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblOvins = new JLabel("OVINS");
		lblOvins.setHorizontalAlignment(SwingConstants.CENTER);
		lblOvins.setBounds(61, 28, 64, 29);
		panel_3.add(lblOvins);
		
		JLabel label_13 = new JLabel("En Savoir plus...");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setBounds(21, 279, 141, 29);
		panel_3.add(label_13);
		
		JLabel label_16 = new JLabel(" ");
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setIcon(new ImageIcon("C:\\Users\\israel\\Desktop\\Mt.PNG"));
		label_16.setBounds(6, 6, 171, 302);
		panel_3.add(label_16);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(245, 222, 179));
		panel_4.setBounds(851, 27, 183, 294);
		getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblCaprins = new JLabel("CAPRINS");
		lblCaprins.setHorizontalAlignment(SwingConstants.CENTER);
		lblCaprins.setBounds(58, 26, 64, 29);
		panel_4.add(lblCaprins);
		
		JLabel label_10 = new JLabel("En Savoir plus...");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setBounds(21, 254, 141, 29);
		panel_4.add(label_10);
		
		JLabel label_18 = new JLabel(" ");
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setIcon(new ImageIcon("C:\\Users\\israel\\Desktop\\Cv.PNG"));
		label_18.setBounds(6, 6, 171, 282);
		panel_4.add(label_18);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(85, 107, 47));
		panel_5.setBounds(1044, 177, 183, 319);
		getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblVolailles = new JLabel("VOLAILLES");
		lblVolailles.setHorizontalAlignment(SwingConstants.CENTER);
		lblVolailles.setBounds(57, 34, 64, 29);
		panel_5.add(lblVolailles);
		
		JLabel label_19 = new JLabel("En Savoir plus...");
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setBounds(20, 279, 141, 29);
		panel_5.add(label_19);
		
		JLabel label_21 = new JLabel(" ");
		label_21.setHorizontalAlignment(SwingConstants.CENTER);
		label_21.setIcon(new ImageIcon("C:\\Users\\israel\\Desktop\\Vl.PNG"));
		label_21.setBounds(6, 6, 171, 307);
		panel_5.add(label_21);
		
		JLabel decouvrir = new JLabel(" ");
		decouvrir.setHorizontalAlignment(SwingConstants.CENTER);
		decouvrir.setIcon(new ImageIcon("C:\\Users\\israel\\Desktop\\icons\\icons8_Home_32px.png"));
		decouvrir.setBounds(8, 86, 46, 30);
		getContentPane().add(decouvrir);
		
		JLabel enregistrer = new JLabel(" ");
		enregistrer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) {
				enregistrer.setBorder(BorderFactory.createLineBorder(new Color(255, 215, 0)));
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
				EnregistrerAnimalForm frame = new EnregistrerAnimalForm();
				frame.setVisible(true);
			}
		});
		enregistrer.setHorizontalAlignment(SwingConstants.CENTER);
		enregistrer.setIcon(new ImageIcon("C:\\Users\\israel\\Desktop\\icons\\icons8_Registration_32px.png"));
		enregistrer.setBounds(9, 154, 46, 30);
		getContentPane().add(enregistrer);
		
		JLabel rechercher = new JLabel(" ");
		rechercher.setHorizontalAlignment(SwingConstants.CENTER);
		rechercher.setIcon(new ImageIcon("C:\\Users\\israel\\Desktop\\icons\\icons8_View_32px.png"));
		rechercher.setBounds(9, 228, 46, 30);
		getContentPane().add(rechercher);
		
		JLabel label_4 = new JLabel(" ");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setIcon(new ImageIcon("C:\\Users\\israel\\Desktop\\icons\\icons8_customer_32px_1.png"));
		label_4.setBounds(1181, 11, 46, 30);
		getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel(" ");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setIcon(new ImageIcon("C:\\Users\\israel\\Desktop\\icons\\icons8_Notification_32px.png"));
		label_5.setBounds(1110, 11, 46, 30);
		getContentPane().add(label_5);
		
		JLabel articles = new JLabel(" ");
		articles.setHorizontalAlignment(SwingConstants.CENTER);
		articles.setIcon(new ImageIcon("C:\\Users\\israel\\Desktop\\icons\\icons8_DOT_32px.png"));
		articles.setBounds(8, 314, 46, 30);
		getContentPane().add(articles);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(210, 105, 30));
		panel_6.setBounds(468, 332, 181, 245);
		getContentPane().add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblCamelins = new JLabel("CAMELINS");
		lblCamelins.setBounds(63, 29, 64, 29);
		panel_6.add(lblCamelins);
		lblCamelins.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel label_9 = new JLabel("En Savoir plus...");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setBounds(30, 195, 141, 29);
		panel_6.add(label_9);
		
		JLabel label_22 = new JLabel(" ");
		label_22.setHorizontalAlignment(SwingConstants.CENTER);
		label_22.setIcon(new ImageIcon("C:\\Users\\israel\\Desktop\\Le site du geant 2\\photos\\download.jpg"));
		label_22.setBounds(6, 6, 169, 233);
		panel_6.add(label_22);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(160, 82, 45));
		panel_7.setBounds(851, 332, 181, 245);
		getContentPane().add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lblPorcins = new JLabel("PORCINS");
		lblPorcins.setHorizontalAlignment(SwingConstants.CENTER);
		lblPorcins.setBounds(61, 28, 64, 29);
		panel_7.add(lblPorcins);
		
		JLabel label_17 = new JLabel("En Savoir plus...");
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setBounds(30, 195, 141, 29);
		panel_7.add(label_17);
		
		JLabel label_20 = new JLabel(" ");
		label_20.setHorizontalAlignment(SwingConstants.CENTER);
		label_20.setIcon(new ImageIcon("C:\\Users\\israel\\Desktop\\Pc.PNG"));
		label_20.setBounds(6, 6, 169, 233);
		panel_7.add(label_20);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(255, 255, 224));
		panel_8.setLayout(null);
		panel_8.setBounds(67, 342, 198, 235);
		getContentPane().add(panel_8);
		
		JLabel lblAbeilles = new JLabel("ABEILLES");
		lblAbeilles.setHorizontalAlignment(SwingConstants.CENTER);
		lblAbeilles.setBounds(63, 6, 64, 29);
		panel_8.add(lblAbeilles);
		
		JLabel label_12 = new JLabel("En Savoir plus...");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setBounds(27, 200, 141, 29);
		panel_8.add(label_12);
		
		JLabel label_1 = new JLabel(" ");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setIcon(new ImageIcon("C:\\Users\\israel\\Desktop\\animals\\into animals\\img\\FB_IMG_15508861349878344.jpg"));
		label_1.setBounds(6, 6, 186, 223);
		panel_8.add(label_1);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(255, 0, 255));
		panel_9.setLayout(null);
		panel_9.setBounds(659, 27, 183, 168);
		getContentPane().add(panel_9);
		
		JLabel lblChats = new JLabel("CHATS");
		lblChats.setHorizontalAlignment(SwingConstants.CENTER);
		lblChats.setBounds(61, 28, 64, 29);
		panel_9.add(lblChats);
		
		JLabel label_14 = new JLabel("En Savoir plus...");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setBounds(23, 133, 141, 29);
		panel_9.add(label_14);
		
		JLabel label_15 = new JLabel(" ");
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setIcon(new ImageIcon("C:\\Users\\israel\\Desktop\\Le site du geant 2\\img\\c2.jpg"));
		label_15.setBounds(6, 6, 171, 156);
		panel_9.add(label_15);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(255, 255, 255));
		panel_10.setLayout(null);
		panel_10.setBounds(275, 27, 181, 168);
		getContentPane().add(panel_10);
		
		JLabel lblChiens = new JLabel("CHIENS");
		lblChiens.setHorizontalAlignment(SwingConstants.CENTER);
		lblChiens.setBounds(61, 6, 64, 29);
		panel_10.add(lblChiens);
		
		JLabel label_2 = new JLabel("En Savoir plus...");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(20, 133, 141, 29);
		panel_10.add(label_2);
		
		JLabel label_3 = new JLabel(" ");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setIcon(new ImageIcon("C:\\Users\\israel\\Desktop\\Le site du geant 2\\photos\\ww.jpg"));
		label_3.setBounds(6, 0, 169, 168);
		panel_10.add(label_3);
		
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		 
		Administrateur admin = new Administrateur();
		admin.setVisible(true);
	}
}
