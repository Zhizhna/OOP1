class Slytherin {
    int cunning;
    int determination;
    int ambition;

    public Slytherin(int cunning, int determination, int ambition) {
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
    }

    public void compareStudents(Student student1, Student student2) {
        int score1 = student1.magicPower + student1.transgressionDistance + cunning + determination + ambition;
        int score2 = student2.magicPower + student2.transgressionDistance + cunning + determination + ambition;

        if (score1 > score2)
            System.out.println(student1.name + " is a better Slytherin student than " + student2.name);
        else if (score1 < score2)
            System.out.println(student2.name + " is a better Slytherin student than " + student1.name);
        else
            System.out.println("Both Slytherin students have the same score.");
    }
}