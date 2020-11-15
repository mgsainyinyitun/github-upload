import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class FileAssignment{
	public static void main(String[] args) {

		System.out.println("***************************************");
		System.out.println("***           Contact Info          ***");
		System.out.println("***************************************");

		Scanner sc = new Scanner(System.in);
		Scanner scs = new Scanner(System.in);
		
		System.out.print("Enter Your Name :: ");
		String name = scs.nextLine();
		System.out.print("Enter Your Phone Number :: ");
		String phone = sc.nextLine();

		String label[] = {"name", "phone"};		
		Contact c = new Contact("Contacts.txt",label);

		String info[] = {name,phone};

		if(c.add(info)){
			System.out.println("Successful!");
		}
		else{
			System.out.println("Please Try Again");	
		}
		String s = sc.nextLine();
	}
	
}