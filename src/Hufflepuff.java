class Hufflepuff extends Student {
    int diligence;
    int loyalty;
    int honesty;

    public Hufflepuff(String name, int magicPower, int transgressionDistance, int diligence, int loyalty, int honesty) {
        super(name, magicPower, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public void compareStudents(Hufflepuff student1, Hufflepuff student2) {
        int score1 = student1.magicPower + student1.transgressionDistance +
                student1.diligence + student1.loyalty + student1.honesty;
        int score2 = student2.magicPower + student2.transgressionDistance +
                student2.diligence + student2.loyalty + student2.honesty;

        if (score1 > score2)
            System.out.println(student1.name + " is a better Hufflepuff student than " + student2.name);
        else if (score1 < score2)
            System.out.println(student2.name + " is a better Hufflepuff student than " + student1.name);
        else
            System.out.println("Both Hufflepuff students have the same score.");
    }
}