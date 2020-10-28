package no.hvl.dat100.jplab11.oppgave4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.oppgave3.Blogg;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

		try {

			File innfil = new File(mappe, filnavn);
			PrintWriter skriver = new PrintWriter(innfil);
			skriver.println(samling.toString());
			skriver.close();

		} catch (FileNotFoundException e) {

			return false;

		}
		return true;

	}
}
