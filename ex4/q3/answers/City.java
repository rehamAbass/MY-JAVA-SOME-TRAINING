
public class City implements Comparable<City>{


		private String name;
		private Country country;
		private int population;
	
	public City(String name, Country country, int pop) {
		this.country=country;
		this.name=name;
		this.population=pop;
	} 
	///////////////////////////////////////////////////////
	public String getName() {
		return this.name;
	}
	///////////////////////////////////////////
	public Country getCountry() {
		return this.country;
	}
	//////////////////////////////////////////
	public int getPopulation() {
		return this.population;
	}
	/////////////////////////////////////////
	public String toString() {
		return String.format("%s (of %s)",this.name,this.country.toString());
	}
	//////////////////////////////////////////
	@Override
	public boolean equals(Object other) {
		if(other == this) return true;
		if(!(other instanceof City)) return false;
		City c= (City)other;
		if(this.country != c.country) return false;
		if(this.name == c.name) return true;
		return false;
	}
	////////////////////////////////////////
	@Override
	public int compareTo(City c) {
		if (this.equals(c)) return 0;
			if(this.name.compareTo(c.getName()) == 0){
				return this.country.toString().compareTo(c.getCountry().toString());
			}
			else return this.name.compareTo(c.getName());
	}
	/////////////////////////////////////////////
	
	///////////////////////////////////

}
