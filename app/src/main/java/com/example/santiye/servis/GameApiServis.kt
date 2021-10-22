package com.gaming.games.servis
import com.example.santiye.model.deneyListesiResponse
import com.example.santiye.model.girisResponse
import com.example.santiye.model.santiyeListResponse
import com.example.santiye.model.tipListesiResponse
import com.google.gson.GsonBuilder
import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class GameApiServis {

    private val BASE_URL = "http://labmobil.rubusoft.com/Home/"
    var gson = GsonBuilder()
        .setLenient()
        .create()
    private val api =
        Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create(gson))
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
        .create(GameApi::class.java)

    fun getGiris(): Single<List<girisResponse.girisResponseItem>> {
        return api.getGiris()
    }
    fun getSantiyeList(): Single<List<santiyeListResponse.santiyeListResponsItem>> {
        return api.getSantiyeList()
    }
    fun getTipListesi(): Single<List<tipListesiResponse.TipListesiItem>> {
        return api.getTipListesi()
    }
    fun getDeneyLİstesi(): Single<List<deneyListesiResponse.deneyListesiResponseItem>> {
        return api.getDeneyLİstesi()
    }
}