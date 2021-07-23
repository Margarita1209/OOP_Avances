package com.telefonos;

public interface Ringable {
	
	Phone creaCelular(String versionNumber,String ringTone);//Este método crea y retorna un Pokemon.
	String PhoneInfo(Phone celular); //Este método devuelve un string con el name, health, y type del Pokemon.
	

	void ring(String ring);
	void unlock(String unlock);
	

}
