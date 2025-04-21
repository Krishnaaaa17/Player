
public class Cricket extends Player{
	int runs;
	int wickets;
	Cricket(String name,int age,double height,String country,int runs,int wickets){
		super( name, age, height, country);
		this.runs=runs;
		this.wickets=wickets;
	}
	void DisplayStats() {
		super.displayInfo();
		System.out.println(runs);
		System.out.println(wickets);
	}
}
