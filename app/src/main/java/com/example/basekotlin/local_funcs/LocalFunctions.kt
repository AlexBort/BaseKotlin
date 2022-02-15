package com.example.basekotlin.local_funcs

import java.io.File

class LocalFunctions {

    /**
     * simple variant of local function
     */
    fun f1() {
        fun f() {

        }
    }

    fun files(
        file: File
    ): Set<File> {
        require(file.exists()) { "File $file doesn't exist" }

        fun traverse(
            current: File,
            set: MutableSet<File>
        ) {
            val files = current.listFiles()
            if (files == null) {
                set += current
            } else {
                files.forEach { file -> traverse(file, set) }
            }
        }
        return HashSet<File>()
            .also { set -> traverse(file, set) }
    }




}

fun main() {
    LocalFunctions().f1()
}