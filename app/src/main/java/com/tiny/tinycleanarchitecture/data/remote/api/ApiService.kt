package com.tiny.tinycleanarchitecture.data.remote.api

import com.tiny.tinycleanarchitecture.data.remote.dto.TransactionDto

interface ApiService {
    suspend fun getTransactions(): List<TransactionDto>
}