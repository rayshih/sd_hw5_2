package hw5_2;
import hw5_2.fly_strategy.*;
import hw5_2.quack_strategy.*;

public class RedDuck extends Duck {
	public RedDuck(){
		this.setFlyStrategy( new FlyWithWingStrategy());
		this.setQuackStrategy( new SqueakStrategy());
	}
}
