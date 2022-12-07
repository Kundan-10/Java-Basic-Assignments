package Q2;

public class Main {

	public static void main(String[] args) {
		
		Animal an=new Animal();
		an.eat();
		an.makeNoise();
		an.walk();
		
	
		Animal[] ani=new Animal[3];
		
		ani[0]=new Cat();
		ani[1]=new Dog();
		ani[2]=new Tiger();
	
		
		ani[0].makeNoise();
		ani[1].makeNoise();
		ani[2].makeNoise();


	}

}
