package com.example.demo.model;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface IFooRepository extends PagingAndSortingRepository<Foo,Long> {
}
