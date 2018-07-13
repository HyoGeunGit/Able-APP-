package kr.co.highton.slacks.sim

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.content.res.ResourcesCompat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView

/**
 * Created by Kinetic on 2018-06-02.
 */

class AdFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_ad, container, false)
        view.findViewById<Button>(R.id.summer_btn).setOnClickListener { changeSelect(it) }
        view.findViewById<Button>(R.id.winter_btn).setOnClickListener { changeSelect(it) }

        return view
    }

    var season = "summer"


    private fun changeSelect(v: View) {

        when ((v as Button).text.toString()) {
            "휠체어 연결" -> {
                view!!.findViewById<Button>(R.id.summer_btn).background = ResourcesCompat.getDrawable(resources, R.drawable.round_effect_select, null)
                view!!.findViewById<Button>(R.id.winter_btn).background = ResourcesCompat.getDrawable(resources, R.drawable.round_effect_unselect, null)
                season = "summer"
            }

            "지팡이 연결" -> {
                view!!.findViewById<Button>(R.id.winter_btn).background = ResourcesCompat.getDrawable(resources, R.drawable.round_effect_select, null)
                view!!.findViewById<Button>(R.id.summer_btn).background = ResourcesCompat.getDrawable(resources, R.drawable.round_effect_unselect, null)
                season = "winter"
            }
        }
    }
}