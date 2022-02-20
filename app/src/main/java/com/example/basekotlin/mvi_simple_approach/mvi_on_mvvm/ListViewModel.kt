package com.example.basekotlin.mvi_simple_approach.mvi_on_mvvm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.basekotlin.mvi_simple_approach.data.ListRepository
import com.example.basekotlin.mvi_simple_approach.data.MockData

class ListViewModel : ViewModel() {

    private val repository: ListRepository = ListRepository()
    private var mutableLiveData: MutableLiveData<List<MockData>> = MutableLiveData<List<MockData>>()
    val list = mutableLiveData

    init {
        obtainIntent(BaseUserIntent.UserFetch)
    }

    fun obtainIntent(intent: BaseUserIntent) {
        when (intent) {
            is BaseUserIntent.UserFetch -> {
                mutableLiveData.value = repository.fetchData()
            }
            is ListUserIntent.ClickItemIntent -> ""
        }
    }

    fun renderState(state: State<MockData>) {
        when (state) {
            is State.SuccessState -> ""
            is State.LoadingState -> ""
            is State.EmptyDataState -> ""
            is State.ErrorState -> ""
        }
    }
}