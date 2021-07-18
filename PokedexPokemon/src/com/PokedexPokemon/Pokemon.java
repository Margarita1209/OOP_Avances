package com.PokedexPokemon;

public class Pokemon {
	private String name;
	private int health;
	private String type;
	
	public void attackPokemon (Pokemon pokemon) {
		pokemon.health -= 10;
		String nombre = pokemon.name;
		System.out.println("El pokemon " + nombre + " fue atacado. Su salud ahora es de: " + pokemon.health);
	}
	
	static int count;
	public Pokemon(String nombre, int salud, String tipo) {
		count++;
		this.name = nombre;
		this.health = salud;
		this.type = tipo;
		System.out.println("Se ha agregado un pokemon: " + this.name);
		System.out.println("Su salud es de: " + this.health);
		System.out.println("Es de tipo: " + this.type);
	}
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
