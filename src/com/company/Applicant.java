package com.company;

public class Applicant {
    private final String name;
    private final int untScore;
    private final boolean hasSchoolCertificate;

    public Applicant(String name, int untScore, boolean hasSchoolCertificate) {
        this.name = name;
        this.untScore = untScore;
        this.hasSchoolCertificate = hasSchoolCertificate;
    }

    public String getName() {
        return name;
    }

    public int getUntScore() {
        return untScore;
    }

    public boolean hasSchoolCertificate() {
        return hasSchoolCertificate;
    }
}
