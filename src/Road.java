public class Road extends Barrier {
    private int length;

    public Road(String name, int length) {
        super(name);

        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    protected boolean moving(Actions actions) {
        //System.out.println("Дорога " + super.getName() + " длинной: " + this.length);
        System.out.println(super.getName() + " м " + this.length);
        actions.run();

        if (getLength() <= actions.getRunDistance()) {
            System.out.println("успешно пробежал");

            return true;
        } else {
            System.out.println("плохо пробежал");

            return false;
        }
    }
}