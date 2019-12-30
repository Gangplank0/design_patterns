package command;
/**
 * @todo
 * @author 成明俊
 * @email 1047914020@qq.com
 * @date 2019年11月28日
 */
class ObjectAdapter implements Target{
	private Adaptee adaptee;
	public ObjectAdapter(Adaptee adaptee) {
		this.adaptee=adaptee;
	}
	public void request() {
		adaptee.sepecificRequest();
	}
}

public class ObjectAdapterTest {
	 public static void main(String[] args)
	    {
	        System.out.println("对象适配器模式测试：");
	        Adaptee adaptee = new Adaptee();
	        Target target = new ObjectAdapter(adaptee);
	        target.request();
	    }

}
