package com.gokdemiruzunkaya.business.services.impl;

import com.google.gson.JsonElement;
import com.gokdemiruzunkaya.business.services.IDailyService;
import com.gokdemiruzunkaya.retrofit.RetrofitCommonGenerics;
import com.gokdemiruzunkaya.retrofit.request.IDailyServiceRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

//Lombok
@RequiredArgsConstructor
@Log4j2

@Service
public class DailyService implements IDailyService {
    // REST             REQUEST
    // ----------       -------
    // @GetMapping      @GET
    // @PostMapping     @POST
    // @DeleteMapping   @DELETE
    // @PutMapping      @PUT

    // @PathVariable    @Path
    // @RequestBody     @Body

    // ResponseEntity   Call
    // DailyDto         JsonElement


    //injection
    private final IDailyServiceRequest iDailyServiceRequest;

    //SAVE
    @Override
    public JsonElement dailySave(JsonElement jsonElement) {
        return RetrofitCommonGenerics.retrofitGenerics(iDailyServiceRequest.dailySave(jsonElement));
    }

    //LIST
    @Override
    public List<JsonElement> dailyList() {
        return RetrofitCommonGenerics.retrofitGenerics(iDailyServiceRequest.dailyList());
    }

    //FIND
    @Override
    public JsonElement dailyFind(Long id) {
        return RetrofitCommonGenerics.retrofitGenerics(iDailyServiceRequest.dailyFind(id));
    }

    //DELETE
    @Override
    public void dailyDelete(Long id) {
        RetrofitCommonGenerics.retrofitGenerics(iDailyServiceRequest.dailyDelete(id));
    }

    //UPDATE
    @Override
    public JsonElement dailyUpdate(Long id, JsonElement jsonElement) {
        return RetrofitCommonGenerics.retrofitGenerics(iDailyServiceRequest.dailyUpdate(id,jsonElement));
    }

}
