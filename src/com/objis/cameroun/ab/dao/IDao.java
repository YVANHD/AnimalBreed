package com.objis.cameroun.ab.dao;

import java.util.List;

import com.objis.cameroun.ab.domaine.Animal;

public interface IDao {

	public int enregistrerAnimalDao (Animal an);
	
	public List<Animal> listAnimauxDao(String nomlocal, String nomscientifique, String pays, String aspectgeneral, String aptitude);
	public List<Animal> rechercheAnimalDao(String nomlocal);
	public List<Animal> nombreAnimalDao(String pays);
}
