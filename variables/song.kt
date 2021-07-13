/*

	Android 101

	Homework #2: Variables

	Author: Erick Marroquín

*/

//Song Attributes
var title: String = "Play with fire"
var year: Int = 2020
var author: String = "Nico Santos"
var language: String = "English"
var genre: String = "Pop"
var isOnSpotify: Boolean = true
var isOnDeezer: Boolean = true
var isOnYoutubeMusic: Boolean = true

//Main function
fun main(args: Array<String>) {
    println("Song title: " + title)
    println("Author: " + author)
    println("Genre: " + genre)
    println("Language: " + language)
    println("Release date: " + year)
    println("The song is avalible on spotify: " + isOnSpotify)
    println("The song is avalible on Deezer: " + isOnDeezer)
    println("The song is avalible on Youtube Music: " + isOnYoutubeMusic)
}