package com.isika.cdi6.candidatures.composants;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.isika.cdi6.candidatures.exception.NoteNegativeException;
import com.isika.cdi6.candidatures.exception.NoteHorsIntervalleException;

public class ValidationDissertationTest {

	private static final double DELTA = 0;

	@Test
	public void testCalculerNotePositive() throws NoteNegativeException, NoteHorsIntervalleException {
		
		
		double noteCandidat = 10 ;
		
		double noteExpected = 15 ;
		
		ValidationDissertation validation = new ValidationDissertation();
		
		double noteCalcule  = validation.calculerNoteDissertation(noteCandidat);
		 
		 assertEquals(noteExpected,noteCalcule,DELTA);
	}
	
	@Test
	public void testCalculerNoteNulle() throws NoteNegativeException, NoteHorsIntervalleException {
		
		double noteCandidat = 0 ;
		
		double noteExpected = 0 ;
		
		ValidationDissertation validation = new ValidationDissertation();
		
		 double noteCalcule  = validation.calculerNoteDissertation(noteCandidat);
		 
		 assertEquals(noteExpected, noteCalcule, DELTA);
	}
	
	@Test(expected = NoteNegativeException.class)
	public void testCalculerNoteNegative() throws NoteNegativeException, NoteHorsIntervalleException {
		
		double noteCandidat = -5  ;
		
		
		ValidationDissertation validation = new ValidationDissertation();
		
		 validation.calculerNoteDissertation(noteCandidat);
		  
	}
	
	@Test(expected = NoteHorsIntervalleException.class)
	public void testCalculerNoteHorsIntervalle() throws NoteNegativeException, NoteHorsIntervalleException {
		
		double noteCandidat = 25;
		
		ValidationDissertation validation = new ValidationDissertation();
		
		 validation.calculerNoteDissertation(noteCandidat);
		
	}
	



}
