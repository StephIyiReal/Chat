package com.example.chat.Fragments;

import com.example.chat.Notifications.MyResponse;
import com.example.chat.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAIBIdRAA:APA91bESLSXXLGd9mD8-4l3RdeOy75Otn8X_RPV4mqyeKWI1ME77RFKfs08Y3att0DS7MS1CatQUlnWSNOgsJulyMbWhDeTqlMAL84g02q2UJg5-H2uQstPLgQbDzxCjeFwWMi9UO7bL"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
