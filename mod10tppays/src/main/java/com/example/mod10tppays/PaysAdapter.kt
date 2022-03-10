package com.example.mod10tppays

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.mod10tppays.databinding.LayoutPaysBinding
import com.squareup.picasso.Picasso

class PaysAdapter(val alPays : ArrayList<Pays>) : RecyclerView.Adapter<PaysAdapter.PaysVH>() {
    class PaysVH(val dbPays : LayoutPaysBinding) : RecyclerView.ViewHolder(dbPays.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PaysVH {
        val lpi = DataBindingUtil.inflate<LayoutPaysBinding>(
            LayoutInflater.from(parent.context),
            R.layout.layout_pays,
            parent,
            false
        )
        return PaysVH(lpi)
    }

    override fun onBindViewHolder(holder: PaysVH, position: Int) {
        holder.dbPays.pays = alPays[position]
        Picasso.get().load(alPays[position].drapeauUrl).into(holder.dbPays.imageViewFlag)
    }

    override fun getItemCount(): Int = alPays.size
}