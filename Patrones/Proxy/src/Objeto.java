public class Objeto implements InterfaceObjeto{
	
	private String[] estado = {"BIEN","REGULAR","MAL","INESTABLE","DESCONOCIDO"};   
	
	public Objeto() {
		// TODO Auto-generated constructor stub
	
	}
	
	@Override
	public void mostrarEstado() {
		int index = (int)Math.round(Math.random() * (estado.length-1) ) ;
		String estadoActual = estado[ index];
		System.out.println("El estado es "+estadoActual);
	}
	
	@Override
	public void Saludar() {
		System.out.println("Hola a todos");	
	}
	
}
