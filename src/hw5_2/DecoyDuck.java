package hw5_2;
import hw5_2.fly_strategy.*;
import hw5_2.quack_strategy.*;

public class DecoyDuck extends Duck {
	public DecoyDuck(){
		this.setFlyStrategy( new NoFlyStrategy());
		this.setQuackStrategy( new SilentStrategy());
	}

	public void display(){
		System.out.println("DecoyDuck");
	}
}
