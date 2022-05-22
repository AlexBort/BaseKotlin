package com.example.basekotlin.toolbar

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.Menu
import android.widget.TextView
import androidx.annotation.MenuRes
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.view.children
import androidx.core.view.isVisible
import com.example.basekotlin.databinding.ViewCustomToolbarBinding
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.appbar.AppBarLayout.LayoutParams.*
import kotlin.math.abs

@Suppress("MemberVisibilityCanBePrivate")
class CustomToolbarView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : CoordinatorLayout(context, attrs, defStyleAttr) {

    private val binding = ViewCustomToolbarBinding.inflate(LayoutInflater.from(context), this)

    val supportToolbar = binding.toolbarMercuryToolbar

    var isVisibleHeader: Boolean
        get() = binding.chvMercuryToolbar.isVisible
        set(value) {
            setExpanded(value)
            isScrollable = value
            binding.chvMercuryToolbar.isVisible = value
        }

    var isScrollable: Boolean = false
        set(value) {
            field = value
            val params = binding.ctMercuryToolbar.layoutParams as? AppBarLayout.LayoutParams
            params?.scrollFlags = if (isScrollable) SCROLL_FLAG_SCROLL or SCROLL_FLAG_EXIT_UNTIL_COLLAPSED else SCROLL_FLAG_ENTER_ALWAYS
            binding.ctMercuryToolbar.layoutParams = params
        }

    val menu: Menu = binding.toolbarMercuryToolbar.menu

    fun inflateMenu(@MenuRes resId: Int) {
        binding.toolbarMercuryToolbar.inflateMenu(resId)
    }

    init {
        binding.toolbarMercuryToolbar.title = " "

        binding.toolbarMercuryToolbar.children.find { it is TextView }?.let {
            binding.ablMercuryToolbar.addOnOffsetChangedListener(AppBarLayout.OnOffsetChangedListener { appBarLayout, verticalOffset ->
                if (appBarLayout.totalScrollRange > 0) {
                    val percentage = abs(verticalOffset).toFloat() / appBarLayout.totalScrollRange
                    it.alpha = percentage
                } else {
                    it.alpha = if (isVisibleHeader) 0f else 1f
                }
            })
        }
    }

    fun setExpanded(isExpanded: Boolean) {
        binding.ablMercuryToolbar.setExpanded(isExpanded, isExpanded)
    }

    fun setHeaderLogo(resId: Int) {
        isVisibleHeader = true
        binding.chvMercuryToolbar.setImageResource(resId)
    }

    fun setBackGroundColour(resId: Int) {
        binding.ablMercuryToolbar.setBackgroundResource(resId)
    }
}