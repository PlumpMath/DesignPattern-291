package proxy.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created with IntelliJ IDEA.
 * User: icejoywoo
 * Date: 14-3-11
 * Time: 下午8:44
 * To change this template use File | Settings | File Templates.
 */
public interface MyRemote extends Remote {
    public String sayHello() throws RemoteException;
}
