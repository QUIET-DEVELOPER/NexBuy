package com.ecommerce.NexBuy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.service.annotation.GetExchange;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetExchange("/")
    public String index() {
        return "/admin/index";
    }

    @GetExchange("/addProduct")
    public String addProduct() {
        return "/admin/addProduct";
    }

    @GetExchange("/addCategory")
    public String addCategory() {
        return "/admin/addCategory";
    }
}
