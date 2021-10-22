package com.example.santiye.model
import com.google.gson.annotations.SerializedName
import java.util.*
class santiyeListResponse : ArrayList<santiyeListResponse.santiyeListResponsItem>(){
    data class santiyeListResponsItem(
            @SerializedName("Token")
            var Token: String
    )
}