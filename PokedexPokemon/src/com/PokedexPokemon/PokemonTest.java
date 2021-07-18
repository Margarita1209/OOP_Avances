package com.PokedexPokemon;

public class PokemonTest {

	public static void main(String[] args) {
		Pokedex pokedex = new Pokedex();
		Pokemon Pikachu = pokedex.createPokemon("Pikachu", 100, "Electrico");
		Pokemon Totodile = pokedex.createPokemon("Totodile", 80, "Agua");
		Pokemon Charmander = pokedex.createPokemon("Charmander", 95, "Fuego");
		
		Pikachu.attackPokemon(Totodile);
		Charmander.attackPokemon(Pikachu);
		pokedex.listPokemon();

	}

}
