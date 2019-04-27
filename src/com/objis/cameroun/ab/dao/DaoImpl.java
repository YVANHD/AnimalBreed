package com.objis.cameroun.ab.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.objis.cameroun.ab.domaine.Animal;

public class DaoImpl implements IDao {

	// Etape 1 : récupération de la connexion
			Connection cn = ConnectionMYSQL.getInstance();
	public int enregistrerAnimalDao(Animal an) {
		
		

		try {

			

			// Etape 2 : Création d'un objet  statement et preparation de la requete
			

			String sql = "insert into `agriculteur`(`nomlocal`,`nomscientifique`,`pays`,`aspectgeneral`,`aptitude`)" 
					+"values (?,?,?,?,?)";
			
			PreparedStatement ps=  cn.prepareStatement(sql);
			ps.setString(1, an.getNomlocal());
			ps.setString(2, an.getNomscientifique());
			ps.setString(3, an.getPays());
			ps.setString(4, an.getAspectgeneral());
			ps.setString(5, an.getAptitude());
			 
			
		
			// Etape 3 : exécution requête
			ps.executeUpdate();
			
			
			return 1;
			// Etape 4 : gestion des exceptions et libération 'automatique' des ressources
		} catch (SQLException e) {
			e.printStackTrace();
			
			return 0;
		} 
		
}
	 

	@Override
	public List<Animal> rechercheAnimalDao(String nomlocal) {
 
		return null;
	}


	@Override
	public List<Animal> listAnimauxDao(String nomlocal, String nomscientifique, String pays, String aspectgeneral, String aptitude) {
		 

        //création d'une collection des Animaux
		List<Animal> maListAnimal= new ArrayList<Animal>();
	
		try {

			// Etape 1 : récupération de la connexion
			Connection cn = ConnectionMYSQL.getInstance();

			// Etape 2 : préparation requête
			
			String sql = "SELECT * FROM animal";
			
			Statement st = cn.createStatement();

			

			// Etape 3 : exécution requête
			ResultSet rs = st.executeQuery(sql);

			// Etape 4 :parcours Resultset (optionnel)
			while (rs.next()) {
				
				//recuperation des valeurs d'une ligne de la table animal, pour initialiser dans un objet animal
				Animal an =  new Animal(0, sql, sql, sql, sql, sql);
				an.setIdAnimal(rs.getInt("idAgriculteur"));
				an.setNomlocal(rs.getString("nomlocal"));
				an.setNomscientifique(rs.getString("nomscientifique"));
				an.setPays("pays");
				an.setAptitude(rs.getString("aptitude"));
				an.setAspectgeneral(rs.getString("aspectgeneral"));
				 
				
				//ajout de l'animal dans List maListAnimal
				maListAnimal.add(an); // cette instruction permet d'inser l'objet animal dans ma liste animal
				
			}
			
			// Etape 5 : gestion des exceptions et libération 'automatique' des ressources
		} catch (SQLException e) {
			e.printStackTrace();
			
		} 
		
		return maListAnimal;
		
	}


	@Override
	public List<Animal> nombreAnimalDao(String pays) {
		// TODO Auto-generated method stub
		return null;
	}


	 

}
