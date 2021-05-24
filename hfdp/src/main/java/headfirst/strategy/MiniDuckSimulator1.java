package headfirst.strategy;

public class MiniDuckSimulator1 {

    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
		System.out.print("Mallard Duck quack: \t");
		mallard.performQuack();
		System.out.print("Mallard Duck fly: \t");
		mallard.performFly();

        Duck model = new RedHeadDuck();
		System.out.print("RedHead Duck fly: \t");
		model.performFly();

		System.out.print("RedHead Duck fly after boost: \t");
		model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

    }
}
