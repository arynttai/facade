package com.company;

public class AdmissionOffice {
    private int nextStudentId = 2026001;

    public void enroll(Applicant applicant, String major) {
        System.out.println("4) " + applicant.getName() + " is now a " + major + " student. Student ID: " + nextStudentId);
        nextStudentId++;
    }
}
