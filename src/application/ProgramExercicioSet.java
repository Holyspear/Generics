package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProgramExercicioSet {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> cursoA = new HashSet<>();
		Set<Integer> cursoB = new HashSet<>();
		Set<Integer> cursoC = new HashSet<>();
		Set<Integer> unionAll = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int qtdAlunos = sc.nextInt();		
		for (int i = 0; i < qtdAlunos; i++) {
			cursoA.add(sc.nextInt());
		}
		System.out.print("How many students for course B? ");
		qtdAlunos = sc.nextInt();		
		for (int i = 0; i < qtdAlunos; i++) {
			cursoB.add(sc.nextInt());
		}
		System.out.print("How many students for course C? ");
		qtdAlunos = sc.nextInt();		
		for (int i = 0; i < qtdAlunos; i++) {
			cursoC.add(sc.nextInt());
		}
		
		unionAll.addAll(cursoA);
		unionAll.addAll(cursoB);
		unionAll.addAll(cursoC);
		
		System.out.println("Total students: " + unionAll.size());
		
		sc.close();
	}

}
