package com.tiny.tinycleanarchitecture.domain.model

data class Transaction (
    val transactionId: Int,
    val amount: Long,
    val createTime: String,
    val accountSend: String,
    val accountReceive: String,
)