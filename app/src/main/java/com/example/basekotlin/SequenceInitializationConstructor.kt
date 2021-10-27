package com.example.basekotlin

class SequenceInitializationConstructor {

    class Size(_width: Int, _height: Int) {
        // 1: the width property is initialized
        val width = _width

        // 2: 1st init block is executed
        init {
            println("First initializer block that prints the width $width")
        }

        // 3: the height property is initialized
        val height = _height

        // 4: 2nd init block is executed
        init {
            println("Second initializer block that prints the height $height")
        }

        // 5: the area property is initialized
        val area = width * height
    }

    /**
     * Тоесть поля, находящиеся в классе, грубо говоря тоже как-будто инитятся в конструкторе.
     * Поэтому они могут и раньше вызываться нежели код в каком-то из блоков.
     * Тоесть последовательность написания диктует последовательность всего, что есть в этом классе.

     */

    /**
     * In the examples above, the parameter names begin with underscores (_width, _height)
     * to distinguish them from class members (width, height).
     * It is a useful coding convention widely accepted in various programming languages.
     */

}