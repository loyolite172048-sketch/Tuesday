package com.viraj.catelogService.web.controllers;

import com.viraj.catelogService.domain.PagedResult;
import com.viraj.catelogService.domain.Product;
import com.viraj.catelogService.domain.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
class ProductController {

    private final ProductService productService;

    @GetMapping("/getProducts")
    public PagedResult<Product> getProducts(@RequestParam(name="page", defaultValue = "1") int pageNo){
        return productService.getProduct(pageNo);
    }
}
