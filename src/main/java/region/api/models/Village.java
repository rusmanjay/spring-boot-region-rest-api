package region.api.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="villages")
public class Village {

	@Id
	private Long id;
	
	private Integer district_id;
	
	private String name;

	public Village() {

	}

	public Village(Long id, Integer districtId, String name) {
		super();
		this.id = id;
		this.district_id = districtId;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getDistrictId() {
		return district_id;
	}

	public void setDistrictId(Integer districtId) {
		this.district_id = districtId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}