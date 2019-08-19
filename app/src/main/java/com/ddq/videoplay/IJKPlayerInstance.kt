package com.ddq.videoplay

import tv.danmaku.ijk.media.player.IjkMediaPlayer

class IJKPlayerInstance private constructor() {


    companion object {
        private var ijkMediaPlayer: IjkMediaPlayer? = null

        @JvmStatic
        fun getIJKPlayer(): IjkMediaPlayer {
            if (ijkMediaPlayer == null) {
                synchronized(this) {
                    ijkMediaPlayer = IjkMediaPlayer()
                    IjkMediaPlayer.native_setLogLevel(IjkMediaPlayer.IJK_LOG_DEBUG)
                }
            }
            return ijkMediaPlayer!!
        }
    }

}