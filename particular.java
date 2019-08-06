package sana;

public class particular {
	 BufferedReader br = new BufferedReader(new FileReader("position2.txt"));
	    BufferedWriter bw = new BufferedWriter(new FileWriter("position.txt"));
	    String line;

	    while ((line = br.readLine())!= null){
	        if(line.isEmpty() || line.trim().equals("") || line.trim().equals("\n")){
	            continue;
	        }else{
	            //bw.write(line + "\n");
	            String[] data = line.split(" ");
	            bw.write(data[0] + " " + data[1] + " " + data[2] + "\n");
	        }

	    }

	    br.close();
	    bw.close();

	}
}
