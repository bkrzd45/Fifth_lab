package ru.stankin.labs.bekmurzaev5

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val dataList: LocationData) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val latitudeView: TextView = itemView.findViewById(R.id.textViewLatitude)
        val longitudeView: TextView = itemView.findViewById(R.id.textViewLongitude)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.my_list_item_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.latitudeView.text = "Широта: ${dataList.latitude}"
        holder.longitudeView.text = "Долгота: ${dataList.longitude}"
    }


    override fun getItemCount(): Int {
        return 1
    }
}
