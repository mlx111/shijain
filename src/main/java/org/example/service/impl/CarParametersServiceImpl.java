package org.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.domain.CarParameters;
import org.example.service.CarParametersService;
import org.example.mapper.CarParametersMapper;
import org.springframework.stereotype.Service;

/**
* @author 34132
* @description 针对表【car_parameters】的数据库操作Service实现
* @createDate 2024-08-31 16:38:19
*/
@Service
public class CarParametersServiceImpl extends ServiceImpl<CarParametersMapper, CarParameters>
    implements CarParametersService{

}




