package it.polito.tdp.lab04.DAO;
import java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import it.polito.tdp.lab04.model.Corso;
import it.polito.tdp.lab04.model.Studente;

public class StudenteDAO {

	public List<Studente> getTuttiGliStudenti() {

		final String sql = "SELECT * FROM studente";
		List<Studente> studenti = new ArrayList<Studente>();


		try {
			Connection connect = ConnectDB.getConnection();
			PreparedStatement stat = connect.prepareStatement(sql);

			ResultSet res = stat.executeQuery();

			while (res.next()) {

				// Crea un nuovo JAVA Bean Studente
				// Aggiungi il nuovo Studente alla lista
				
				Studente s = new Studente(res.getInt("matricola"), res.getString("cognome"), res.getString("nome"), res.getString("CDS"));
				studenti.add(s);
			
			}
			stat.close();
			connect.close();
			return studenti;

		} catch (SQLException e) {
			// e.printStackTrace();
			throw new RuntimeException("Errore Db");
		}
	}


}
