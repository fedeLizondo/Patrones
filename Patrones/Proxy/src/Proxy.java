
public class Proxy implements InterfaceObjeto{

	
	private Objeto objeto;
	
	public Proxy() {
		objeto = null;
	}

	@Override
	public void mostrarEstado() {
		if( objeto == null)
		{
			System.out.println("Recien Ahora creo el objeto");
			objeto = new Objeto();
		}
		objeto.mostrarEstado();
		
	}

	@Override
	public void Saludar() {
		if(objeto == null)
		{
			System.out.println("Recien Ahora creo el objeto");
			objeto = new Objeto();
		}	
		objeto.Saludar();	
	}

	
	
}
