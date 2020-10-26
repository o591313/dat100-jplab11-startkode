package no.hvl.dat100.jplab11.oppgave1;

import no.hvl.dat100.jplab11.common.TODO;

public abstract class Innlegg {

	// TODO - deklarering av objektvariable

	private int id;
	private String bruker;
	private String dato;
	private int likes;

	public Innlegg() {

	}

	public Innlegg(int id, String bruker, String dato) {

		// TODO
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = 0;

	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		// TODO - START

		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
	}

	public String getBruker() {

		return bruker;

	}

	public void setBruker(String bruker) {

		this.bruker = bruker;
	}

	public String getDato() {
		return dato;

	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public int getId() {
		return id;

	}

	public int getLikes() {
		return likes;

	}

	public void doLike() {
		likes++;
	}

	public boolean erLik(Innlegg innlegg) {
		boolean lik = false;

		if (id == innlegg.id) {

			lik = true;
		}

		return lik;
	}

	@Override
	public String toString() {

		String konvertert;

		String stringId = Integer.toString(id);
		String stringLikes = Integer.toString(likes);

		konvertert = stringId + "\n" + bruker + "\n" + dato + "\n" + stringLikes + "\n";
		return konvertert;
	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {

		throw new UnsupportedOperationException(TODO.method());

	}
}
