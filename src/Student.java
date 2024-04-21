class Student {
    String name;
    int magicPower;
    int transgressionDistance;

    public Student(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public void displayDescription() {
        System.out.println("Name: " + name);
        System.out.println("Magic Power: " + magicPower);
        System.out.println("Transgression Distance: " + transgressionDistance);
    }
}