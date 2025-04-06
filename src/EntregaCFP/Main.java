package EntregaCFP;

import java.io.IOException;

public class Main {
	
	
	    public static void main(String[] args) {
	        try {
	            GenerateInfoFiles.createSalesManInfoFile(5);
	            GenerateInfoFiles.createProductsFile(10);
	            String name = GenerateInfoFiles.NAMES[GenerateInfoFiles.RANDOM.nextInt(GenerateInfoFiles.NAMES.length)];
	            GenerateInfoFiles.createSalesMenFile(5, name, 74528667);
	            String name2 = GenerateInfoFiles.NAMES[GenerateInfoFiles.RANDOM.nextInt(GenerateInfoFiles.NAMES.length)];
	            if(name.equals(name2)) {
	            	 name2 = GenerateInfoFiles.NAMES[GenerateInfoFiles.RANDOM.nextInt(GenerateInfoFiles.NAMES.length)];
	            }
	            GenerateInfoFiles.createSalesMenFile(7, name2, 84221338);
	        } catch (IOException e) {
	            System.out.println("Error generando archivos: " + e.getMessage());
	        }
	    }
	}




