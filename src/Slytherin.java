class Slytherin extends Student {
    int cunning;
    int determination;
    int ambition;

    public Slytherin(String name, int magicPower, int transgressionDistance, int cunning, int determination, int ambition) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
    }

    public void compareStudents(Slytherin student1, Slytherin student2) {
        int score1 = student1.magicPower + student1.transgressionDistance +
                student1.cunning + student1.determination + student1.ambition;
        int score2 = student2.magicPower + student2.transgressionDistance +
                student2.cunning + student2.determination + student2.ambition;

        if (score1 > score2)
            System.out.println(student1.name + " is a better Slytherin student than " + student2.name);
        else if (score1 < score2)
            System.out.println(student2.name + " is a better Slytherin student than " + student1.name);
        else
            System.out.println("Both Slytherin students have the same score.");
    }
}