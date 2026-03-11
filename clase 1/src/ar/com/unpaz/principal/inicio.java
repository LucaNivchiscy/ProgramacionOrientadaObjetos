package ar.com.unpaz.principal;

import ar.com.unpaz.model.*;
public class inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cuenta cuenta1 = new cuenta();
		
		cuenta1.setNumeroCuenta(1234);
		cuenta1.setTitular("Luca");
		cuenta1.setSaldo(200000);
		
		
		Contacto contacto1 = new Contacto();
		contacto1.setCalle("Calle Falsa");
		contacto1.setLocalidad("San Miguel");
		contacto1.setNumeroCalle(123);
		contacto1.setMail("mailDePrueba@gmail.com");

		cliente cliente1 = new cliente();
		
		
		cliente1.setNombre("Luca");
		cliente1.setApellido("Nivchiscy");
		cliente1.setDni(42351493);
		cliente1.setCuenta(cuenta1);
		cliente1.setContacto(contacto1);
		
		
		System.out.println("numero de cuenta: " + cliente1.getCuenta().getNumeroCuenta());
		System.out.println("cuenta a nombre de: " + cliente1.getCuenta().getTitular());
		System.out.println("cuenta a nombre de: " + cliente1.getCuenta().getSaldo());
		

		

	}

}
