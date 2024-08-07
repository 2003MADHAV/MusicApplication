package com.example.musicapplication

import android.app.Activity
import android.media.MediaPlayer
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AbsListView.RecyclerListener
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.core.net.toUri
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

/*
class MyAdapter(val context :Activity,val datalist:List<Data>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>()
  {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        // crreate the view in case thrw layout manager fails to create view for the dta
        val itemView = LayoutInflater.from(context).inflate(R.layout.activity_main, parent, false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return datalist.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        //populate the data into the view
        val curreentData = datalist[position]

        val mediaPlayer = MediaPlayer.create(context, curreentData.preview.toUri())

        holder.title.text = curreentData.title

        Picasso.get().load(curreentData.album.cover).into(holder.image);

        holder.playPause.setOnClickListener {
            if (mediaPlayer.isPlaying) {
                mediaPlayer.pause()
                holder.playPause.setImageResource(android.R.drawable.ic_media_play)
            } else {
                mediaPlayer.start()
                holder.playPause.setImageResource(android.R.drawable.ic_media_pause)
            }
        }

        holder.next.setOnClickListener {
            mediaPlayer.reset()
            val nextPosition = if (position + 1 < itemCount) position + 1 else 0
            val nextData = datalist[nextPosition]
            mediaPlayer.setDataSource(context, Uri.parse(nextData.preview))
            mediaPlayer.prepare()
            mediaPlayer.start()
            holder.title.text = nextData.title
            Picasso.get().load(nextData.album.cover).into(holder.image)
        }

        holder.prev.setOnClickListener {
            mediaPlayer.reset()
            val prevPosition = if (position - 1 >= 0) position - 1 else itemCount - 1
            val prevData = datalist[prevPosition]
            mediaPlayer.setDataSource(context, Uri.parse(prevData.preview))
            mediaPlayer.prepare()
            mediaPlayer.start()
            holder.title.text = prevData.title
            Picasso.get().load(prevData.album.cover).into(holder.image)
        }
    }

    }
    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val playPause: ImageButton
        val image: ImageView
        val title: TextView
        //val play: ImageButton
        //val pause: ImageButton
        val next: ImageButton
        val prev: ImageButton

        init {
            image = itemView.findViewById(R.id.iv_album_art)
            title = itemView.findViewById(R.id.tv_song_title)
            playPause=itemView.findViewById(R.id.btn_play_pause)
           // play = itemView.findViewById(R.id.btn_play_pause)
           // pause = itemView.findViewById(R.id.btn_play_pause) // Assuming the same button for play/pause toggle
            next = itemView.findViewById(R.id.btn_next)
            prev = itemView.findViewById(R.id.btn_previous)
        }

    }

}

 */



class MyAdapter(val context: Activity, val dataList: List<Data>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.iv_album_art)
        val title: TextView = itemView.findViewById(R.id.tv_song_title)
        val playPause: ImageButton = itemView.findViewById(R.id.btn_play_pause)
        val next: ImageButton = itemView.findViewById(R.id.btn_next)
        val prev: ImageButton = itemView.findViewById(R.id.btn_previous)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        // Inflate the item layout
        val itemView = LayoutInflater.from(context).inflate(R.layout.activity_main, parent, false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        // Populate the data into the view
        val currentData = dataList[position]

        val mediaPlayer = MediaPlayer.create(context, currentData.preview.toUri())

        holder.title.text = currentData.title

        Picasso.get().load(currentData.album.cover).into(holder.image)

        holder.playPause.setOnClickListener {
            if (mediaPlayer.isPlaying) {
                mediaPlayer.pause()
                holder.playPause.setImageResource(android.R.drawable.ic_media_play)
            } else {
                mediaPlayer.start()
                holder.playPause.setImageResource(android.R.drawable.ic_media_pause)
            }
        }

        holder.next.setOnClickListener {
            mediaPlayer.reset()
            val nextPosition = if (position + 1 < itemCount) position + 1 else 0
            val nextData = dataList[nextPosition]
            mediaPlayer.setDataSource(context, Uri.parse(nextData.preview))
            mediaPlayer.prepare()
            mediaPlayer.start()
            holder.title.text = nextData.title
            Picasso.get().load(nextData.album.cover).into(holder.image)
        }

        holder.prev.setOnClickListener {
            mediaPlayer.reset()
            val prevPosition = if (position - 1 >= 0) position - 1 else itemCount - 1
            val prevData = dataList[prevPosition]
            mediaPlayer.setDataSource(context, Uri.parse(prevData.preview))
            mediaPlayer.prepare()
            mediaPlayer.start()
            holder.title.text = prevData.title
            Picasso.get().load(prevData.album.cover).into(holder.image)
        }
    }
}