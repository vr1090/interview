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

class Presenter(val view:MovieView):MoviePresenter{
    val title = "this is title"

    override fun showTitle() {
        view.showTitle(Presenter.getTitle())
    }

    override fun showMovie() {
    }

    companion object {
        fun getTitle() = "apalah"
    }

}