package com.gaming.games.servis
import com.example.santiye.model.deneyListesiResponse
import com.example.santiye.model.girisResponse
import com.example.santiye.model.santiyeListResponse
import com.example.santiye.model.tipListesiResponse
import io.reactivex.Single
import retrofit2.http.GET

interface GameApi {

    companion object {
        private const val giris = "Giris"
        private const val santiyeListesi = "SantiyeListesi"
        private const val tipListesi = "TipListesi"
        private const val deneyListesi = "DeneyListesi"
    }

    @GET(giris)
    fun getGiris(): Single<List<girisResponse.girisResponseItem>>

   @GET(santiyeListesi)
    fun getSantiyeList() : Single<List<santiyeListResponse.santiyeListResponsItem>>

    @GET(tipListesi)
    fun getTipListesi(): Single<List<tipListesiResponse.TipListesiItem>>

    @GET(deneyListesi)
    fun getDeneyLİstesi(): Single<List<deneyListesiResponse.deneyListesiResponseItem>>
}