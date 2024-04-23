package onetoone_bi.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;
@Entity
@Data

public class Aadharcard {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	private String name;
	private String address;
	
	@OneToOne(mappedBy = "ac")
	Person p;

	@Override
	public String toString() {
		return "Aadharcard [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
}
