package com.example.lab8mysql_queryinsert

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.std_item_layout.view.*

class ViewHolder(view: View):RecyclerView.ViewHolder(view) {
    var tvID:TextView = view.tv_id
    var tvname :TextView = view.tv_name
    var tvAge :TextView = view.tv_age


}