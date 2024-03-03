public class Inky {
    String pinky;

    public Inky() {
        String pinky = "donky";
        this.pinky = pinky;
        System.out.println("pinky " + pinky);
    }

    public Inky(String pinky, String blinky, String rinky) {
        System.out.println("01. " + pinky + " " + blinky);
        System.out.println("02. " + pinky + " " + rinky);
        System.out.println("03. " + pinky + " " + blinky + " " + rinky);
    }

    public static void main(String[] args) {
        Inky ponky = new Inky();
        String blinky = "pinky";
        String rinky = "monky";
        Inky ponky2 = new Inky("donkey", blinky, rinky);
    }
}

    

