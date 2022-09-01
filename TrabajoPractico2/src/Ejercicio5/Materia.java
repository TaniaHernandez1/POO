package Ejercicio5;

public class Materia  {
	private String nombre;
	private String codigo;
	private int numeracion;
	//private String introduccion;
	public Materia(String nombre, String codigo) {
		this.nombre= nombre;
		this.codigo = codigo;
		}
	public Materia(String nombre, int numeracion) {
		this.nombre= nombre;
		this.numeracion = numeracion;
		}
	public Materia(String nombre) {
		this.nombre = nombre;
	}
		public String getNombre() {
		return nombre;
		}
		/*public Materia(String nombre, String codigo, int numeracion) {
			super();
			this.nombre = nombre;
			this.codigo = codigo;
			this.numeracion = numeracion;
		}*/
		/*public Materia(String introduccion) {
			//this.nombre= nombre;
			this.introduccion = introduccion;
			}*/
		public void setNombre(String nombre) {
		this.nombre = nombre;
		}
		public String getCodigo() {
			return codigo;
		}
		public void setCodigo(String codigo) {
		this.codigo = codigo;
		}
}
