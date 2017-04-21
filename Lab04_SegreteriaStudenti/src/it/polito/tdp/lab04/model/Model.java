package it.polito.tdp.lab04.model;

import java.util.*;
import java.util.List;

import it.polito.tdp.lab04.DAO.CorsoDAO;
import it.polito.tdp.lab04.DAO.StudenteDAO;


public class Model {
	
	private List<Corso> corsi;
	private List<Studente> studenti;
	private CorsoDAO corso;
	private List<Studente> studentiIscrittiCorso = new LinkedList<Studente>();	
	private Corso corsoCorrente = null;
	
	public Model(){
		CorsoDAO dao = new CorsoDAO();
		this.corsi = dao.getTuttiICorsi();
		StudenteDAO studDao = new StudenteDAO();
		this.studenti = studDao.getTuttiGliStudenti();
		this.studentiIscrittiCorso = dao.getStudentiIscrittiAlCorso(corsoCorrente);
		
		
	}
	
	public Corso getCorsoCorrente(){
		return corsoCorrente;
	}

	public List<Studente> getStudentiIscrittiAlCorso(Corso corsoCorrente){
		return studentiIscrittiCorso;
	}
	
	public List<Corso> getCorsi() {
		return corsi;
		}	
		
		
	public Studente getStudente(int matricola){		
		for(Studente s : studenti){
			if (s.matricola == matricola){
				return s;
			}
		}
		return null;
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


