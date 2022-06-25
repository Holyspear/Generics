package application;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import model.entities.LogEntry;

public class ProgramLog {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8"))){
			Set<LogEntry> conjunto = new HashSet<>();
			
			String linha = reader.readLine();
			while(linha != null) {
				String[] campos = linha.split(" ");
				String username = campos[0];
				Date moment = Date.from(Instant.parse(campos[1]));
				
				conjunto.add(new LogEntry(username, moment));
				linha = reader.readLine();
			}
			System.out.println("Total users: " + conjunto.size());
			
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			sc.close();
		}
	}

}
