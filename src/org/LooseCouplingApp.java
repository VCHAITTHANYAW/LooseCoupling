package org;

public class LooseCouplingApp {
public static void main(String[] args) {
	TransportImpl impl=new TransportImpl();
	impl.setTransport(new Ftp());
	impl.send();
}
}
