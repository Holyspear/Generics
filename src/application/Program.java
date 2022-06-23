package application;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import model.services.CalculationService;

public class Program {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		String path = "C:\\Workspaces\\ws-eclipse\\generics_set_map\\products.txt";
		
		try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8"))) {
			
			String line = bufferedReader.readLine();
			while (line != null) {
				list.add(Integer.parseInt(line));
				line = bufferedReader.readLine();
			}
			
			Integer x = CalculationService.max(list);
			System.out.println("Max: ");
			System.out.println(x);
		}		
		catch (IOException e) {
			e.getMessage();
		}
		
	}

}
