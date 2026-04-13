package com.tiny.tinycleanarchitecture.data.repository

import com.tiny.tinycleanarchitecture.data.mapper.toDomain
import com.tiny.tinycleanarchitecture.data.remote.api.ApiService
import com.tiny.tinycleanarchitecture.domain.model.Transaction
import com.tiny.tinycleanarchitecture.domain.repository.TransactionRepository
import com.tiny.tinycleanarchitecture.domain.util.Result

class TransactionRepositoryImpl(private val apiService: ApiService) : TransactionRepository {

    override suspend fun getTransactions(): Result<List<Transaction>> {
        return try {
            val dto = apiService.getTransactions()

            val data = dto.map { it.toDomain() }

            Result.Success(data)

        } catch (e: Exception) {
            Result.Error(e)
        }
    }
}
