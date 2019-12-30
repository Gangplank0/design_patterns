package command;
/**
 * @todo
 * @author 成明俊
 * @email 1047914020@qq.com
 * @date 2019年11月29日
 */
public class BridgeTest {
	public static void main(String[] args) {
		Implementor imple = new ConcreteImplementorA();
		Abstraction abs = new RefinedAbstraction(imple);
		abs.Operation();
	}

}

//实现化角色
interface Implementor{
	public void OperationImp();
}

//具体实现化角色A
class ConcreteImplementorA implements Implementor{
	public void OperationImp() {
		System.out.println("具体实现化角色A");
	}
}

//抽象化角色
abstract class Abstraction{
	protected Implementor imple;
	protected Abstraction(Implementor imple)
	   {
	       this.imple=imple;
	   }
	public abstract void Operation();
}

//扩展抽象化角色
class RefinedAbstraction extends Abstraction{
	protected RefinedAbstraction(Implementor imple) {
		super(imple);
	}

	public void Operation() {
		imple.OperationImp();
		System.out.println("扩展抽象化角色");
	}
	
}
