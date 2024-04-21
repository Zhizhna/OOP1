public class Hogwarts {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Harry Potter", 90, 50, 90, 85, 95);
        Gryffindor hermioneGranger = new Gryffindor("Hermione Granger", 95, 55, 95, 90, 95);
        Gryffindor ronWeasley = new Gryffindor("Ron Weasley", 85, 45, 85, 80, 90);
        Slytherin dracoMalfoy = new Slytherin("Draco Malfoy", 80, 60, 85, 90, 95);
        Slytherin grahamMontague = new Slytherin("Graham Montague", 75, 65, 80, 85, 90);
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle", 70, 70, 75, 80, 85);
        Hufflepuff zachariasSmith = new Hufflepuff("Zacharias Smith", 85, 50, 80, 85, 90);
        Hufflepuff cedricDiggory = new Hufflepuff("Cedric Diggory", 90, 55, 85, 90, 95);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Justin Finch-Fletchley", 80, 60, 75, 80, 85);
        Ravenclaw choChang = new Ravenclaw("Cho Chang", 95, 65, 95, 90, 95, 90);
        Ravenclaw padmaPatil = new Ravenclaw("Padma Patil", 85, 70, 90, 85, 90, 85);
        Ravenclaw marcusBelby = new Ravenclaw("Marcus Belby", 90, 75, 90, 85, 90, 85);

        System.out.println("Description of Harry Potter:");
        harryPotter.displayDescription();
        System.out.println();

        System.out.println("Comparison of Gryffindor Students:");
        harryPotter.compareStudents(hermioneGranger, ronWeasley);
        System.out.println();

        System.out.println("Comparison of Slytherin Students:");
        dracoMalfoy.compareStudents(grahamMontague, gregoryGoyle);
        System.out.println();

        System.out.println("Comparison of Hufflepuff Students:");
        zachariasSmith.compareStudents(cedricDiggory, justinFinchFletchley);
        System.out.println();

        System.out.println("Comparison of Ravenclaw Students:");
        choChang.compareStudents(padmaPatil, marcusBelby);
        System.out.println();
    }
}