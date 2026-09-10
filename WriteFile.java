package Demo;
import java.io.FileWriter;
import java.io.IOException;
public class WriteFile {
	public static void main(String[] args) {
	try {
		FileWriter writer = new FileWriter("example.txt");
		writer.write("Hello Java!");
		writer.write("\nWelcme to file Handling.");
		writer.close();
		System.out.println("Data written successsfully.");
	} catch (IOException e) {
		System.out.println("An error occured.");
		
	}

}
}
