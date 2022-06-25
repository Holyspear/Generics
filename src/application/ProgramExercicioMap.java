package application;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ProgramExercicioMap {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter file full path: ");
		String path = sc.nextLine();

		try (BufferedReader fileVotes = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8"))) {

			Map<String, Integer> candidatesMap = new LinkedHashMap<>();

			String linha = fileVotes.readLine();
			String strCandidate[];
			Integer sumVotes;
			while (linha != null) {
				strCandidate = linha.split(",");
				sumVotes = Integer.valueOf(strCandidate[1]);
				if (candidatesMap.containsKey(strCandidate[0])) {
					sumVotes += candidatesMap.get(strCandidate[0]);
					candidatesMap.put(strCandidate[0], sumVotes);
				} else {
					candidatesMap.put(strCandidate[0], Integer.valueOf(strCandidate[1]));
				}

				linha = fileVotes.readLine();
			}
			for (String idCandidate : candidatesMap.keySet()) {
				System.out.println(idCandidate + ": " + candidatesMap.get(idCandidate));
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			sc.close();
		}

	}

}
