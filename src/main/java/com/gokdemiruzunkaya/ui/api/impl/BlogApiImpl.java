package com.gokdemiruzunkaya.ui.api.impl;

import com.google.gson.JsonElement;
import com.gokdemiruzunkaya.business.services.IBlogService;
import com.gokdemiruzunkaya.error.ApiResult;
import com.gokdemiruzunkaya.ui.api.IBlogApi;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Lombok
@RequiredArgsConstructor

@RestController
@RequestMapping("gateway/blog")
public class BlogApiImpl implements IBlogApi {

    //Injection
    private final IBlogService blogService;
    private static final String PATH = "gateway/blog";

    //SAVE
    //http://localhost:1111/gateway/blog  ==> POST
    @Override
    @PostMapping
    public ApiResult saveBlog( @RequestBody JsonElement jsonElement) {
        blogService.blogSave(jsonElement);
        return new ApiResult(200, "Kayıt olundu", PATH);
    }

    //LIST
    //http://localhost:1111/gateway/blog  ==> GET
    @Override
    @GetMapping
    public ResponseEntity<List<?>> listBlog() {
        blogService.blogList();
        return ResponseEntity.ok(blogService.blogList());
    }

    //FIND
    //http://localhost:1111/gateway/blog/1
    @Override
    @GetMapping("/{id}")
    public ResponseEntity<?> findBlog(@PathVariable(name="id") Long id) {
        return ResponseEntity.ok(blogService.blogFind(id));
    }

    //DELETE
    //http://localhost:1111/gateway/blog/1
    @Override
    @DeleteMapping("/{id}")
    public ApiResult deleteBlog(@PathVariable(name = "id") Long id) {
        blogService.blogDelete(id);
        return new ApiResult(200, "Silindi", PATH);
    }

    //UPDATE
    //http://localhost:1111/gateway/blog/1
    @Override
    @PutMapping("/{id}")
    public ApiResult updateBlog(@PathVariable(name="id")Long id, @RequestBody  JsonElement jsonElement) {
        blogService.blogUpdate(id,jsonElement);
        return new ApiResult(200, "Güncellendi", PATH);
    }
}