package org.example;

public class Main {
    public static void main(String[] args) {
        Student anna = new Student(1, "Anna", "Milchstraße 4", 3);
        Student nils = new Student(2, "Nils", "Milchstraße 9", 3);
        Student mike = new Student(2, "Mike", "Schokoweg 3", 5);
        Teacher niedermayer = new Teacher(1, "Niedermayer", "Deutsch");
        Course english = Course.builder()
                .id(2)
                .name("English")
                .teacher(niedermayer)
                .build();

        Teacher mayer = niedermayer.withName("Mayer");

        Course deutsch = new Course(1, "Deutsch", mayer);
        deutsch.getStudents().add(anna);
        deutsch.getStudents().add(nils);
        deutsch.getStudents().add(mike);

        english.getStudents().add(anna);

        System.out.println(deutsch);
        System.out.println(english);
    }
}