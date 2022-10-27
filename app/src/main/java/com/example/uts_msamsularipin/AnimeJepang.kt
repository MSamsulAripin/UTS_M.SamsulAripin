package com.example.uts_msamsularipin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.uts_msamsularipin.Anime

class AnimeJepang (var mContext: Context, var resources: Int, var items:List<Anime>): ArrayAdapter<Anime>(mContext, resources, items) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater: LayoutInflater = LayoutInflater.from(mContext)
        val view: View = layoutInflater.inflate(resources, null)

        val imageView: ImageView = view.findViewById(R.id.poster)
        val KotaIndonesia: TextView = view.findViewById(R.id.tvAnime)
        val Deskripsi: TextView = view.findViewById(R.id.tvDeskripsi)

        var mItem:Anime = items[position]
        imageView.setImageDrawable(mContext.resources.getDrawable(mItem.photo))
        KotaIndonesia.text = mItem.anime
        Deskripsi.text = mItem.deskripsi
        return view
    }
}