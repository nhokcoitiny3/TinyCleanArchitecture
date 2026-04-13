package com.tiny.tinycleanarchitecture.domain.repository

import com.tiny.tinycleanarchitecture.domain.model.Transaction
import com.tiny.tinycleanarchitecture.domain.util.Result

interface TransactionRepository {
    suspend fun getTransactions() : Result<List<Transaction>>
}
