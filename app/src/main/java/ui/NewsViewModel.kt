package ui

import androidx.lifecycle.ViewModel
import repository.NewsRepository

class NewsViewModel(
    val newsRepository: NewsRepository
):ViewModel() {
}