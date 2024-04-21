class Ravenclaw extends Student {
    int intelligence;
    int wisdom;
    int wit;
    int creativity;

    public Ravenclaw(String name, int magicPower, int transgressionDistance, int intelligence, int wisdom, int wit, int creativity) {
        super(name, magicPower, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public void compareStudents(Ravenclaw student1, Ravenclaw student2) {
        int score1 = student1.magicPower + student1.transgressionDistance +
                student1.intelligence + student1.wisdom + student1.wit + student1.creativity;
        int score2 = student2.magicPower + student2.transgressionDistance +
                student2.intelligence + student2.wisdom + student2.wit + student2.creativity;

        if (score1 > score2)
            System.out.println(student1.name + " is a better Ravenclaw student than " + student2.name);
        else if (score1 < score2)
            System.out.println(student2.name + " is a better Ravenclaw student than " + student1.name);
        else
            System.out.println("Both Ravenclaw students have the same score.");
    }
}