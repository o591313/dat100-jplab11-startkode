package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	// TODO: objektvariable
	private Innlegg[] innleggtabell;
	private int nesteledig = 0;

	public Blogg() {
		this.innleggtabell = new Innlegg[20];
		this.nesteledig = 0;

	}

	public Blogg(int lengde) {
		this.innleggtabell = new Innlegg[lengde];
		this.nesteledig = 0;
	}

	public int getAntall() {

		int antall = 0;
		if (nesteledig > 0) {
			return antall = nesteledig;
		}
		return antall;
	}

	public Innlegg[] getSamling() {
		return innleggtabell;

	}

	public int finnInnlegg(Innlegg innlegg) {

		boolean funnet = false;
		int i = 0;

		while (i < nesteledig && !funnet) {
			if (innleggtabell[i].erLik(innlegg)) {
				funnet = true;
				return i;
			}
			i++;
		}
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {

		boolean finnes = false;
		int i = 0;

		while (i < nesteledig && !finnes) {
			if (innleggtabell[i].erLik(innlegg)) {
				return finnes = true;
			}
			i++;
		}
		return false;
	}

	public boolean ledigPlass() {

		if (nesteledig < innleggtabell.length) {
			return true;
		}
		return false;
	}

	public boolean leggTil(Innlegg innlegg) {

		boolean ny = finnInnlegg(innlegg) == -1;
		if (ny && nesteledig < innleggtabell.length) {
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			return true;
		} else {
			return false;
		}
	}

	public String toString() {

		String blogg = getAntall() + "\n";

		for (Innlegg i : innleggtabell) {
			if (i != null) {
				blogg += i.toString();
			}
		}
		return blogg;
	}

	// valgfrie oppgaver nedenfor

	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());

	}

	public boolean slett(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
	}

	public int[] search(String keyword) {

		throw new UnsupportedOperationException(TODO.method());

	}
}