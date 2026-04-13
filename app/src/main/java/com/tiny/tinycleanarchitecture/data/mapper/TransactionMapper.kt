package com.tiny.tinycleanarchitecture.data.mapper

import com.tiny.tinycleanarchitecture.data.remote.dto.TransactionDto
import com.tiny.tinycleanarchitecture.domain.model.Transaction

fun TransactionDto.toDomain() = Transaction(
    transactionId = transaction_id ?: 1,
    amount = (amount?.replace("VND", "")?.replace(" ", "")?.replace(",", "")?.toLongOrNull()) ?: 0,
    createTime = create_time ?: "",
    accountSend = account_send ?: "",
    accountReceive = account_receive ?: ""
)