package com.example.santiye.model
import java.util.*
import com.google.gson.annotations.SerializedName

class deneyListesiResponse : ArrayList<deneyListesiResponse.deneyListesiResponseItem>(){
    data class deneyListesiResponseItem(
            @SerializedName("Token")
            var Token: String,
            @SerializedName("SantiyeKod")
            var SantiyeKod: String,
            @SerializedName("DeneyTipId")
            var DeneyTipId: String
    )
}