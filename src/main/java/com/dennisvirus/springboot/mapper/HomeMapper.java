package com.dennisvirus.springboot.mapper;

import com.dennisvirus.springboot.dto.Country;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface HomeMapper {

    Country getTableData(String name);
}
