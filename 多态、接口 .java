import java.util.ArrayList;

abstract class animals{
	String sex;
	double weight;

	public abstract void bark();
	public void run(){
		System.out.println("Run!");
	} 

	public void eat(){
		System.out.println("Eat food!");
	}
}

interface pets{
	public abstract void play();
	public abstract void maimeng();
}

class dog extends animals implements pets{
	public void play(){
		System.out.println("Play!");
	}

	public void maimeng(){
		System.out.println("Maimeng!");
	}

	public void bark(){
		System.out.println("wangwangwanag!");
	}
}

class animalstestdrive{
	public static void main (String[] args){
		ArrayList<dog> dogArrayList = new ArrayList<dog>();
		dog a = new dog();
		System.out.println(a.sex);
		System.out.println(a.weight);

		a.bark();
		a.eat();
		a.run();
		a.play();
		a.maimeng();

		dogArrayList.add(a);
		dog b = dogArrayList.get(0);

		if(a.equals(b)){
			System.out.println("True!");
		}else{
			System.out.println("False!");
		}

		System.out.println(a.getClass());
		System.out.println(b.getClass());
		System.out.println(a.hashCode());
		System.out.println(a.toString());
	}
}