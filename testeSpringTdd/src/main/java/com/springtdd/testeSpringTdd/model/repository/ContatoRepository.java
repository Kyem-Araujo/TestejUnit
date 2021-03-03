package com.springtdd.testeSpringTdd.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springtdd.testeSpringTdd.model.ContatoModel;

public interface ContatoRepository extends JpaRepository<ContatoModel, Long> {
}