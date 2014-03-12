package proxy.rmi;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created with IntelliJ IDEA.
 * User: icejoywoo
 * Date: 14-3-11
 * Time: 下午8:45
 * 启动rmi注册服务 (要在可以找到当前类的目录下启动)
 *      rmiregistry
 * 编译stub和skeleton(现在没有skeleton了)
 *      rmic proxy.rmi.MyRemoteImpl
 * 会多生成一个*_stub.class的字节码文件, 客户端运行的时候需要
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    public MyRemoteImpl() throws RemoteException {}

    // 参数和返回值都必须是基本类型或者可以序列化 serializable
    @Override
    public String sayHello() throws RemoteException {
        return "Server say: Hi!";
    }

    public static void main(String[] args) {
        try {
            MyRemote remote = new MyRemoteImpl();
            Naming.rebind("remote", remote); // rebind or bind
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
