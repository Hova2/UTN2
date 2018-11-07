package ar.edu.utn.clase11;

public class Producto {

	private int _codigoBarras;
	private String _nombre;
	private double _precio;
	private ETipoComestible _tipo;
	
	private Producto(int codigo) {
		this._codigoBarras = codigo;
	}
	
	public Producto(int codigo, String nombre, ETipoComestible tipo) {
		this(codigo);
		this._nombre = nombre;
		this._tipo = tipo;
	}
	
	Producto(int codigo, String nombre, ETipoComestible tipo , double precio){
		this(codigo,nombre,tipo);
		this._precio = precio;
	}
	
	public void mostrar() {
		
		StringBuilder mProducto = new StringBuilder();
		
		mProducto.append("Codigo: ").append(this._codigoBarras).append("\n");
		mProducto.append("Nombre: ").append(this._nombre).append("\n");
		mProducto.append("Precio: ").append(this._precio).append("\n");
		mProducto.append("Tipo: ").append(this._tipo).append("\n");
		
		System.out.println(mProducto);
	}
	
	public static boolean comparaComestible(Producto unProducto, ETipoComestible tipo) {
		return unProducto._tipo.equals(tipo);
	}
	
	public static boolean comparaDosProductos(Producto unProducto, Producto otroProducto) {
		return unProducto._codigoBarras==otroProducto._codigoBarras;
	}
}
