package crop.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Field {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "CODE")
	private String code;

	// @OneToOne()
	// @JoinColumn(name="TECH_CARDS_ID")
	// private TechCards techCards;

	@Column(name = "OBLAST")
	private String oblast;

	@Column(name = "RAJON")
	private String rajon;

	@Column(name = "VILLAGE")
	private String village;

	@Column(name = "AREA_TOTAL")
	private double areaTotal;

	@Column(name = "AREA_PLANTED")
	private double areaPlanted;

	public Field() {
		// TODO Auto-generated constructor stub
	}


	

	public Field(int id, String code, String oblast, String rajon, String village, double areaTotal,
			double areaPlanted) {
		super();
		this.id = id;
		this.code = code;
		this.oblast = oblast;
		this.rajon = rajon;
		this.village = village;
		this.areaTotal = areaTotal;
		this.areaPlanted = areaPlanted;
	}




	public Field(String code, String oblast, String rajon, String village, double areaTotal, double areaPlanted) {
		super();
		this.code = code;
		this.oblast = oblast;
		this.rajon = rajon;
		this.village = village;
		this.areaTotal = areaTotal;
		this.areaPlanted = areaPlanted;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getOblast() {
		return oblast;
	}

	public void setOblast(String oblast) {
		this.oblast = oblast;
	}

	public String getRajon() {
		return rajon;
	}

	public void setRajon(String rajon) {
		this.rajon = rajon;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public double getAreaTotal() {
		return areaTotal;
	}

	public void setAreaTotal(double areaTotal) {
		this.areaTotal = areaTotal;
	}

	public double getAreaPlanted() {
		return areaPlanted;
	}

	public void setAreaPlanted(double areaPlanted) {
		this.areaPlanted = areaPlanted;
	}

}
