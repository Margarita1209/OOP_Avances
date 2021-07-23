package com.telefonos;

public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
   
	@Override
    public String ring() {
		return null;
        // tu código aquí
    }
  
	@Override
    public String unlock() {
		return null;
        // tu código aquí
    }
    @Override
    public void displayInfo() {
        System.out.println("IPhone");
    }

	@Override
	public void ring(String ring) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unlock(String unlock) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Phone creaCelular(String versionNumber, String ringTone) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String PhoneInfo(Phone celular) {
		// TODO Auto-generated method stub
		return null;
	}
}