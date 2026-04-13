package com.tiny.tinycleanarchitecture.data.remote.dto

data class TransactionDto(
    val transaction_id: Int?,
    val amount: String?,
    val create_time: String?,
    val account_send: String?,
    val account_receive: String?,
)