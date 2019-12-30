package command;
/**
 * @todo
 * @author 成明俊
 * @email 1047914020@qq.com
 * @date 2019年12月3日
 */
public class DecoratorPattern {
	public static void main(String[] args) {
		Componnet componnet = new ConcreteComponent();
		componnet.operation();
		System.out.println("---------------------------------");
		Componnet componnet1 =new ConcreteDecorator(componnet);
		componnet1.operation();
	}
}
//抽象构建
interface Componnet{
	public void operation();
}

//具体构件
class ConcreteComponent implements Componnet{
    public ConcreteComponent()
    {
        System.out.println("创建具体构件角色");       
    }  
	public void operation() {
		System.out.println("具体构建方法");
	}
}

//抽象装饰
class Decorator implements Componnet{
	private Componnet componnet;
	public Decorator(Componnet componnet) {
		this.componnet=componnet;
	}
	public void operation() {
		componnet.operation();
	}
}

//具体装饰
class ConcreteDecorator extends Decorator{
	public ConcreteDecorator(Componnet componnet) {
		super(componnet);
	}
	public void operation() {
		super.operation();
		addedFunction();
	}
	public void addedFunction() {
		System.out.println("为具体构件角色增加额外的功能addedFunction()"); 
	}
}