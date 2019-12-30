package command;
/**
 * @todo
 * @author 成明俊
 * @email 1047914020@qq.com
 * @date 2019年11月28日
 */
//目标接口
interface Target{
	public void request();
}

//适配者接口
class Adaptee{
	public void sepecificRequest() {
		System.out.println("适配者中的业务代码被调用！");
	}
}

//类适配器类
class ClassAdapter extends Adaptee implements Target{
	public void request() {
		sepecificRequest();
	}
}

//客户端代码
public class ClassAdapterTest {
	public static void main(String[] args) {
		System.out.println("类适配器模式测试");
		Target target = new ClassAdapter();
		target.request();
	}

}
