package it.polito.tdp.lab04.model;

import java.util.*;
import java.util.List;

import it.polito.tdp.lab04.DAO.CorsoDAO;
import it.polito.tdp.lab04.DAO.StudenteDAO;



public class Model {
	
	private List<Corso> corsi;
	private List<Studente> studenti;
	//private Studente studenteTrovato;

	
//	private Corso corsoCorrente = null;
	
	public Model(){
		CorsoDAO dao = new CorsoDAO();
		this.corsi = dao.getTuttiICorsi();
		StudenteDAO studDao = new StudenteDAO();
		this.studenti = studDao.getTuttiGliStudenti();
		
		
	}
////
//	public void selezionaCorso(Corso c){
//		this.corsoCorrente = c;
//		CorsoDAO dao = new CorsoDAO();
//
//	}	
	
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


