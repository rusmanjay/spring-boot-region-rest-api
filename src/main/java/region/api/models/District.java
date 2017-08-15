package region.api.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="districts")
public class District {

	@Id
	private Integer id;

	@Column(nullable = false)
	private String name;

	@ManyToOne(optional = false)
	@JoinColumn(name = "regency_id", referencedColumnName = "id")
	private Regency regency;

	@OneToMany(targetEntity = Village.class, fetch = FetchType.EAGER)
	@JoinColumn(name = "district_id", referencedColumnName = "id")
	@JsonIgnore
	private List<Village> village;

	public District() {

	}

	public District(Integer id, Regency regency, String name) {
		super();
		this.id = id;
		this.regency = regency;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Regency getRegency() {
		return regency;
	}

	public void setRegency(Regency regency) {
		this.regency = regency;
	}

	public List<Village> getVillage() {
		return village;
	}

	public void setVillage(List<Village> village) {
		this.village = village;
	}
}
