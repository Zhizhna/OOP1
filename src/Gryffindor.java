class Gryffindor {
    int nobility;
    int honor;
    int bravery;

    public Gryffindor(int nobility, int honor, int bravery) {
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public void compareStudents(Student student1, Student student2) {
        int score1 = student1.magicPower + student1.transgressionDistance + nobility + honor + bravery;
        int score2 = student2.magicPower + student2.transgressionDistance + nobility + honor + bravery;

        if (score1 > score2)
            System.out.println(student1.name + " is a better Gryffindor student than " + student2.name);
        else if (score1 < score2)
            System.out.println(student2.name + " is a better Gryffindor student than " + student1.name);
        else
            System.out.println("Both Gryffindor students have the same score.");
    }
}