import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Actions[] actions = new Actions[3];

        int distance = rand.nextInt(20);
        int heigth = rand.nextInt(2);
        actions[0] = new Human("Anton", distance, heigth);

        distance = rand.nextInt(33);
        heigth = rand.nextInt(4);
        actions[1] = new Robot("Robokop", distance, heigth);

        distance = rand.nextInt(15);
        heigth = rand.nextInt(1);
        actions[2] = new Cat("Myra", distance, heigth);

        Barrier[] barriers = new Barrier[5];

        boolean isRoad;
        for (int i = 0; i < barriers.length; i++) {
            distance = rand.nextInt(10);
            isRoad = rand.nextBoolean();
            if (isRoad) {
                barriers[i] = new Road("Дорога " + i, distance);
            } else {
                barriers[i] = new Wall("Стена " + i, distance);
            }
        }

        for (int i = 0; i < actions.length; i++) {
            boolean result = true;
            for (int j = 0; j < barriers.length; j++) {

                result = barriers[j].moving(actions[i]);

                if (!result) {
                    break;
                }
            }

            if (result) {
                System.out.println("Успешно");
            } else {
                System.out.println("Плохо");
            }
        }
    }
}


