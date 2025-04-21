
public class Player {
	String name;
	int age;
	double height;
	String country;
	Player(String name,int age,double height,String country){
		this.name=name;
		this.age=age;
		this.height=height;
		this.country=country;
	}
	void displayInfo(){
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		System.out.println(country);
	}
}
