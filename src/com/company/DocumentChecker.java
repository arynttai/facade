package com.company;

public class DocumentChecker {
    public void checkDocuments(Applicant applicant) {
        if (!applicant.hasSchoolCertificate()) {
            throw new IllegalStateException(applicant.getName() + " didn't bring the school certificate");
        }
        System.out.println("1) Documents are OK");
    }
}
