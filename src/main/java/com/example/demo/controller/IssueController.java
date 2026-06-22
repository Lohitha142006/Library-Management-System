package com.example.demo.controller;

import com.example.demo.entity.IssueRecord;
import com.example.demo.service.IssueService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/issues")
public class IssueController {

    private final IssueService service;

    public IssueController(IssueService service) {
        this.service = service;
    }

    @PostMapping
    public IssueRecord issueBook(@RequestBody IssueRecord record) {
        return service.issueBook(record);
    }

    @PutMapping("/return/{id}")
    public IssueRecord returnBook(@PathVariable Long id) {
        return service.returnBook(id);
    }

    @GetMapping
    public List<IssueRecord> getAll() {
        return service.getAll();
    }
}