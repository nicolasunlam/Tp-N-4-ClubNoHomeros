package ar.edu.unlam.clubhomero;

import java.util.Set;

public class Bar {

	private Set<Cliente> listaDeClientes;
	private Boolean abrir;
	private Bar bar;

	public Boolean abrir(Boolean abrir) {
		this.abrir = abrir;
		return abrir;

	}

	public Boolean getAbrir() {
		return abrir;
	}

	public void setAbrir(Boolean abrir) {
		this.abrir = abrir;
	}

	public Set<Cliente> getListaDeClientes() {
		return listaDeClientes;
	}

	public void setListaDeClientes(Set<Cliente> listaDeClientes) {
		this.listaDeClientes = listaDeClientes;
	}

	public Bar getBar() {
		return bar;
	}

	public void setBar(Bar bar) {
		this.bar = bar;
	}

	public void checkName(Set<Cliente> listaDeClientes) {
		this.listaDeClientes = listaDeClientes;
		if (listaDeClientes.size() == 2)
			try {
				throw new Exception("No puede haber clientes con el mismo nombre");
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}

	}

}
