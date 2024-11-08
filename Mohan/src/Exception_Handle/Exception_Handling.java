package Exception_Handle;

public class Exception_Handling {

	public static void main(String[] args) {
		int num_1 = 50/10;
		System.out.println(num_1);
		try {
		int num_2 = 50/0;
		System.out.println(num_2);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		int num_3 = 50/25;
		System.out.println(num_3);
	}
}
