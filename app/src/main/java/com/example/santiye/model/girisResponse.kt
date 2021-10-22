package com.example.santiye.model

import java.util.*
import com.google.gson.annotations.SerializedName

class girisResponse : ArrayList<girisResponse.girisResponseItem>(){
    data class girisResponseItem(
            @SerializedName("FirmaKodu")
            var FirmaKodu: String,
            @SerializedName("KullaniciAdi")
            var KullaniciAdi: String,
            @SerializedName("Sifre")
            var Sifre: String
    )
}

