package criptografia;

public interface Criptografia  extends java.rmi.Remote{

	public String criptografar(String value) throws java.rmi.RemoteException;
	public String descriptografar(String value) throws java.rmi.RemoteException;
}
