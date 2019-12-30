package command;
/**
 * @todo
 * @author 成明俊
 * @email 1047914020@qq.com
 * @date 2019年11月28日
 */
//目标接口1
interface TwoWayAdaptee{
	public void specifiRequest();
}

//目标接口2
interface TwoWayTarget{
	public void request();
}

//适配者实现
class AdapteeRealize implements TwoWayAdaptee{
	public void specifiRequest() {
		System.out.println("适配者实现");
	}
}

//目标实现
class TargetRealize implements TwoWayTarget{
	public void request() {
		System.out.println("目标实现");
	}
}

//双向适配器
class TwoWayAdapter{
	private TwoWayAdaptee adaptee;
	private TwoWayTarget target;
	public TwoWayAdapter(TwoWayAdaptee adaptee) {
		this.adaptee=adaptee;
	}
	public TwoWayAdapter(TwoWayTarget target) {
		this.target=target;
	}
	public void request() {
		adaptee.specifiRequest();
	}
	public void specifiRequest(){
		target.request();
	}
}

//客户端
public class TwoWayAdapterTest{
	public static void main(String[] args) {
		TwoWayAdaptee aptee = new AdapteeRealize();
		TwoWayAdapter Adapter = new TwoWayAdapter(aptee);
		Adapter.request();
	}
}