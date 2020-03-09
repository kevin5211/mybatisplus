package xyz.rl2jy.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import xyz.rl2jy.order.entity.User;
import xyz.rl2jy.order.mapper.UserMapper;

@Service
public class IUserService extends ServiceImpl<UserMapper, User>{
    
}
