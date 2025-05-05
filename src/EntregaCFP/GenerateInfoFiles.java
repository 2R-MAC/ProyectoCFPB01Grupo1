package EntregaCFP;

import java.io.*;
import java.util.*;

public class GenerateInfoFiles {
	
    public static final String[] NAMES = {"Miguel", "Andrea", "Roberto", "Jaime", "Jairo"};
    private static final String[] LASTNAMES = {"Gonzalez", "Ruiz", "Pérez", "Osorio", "Martínez"};
    private static final String[] PRODUCTOS = {"Mouse", "Computador", "Televisor", "Aire Acondicionado", "Nevera", "Monitor"};
    public static final Random RANDOM = new Random();

    public static void createSalesManInfoFile(int salesmanCount) throws IOException {
        File file = new File("Vendedores"
        		+ .csv");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (int i = 0; i < salesmanCount; i++) {
                String docType = "CC";
                long docNumber = 10000000 + RANDOM.nextInt(90000000);
                String name = NAMES[RANDOM.nextInt(NAMES.length)];
                String lastName = LASTNAMES[RANDOM.nextInt(LASTNAMES.length)];
                writer.write(docType + ";" + docNumber + ";" + name + ";" + lastName + "\n");
            }
        }
        System.out.println("Archivo de vendedores generado exitosamente.");
    }

    public static void createProductsFile(int productsCount) throws IOException {
        File file = new File("productos.csv");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (int i = 1; i <= productsCount; i++) {
            	String productoname = PRODUCTOS[RANDOM.nextInt(PRODUCTOS.length)];
                double price = 100 + (RANDOM.nextDouble() * 90);
                writer.write(i + ";" + productoname + ";" + String.format("%.2f", price) + "\n");
            }
        }
        System.out.println("Archivo de productos generado exitosamente.");
    }
    

    public static void createSalesMenFile(int randomSalesCount, String name, long id) throws IOException {
        File file = new File("Ventas de " + name + ".csv");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write("CC;" + id + "\n");
            for (int i = 0; i < randomSalesCount; i++) {
                int productId = 1 + RANDOM.nextInt(10);
                int quantity = 1 + RANDOM.nextInt(10);
                writer.write(productId + ";" + quantity + ";\n");
            }
        }
        System.out.println("Archivo de ventas para " + name + " generado exitosamente.");
    

}

    public static void main(String[] args){

}
}