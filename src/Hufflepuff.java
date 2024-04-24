class Hufflepuff {
    int diligence;
    int loyalty;
    int honesty;

    public Hufflepuff(int diligence, int loyalty, int honesty) {
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public void compareStudents(Student student1, Student student2) {
        int score1 = student1.magicPower + student1.transgressionDistance + diligence + loyalty + honesty;
        int score2 = student2.magicPower + student2.transgressionDistance + diligence + loyalty + honesty;

        if (score1 > score2)
            System.out.println(student1.name + " is a better Hufflepuff student than " + student2.name);
        else if (score1 < score2)
            System.out.println(student2.name + " is a better Hufflepuff student than " + student1.name);
        else
            System.out.println("Both Hufflepuff students have the same score.");
    }
}