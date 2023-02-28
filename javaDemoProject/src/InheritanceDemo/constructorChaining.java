package InheritanceDemo;

public class constructorChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subClass cc=new subClass();
		subClass cc2=new subClass(10);
		superClass ss=new superClass();

	}
}
	class superClass{
		int x;
		superClass(){
			System.out.println("No args Parent Constructor");
		}
		superClass(int x){
			this.x=x;
			System.out.println("One arg Parent Constructor");
		}
	}
	class subClass extends superClass{
		subClass(){
			System.out.println("No args Child Constructor");
		}
		subClass(int y){
			super(y);
			System.out.println("One arg Child Constructor");
		}
	}

