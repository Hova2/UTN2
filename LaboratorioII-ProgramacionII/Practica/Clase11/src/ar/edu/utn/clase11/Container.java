package ar.edu.utn.clase11;

import java.util.ArrayList;

public class Container {

	private int _capacidad;
	private String _empresa;
	private ArrayList<Producto> _listaProducto;
	
	Container(int capacidad, String empresa){
		this._capacidad = capacidad;
		this._empresa = empresa;
		this._listaProducto = new ArrayList<>();
	}
	
	public static void mostrar(Container contenedor) {
		StringBuilder mContainer = new StringBuilder();
		int cont=1;
		
		mContainer.append("Capacidad: ").append(contenedor._capacidad).append("\n");
		mContainer.append("Empresa: ").append(contenedor._empresa).append("\n");
		
		System.out.println(mContainer);
		
		for(Producto prod : contenedor._listaProducto) {
			System.out.println("Producto N°: " + cont);
			prod.mostrar();
			cont++;
		}
	}
	
	public boolean agregar(Producto proUno){
		boolean puede=false;
		
		if(this._listaProducto.size()<this._capacidad && !Container.contieneProducto(this, proUno)) {
			this._listaProducto.add(proUno);
			puede=true;
		}
		
		return puede;
	}
	
	public static ArrayList<Producto> seleccionarComestible(Container contenedorUno, ETipoComestible tipoComestible){
		ArrayList<Producto> listaTmp=new ArrayList<>();
		
		for (Producto prod : contenedorUno._listaProducto) {
			if(Producto.comparaComestible(prod, tipoComestible)) {
				listaTmp.add(prod);
			}
		}
		
		return listaTmp;
	}
	
	public static boolean contieneProducto(Container unContenedor, Producto unProducto) {
		boolean existe=false;
		
		for (Producto prod : unContenedor._listaProducto) {
			if(existe=Producto.comparaDosProductos(unProducto, prod)) {
				break;
			}
		}
		return existe;
	}
	
}
