/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pokemon;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LEONARDOESLABAOBARBO
 */
public class Mochila {

    private ArrayList<Pokemon> pokemons;
    
    public Mochila() {
        pokemons = new ArrayList<>();
    }

    public String adicionarPokemon(Pokemon pokemon) throws MochilaCheiaException {
        if (pokemons.size() >= 6) {
            return "A mochila está cheia! Não é possível adicionar mais Pokémons.";
        }
        pokemons.add(pokemon);
        return pokemon.getNome() + " adicionado a mochila";
    }

    public String removerPokemon(Pokemon pokemon) throws MochilaCheiaException {
        if(pokemons.size() <= 0){
            return "A mochila esta vazia.";
        }
        pokemons.remove(pokemon);
        return pokemon.getNome() + " foi removido da mochila";
    }
    
        
  
}
