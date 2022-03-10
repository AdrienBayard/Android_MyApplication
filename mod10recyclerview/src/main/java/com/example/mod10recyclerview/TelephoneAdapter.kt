package com.example.mod10recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.mod10recyclerview.databinding.LineTelephoneBinding

class TelephoneAdapter(val listTelephones : ArrayList<Telephone>):
    RecyclerView.Adapter<TelephoneAdapter.TelViewHolder>(){

    // Classe qui est le conteneur d'un élément de liste
    class TelViewHolder(val itemList : LineTelephoneBinding)
        : RecyclerView.ViewHolder(itemList.root)

    // Va créer le TelViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TelViewHolder {
        val dbLineTel = DataBindingUtil.inflate<LineTelephoneBinding>(
            LayoutInflater.from(parent.context),
            R.layout.line_telephone,
            parent,
            false
        )
        return TelViewHolder(dbLineTel)
    }

    override fun onBindViewHolder(holder: TelViewHolder, position: Int) {
        holder.itemList.telephone = listTelephones[position]
    }

    override fun getItemCount(): Int = listTelephones.size

}