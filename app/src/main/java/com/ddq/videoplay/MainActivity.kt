package com.ddq.videoplay

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //ijk.setVideoPath("http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4")

        rcy.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val playerAdapter = PlayerAdapter(
                arrayListOf(
//                        "http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4",
//                        "http://vjs.zencdn.net/v/oceans.mp4",
//                        "https://media.w3.org/2010/05/sintel/trailer.mp4",
//                        "http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4",
//                        "http://vjs.zencdn.net/v/oceans.mp4",
//                        "https://media.w3.org/2010/05/sintel/trailer.mp4",
//                        "http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4",
//                        "http://vjs.zencdn.net/v/oceans.mp4",
//                        "https://media.w3.org/2010/05/sintel/trailer.mp4",
//                        "http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4",
//                        "http://vjs.zencdn.net/v/oceans.mp4",
//                        "https://media.w3.org/2010/05/sintel/trailer.mp4",
//                        "http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4",
//                        "http://vjs.zencdn.net/v/oceans.mp4",
//                        "https://media.w3.org/2010/05/sintel/trailer.mp4",
                        "http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4"
                )
        )
        rcy.adapter = playerAdapter
        playerAdapter.notifyDataSetChanged()
    }
}
