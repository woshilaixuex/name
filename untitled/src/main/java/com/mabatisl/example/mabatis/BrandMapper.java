package com.mabatisl.example.mabatis;
import org.apache.ibatis.annotations.Param;

import java.util.*;
public interface BrandMapper {
//    List<Brand> selectAll();
    List<Brand> selectByCondition(
            @Param("status") int status,
            @Param("company_name") String company_name,
            @Param("brand_name") String brand_name
    );
}
