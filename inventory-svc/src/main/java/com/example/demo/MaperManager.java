package com.example.demo;



import com.example.demo.domain.ESProduct;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
 
public class MaperManager {
 
    private MapperFactory mapperFactory;
 
    public MaperManager() {
        this.mapperFactory = new DefaultMapperFactory.Builder().build();
        this.mapperFactory.classMap(ESProduct.class, Process.class).
                mapNulls(false).
                mapNullsInReverse(false).
                byDefault().
                field("id", "id").
                register();
    }
 
    public <S, D> D map(S s, Class<D> type) {
        return this.mapperFactory.getMapperFacade().map(s, type);
    }
 
}