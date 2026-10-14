package my.gov.imi.niise_demomaz;

import org.springframework.stereotype.Component;

@Component
public class Grades {

    // A simple method that prints when called by the Student class
    public void getGrades() {
        System.out.println("Paparkan Pencapaian Setiap Pelajar: Math: A, Science: B, English: A");
    }
}

