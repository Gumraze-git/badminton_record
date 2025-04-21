package com.example.badminton_record.repository

import com.example.badminton_record.model.Player

object PlayerRepository {
    private val dummyPlayers = listOf(
        Player("Kim", "A"),
        Player("Han", "A")
    )

    fun searchPlayers(query: String): List<Player> {
        return dummyPlayers.filter {
            it.name.contains(query)
        }
    }
}