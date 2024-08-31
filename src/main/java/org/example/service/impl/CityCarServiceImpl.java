package org.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.domain.CityCar;
import org.example.service.CityCarService;
import org.example.mapper.CityCarMapper;
import org.springframework.stereotype.Service;

/**
* @author 34132
* @description 针对表【city_car】的数据库操作Service实现
* @createDate 2024-08-31 23:58:33
*/
@Service
public class CityCarServiceImpl extends ServiceImpl<CityCarMapper, CityCar>
    implements CityCarService{

}




