package com.company;

public class UntScoreChecker {
    private static final int MAX_SCORE = 140;
    private static final int MIN_SCORE_FOR_GRANT = 70;

    public void checkScore(Applicant applicant) {
        int score = applicant.getUntScore();
        if (score < 0 || score > MAX_SCORE) {
            throw new IllegalStateException("UNT score must be from 0 to " + MAX_SCORE);
        }
        if (score < MIN_SCORE_FOR_GRANT) {
            throw new IllegalStateException("UNT score " + score + " is too low, you need at least " + MIN_SCORE_FOR_GRANT);
        }
        System.out.println("2) UNT score " + score + " is enough");
    }
}
