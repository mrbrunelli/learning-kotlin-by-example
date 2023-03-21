import com.google.gson.Gson
import com.google.gson.annotations.SerializedName
import okhttp3.OkHttpClient
import okhttp3.Request

data class GithubUser(
    @SerializedName("login")
    val user: String,
    @SerializedName("avatar_url")
    val avatarUrl: String,
    @SerializedName("html_url")
    val url: String,
    @SerializedName("public_repos")
    val totalPublicRepos: Int,
    val bio: String,
    val company: String
)

fun main() {
    val gson = Gson()
    val url = "https://api.github.com/users/mrbrunelli"
    val request = Request.Builder()
        .url(url)
        .get()
        .build()
    val client = OkHttpClient()

    val response = client.newCall(request).execute()

    val jsonData = response.body?.string()
    val githubUser = gson.fromJson(jsonData, GithubUser::class.java)

    println(jsonData)
    println(githubUser)
}