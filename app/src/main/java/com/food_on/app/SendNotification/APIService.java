package com.food_on.app.SendNotification;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAApltC13o:APA91bFvJfAh4CCZdB3fG6mHktK6Bsj9n79dLVxg4Qj2w1Y3NHAKa2uHmlX6y7fY2giBs4iBSuFCbknlyScQ4Fol_FmBBDoNvuAU5O-2T_21ASptjD3IyKMIUcl9rDsRDFjwr9NP8aeg"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body NotificationSender body);
}
