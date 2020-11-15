import java.io.File;
import java.io.FileWriter; 
public class Contact{
	File f = null;
	FileWriter fw = null;
	String path = "";

	public Contact(String path){   // create file and filewriter
		this.path = path;

		try{
			f = new File(path);
			fw = new FileWriter(f);
			f.createNewFile();

		}catch (Exception e){
			System.out.println("Error...");
		}
	}
	public Contact(String path, String label[]){
		this.path = path;

		try{
			f = new File(path);
					
			if(f.createNewFile()){
				fw = new FileWriter(f,true);
				for(String first:label){  // each data in caption adds to file
					fw.append(first);			// append enable
					fw.append(",");			// separate each data with ,	
				}
				fw.append("\n");			// go to new line when all datas are added
				fw.close();
			}

		}catch (Exception e){
			System.out.println("Error...");
		}
	}

	public boolean add(String info[]){  // for information

		try{
			fw = new FileWriter(path,true);
			for(String cont:info){						// cont for  name and phone
				fw.append(cont);
				fw.append(",");
			}
			fw.append("\n");
			fw.close();
			return true;

		}catch(Exception e){
			return false;
		}
	}
}	