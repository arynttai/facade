package com.company;

public class Main {
    public static void main(String[] args) {
        Applicant tomiris = new Applicant("Tomiris", 112, true);
        Applicant aisha = new Applicant("Aisha", 98, false);
        Applicant dayana = new Applicant("Dayana", 60, true);
        Applicant alikhan = new Applicant("Alikhan", 105, true);
        Applicant darkhan = new Applicant("Darkhan", 120, true);

        AdmissionFacade admissionFacade = new AdmissionFacade();
        admissionFacade.applyToUniversity(tomiris, "Software Engineering");
        admissionFacade.applyToUniversity(aisha, "Computer Science");
        admissionFacade.applyToUniversity(dayana, "Computer Science");
        admissionFacade.applyToUniversity(alikhan, "Software Engineering");
        admissionFacade.applyToUniversity(darkhan, "Computer Science");
    }
}
