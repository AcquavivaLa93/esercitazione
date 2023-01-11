package it.corso.junitTest;

import java.util.ArrayList;
import java.util.List;

public class Calendario {

	//attributi
	public String nome;
	public String descrizione;
	public List<Evento> eventi = new ArrayList<Evento>();
	
	
	//costruttori
	public Calendario() { }


	public Calendario(String nome, String descrizione, List<Evento> eventi) {
		this.nome = nome;
		this.descrizione = descrizione;
		this.eventi = eventi;
	}





	//getters e setters
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDescrizione() {
		return descrizione;
	}


	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}


	public List<Evento> getEventi() {
		return eventi;
	}


	public void setEventi(List<Evento> eventi) {
		this.eventi = eventi;
	}

	
	
	
	//metodo add
	public void addEvento(Evento e) {
		eventi.add(e);
	}
	
	
	//metodo remove
	public void removeEvento(Evento e) {
		for (int i = 0; i<eventi.size(); i++) {
			if (e.getNome() == eventi.get(i).getNome() && e.getGiorno() == eventi.get(i).getGiorno() &&
					e.getMese() == eventi.get(i).getMese() && e.getAnno() == eventi.get(i).getAnno()) {
				eventi.remove(e);
			}
		}
	}
	
	//metodo per visualizzare eventi su calendario
	public void visualizzaEventi() {
		for (int i = 0; i<eventi.size(); i++) {
			System.out.println("Nome: " + eventi.get(i).getNome() +'\n' + "Descrizione: " + eventi.get(i).getDescrizione() +
					'\n' + "Giorno: " + eventi.get(i).getGiorno() + '\n' + "Mese: " + eventi.get(i).getMese() +
					'\n' + "Anno: " + eventi.get(i).getAnno());
			System.out.println();
		}
	}
	
	
	
	
}
