import com.squareup.moshi.Json
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.Request


data class CatFact(
    val fact: String,
    val length: String
)

fun main() {
    val moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()
    val adapter = moshi.adapter(CatFact::class.java)

    val url = "https://catfact.ninja/fact"
    val request = Request.Builder().url(url).build()
    val client = OkHttpClient()

    val response = client.newCall(request).execute()
    val jsonData = response.body?.string()
    println(jsonData)

    val catFact = adapter.fromJson(jsonData)
    println(catFact)
}