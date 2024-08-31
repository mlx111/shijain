package org.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.domain.CityResource;
import org.example.service.CityResourceService;
import org.example.mapper.CityResourceMapper;
import org.springframework.stereotype.Service;

/**
* @author 34132
* @description 针对表【city_resource】的数据库操作Service实现
* @createDate 2024-08-31 23:58:57
*/
@Service
public class CityResourceServiceImpl extends ServiceImpl<CityResourceMapper, CityResource>
    implements CityResourceService{

}




