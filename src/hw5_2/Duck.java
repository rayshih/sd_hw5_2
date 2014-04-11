package hw5_2;
import hw5_2.fly_strategy.FlyStrategy;
import hw5_2.quack_strategy.QuackStrategy;

public abstract class Duck {
	private FlyStrategy flyStrategy;
	private QuackStrategy quackStrategy;

	public void setFlyStrategy(FlyStrategy flyStrategy){
		this.flyStrategy = flyStrategy;
	}

	public void setQuackStrategy(QuackStrategy quackStrategy){
		this.quackStrategy = quackStrategy;
	}

	public void swim(){
		System.out.println("The same swim");
	}

	public void fly(){
		this.flyStrategy.fly();
	}

	public void quack(){
		this.quackStrategy.quack();
	}
}

