
public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "555");
        Teacher t2 = new Teacher("Graham Bell", "FZK", "0206");
        Teacher t3 = new Teacher("Külyutmaz", "BIO", "5465");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji", "101", "BIO");
        biyo.addTeacher(t3);


        Student s1 = new Student("Kemal Sunal", "123", tarih, fizik, biyo);
        s1.addBulkExamNote(25, s1.calculateClassNote(20, 30), 65);
        s1.isPass();

        Student s2 = new Student("Halit Akçatepe", "123", tarih, fizik, biyo);
        s2.addBulkExamNote(100, s2.calculateClassNote(90, 90), 65);
        s2.isPass();

    }
}