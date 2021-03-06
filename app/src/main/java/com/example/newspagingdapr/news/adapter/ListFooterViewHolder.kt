package com.example.newspagingdapr.news.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.newspagingdapr.news.data.State
import kotlinx.android.synthetic.main.item_list_footer.view.*
import android.view.LayoutInflater
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.view.ViewGroup
import com.example.newspagingdapr.R

class ListFooterViewHolder (view: View) : RecyclerView.ViewHolder(view) {

    fun bind(status: State?) {
        itemView.progress_bar.visibility = if (status == State.LOADING) VISIBLE else INVISIBLE
        itemView.txt_error.visibility = if (status == State.ERROR) VISIBLE else INVISIBLE
    }

    companion object {
        fun create(retry: () -> Unit, parent: ViewGroup): ListFooterViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_list_footer, parent, false)
            view.txt_error.setOnClickListener { retry() }
            return ListFooterViewHolder(view)
        }
    }
}