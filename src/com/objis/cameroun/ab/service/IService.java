/**
 * 
 */
package com.objis.cameroun.ab.service;

import java.util.List;

import com.objis.cameroun.ab.domaine.Animal;



/**
 * @author Menguele
 *
 */
public interface IService {
	public int enregistrerAnimalService (Animal an);
	public List<Animal> listAnimauxService(String nomlocal, String nomscientifique, String pays, String aspectgeneral, String aptitude);
	public List<Animal> rechercheAnimalService(String nomlocal);
	public List<Animal> nombreAnimalService(String pays);

}
