package com.objis.cameroun.ab.domaine;

public class Animal {
	private int idAnimal;
	private String nomlocal;
	private String nomscientifique;	 
	private String pays;
	private String aspectgeneral;
	private String aptitude;
	/**
	 * @param idAnimal
	 * @param nomlocal
	 * @param nomscientifique
	 * @param pays
	 * @param aspectgeneral
	 * @param aptitude
	 */
	public Animal(int idAnimal, String nomlocal, String nomscientifique, String pays, String aspectgeneral,
			String aptitude) {
		super();
		this.idAnimal = idAnimal;
		this.nomlocal = nomlocal;
		this.nomscientifique = nomscientifique;
		this.pays = pays;
		this.aspectgeneral = aspectgeneral;
		this.aptitude = aptitude;
	}
	/**
	 * @return the idAnimal
	 */
	public int getIdAnimal() {
		return idAnimal;
	}
	/**
	 * @param idAnimal the idAnimal to set
	 */
	public void setIdAnimal(int idAnimal) {
		this.idAnimal = idAnimal;
	}
	/**
	 * @return the nomlocal
	 */
	public String getNomlocal() {
		return nomlocal;
	}
	/**
	 * @param nomlocal the nomlocal to set
	 */
	public void setNomlocal(String nomlocal) {
		this.nomlocal = nomlocal;
	}
	/**
	 * @return the nomscientifique
	 */
	public String getNomscientifique() {
		return nomscientifique;
	}
	/**
	 * @param nomscientifique the nomscientifique to set
	 */
	public void setNomscientifique(String nomscientifique) {
		this.nomscientifique = nomscientifique;
	}
	/**
	 * @return the pays
	 */
	public String getPays() {
		return pays;
	}
	/**
	 * @param pays the pays to set
	 */
	public void setPays(String pays) {
		this.pays = pays;
	}
	/**
	 * @return the aspectgeneral
	 */
	public String getAspectgeneral() {
		return aspectgeneral;
	}
	/**
	 * @param aspectgeneral the aspectgeneral to set
	 */
	public void setAspectgeneral(String aspectgeneral) {
		this.aspectgeneral = aspectgeneral;
	}
	/**
	 * @return the aptitude
	 */
	public String getAptitude() {
		return aptitude;
	}
	/**
	 * @param aptitude the aptitude to set
	 */
	public void setAptitude(String aptitude) {
		this.aptitude = aptitude;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Animal [idAnimal=" + idAnimal + ", nomlocal=" + nomlocal + ", nomscientifique=" + nomscientifique
				+ ", pays=" + pays + ", aspectgeneral=" + aspectgeneral + ", aptitude=" + aptitude + "]";
	}
	
	
	 
}
