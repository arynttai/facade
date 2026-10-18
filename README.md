# University Admission (Facade pattern)

This is my Assignment 4 for Software Design Patterns. I used the Facade pattern.

## Topic

When you apply to a university, a lot of things happen. They check your documents, check your UNT score, look for a free grant and then enroll you. A student doesn't want to go to four different offices. So there is one class that does all of it for them. This class is the facade.

## How it works

`Main` only talks to `AdmissionFacade`:

```java
admissionFacade.applyToUniversity(tomiris, "Software Engineering");
```

`AdmissionFacade` calls four classes in this order:

1. `DocumentChecker` checks the school certificate
2. `UntScoreChecker` checks the UNT score (you need at least 70)
3. `GrantOffice` gives a grant if there are free places
4. `AdmissionOffice` enrolls the student and gives a student ID

If one step fails, the facade stops and prints the reason.

These four classes don't know about the facade. They can also be used without it, for example you can call `UntScoreChecker` on its own.

## Classes

- Facade: `AdmissionFacade`
- Subsystem: `DocumentChecker`, `UntScoreChecker`, `GrantOffice`, `AdmissionOffice`
- Data: `Applicant`
- Client: `Main`

## Clean Code

1. Clear names. Names like `applyToUniversity` and `checkDocuments` show what the method does, so I didn't need comments.
2. One class, one job. Each subsystem class does only one thing. The facade doesn't check anything itself, it only calls the classes in the right order.
3. Hidden details. The fields in the facade are private. `Main` only sees `applyToUniversity()`.
4. Small classes. Each class has one public method and is easy to read.
5. Error handling. If a check fails, it throws an exception with a clear message. The facade catches it, so the program doesn't crash and you can see why the student wasn't accepted.
6. No magic numbers. 140 and 70 are saved as `MAX_SCORE` and `MIN_SCORE_FOR_GRANT`.

## Example

```
Tomiris applies for Software Engineering...
1) Documents are OK
2) UNT score 112 is enough
3) Tomiris gets a grant for Software Engineering
4) Tomiris is now a Software Engineering student. Student ID: 2026001
Aisha applies for Computer Science...
Not accepted: Aisha didn't bring the school certificate
```

## How to run

Open the project in IntelliJ IDEA and run `Main.java`.
