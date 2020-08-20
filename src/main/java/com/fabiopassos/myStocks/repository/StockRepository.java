package com.fabiopassos.myStocks.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.fabiopassos.myStocks.domain.Stock;

@RepositoryRestResource(collectionResourceRel = "stock", path = "stock")
public interface StockRepository extends CrudRepository<Stock, Integer>{

	List<Stock> findByCode(@Param("code") String code);
}
