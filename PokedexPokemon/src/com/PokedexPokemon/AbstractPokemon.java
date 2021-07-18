package com.PokedexPokemon;

import java.util.ArrayList;

public abstract class AbstractPokemon implements PokemonInterface {
	Pokemon pokemon;
	String name;
	int health;
	String type;
	ArrayList<String> lista = new ArrayList<>();

	public Pokemon createPokemon(String name, int health, String type) {
		pokemon = new Pokemon(name, health, type);
		lista.add(pokemonInfo(pokemon));
		return pokemon;
	}
	
	public String pokemonInfo(Pokemon pokemon) {
		String poke = "Nombre: " + pokemon.getName() + ". Tipo: " + pokemon.getType() + ". Salud: " + pokemon.getHealth();
		return poke;
	}

}
