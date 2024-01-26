package com.example.paginationrw

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import coil.load
import com.example.paginationrw.databinding.ItemImgBinding

class PixaViewHolder(private val binding: ItemImgBinding) : ViewHolder(binding.root) {

    fun onBind(image: ImageModel) {
        with(binding) {
            likeTv.text = image.likes.toString()
            pixaImg.load(image.largeImageUrl)
        }
    }
}

class PixaAdapter(var list: ArrayList<ImageModel>) : Adapter<PixaViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PixaViewHolder {
        return PixaViewHolder(
            ItemImgBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: PixaViewHolder, position: Int) {
        holder.onBind(list[position])
    }

}