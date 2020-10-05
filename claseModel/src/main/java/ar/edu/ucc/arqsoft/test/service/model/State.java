package ar.edu.ucc.arqsoft.test.service.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "STATE")
public class State extends GenericObject{

	@NotNull
	@Size(min=1, max=250)
	@Column (name="NAME")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
