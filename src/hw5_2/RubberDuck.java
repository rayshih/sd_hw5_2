package hw5_2;
import hw5_2.fly_strategy.*;
import hw5_2.quack_strategy.*;

public class RubberDuck extends Duck {
	public RubberDuck(){
		this.setFlyStrategy( new FlyWithWingStrategy());
		this.setQuackStrategy( new SilentStrategy());
	}

	public void display(){
		System.out.println("RubberDuck");
	}
}
