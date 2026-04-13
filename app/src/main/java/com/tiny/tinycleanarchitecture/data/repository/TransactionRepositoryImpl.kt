package com.tiny.tinycleanarchitecture.data.repository

import com.tiny.tinycleanarchitecture.domain.model.Transaction
import com.tiny.tinycleanarchitecture.domain.repository.TransactionRepository

class TransactionRepositoryImpl : TransactionRepository {
    override fun getTransactions(): Result<Transaction> {
        TODO("Not yet implemented")
    }
}