package application;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.entities.Product;
import model.services.CalculationService;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		String path = "C:\\Workspaces\\ws-eclipse\\generics_set_map\\products.txt";
		
		try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8"))) {
			
			String line = bufferedReader.readLine();
			Product product;
			while (line != null) {
				String[] fields = line.split(",");
				product = new Product(fields[0], Double.parseDouble(fields[1]));
				list.add(product);
				line = bufferedReader.readLine();
			}
			
			Product maxProduct = CalculationService.max(list);
			System.out.println("Most expensive Product: ");
			System.out.println(maxProduct);
		}		
		catch (IOException e) {
			e.getMessage();
		}
		
	}

}
