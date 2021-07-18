package com.PokedexPokemon;

public class Pokedex extends AbstractPokemon {
	int myPokemons;
	
	public void listPokemon() {
		myPokemons = Pokemon.count;
		System.out.println("Tienes " + myPokemons + " pokemons: ");
		for(int i=0; i<myPokemons; i++) {
			System.out.println(lista.get(i));
		}
	}

}
