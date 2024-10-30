// databuku.kt
package com.example.utsmobcom

object DataBuku {
    var title = "Bapak ku Garena"
    var author = "Apta"
    var rangkuman = "jadi main epep ketemu bocil, ngetroll, dibacotin bocil. ngadu bapak"

    fun updateData(newTitle: String, newAuthor: String, newRangkuman: String) {
        title = newTitle
        author = newAuthor
        rangkuman = newRangkuman
    }
}
