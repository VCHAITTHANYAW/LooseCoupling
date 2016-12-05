package org;

public class TransportImpl {
	private Transport transport;

	public Transport getTransport() {
		return transport;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}
	public void send()
	{
		transport.sendmail();
	}

}
