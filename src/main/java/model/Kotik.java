package model;

public class Kotik {
    private String name;
    private int prettiness;
    private int weight;
    private String meow;
    private int satiety;
    private static int counter;

    {
        counter++;
    }

    public Kotik (String name, int prettiness, int weight, String meow, int satiety) {
        this.name=name;
        this.prettiness=prettiness;
        this.weight=weight;
        this.meow=meow;
        this.satiety=satiety;
    }

    public Kotik () {
    }

    //methods of behavior
    private boolean play() {
        satiety -= 8;
        System.out.println(name + " is playing");
        return true;
    }

    private boolean sleep() {
        satiety -= 3;
        System.out.println(name + " is sleeping");
        return true;
    }

    private boolean chaseMouse() {
        satiety -= 10;
        System.out.println(name + " is chasing the mouse");
        return true;
    }

    private boolean sharpenClaws() {
        satiety -= 6;
        System.out.println(name + " is sharpening its claws");
        return true;
    }

    private boolean meow() {
        satiety -= 4;
        System.out.println(name + " is meowing: '" + meow + "!'");
        return true;
    }

    private void eat (int satietyUnits) {
        satiety += satietyUnits;
        System.out.println(name + " has eaten");
    }

    private void eat (int satietyUnits, String foodName) {
        satiety += satietyUnits;
        System.out.println(name + " has eaten " + foodName);
    }

    private void eat () {
        int satietyUnits1 = 7;
        String foodName1 = "dry food";
        eat(satietyUnits1, foodName1);
    }

    public void liveAnotherDay() {

        for (int i = 1; i <= 24; i++) {
            if (satiety <= 0) {
                int feedingManner = (int)(Math.random()*3 + 1);
                switch (feedingManner) {
                    case 1:
                        eat(6, "fish");
                        break;
                    case 2:
                        eat();
                        break;
                    case 3:
                        eat(7);
                        break;
                }
            } else {
                int action = (int) (Math.random() * 5 + 1);
                switch (action) {
                    case 1:
                        play();
                        break;
                    case 2:
                        sleep();
                        break;
                    case 3:
                        chaseMouse();
                        break;
                    case 4:
                        sharpenClaws();
                        break;
                    case 5:
                        meow();
                        break;
                }
            }
        }
    }

    //getters and setters
    public String getName() {
        return name;
    }
    public int getPrettiness() {
        return prettiness;
    }
    public int getWeight() {
        return weight;
    }
    public String getMeow() {
        return meow;
    }
    public int getSatiety() {
        return satiety;
    }
    public static int getCounter() {
        return counter;
    }

    public void setKotik(String name, int prettiness, int weight, String meow, int satiety) {
        this.name = name;
        this.prettiness = prettiness;
        this.weight = weight;
        this.meow = meow;
        this.satiety = satiety;
    }



}
