package com.ddq.videoplay

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import tv.danmaku.ijk.media.player.IMediaPlayer
import java.util.*

class PlayerAdapter(val data: ArrayList<String>?) : RecyclerView.Adapter<PlayerAdapter.PlayerHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayerHolder {
        return PlayerHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_player, null))
    }

    override fun getItemCount(): Int {
        return data?.size ?: 0
    }

    override fun onBindViewHolder(holder: PlayerHolder, position: Int) {
        holder.run {
            ijk.background = ColorDrawable(if (Random().nextInt(2) == 0)Color.GRAY else Color.YELLOW)
            ijk.setVideoPath(data!![position])
            ijk.setListener(object : VideoPlayerListener {
                override fun onSeekComplete(p0: IMediaPlayer?) {

                }

                override fun onInfo(p0: IMediaPlayer?, p1: Int, p2: Int): Boolean {
                    return false
                }

                override fun onPrepared(p0: IMediaPlayer?) {
                    ijk.start()
                }

                override fun onBufferingUpdate(p0: IMediaPlayer?, p1: Int) {
                }

                override fun onError(p0: IMediaPlayer?, p1: Int, p2: Int): Boolean {
                    return false
                }
            })

        }
    }

    class PlayerHolder(item: View) : RecyclerView.ViewHolder(item) {
        val ijk = item.findViewById<IjkplayerVideoView_TextureView>(R.id.ijk)
    }
}