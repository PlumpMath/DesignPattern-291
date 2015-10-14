package proxy.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Created with IntelliJ IDEA.
 * User: icejoywoo
 * Date: 14-3-11
 * Time: 下午8:50
 * To change this template use File | Settings | File Templates.
 */
public class MyRemoteClient {
    public static void main(String[] args) {
        try {
            MyRemote remote = (MyRemote) Naming.lookup("rmi://127.0.0.1:1099/remote");
            System.out.println(remote.sayHello());
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
