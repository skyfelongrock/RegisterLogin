package com.gokdemiruzunkaya.ui.api;

import com.google.gson.JsonElement;
import com.gokdemiruzunkaya.error.ApiResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface IBlogApi {
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


    //SAVE
    ApiResult saveBlog(JsonElement jsonElement);

    //LIST
    ResponseEntity<List<?>> listBlog();

    //FIND
    ResponseEntity<?> findBlog(Long id);


    //DELETE
    ApiResult deleteBlog(Long id);

    //UPDATE
    ApiResult updateBlog(Long id,JsonElement jsonElement);
}
