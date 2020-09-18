package com.isika.cdi6.candidatures.composants;

import com.isika.cdi6.candidatures.exception.NoteHorsIntervalleException;
import com.isika.cdi6.candidatures.exception.NoteNegativeException;

public class ValidationDissertation {

	private static final double COEF_TEST_DISSERTATION = 1.5;

	public double calculerNoteDissertation(double note) throws NoteNegativeException, NoteHorsIntervalleException {
		
		if(note == 0) return 0;
		if(note < 0) throw new NoteNegativeException("La note est négative");
		if(note > 20) throw new NoteHorsIntervalleException("La note est hors intervalle");

		return note* COEF_TEST_DISSERTATION;
	}
	
}
