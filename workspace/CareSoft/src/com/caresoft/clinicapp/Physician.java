package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends Usuario implements UsuarioCompatibleConHIPAA{	

	// Dentro de la clase:
    private ArrayList<String> patientNotes;
	
    // PARA HACER: Constructor que tome un ID
    public Physician(Integer id) {
		super(id);
	}
    
    // PARA HACER: ¡Implementar UsuarioCompatibleConHIPAA!
    private int digitos(int numero) {
    	int digitos = 0;
    	while(numero>0) {
    		numero/=10;
    		digitos++;    		
    	}
    	return digitos;
    }
    public boolean assignPin(int pin) {
    	if(digitos(pin)==4) {
    		this.pin = pin;
    		return true;
    	}
    	else {
    		return false;     		
    	}   	
    }
    
    public boolean accessAuthorized(Integer confirmedAuthID) {
    	if(confirmedAuthID.equals(this.id)) {
    		return true;
    	}else {
    		return false;   
    	}    	 	
    }
	
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Fecha y hora de envío: %s \n", date);
        report += String.format("Reportado por ID: %s\n", this.id);
        report += String.format("Nombre del paciente: %s\n", patientName);
        report += String.format("Notas: %s \n", notes);
        this.patientNotes.add(report);
    }
	
    // PARA HACER: Setters y Getters
    public ArrayList<String> getPatientNotes() {
		return patientNotes;
	}

	public void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}
}
