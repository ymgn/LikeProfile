package com.likeprofile.controller

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.likeprofile.domain.entity.Genre
import com.likeprofile.infrastructure.GenreOnMemoryRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * ジャンルコントローラー
 */
@RestController
//@RequestMapping(path = ["/api/v1/genres"])
class GenreController {

    @GetMapping(path = ["/api/v1/genres"])
    fun genres(): String {
        val genresInit: ArrayList<Genre> = arrayListOf(
                Genre("格好良い","かっこいい"),
                Genre("熱血", "ねっけつ"),
                Genre("近未来", "きんみらい")
        )

        val genreRepository = GenreOnMemoryRepository()

        genreRepository.saveInArrayList(genresInit)

        val genres: ArrayList<Genre?> = genreRepository.findAll()

        val mapper: ObjectMapper = jacksonObjectMapper()
        val jsonString: String = mapper.writeValueAsString(genres)

        return jsonString

    }
}
