package com.example.basekotlin.mvi_simple_approach

sealed class BaseUserIntent {
    object UserFetch : BaseUserIntent()
}

sealed class ListUserIntent : BaseUserIntent() {
    class ClickItemIntent(val id: String) : ListUserIntent()
}

sealed class DetailsUserIntent : BaseUserIntent() {
    class EditIntent(val description: String)
}