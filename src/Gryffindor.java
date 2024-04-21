class Gryffindor extends Student {
    int nobility;
    int honor;
    int bravery;

    public Gryffindor(String name, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public void compareStudents(Gryffindor student1, Gryffindor student2) {
        int score1 = student1.nobility + student1.honor + student1.bravery;
        int score2 = student2.nobility + student2.honor + student2.bravery;

        if (score1 > score2)
            System.out.println(student1.name + " is a better Gryffindor student than " + student2.name);
        else if (score1 < score2)
            System.out.println(student2.name + " is a better Gryffindor student than " + student1.name);
        else
            System.out.println("Both Gryffindor students have the same score.");
    }
}