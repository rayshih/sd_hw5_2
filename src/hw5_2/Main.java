package hw5_2;
import hw5_2.fly_strategy.*;

public class Main {
	public static void main(String[] args){
		Duck mallardDuck = new MallardDuck();
		Duck redDuck = new RedDuck();

		mallardDuck.display();
		mallardDuck.swim();
		mallardDuck.fly();
		mallardDuck.quack();

		redDuck.display();
		redDuck.swim();
		redDuck.fly();
		redDuck.quack();

		System.out.println("RedDuck after change fly strategy");
		redDuck.display();
		redDuck.setFlyStrategy( new NoFlyStrategy());
		redDuck.swim();
		redDuck.fly();
		redDuck.quack();
	}
}
