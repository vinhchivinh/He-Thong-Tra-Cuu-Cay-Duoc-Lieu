package com.tracuucayduoclieu.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import groovy.transform.Generated;

@Entity
@Table(name ="BAOCAO")
public class Baocao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idbaocao;
	
	@Column(name ="noidungbaocao")
	private String noidungbaocao;
	
	@ManyToOne
	@JoinColumn(name ="idcautraloi")
	private Traloi traloi;

	@Override
	public String toString() {
		return "Baocao [idbaocao=" + idbaocao + ", noidungbaocao=" + noidungbaocao + ", traloi=" + traloi + "]";
	}

	public int getIdbaocao() {
		return idbaocao;
	}

	public void setIdbaocao(int idbaocao) {
		this.idbaocao = idbaocao;
	}

	public String getNoidungbaocao() {
		return noidungbaocao;
	}

	public void setNoidungbaocao(String noidungbaocao) {
		this.noidungbaocao = noidungbaocao;
	}

	public Traloi getTraloi() {
		return traloi;
	}

	public void setTraloi(Traloi traloi) {
		this.traloi = traloi;
	}
	
	
	
}
