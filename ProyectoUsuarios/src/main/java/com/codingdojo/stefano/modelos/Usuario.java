package com.codingdojo.stefano.modelos;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="usuarios")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull //@NotEmpty
	@Size(min=2, max=100, message="El nombre debe tener al menos 2 caracteres.")
	private String firstName;
	
	@NotNull
	@Size(min=2, max=200)
	private String lastName;
	
	@NotNull
	@Size(min=5, max=255)
	private String email;
	
	@NotNull
	@Size(min=5, max=255)
	private String password;
	
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
	
	@JsonIgnore // Me ignora el regresar el dato
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updateAt;
	
	@JsonBackReference(value="salon-json")  //Objeto de usuario no va a visualizar el salon.
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="classroom_id")//Llave foranea
	private Salon salon;
	
	@JsonManagedReference(value="hoobies-json")  //Objeto de Usuario SI se vea en Hoobies.
	@JsonIgnore  //Para no mandarlo a travez del Json al ser Guardado.
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(
			name="users_has_hobbies",
			joinColumns= @JoinColumn(name="user_id"),
			inverseJoinColumns= @JoinColumn(name="hobby_id")
			)
	private List<Hobby> hobbies;
	
	public Usuario() {
	}

	public Usuario(String firstName, String lastName, String email, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}

	public Usuario(long id, String firstName, String lastName, String email, String password) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}
	
	public Salon getSalon() {
		return salon;
	}

	public void setSalon(Salon salon) {
		this.salon = salon;
	}

	public List<Hobby> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<Hobby> hobbies) {
		this.hobbies = hobbies;
	}

	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}
	
	@PreUpdate
	protected void onUpdate() {
		this.updateAt = new Date();
	}
}
