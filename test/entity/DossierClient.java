package com.innso.test.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="dossier_client")
public class DossierClient {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private String nomClient;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateOuverture;
	
	private String reference;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="dossier_client_id", referencedColumnName = "id")
	private List<Message> messages = new ArrayList<Message>();
	
	

	public DossierClient(String nomClient, Date dateOuverture, String reference, List<Message> messages) {
		super();
		this.nomClient = nomClient;
		this.dateOuverture = dateOuverture;
		this.reference = reference;
		this.messages = messages;
	}
	
	public DossierClient() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomClient() {
		return nomClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	public Date getDateOuverture() {
		return dateOuverture;
	}

	public void setDateOuverture(Date dateOuverture) {
		this.dateOuverture = dateOuverture;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}		
	
}
