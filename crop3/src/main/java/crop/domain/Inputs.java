package crop.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Inputs {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private int id;

	@Column(name = "NAME")
	private String name;
	
	@Column(name = "UNIT_MEASURMEN")
	private String unitMeasurmen;
	
	@Column(name = "INPUT_CLASS")
	private String inputClass;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "inputs")
	private List<Prices> prices;

	public Inputs() {
		// TODO Auto-generated constructor stub
	}

	public Inputs(String name, String unitMeasurmen, String inputClass, String plName, String cfName,
			List<Prices> prices) {
		super();
		this.name = name;
		this.unitMeasurmen = unitMeasurmen;
		this.inputClass = inputClass;	
		this.prices = prices;
	}
	
	
	
	

	public Inputs(String name, String unitMeasurmen, String inputClass) {
		super();
		this.name = name;
		this.unitMeasurmen = unitMeasurmen;
		this.inputClass = inputClass;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUnitMeasurmen() {
		return unitMeasurmen;
	}

	public void setUnitMeasurmen(String unitMeasurmen) {
		this.unitMeasurmen = unitMeasurmen;
	}

	public String getInputClass() {
		return inputClass;
	}

	public void setInputClass(String inputClass) {
		this.inputClass = inputClass;
	}

	public List<Prices> getPrices() {
		return prices;
	}

	public void setPrices(List<Prices> prices) {
		this.prices = prices;
	}

	@Override
	public String toString() {
		return "Inputs [id=" + id + ", name=" + name + ", unitMeasurmen=" + unitMeasurmen + ", inputClass=" + inputClass
				+ "]";
	}

	

	
	

}
