package com.example.game2d

import android.graphics.Rect

class Boy(screenH:Int, scale:Float) {
    var w = (100 * scale).toInt()
    var h = (220 * scale).toInt()
    var x = 0
    var y = screenH - h
    var pictNo = 0
    var zoomout = (10 * scale).toInt() //圖片內縮

    fun Walk() {
        pictNo++
        if (pictNo > 7) {

            pictNo = 0
        }
    }

    fun getRect(): Rect {
        return Rect(x+zoomout, y+zoomout,x+w-zoomout,
            y+h-zoomout)

    }
}