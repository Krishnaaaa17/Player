
public class Football extends Player{
	String Position;
	int Goals;
	Football(String name,int age,double height,String country,String Position,int Goals){
		super( name, age, height, country);
		this.Position=Position;
		this.Goals=Goals;
	}
	void displayFootballStats(){
		super.displayInfo();
		System.out.println(Position);
		System.out.println(Goals);
	}

}
