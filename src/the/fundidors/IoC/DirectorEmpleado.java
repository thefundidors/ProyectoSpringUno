package the.fundidors.IoC;

public class DirectorEmpleado implements Empleados {
	
	//Creación de campo tipo CreacionInformne(interfaz)
	private CreacionInformes informeNuevo;
	
	//Creación de constructor que inyecta la dependencia
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Este es un informe de un Director Empleado: " + informeNuevo.getInforme();
	}

}
