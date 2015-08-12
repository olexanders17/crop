package crop.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Prices {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "PRICE_TYPE_NAME")
	private String priceTypeName;
		
	@ManyToOne()
	@JoinColumn(name="INPUTS_ID")
	private Inputs inputs;

	
	@Column(name = "VAT_RATE")
	private double vatRate;

	@Column(name = "UAH_EXC_VAT")
	private double uahExcVat;

	@Column(name = "UAH_INC_VAT")
	private double uahIncVat;

	@Column(name = "USD_EXC_VAT")
	private double usdExcVat;

	@Column(name = "USD_INC_VAT")
	private double usdIncVat;
	
	public Prices() {
		// TODO Auto-generated constructor stub
	}

	public Prices(Inputs inputs, double vatRate, double uahExcVat) {
		super();
		this.inputs = inputs;
		this.vatRate = vatRate;
		this.uahExcVat = uahExcVat;
	}

	public Prices(String priceTypeName, Inputs inputs, double vatRate, double uahExcVat) {
		super();
		this.priceTypeName = priceTypeName;
		this.inputs = inputs;
		this.vatRate = vatRate;
		this.uahExcVat = uahExcVat;
	}

	public String getPriceTypeName() {
		return priceTypeName;
	}

	public void setPriceTypeName(String priceTypeName) {
		this.priceTypeName = priceTypeName;
	}

	public Inputs getInputs() {
		return inputs;
	}

	public void setInputs(Inputs inputs) {
		this.inputs = inputs;
	}

	public double getVatRate() {
		return vatRate;
	}

	public void setVatRate(double vatRate) {
		this.vatRate = vatRate;
	}

	public double getUahExcVat() {
		return uahExcVat;
	}

	public void setUahExcVat(double uahExcVat) {
		this.uahExcVat = uahExcVat;
	}

	public double getUahIncVat() {
		return uahIncVat;
	}

	public void setUahIncVat(double uahIncVat) {
		this.uahIncVat = uahIncVat;
	}

	public double getUsdExcVat() {
		return usdExcVat;
	}

	public void setUsdExcVat(double usdExcVat) {
		this.usdExcVat = usdExcVat;
	}

	public double getUsdIncVat() {
		return usdIncVat;
	}

	public void setUsdIncVat(double usdIncVat) {
		this.usdIncVat = usdIncVat;
	}
	
	
	
	
	
	
	
	
	
	

}
