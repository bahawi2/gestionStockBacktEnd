package com.bahawi.entities;

import java.io.Serializable;

public class Produit implements Serializable {
	
	private String ref;
	private int quantite;
	private float prixunitaire;
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public float getPrix() {
		return prixunitaire;
	}
	public void setPrix(float prix) {
		this.prixunitaire = prix;
	}
	public Produit(String ref, int quantite, float prix) {
		super();
		this.ref = ref;
		this.quantite = quantite;
		this.prixunitaire = prix;
	}
	public Produit(String ref) {
		super();
		this.ref = ref;
	}
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ref == null) ? 0 : ref.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produit other = (Produit) obj;
		if (ref == null) {
			if (other.ref != null)
				return false;
		} else if (!ref.equals(other.ref))
			return false;
		return true;
	}
	
	
	
}
