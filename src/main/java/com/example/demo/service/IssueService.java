package com.example.demo.service;

import com.example.demo.entity.IssueRecord;
import com.example.demo.repository.IssueRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class IssueService {

    private final IssueRepository repo;

    public IssueService(IssueRepository repo) {
        this.repo = repo;
    }

    public IssueRecord issueBook(IssueRecord record) {
        record.setIssueDate(LocalDate.now());
        record.setStatus("ISSUED");
        return repo.save(record);
    }

    public IssueRecord returnBook(Long id) {
        IssueRecord record = repo.findById(id).orElseThrow();
        record.setReturnDate(LocalDate.now());
        record.setStatus("RETURNED");
        return repo.save(record);
    }

    public List<IssueRecord> getAll() {
        return repo.findAll();
    }
}
