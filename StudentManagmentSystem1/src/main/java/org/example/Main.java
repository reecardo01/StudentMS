package org.example;

public class Main {

    public static void main(String[] args) {

        UndergraduateStudent undergraduateStudent =
                new UndergraduateStudent.Builder()
                        .setStudentId("U234678")
                        .setName("Rendani")
                        .setEmail("Rendani@example.com")
                        .setDepartment("Computer Science")
                        .setCreditHours(9)
                        .setScholarshipAmount(1000)
                        .build();

        GraduateStudent graduateStudent =
                new GraduateStudent.Builder()
                        .setStudentId("G457896")
                        .setName("Ricardo")
                        .setEmail("Ricardo@example.com")
                        .setDepartment("Data Science")
                        .setResearchAssistant(true)
                        .setStipend(5000)
                        .build();



        System.out.println(" Undergraduate Student ");
        undergraduateStudent.displayStudentDetails();

        System.out.println("\n============================\n");

        System.out.println(" Graduate Student ");
        graduateStudent.displayStudentDetails();
    }
}
