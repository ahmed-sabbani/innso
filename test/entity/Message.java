package com.innso.test.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.innso.test.utils.Canal;

@Entity
@Table(name="message")
public class Message {
	
	@Id
	@Column(name = "id") 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateMessage;
	
	@NonNull
	private String nomAuteur;
	
	@NonNull
	private String contenuMessage;
	
	@Enumerated(EnumType.STRING)
	private Canal canal;	

	public Message(Date dateMessage, String nomAuteur, String contenuMessage, Canal canal) {
		super();
		this.dateMessage = dateMessage;
		this.nomAuteur = nomAuteur;
		this.contenuMessage = contenuMessage;
		this.canal = canal;
	}
	
	public Message() {}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDateMessage() {
		return dateMessage;
	}

	public void setDateMessage(Date dateMessage) {
		this.dateMessage = dateMessage;
	}

	public String getNomAuteur() {
		return nomAuteur;
	}

	public void setNomAuteur(String nomAuteur) {
		this.nomAuteur = nomAuteur;
	}

	public String getContenuMessage() {
		return contenuMessage;
	}

	public void setContenuMessage(String contenuMessage) {
		this.contenuMessage = contenuMessage;
	}

	public Canal getCanal() {
		return canal;
	}

	public void setCanal(Canal canal) {
		this.canal = canal;
	}
	
}
