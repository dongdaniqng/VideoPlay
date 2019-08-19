package com.ddq.videoplay;

import tv.danmaku.ijk.media.player.IMediaPlayer;

interface VideoPlayerListener extends IMediaPlayer.OnPreparedListener, IMediaPlayer.OnInfoListener,
        IMediaPlayer.OnSeekCompleteListener, IMediaPlayer.OnBufferingUpdateListener, IMediaPlayer.OnErrorListener {

}
