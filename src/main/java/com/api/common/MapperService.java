package com.api.common;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MapperService {

    @Qualifier("dwfmDozerBeanMapper")
    @Autowired
    private DozerBeanMapper mapper;

    private MapperService() {}

    public MapperService(DozerBeanMapper mapper) {
        this.mapper = mapper;
    }

    /**
     * Map the source object to the destination object.
     */
    public void map(Object source, Object destination) {
        getMapper().map(source, destination);

    }

    /**
     * Map the source object to the destination by creating an object based on type.
     */
    public <T> T map(Object source, Class<T> destinationType) {
        T result = getMapper().map(source, destinationType);
        return result;
    }

    private DozerBeanMapper getMapper() {
        return mapper;
    }
}
