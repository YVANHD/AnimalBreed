package com.objis.cameroun.ab.presentation;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.objis.cameroun.ab.domaine.Animal;
import com.objis.cameroun.ab.service.IService;
import com.objis.cameroun.ab.service.ServiceImpl;

public class EnregistrerAnimalForm extends JFrame {
	protected static final AbstractButton textArea = null;
	protected static final AbstractButton textArea_1 = null;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	public EnregistrerAnimalForm() {
		setVisible(true);
		this.setSize(new Dimension(932, 608));//on a dimensionner la fenetre graphique
		this.setLocationRelativeTo(null); //null correspond au desktop, donc
		//on a centrer la fenetre en plein milieu de l'ecran
		this.setDefaultCloseOperation(EXIT_ON_CLOSE );//on definit le comportement en cas 
		//de clic sur la croix.
		//dispose on close pour liberer l'ensemble des ressources de la fenetre graphique
		getContentPane().setBackground(Color.DARK_GRAY);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(75, 0, 130));
		panel.setBounds(0, 77, 939, 453);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNomLocal = new JLabel("NOM LOCAL");
		lblNomLocal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNomLocal.setForeground(new Color(255, 255, 255));
		lblNomLocal.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomLocal.setBounds(137, 29, 95, 26);
		panel.add(lblNomLocal);
		
		textField = new JTextField();
		textField.setBounds(74, 55, 216, 39);
		panel.add(textField);
		textField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(52, 93, 249, 2);
		panel.add(separator);
		
		JLabel lblNomScientifique = new JLabel("NOM SCIENTIFIQUE");
		lblNomScientifique.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNomScientifique.setForeground(new Color(255, 255, 255));
		lblNomScientifique.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomScientifique.setBounds(390, 29, 164, 26);
		panel.add(lblNomScientifique);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(366, 55, 216, 39);
		panel.add(textField_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(344, 93, 249, 2);
		panel.add(separator_1);
		
		JLabel lblPays = new JLabel(" PAYS");
		lblPays.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPays.setForeground(new Color(255, 255, 255));
		lblPays.setHorizontalAlignment(SwingConstants.CENTER);
		lblPays.setBounds(728, 29, 95, 26);
		panel.add(lblPays);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(665, 55, 216, 39);
		panel.add(textField_2);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(648, 93, 249, 2);
		panel.add(separator_2);
		
		JLabel lblAptitude = new JLabel("APTITUDE");
		lblAptitude.setHorizontalAlignment(SwingConstants.CENTER);
		lblAptitude.setForeground(Color.WHITE);
		lblAptitude.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAptitude.setBounds(193, 135, 95, 26);
		panel.add(lblAptitude);
		
		JLabel lblAspectGeneral = new JLabel("ASPECT GENERAL");
		lblAspectGeneral.setHorizontalAlignment(SwingConstants.CENTER);
		lblAspectGeneral.setForeground(Color.WHITE);
		lblAspectGeneral.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAspectGeneral.setBounds(615, 135, 164, 26);
		panel.add(lblAspectGeneral);
		
		JButton btnEnregistrer = new JButton("ENREGISTRER");
		btnEnregistrer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				//Recupératio des valeurs saisies par l utilisayeur
				
				String nomlocal = textField.getText();
				String nomscientifique = textField_1.getText();
				String pays = textField_2.getText();
				String aspectgeneral = textField_3.getText();
				String aptitude =textField_4.getText();
				
				 
				
				// Création d'un Objet animal et initialisation de ses attributs.
				Animal animal = new Animal(0, nomlocal, nomscientifique, pays, aspectgeneral, aptitude);
						
				
				animal.setNomlocal(nomlocal);
				animal.setNomscientifique(nomscientifique);
				animal.setPays(pays);
				animal.setAspectgeneral(aspectgeneral);
				animal.setAptitude(aptitude);
				
				 
				
				// Enregistrement de l'objet Animal dans la BD
				
				//Appel de couche Service
				
				IService service = new ServiceImpl();
				
				// Appel de methode enregisterAnimal de la couche Service
				
				int status;
				status = service.enregistrerAnimalService(animal);
					
				  
				  if(status == 1) {
					  JOptionPane.showMessageDialog(null, "Animal  " + animal.getNomlocal() + 
							  "enregistré dans la BD!");
					  
					  textField.setText("");
					  textField_1.setText("");
					  textField_2.setText("");
					  textField_3.setText("");
					  textField_4.setText("");
					  
					   
					  
				  }else {
					  JOptionPane.showMessageDialog(null, 
							  "Erreur lors de l'enregistrement de l'Animal!!! ");
				  }
				
				
				service.enregistrerAnimalService(animal);
				
				
				
			
			}
		});
		btnEnregistrer.setForeground(new Color(255, 255, 255));
		btnEnregistrer.setBackground(new Color(0, 0, 139));
		btnEnregistrer.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnEnregistrer.setBounds(285, 411, 131, 23);
		panel.add(btnEnregistrer);
		
		JButton btnAnnuler = new JButton("ANNULER");
		btnAnnuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int dialog = JOptionPane.YES_NO_OPTION;
				int result = JOptionPane.showConfirmDialog(null, "Etes-vous sùr de vouloir quitter?","Exit",dialog);
				if (result == 0) {
					System.exit(0);
				}
			}
		});
		btnAnnuler.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAnnuler.setForeground(new Color(255, 255, 255));
		btnAnnuler.setBackground(new Color(148, 0, 211));
		btnAnnuler.setBounds(540, 411, 131, 23);
		panel.add(btnAnnuler);
		
		textField_3 = new JTextField();
		textField_3.setBounds(657, 198, 195, 68);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(119, 198, 176, 68);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblEnregistrement = new JLabel("BIENVENUE DANS LE FORMULAIRE D'ENREGISTREMENT");
		lblEnregistrement.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnregistrement.setForeground(new Color(255, 255, 255));
		lblEnregistrement.setFont(new Font("Showcard Gothic", Font.BOLD, 17));
		lblEnregistrement.setBounds(6, 6, 493, 59);
		getContentPane().add(lblEnregistrement);
		
		JLabel label = new JLabel(" ");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon("C:\\Users\\israel\\Desktop\\Le site du geant 2\\photos\\a.jpg"));
		label.setBounds(559, 0, 380, 76);
		getContentPane().add(label);
	}
}
