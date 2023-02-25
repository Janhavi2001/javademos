package javaDemoProject;

public class staticNonStaticBlock {
	static {
		System.out.println("Static Block");
	}
	{
		System.out.println("Non-Static Block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method");
		staticNonStaticBlock sns=new staticNonStaticBlock();
	}

}
