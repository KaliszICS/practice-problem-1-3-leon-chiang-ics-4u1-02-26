import java.io.*;

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String readFile(String filename) {
		BufferedReader x=null;
		String y="";
		String z="";
		try {
			x=new BufferedReader(new FileReader(filename));

			while ((y=x.readLine())!=null) {
				z+=y;
				z+="\n";
			}
		}
		catch (IOException e) {
			System.out.println(e);
		}
		finally {
			try {
				if (x!=null) {
					x.close();
				}
			}
			catch (IOException e) {
				System.out.println(e);
			}
		}
		
		return z;
	}

	public static String backwardsReadFile(String filename) {
		String y="";
		int z;

		FileReader x=null;
		try {
			x=new FileReader(filename);
			while ((z=x.read())!=-1) {
			y=((char)z)+y;
			}
		}
		catch (IOException e) {
				System.out.println(e);
			}
		finally {
			try{
				if(x!=null) {
					x.close();
				}
			}
			catch (IOException e) {
				System.out.println(e);
			}
		}
		return y;
	}

}
