package kmklabs.com.interview


interface MoviePresenter{
    fun showTitle():Unit
    fun showMovie():Unit
}

interface MovieView{
    fun showTitle(title:String)
    fun showMovie(movies:List<Movie>)
}

data class Movie(val title:String, val description:String, val year:Int, val picturePath:String)