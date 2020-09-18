package com.isika.cdi6.candidatures.main;

import java.util.Scanner;

import com.isika.cdi6.candidatures.composants.ValidationTests;
import com.isika.cdi6.candidatures.exception.NoteHorsIntervalleException;
import com.isika.cdi6.candidatures.exception.NoteNegativeException;


public class Main {

	public static void main(String[] args) throws NoteNegativeException, NoteHorsIntervalleException {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Veuillez saisir la note du test logique : ");
		double noteLogique = sc.nextDouble();
		
		
		System.out.print("Veuillez saisir la note du test technique : ");
		double noteTechnique = sc.nextDouble();
		
		System.out.print("Veuillez saisir la note du test dissertion : ");
		double noteDissertation = sc.nextDouble();
	
		ValidationTests validationTests = new ValidationTests();
		
		double notesTests = validationTests.calculerNotesTests(noteLogique, noteTechnique, noteDissertation);
		validationTests.decisionEntretien(notesTests);
		
		
		sc.close();
	}

}
 