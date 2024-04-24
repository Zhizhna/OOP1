class Ravenclaw {
    int intelligence;
    int wisdom;
    int wit;
    int creativity;

    public Ravenclaw(int intelligence, int wisdom, int wit, int creativity) {
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public void compareStudents(Student student1, Student student2) {
        int score1 = student1.magicPower + student1.transgressionDistance + intelligence + wisdom + wit + creativity;
        int score2 = student2.magicPower + student2.transgressionDistance + intelligence + wisdom + wit + creativity;

        if (score1 > score2)
            System.out.println(student1.name + " is a better Ravenclaw student than " + student2.name);
        else if (score1 < score2)
            System.out.println(student2.name + " is a better Ravenclaw student than " + student1.name);
        else
            System.out.println("Both Ravenclaw students have the same score.");
    }
}