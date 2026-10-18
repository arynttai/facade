package com.company;

public class AdmissionFacade {
    private final DocumentChecker documentChecker = new DocumentChecker();
    private final UntScoreChecker untScoreChecker = new UntScoreChecker();
    private final GrantOffice grantOffice = new GrantOffice();
    private final AdmissionOffice admissionOffice = new AdmissionOffice();

    public void applyToUniversity(Applicant applicant, String major) {
        System.out.println(applicant.getName() + " applies for " + major + "...");
        try {
            documentChecker.checkDocuments(applicant);
            untScoreChecker.checkScore(applicant);
            grantOffice.giveGrant(applicant, major);
            admissionOffice.enroll(applicant, major);
        } catch (IllegalStateException exception) {
            System.out.println("Not accepted: " + exception.getMessage());
        }
    }
}
