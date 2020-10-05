package ar.edu.ucc.arqsoft.test.service.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType; // preguntar al profe
import javax.persistence.JoinColumn; //preguntar al profe
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "ADRESS")
public class Adress extends GenericObject{
	
	@NotNull
	@Size(min=1, max=250)
	@Column (name="STREET")
	private String street;
	
	@NotNull
	@Column(name = "NUMBER")
	private long numer;
	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="STATE_ID")
	private State state;


	@Enumerated(value = EnumType.ORDINAL)
	@Column(name = "ADDRESS_TYPE")
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public long getNumer() {
		return numer;
	}

	public void setNumer(long numer) {
		this.numer = numer;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
}
