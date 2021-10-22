package com.example.santiye.model

import java.util.*
import com.google.gson.annotations.SerializedName

class tipListesiResponse : ArrayList<tipListesiResponse.TipListesiItem>(){
    data class TipListesiItem(
            @SerializedName("Token")
            var Token: String,
            @SerializedName("SantiyeKod")
            var SantiyeKod: String,
    )
}