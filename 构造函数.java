class dog{
	int size;

	public dog(int dogsize){
			size = dogsize;

			System.out.println("a new dog");
		}

	public void bark(){
		System.out.println("wwwwwwwwwww");
	}
}

class makedog{
	public static void main(String[] args){
		dog a = new dog(18);
		System.out.println(a.size);
		a.bark();
	}
}