package crop.domain;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQueries({ @NamedQuery(name = "TechCards.getTCById", query = "select tc  from TechCards tc where tc.id=:id") })
public class TechCards {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private int id;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "FIELD_ID")
	private Field field;

	@Column(name = "OPERATION_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar operationDate;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "OPERATION_ID")
	private Operations operations;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "INPUTS_ID")
	private Inputs inputs;

	@Column(name = "APPLICATION_RATE")
	private double applicationRate;

	@Column(name = "HECTARES_APPLIED")
	private double hectaresApplied;

	@Column(name = "TOTAL_QUANTITY")
	private double totalQuantity;

	@Column(name = "PRICE")
	private double price;

	@Column(name = "TOTAL_USD")
	private double totalUsd;

	@Column(name = "TOTAL_UAH")
	private double totalUah;

	public TechCards() {
		// TODO Auto-generated constructor stub
	}

	public TechCards(int id, Field field, Calendar operationDate, Operations operations, Inputs inputs,
			double applicationRate, double hectaresApplied, double totalQuantity, double price, double totalUsd,
			double totalUah) {
		super();
		this.id = id;
		this.field = field;
		this.operationDate = operationDate;
		this.operations = operations;
		this.inputs = inputs;
		this.applicationRate = applicationRate;
		this.hectaresApplied = hectaresApplied;
		this.totalQuantity = totalQuantity;
		this.price = price;
		this.totalUsd = totalUsd;
		this.totalUah = totalUah;
	}

	public TechCards(Field field, Calendar operationDate, Operations operations, Inputs inputs, double applicationRate,
			double hectaresApplied, double totalQuantity, double totalUah) {
		super();

		this.field = field;
		this.operationDate = operationDate;
		this.operations = operations;
		this.inputs = inputs;
		this.applicationRate = applicationRate;
		this.hectaresApplied = hectaresApplied;
		this.totalQuantity = totalQuantity;
		this.totalUah = totalUah;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Field getField() {
		return field;
	}

	public void setField(Field field) {
		this.field = field;
	}

	public Calendar getOperationDate() {
		return operationDate;
	}

	public void setOperationDate(GregorianCalendar operationDate) {
		this.operationDate = operationDate;
	}

	public double getApplicationRate() {
		return applicationRate;
	}

	public void setApplicationRate(double applicationRate) {
		this.applicationRate = applicationRate;
	}

	public double getHectaresApplied() {
		return hectaresApplied;
	}

	public void setHectaresApplied(double hectaresApplied) {
		this.hectaresApplied = hectaresApplied;
	}

	public double getTotalQuantity() {
		return totalQuantity;
	}

	public void setTotalQuantity(double totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

	public double getTotalUsd() {
		return totalUsd;
	}

	public void setTotalUsd(double totalUsd) {
		this.totalUsd = totalUsd;
	}

	public double getTotalUah() {
		return totalUah;
	}

	public void setTotalUah(double totalUah) {
		this.totalUah = totalUah;
	}

}
