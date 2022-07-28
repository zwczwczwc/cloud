package com.xn2001.order.service;

import com.feign.clients.UserClient;
import com.feign.pojo.User;
import com.xn2001.order.mapper.OrderMapper;
import com.xn2001.order.pojo.Order;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
//import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {

    @Resource
    private OrderMapper orderMapper;

    @Resource
    private UserClient userClient;

    /*@Autowired
    private RestTemplate restTemplate;*/

    public Order queryOrderById(Long orderId) {
        // 1.查询订单
        Order order = orderMapper.findById(orderId);
        // TODO: 2021/8/20 使用feign远程调用
        User user = userClient.findById(order.getUserId());
        // 3. 将用户信息封装进订单
        order.setUser(user);
        // 4.返回
        return order;
    }


    /*public Order queryOrderById(Long orderId) {
        // 1.查询订单
        Order order = orderMapper.findById(orderId);

        String url = "http://userservice/user/" + order.getUserId();

        User user = restTemplate.getForObject(url, User.class);

        order.setUser(user);

        return order;
    }*/
}
