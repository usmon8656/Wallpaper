package com.example.helloworld.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.asadullo.wordsapp.databinding.ItemAdapterBinding
import com.asadullo.wordsapp.databinding.ItemWordsBinding
import com.example.helloworld.Models.UserWords

class WordsAdapter(var list: ArrayList<UserWords>) : RecyclerView.Adapter<WordsAdapter.Vh>() {
    inner class Vh(var item: ItemAdapterBinding) : RecyclerView.ViewHolder(item.root) {
        fun onBind(user: UserWords) {
            item.txtEng.text = user.eng
            item.txtUzb.text = user.uzb

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemAdapterBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])
    }

}