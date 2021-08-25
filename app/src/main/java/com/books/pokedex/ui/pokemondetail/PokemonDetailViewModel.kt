package com.books.pokedex.ui.pokemondetail

import androidx.lifecycle.ViewModel
import com.books.pokedex.data.remote.responses.Pokemon
import com.books.pokedex.repository.PokemonRepository
import com.books.pokedex.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }
}