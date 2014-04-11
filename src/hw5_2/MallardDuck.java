package hw5_2;
import hw5_2.fly_strategy.*;
import hw5_2.quack_strategy.*;

public class MallardDuck extends Duck {
	public MallardDuck(){
		this.setFlyStrategy( new FlyWithWingStrategy());
		this.setQuackStrategy( new DefaultStrategy());
	}
}
