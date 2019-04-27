
package com.objis.cameroun.ab.service;

import java.util.List;

import com.objis.cameroun.ab.dao.DaoImpl;
import com.objis.cameroun.ab.dao.IDao;
import com.objis.cameroun.ab.domaine.Animal;

public class ServiceImpl implements IService {
	IDao dao;
	
	public ServiceImpl (){
		dao = new DaoImpl();				
	}

	@Override
	public int enregistrerAnimalService(Animal an) {		 
		return dao.enregistrerAnimalDao(an);
	}

	@Override
	public List<Animal> listAnimauxService(String nomlocal, String nomscientifique, String pays, String aspectgeneral,String aptitude) {
		return dao.listAnimauxDao(nomlocal, nomscientifique, pays, aspectgeneral, aptitude);
	}

	@Override
	public List<Animal> rechercheAnimalService(String nomlocal) {
	dao.rechercheAnimalDao(nomlocal);
		return null;
	}

	@Override
	public List<Animal> nombreAnimalService(String pays) {
		dao.nombreAnimalDao(pays);
		return null;
	}

}
