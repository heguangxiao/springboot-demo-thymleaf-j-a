/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import java.util.List;
import org.springframework.data.domain.Page;

/**
 *
 * @author HTC-PC
 * @param <H>
 */
public interface BaseService<H> {

    List<H> findAll();

    H save(H h);

    H findById(long id);

    void deleteById(long id);

    Page<H> findAll(int pageNo, int pageSize, String sortField, String sortDirection);
}
