package com.company;

import java.util.HashMap;
import java.util.Map;

public class GrantOffice {
    private final Map<String, Integer> freeGrants = new HashMap<>();

    public GrantOffice() {
        freeGrants.put("Software Engineering", 1);
        freeGrants.put("Computer Science", 2);
    }

    public void giveGrant(Applicant applicant, String major) {
        if (!freeGrants.containsKey(major)) {
            throw new IllegalStateException("There is no major called " + major);
        }
        int grantsLeft = freeGrants.get(major);
        if (grantsLeft == 0) {
            throw new IllegalStateException("No free grants left for " + major);
        }
        freeGrants.put(major, grantsLeft - 1);
        System.out.println("3) " + applicant.getName() + " gets a grant for " + major);
    }
}
