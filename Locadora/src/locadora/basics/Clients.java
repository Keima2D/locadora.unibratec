package locadora.basics;

import java.util.Calendar;

public class Clients {
	private String name;
	private String adress;
	private String sector;
	private char gender;
	private String phone;
	private Calendar registerDate;
	private String CPF;
	private String RG;
	
	public Clients(String name, String adress, String sector, char gender,
			String phone, Calendar registerDate, String cPF, String rG) {
		super();
		this.name = name;
		this.adress = adress;
		this.sector = sector;
		this.gender = gender;
		this.phone = phone;
		this.registerDate = registerDate;
		CPF = cPF;
		RG = rG;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Calendar getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Calendar registerDate) {
		this.registerDate = registerDate;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}
	

}
