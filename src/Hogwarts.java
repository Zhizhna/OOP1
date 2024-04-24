public class Hogwarts {
    public static void main(String[] args) {
        Student harryPotter = new Student("Harry Potter", 90, 50);
        Student hermioneGranger = new Student("Hermione Granger", 95, 55);
        Student ronWeasley = new Student("Ron Weasley", 85, 45);
        Student dracoMalfoy = new Student("Draco Malfoy", 80, 60);
        Student grahamMontague = new Student("Graham Montague", 75, 65);
        Student gregoryGoyle = new Student("Gregory Goyle", 70, 70);
        Student zachariasSmith = new Student("Zacharias Smith", 85, 50);
        Student cedricDiggory = new Student("Cedric Diggory", 90, 55);
        Student justinFinchFletchley = new Student("Justin Finch-Fletchley", 80, 60);
        Student choChang = new Student("Cho Chang", 95, 65);
        Student padmaPatil = new Student("Padma Patil", 85, 70);
        Student marcusBelby = new Student("Marcus Belby", 90, 75);

        Gryffindor gryffindor = new Gryffindor(90, 85, 95);
        Slytherin slytherin = new Slytherin(85, 90, 95);
        Hufflepuff hufflepuff = new Hufflepuff(85, 90, 95);
        Ravenclaw ravenclaw = new Ravenclaw(95, 90, 95, 90);

        System.out.println("Description of Harry Potter:");
        harryPotter.displayDescription();
        System.out.println();

        System.out.println("Comparison of Gryffindor Students:");
    }

    public void compareMagicAndTransgression(Student student1, Student student2) {
        int score1 = student1.magicPower + student1.transgressionDistance;
        int score2 = student2.magicPower + student2.transgressionDistance;

        if (score1 > score2)
            System.out.println(student1.name + " has stronger magic and transgression skills compared to " + student2.name);
        else if (score1 < score2)
            System.out.println(student2.name + " has stronger magic and transgression skills compared to " + student1.name);
        else System.out.println("Both students have the same magic and transgression skills.");
    }
}