package entities;

public class Bill {
	
	private char gender;
	private int beer;
	private int barbecue;
	private int softDrink;
	
	public Bill() {
		
	}

	public Bill(char gender, int beer, int barbecue, int softDrink) {
		this.gender = gender;
		this.beer = beer;
		this.barbecue = barbecue;
		this.softDrink = softDrink;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getBeer() {
		return beer;
	}

	public void setBeer(int beer) {
		this.beer = beer;
	}

	public int getBarbecue() {
		return barbecue;
	}

	public void setBarbecue(int barbecue) {
		this.barbecue = barbecue;
	}

	public int getSoftDrink() {
		return softDrink;
	}

	public void setSoftDrink(int softDrink) {
		this.softDrink = softDrink;
	}
	
	public double feeding() {
		double totalBeer = beer * 5.00;
		double totalBarbecue = barbecue * 7.00;
		double totalSoftDrink = softDrink * 3.00;
		double totalFeeding = totalBarbecue + totalBeer + totalSoftDrink;
		return totalFeeding; 
	}
	
	public double cover() {
		if (feeding() < 30.0) {
			return 4.0;
		}
		else {
			return 0;
		}
			
	}
	
	public double ticket() {
		if (gender == 'F'){
			return 8.0;
		} else {
			return 10.0;
		}
	}
	
	public double total() {
		double sumTotal = ticket() + cover() + feeding();
		return sumTotal;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("RELATÓRIO: \r\n");
		sb.append(String.format("Consumo = R$ %.2f %n", feeding()));
		if (cover() > 0) {
			sb.append(String.format("Couvert = R$ %.2f %n", cover()));	
		} else {
			sb.append("Isento de Couvert \r\n");
		}
		sb.append(String.format("Ingresso = = R$ %.2f %n%n", ticket()));
		sb.append(String.format("Valor a pagar = R$ %.2f %n", total()));		
		return sb.toString();
	}
	
	
	
}
