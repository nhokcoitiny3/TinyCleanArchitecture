package com.tiny.tinycleanarchitecture.data.remote.api

import com.tiny.tinycleanarchitecture.data.remote.dto.TransactionDto
import kotlinx.coroutines.delay
import kotlin.random.Random

class  FakeApiService : ApiService {
    override suspend fun getTransactions(): List<TransactionDto> {
        delay(1000) // giả lập network

        if (Random.nextBoolean()) {
            throw Exception("Network error")
        }
        return listOf(
            TransactionDto(1, "13000 VND", "2024-01-01","123","1234"),
            TransactionDto(1, "41000 VND", "2024-01-01","123","1234"),
            TransactionDto(1, "61000 VND", "2024-01-01","123","1234"),
            TransactionDto(1, "11000 VND", "2024-01-01","123","1234"),
        )
    }
}