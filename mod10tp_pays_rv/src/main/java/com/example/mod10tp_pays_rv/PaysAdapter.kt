package com.example.mod10tp_pays_rv

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.mod10tp_pays_rv.databinding.LinePaysBinding
import com.squareup.picasso.Picasso

class PaysAdapter(val alPays : ArrayList<Pays>):
    RecyclerView.Adapter<PaysAdapter.PaysViewHolder>(){

        class PaysViewHolder(val dbPays:LinePaysBinding)
            : RecyclerView.ViewHolder(dbPays.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PaysViewHolder {
        val dbLinePays = DataBindingUtil.inflate<LinePaysBinding>(
            LayoutInflater.from(parent.context),
            R.layout.line_pays,
            parent,
            false
        )
        return PaysViewHolder(dbLinePays)    }

    override fun onBindViewHolder(holder: PaysViewHolder, position: Int) {
        holder.dbPays.pays = alPays[position]
        Picasso.get().load(alPays[position].drapeauUrl).into(holder.dbPays.imageViewFlag)
    }

    override fun getItemCount(): Int = alPays.size
}