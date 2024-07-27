public class Student {

    Course c1;
    Course c2;
    Course c3;

    String name;
    String stuNo;
    String classes;
    int examNote;
    int verbalNote;
    int average;
    boolean isPass;


    Student(String name, String stuNo, Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0;
        this.isPass = false;
    }

    //Sınav ve sözlü notu hesaplama
    public int calculateClassNote(int examNote, int verbalNote){
        this.examNote = examNote;
        this.verbalNote = verbalNote;
        this.c1.note = (int) ((this.examNote * 0.80) + (this.verbalNote * 0.20));

        return this.c1.note;
    }

    void addBulkExamNote(int note1, int note2, int note3){

        if (note1 >= 0 && note1<=100){
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2<=100){
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3<=100){
            this.c3.note = note3;
        }
    }

    void isPass(){
        System.out.println("============================================");
        this.average = (int)((this.c1.note + this.c2.note + this.c3.note) / 3.0);
        if(average > 55){
            System.out.println("GÜM GÜM GÜM Hababam, GÜM GÜM GÜM Hababam !");
            isPass = true;
        } else {
            System.out.println("Hababam sınıfı sınıfta kaldı !");
            isPass = false;
        }

        printNote();
    }

    void printNote(){
        System.out.println(this.c1.name + " notu:" + this.c1.note);
        System.out.println(this.c2.name + " notu:" + this.c2.note);
        System.out.println(this.c3.name + " notu:" + this.c3.note);
        System.out.println("Ortalamanız: " + this.average);
        System.out.println("==================");
    }

}































