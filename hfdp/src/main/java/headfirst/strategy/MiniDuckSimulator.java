package headfirst.strategy;

public class MiniDuckSimulator {

    public static void main(String[] args) {

        MallardDuck mallard = new MallardDuck();
        RubberDuck rubberDuckie = new RubberDuck();
        DecoyDuck decoy = new DecoyDuck();
        ModelDuck model = new ModelDuck();

        System.out.print("Mallard Duck Quack: \t");
        mallard.performQuack();

        System.out.print("Rubber Duck Quack: \t");
        rubberDuckie.performQuack();

        System.out.print("Decoy Duck Quack: \t");
        decoy.performQuack();

        System.out.print("Model Duck fly: \t");
        model.performFly();

        model.setFlyBehavior(new FlyRocketPowered());
        System.out.print("Model Duck fly after boost: \t");
        model.performFly();
    }
}
