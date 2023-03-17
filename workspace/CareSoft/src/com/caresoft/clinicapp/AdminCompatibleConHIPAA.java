package com.caresoft.clinicapp;

import java.util.ArrayList;

public interface AdminCompatibleConHIPAA {
abstract ArrayList<String> reportSecurityIncidents();
    
    // MÉTODOS IMPLEMENTADOS POR DEFECTO
    // Se utiliza para imprimir incidentes de seguridad 
    public default void printSecurityIncidents() {
        System.out.println(reportSecurityIncidents());
    }
    
    // Prueba de QA, PASS/FAIL de los informes contra los resultados esperados de QA
    public default boolean adminQATest(ArrayList<String> expectedIncidents) {
        if (reportSecurityIncidents().equals(expectedIncidents)) {
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
        }
        return reportSecurityIncidents().equals(expectedIncidents);
    }
}
