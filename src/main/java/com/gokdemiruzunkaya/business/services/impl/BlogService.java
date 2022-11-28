package com.gokdemiruzunkaya.business.services.impl;

import com.google.gson.JsonElement;
import com.gokdemiruzunkaya.business.services.IBlogService;
import com.gokdemiruzunkaya.retrofit.RetrofitCommonGenerics;
import com.gokdemiruzunkaya.retrofit.request.IBlogServiceRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

//Lombok
@RequiredArgsConstructor
@Log4j2

@Service
public class BlogService implements IBlogService {
    // REST             REQUEST
    // ----------       -------
    // @GetMapping      @GET
    // @PostMapping     @POST
    // @DeleteMapping   @DELETE
    // @PutMapping      @PUT

    // @PathVariable    @Path
    // @RequestBody     @Body

    // ResponseEntity   Call
    // BlogDto         JsonElement


    //injection
    private final IBlogServiceRequest iBlogServiceRequest;

    //SAVE
    @Override
    public JsonElement blogSave(JsonElement jsonElement) {
        return RetrofitCommonGenerics.retrofitGenerics(iBlogServiceRequest.blogSave(jsonElement));
    }

    //LIST
    @Override
    public List<JsonElement> blogList() {
        return RetrofitCommonGenerics.retrofitGenerics(iBlogServiceRequest.blogList());
    }

    //FIND
    @Override
    public JsonElement blogFind(Long id) {
        return RetrofitCommonGenerics.retrofitGenerics(iBlogServiceRequest.blogFind(id));
    }

    //DELETE
    @Override
    public void blogDelete(Long id) {
        RetrofitCommonGenerics.retrofitGenerics(iBlogServiceRequest.blogDelete(id));
    }

    //UPDATE
    @Override
    public JsonElement blogUpdate(Long id, JsonElement jsonElement) {
        return RetrofitCommonGenerics.retrofitGenerics(iBlogServiceRequest.blogUpdate(id,jsonElement));
    }

}

