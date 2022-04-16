package repository

import api.RetrofitInstance
import db.ArticleDatabase

class NewsRepository(
    val db: ArticleDatabase
){
    suspend fun getBreakingNews(countryCode:String,pageNumber:Int)
     = RetrofitInstance.api.getBreakingNews(countryCode,pageNumber)
}