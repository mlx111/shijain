package org.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.domain.City;
import org.example.service.CityService;
import org.example.mapper.CityMapper;
import org.springframework.stereotype.Service;

/**
* @author 34132
* @description 针对表【city】的数据库操作Service实现
* @createDate 2024-08-31 16:38:22
*/
@Service
public class CityServiceImpl extends ServiceImpl<CityMapper, City>
    implements CityService{

}




