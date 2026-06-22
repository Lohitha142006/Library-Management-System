package com.example.demo.repository;

import com.example.demo.entity.IssueRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueRepository extends JpaRepository<IssueRecord, Long> {
}