package xyz.rl2jy.order.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.rl2jy.order.entity.User;
import xyz.rl2jy.order.mapper.UserMapper;
import xyz.rl2jy.order.service.IUserService;

import java.util.List;
import java.util.Map;

/**
 * 
    localhost:8081/order/getUserById/7112022225200070
 */
@RestController
public class UserController {
    @Autowired
    UserMapper userMapper;
    
    @Autowired
    IUserService userService;
    
    @RequestMapping("/getUser")
    public void getUserInfos(){
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
    }

    @RequestMapping("/getUserById/{id}")
    public void getUserById(@PathVariable String id){
        System.out.println(("----- selectById method test ------"));
//        User user = userMapper.selectById(id);
        User user = userService.getById(id);
        System.out.println(user);
    }

    @RequestMapping("/getUserByCond/{id}")
    public void getUserByWrapper(@PathVariable String id){
        System.out.println(("----- selectByWrapper method test ------"));
//        User user = userMapper.selectById(id);
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.lambda().eq(User::getUserId,id);
        User user = userService.getOne(userQueryWrapper);
        System.out.println(user);
    }
    
    @RequestMapping("/getUserByMap/{id}")
    public void getUserByMap(@PathVariable String id){
        System.out.println(("----- selectByMap method test ------"));
//        User user = userMapper.selectById(id);
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.select("avg(user_id) avg", "min(user_id) min", "max(user_id) max","sum(user_id) sum");
        Map<String, Object> map = userService.getMap(userQueryWrapper);
        System.out.println(map);
    }
    
}
