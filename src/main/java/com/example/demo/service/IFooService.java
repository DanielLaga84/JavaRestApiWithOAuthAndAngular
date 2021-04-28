package com.example.demo.service;

import com.example.demo.model.Foo;
import com.example.demo.model.IFooRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface IFooService {

    Optional<Foo> findById(Long id);

    Foo save(Foo foo);

    Iterable<Foo> findAll();
}


@Service
class FooServiceImpl implements IFooService{

    private IFooRepository fooRepository;

    public FooServiceImpl(IFooRepository fooRepository) {
        this.fooRepository = fooRepository;
    }

    @Override
    public Optional<Foo> findById(Long id) {
        return fooRepository.findById(id);
    }

    @Override
    public Foo save(Foo foo) {
        return fooRepository.save(foo);
    }

    @Override
    public Iterable<Foo> findAll() {
        return fooRepository.findAll();
    }
}
