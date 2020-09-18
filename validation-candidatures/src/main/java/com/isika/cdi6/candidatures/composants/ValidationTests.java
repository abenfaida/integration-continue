package com.isika.cdi6.candidatures.composants;

import com.isika.cdi6.candidatures.exception.NoteHorsIntervalleException;
import com.isika.cdi6.candidatures.exception.NoteNegativeException;

public class ValidationTests {
	

	public double calculerNotesTests(double noteLogique,double noteTechnique, double noteDissertation) throws NoteNegativeException, NoteHorsIntervalleException {
		
		ValidationDissertation validationDissertation = new ValidationDissertation();
		double dissertation = validationDissertation.calculerNoteDissertation(noteDissertation);
		
		ValidationTestLogique testLogique = new ValidationTestLogique();
		double logique = testLogique.calculerNoteLogique(noteLogique);
		
		ValidationTestTechnique testTechnique = new ValidationTestTechnique();
		double technique = testTechnique.calculerNoteTechnique(noteTechnique);
		
		double moyenneTotal = (dissertation + logique + technique) / 6.5;

		System.out.println("La moyenne total est " + moyenneTotal);
		return moyenneTotal;
		

	}
	
	public void decisionEntretien(double notesTests) {
		String message = "Le candidat n'est pas éligible à l'entretien";
		
		if(notesTests>= 10) {
			message = "Le candidat est éligible à l'entretien";
		}
		
		System.out.println(message);
	}
	
}
