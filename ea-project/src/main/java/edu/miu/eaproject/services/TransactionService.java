package edu.miu.eaproject.services;

import edu.miu.eaproject.entities.Transaction;
import edu.miu.eaproject.entities.TransactionDTO;

import java.util.List;

public interface TransactionService {
    public List<Transaction> findTransactionsByMemberId(Long memberId);
    public TransactionDTO createTransaction(long badgeId, long locationId);
}
