package com.isika.cdi6.candidatures.composants;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.isika.cdi6.candidatures.exception.NoteNegativeException;
import com.isika.cdi6.candidatures.exception.NoteHorsIntervalleException;

public class ValidationTechnique {

	private static final double DELTA = 0;

	@Test
	public void testCalculerNotePositive() throws NoteNegativeException, NoteHorsIntervalleException {
		
		double noteCandidat = 10 ;
		
		double noteExpected = 20 ;
		
		ValidationTestTechnique validation = new ValidationTestTechnique();
		
		double noteCalcule  = validation.calculerNoteTechnique(noteCandidat);
		 
		 assertEquals(noteExpected,noteCalcule,DELTA);
	}
	
	@Test
	public void testCalculerNoteNulle() throws NoteNegativeException, NoteHorsIntervalleException {
		
		double noteCandidat = 0 ;
		
		double noteExpected = 0 ;
		
		ValidationTestTechnique validation = new ValidationTestTechnique();
		
		 double noteCalcule  = validation.calculerNoteTechnique(noteCandidat);
		 
		 assertEquals(noteExpected, noteCalcule, DELTA);
	}
	
	@Test(expected = NoteNegativeException.class)
	public void testCalculerNoteNegative() throws NoteNegativeException, NoteHorsIntervalleException {
		
		double noteCandidat = -5  ;
		
		
		ValidationTestTechnique validation = new ValidationTestTechnique();
		
		 validation.calculerNoteTechnique(noteCandidat);
		  
	}
	
	@Test(expected = NoteHorsIntervalleException.class)
	public void testCalculerNoteHorsIntervalle() throws NoteNegativeException, NoteHorsIntervalleException {
		
		double noteCandidat = 25;
		
		ValidationTestTechnique validation = new ValidationTestTechnique();
		
		 validation.calculerNoteTechnique(noteCandidat);
		
	}
	



}
