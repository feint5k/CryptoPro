
package com.example.crypto.pojo

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.crypto.api.ApiFactory.BASE_URL_IMG
import com.example.crypto.utils.convertTime
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import io.reactivex.annotations.NonNull

@Entity(tableName = "full_price_list")
data class CoinPriceInfo(

    @SerializedName("TYPE")
    var TYPE: String? = null,

    @SerializedName("MARKET")
    var MARKET: String? = null,

    @PrimaryKey
    @SerializedName("FROMSYMBOL")
    @Expose
    @NonNull
    var FROMSYMBOL: String,

    @SerializedName("TOSYMBOL")
    var TOSYMBOL: String? = null,

    @SerializedName("FLAGS")
    var FLAGS: String? = null,

    @SerializedName("PRICE")
    var PRICE: Double? = null,

    @SerializedName("LASTUPDATE")
    var LASTUPDATE: Long? = null,

    @SerializedName("MEDIAN")
    var MEDIAN: Double? = null,

    @SerializedName("LASTVOLUME")
    var LASTVOLUME: Double? = null,

    @SerializedName("LASTVOLUMETO")
    var LASTVOLUMETO: Double? = null,

    @SerializedName("LASTTRADEID")
    var LASTTRADEID: String? = null,

    @SerializedName("VOLUMEDAY")
    var VOLUMEDAY: Double? = null,

    @SerializedName("VOLUMEDAYTO")
    var VOLUMEDAYTO: Double? = null,

    @SerializedName("VOLUME24HOUR")
    var VOLUME24HOUR: Double? = null,

    @SerializedName("VOLUME24HOURTO")
    var VOLUME24HOURTO: Double? = null,

    @SerializedName("OPENDAY")
    var OPENDAY: Double? = null,

    @SerializedName("HIGHDAY")
    var HIGHDAY: Double? = null,

    @SerializedName("LOWDAY")
    var LOWDAY: Double? = null,

    @SerializedName("OPEN24HOUR")
    var OPEN24HOUR: Double? = null,

    @SerializedName("HIGH24HOUR")
    var HIGH24HOUR: Double? = null,

    @SerializedName("LOW24HOUR")
    var LOW24HOUR: Double? = null,

    @SerializedName("LASTMARKET")
    var LASTMARKET: String? = null,

    @SerializedName("VOLUMEHOUR")
    var VOLUMEHOUR: Double? = null,

    @SerializedName("VOLUMEHOURTO")
    var VOLUMEHOURTO: Double? = null,

    @SerializedName("OPENHOUR")
    var OPENHOUR: Double? = null,

    @SerializedName("HIGHHOUR")
    var HIGHHOUR: Double? = null,

    @SerializedName("LOWHOUR")
    var lowHour: Double? = null,

    @SerializedName("TOPTIERVOLUME24HOUR")
    var TOPTIERVOLUME24HOUR: Double? = null,

    @SerializedName("TOPTIERVOLUME24HOURTO")
    var TOPTIERVOLUME24HOURTO: Double? = null,

    @SerializedName("CHANGE24HOUR")
    var CHANGE24HOUR: Double? = null,

    @SerializedName("CHANGEPCT24HOUR")
    var CHANGEPCT24HOUR: Double? = null,

    @SerializedName("CHANGEDAY")
    var CHANGEDAY: Double? = null,

    @SerializedName("CHANGEPCTDAY")
    var CHANGEPCTDAY: Double? = null,

    @SerializedName("CHANGEHOUR")
    var CHANGEHOUR: Double? = null,

    @SerializedName("CHANGEPCTHOUR")
    var CHANGEPCTHOUR: Double? = null,

    @SerializedName("CONVERSIONTYPE")
    var CONVERSIONTYPE: String? = null,

    @SerializedName("CONVERSIONSYMBOL")
    var CONVERSIONSYMBOL: String? = null,
