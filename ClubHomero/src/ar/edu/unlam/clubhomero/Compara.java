package ar.edu.unlam.clubhomero;

import java.util.Comparator;

public class Compara implements Comparator<Cliente> {

	@Override
	public int compare(Cliente cliente, Cliente otroCliente) {
		// TODO Auto-generated method stub
		return cliente.getEdad().compareTo(otroCliente.getEdad());
	}

}
