package com.telefonos;

public interface Ringable {
	
	Phone creaCelular(String versionNumber,String ringTone);//Este m�todo crea y retorna un Pokemon.
	String PhoneInfo(Phone celular); //Este m�todo devuelve un string con el name, health, y type del Pokemon.
	

	void ring(String ring);
	void unlock(String unlock);
	

}
