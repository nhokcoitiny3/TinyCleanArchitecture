package com.tiny.tinycleanarchitecture.domain.repository

import com.tiny.tinycleanarchitecture.domain.model.Transaction

interface TransactionRepository {
    fun getTransactions() : Result<Transaction>
}