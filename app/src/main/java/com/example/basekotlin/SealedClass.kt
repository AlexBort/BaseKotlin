package com.example.basekotlin

sealed class SealedClass {
    // sealed class- используется для того, чтобы ограничить класс, тоесть изолировать его. Чтобы представить закрытую иерархию классов
    // каждая enum constant существует как отдельный экземпляр класса
    // такой тип классов не имеет своей внутренней логики
    class Const : SealedClass()
    class Sum : SealedClass()
    object NotANumber : SealedClass()
}