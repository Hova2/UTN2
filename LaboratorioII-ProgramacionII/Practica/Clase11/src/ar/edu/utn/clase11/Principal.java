package ar.edu.utn.clase11;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Producto ProductoUno = new Producto(666,"JamonDelDiablo", ETipoComestible.Solido,2);
		Producto ProductoDos = new Producto(33, "JamonDeDios", ETipoComestible.Solido,10);
		Producto ProductoTres = new Producto(55, "Sprite", ETipoComestible.Liquido, 10);
		Producto ProductoCuatro = new Producto(666, "JamonDelDiablo", ETipoComestible.Solido);
		Producto ProductoCinco = new Producto(666,"JamonDelDiablo", ETipoComestible.Solido,2);
		Container ContenerdorUno = new Container(2, "Skanka");
		Container ContenerdorDos = new Container(3, "Skanka");
		ArrayList<Producto> listaProducto = new ArrayList<>();
		ContenerdorUno.agregar(ProductoUno);
		ContenerdorUno.agregar(ProductoDos);
		if(!ContenerdorUno.agregar(ProductoTres)){
			System.out.println("No se pudo");
		}
		ContenerdorDos.agregar(ProductoUno);
		ContenerdorDos.agregar(ProductoDos);
		if(!ContenerdorDos.agregar(ProductoCuatro)){
			System.out.println("No se pudo");
		}
		ContenerdorDos.agregar(ProductoTres);
		Container.mostrar(ContenerdorUno);
		Container.mostrar(ContenerdorDos);
		listaProducto = Container.seleccionarComestible(ContenerdorDos,ETipoComestible.Liquido);
		System.out.println(" Lista Extraida ");
		for(Producto item : listaProducto){
			item.mostrar();
		}
		
		if(ProductoUno.equals(ProductoCinco)){
			System.out.println("Igual");
		}else {
			System.out.println("No Igual");
		}
	}
}
