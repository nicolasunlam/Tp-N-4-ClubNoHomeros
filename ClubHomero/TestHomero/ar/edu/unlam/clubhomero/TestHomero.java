package ar.edu.unlam.clubhomero;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import org.junit.Assert;
import org.junit.Test;

public class TestHomero {

	@Test

	public void testQueSeAbraElBarSinClientes() {

		Bar bar = new Bar();

		bar.setAbrir(true);
		Boolean abrir = bar.getAbrir();

		Assert.assertTrue(abrir);

		SortedSet<Cliente> listaDeClientes = new TreeSet<Cliente>();
		bar.setListaDeClientes(listaDeClientes);

		Assert.assertTrue(bar.getListaDeClientes().size() == 0);

	}

	@Test

	public void testQueLosClientesSePresentenOrdenadosAlfabeticamente() {

		Bar bar = new Bar();

		bar.setAbrir(true);
		Boolean abrir = bar.getAbrir();
		Assert.assertTrue(abrir);

		Set<Cliente> listaDeClientes = new TreeSet<Cliente>();

		Cliente c1 = new Cliente("Blas", 30);
		listaDeClientes.add(c1);

		Cliente c2 = new Cliente("Carlos", 21);
		listaDeClientes.add(c2);

		Cliente c3 = new Cliente("Alejandro", 25);
		listaDeClientes.add(c3);

		bar.setListaDeClientes(listaDeClientes);
		Set<Cliente> clientes = (TreeSet<Cliente>) bar.getListaDeClientes();

		Assert.assertTrue(((SortedSet<Cliente>) clientes).first().getNombre().equals("Alejandro"));
		Assert.assertTrue(((SortedSet<Cliente>) clientes).last().getNombre().equals("Carlos"));

		System.out.println(bar.getListaDeClientes());

	}

	@Test

	public void testQueNoIngresenClientesConElMismoNombre() {

		Bar bar = new Bar();

		bar.abrir(true);
		Boolean abrir = bar.getAbrir();
		Assert.assertTrue(abrir);

		Set<Cliente> listaDeClientes = new TreeSet<Cliente>();

		Cliente c1 = new Cliente("Blas", 30);
		listaDeClientes.add(c1);

		Cliente c2 = new Cliente("Blas", 30);
		listaDeClientes.add(c2);

		Cliente c3 = new Cliente("Alejandro", 25);
		listaDeClientes.add(c3);

		bar.setListaDeClientes(listaDeClientes);
		Set<Cliente> clientes = bar.getListaDeClientes();

		bar.checkName(clientes);

		// Assert.assertTrue(clientes.size() == 2);

	}

	@Test
	public void testQueSePresentenPorEdadEstandoDentroDelBarAbierto() {

		Compara Comparador = new Compara();

		Bar bar = new Bar();

		bar.abrir(true);

		Boolean abrir = bar.getAbrir();
		Assert.assertTrue(abrir);

		SortedSet<Cliente> listaDeClientes = new TreeSet<Cliente>(Comparador);

		Cliente c1 = new Cliente("Blas", 30);
		listaDeClientes.add(c1);

		Cliente c2 = new Cliente("Carlos", 21);
		listaDeClientes.add(c2);

		Cliente c3 = new Cliente("Alejandro", 25);
		listaDeClientes.add(c3);

		bar.setListaDeClientes(listaDeClientes);

		SortedSet<Cliente> clientes = (SortedSet<Cliente>) bar.getListaDeClientes();

		Assert.assertTrue(clientes.first().getEdad().equals(21));
		Assert.assertTrue(clientes.last().getEdad().equals(30));

		System.out.println(listaDeClientes);

	}

	@Test
	public void testQueLosClientesPuedanCompararseEstandoFueraDelBarPorEdadYporNombre() {

		Compara Comparador = new Compara();

		SortedSet<Cliente> listaDeClientes = new TreeSet<Cliente>(Comparador);

		Cliente c1 = new Cliente("Blas", 30);
		listaDeClientes.add(c1);

		Cliente c2 = new Cliente("Carlos", 21);
		listaDeClientes.add(c2);

		Cliente c3 = new Cliente("Alejandro", 25);
		listaDeClientes.add(c3);

		Assert.assertTrue(listaDeClientes.first().getEdad().equals(21));
		Assert.assertTrue(listaDeClientes.last().getEdad().equals(30));

		System.out.println(listaDeClientes);

		SortedSet<Cliente> listaDeClientes2 = new TreeSet<Cliente>();

		Cliente cl1 = new Cliente("Blas", 30);
		listaDeClientes2.add(cl1);

		Cliente cl2 = new Cliente("Carlos", 21);
		listaDeClientes2.add(cl2);

		Cliente cl3 = new Cliente("Alejandro", 25);
		listaDeClientes2.add(cl3);

		Assert.assertTrue(listaDeClientes2.first().getNombre().equals("Alejandro"));
		Assert.assertTrue(listaDeClientes2.last().getNombre().equals("Carlos"));

		System.out.println(listaDeClientes2);

	}

}
