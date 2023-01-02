package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Bill;

public interface BillRepo extends JpaRepository<Bill, Long> {

}
