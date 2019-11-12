package command;
/**
 * @todo
 * @author ������
 * @email 1047914020@qq.com
 * @date 2019��10��31��
 */
public class CommandPattern
{
    public static void main(String[] args)
    {
        Command cmd=new ConcreteCommand();
        Invoker ir=new Invoker(cmd);
        System.out.println("�ͻ����ʵ����ߵ�call()����...");
        ir.call();
    }
}
//������
class Invoker
{
    private Command command;
    public Invoker(Command command)
    {
        this.command=command;
    }
    public void setCommand(Command command)
    {
        this.command=command;
    }
    public void call()
    {
        System.out.println("������ִ������command...");
        command.execute();
    }
}
//��������
interface Command
{
    public abstract void execute();
}
//��������
class ConcreteCommand implements Command
{
    private Receiver receiver;
    ConcreteCommand()
    {
        receiver=new Receiver();
    }
    public void execute()
    {
        receiver.action();
    }
}
//������
class Receiver
{
    public void action()
    {
        System.out.println("�����ߵ�action()����������...");
    }
}