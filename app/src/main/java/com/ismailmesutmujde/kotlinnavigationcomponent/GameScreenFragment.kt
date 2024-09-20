package com.ismailmesutmujde.kotlinnavigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ismailmesutmujde.kotlinnavigationcomponent.databinding.FragmentGameScreenBinding


class GameScreenFragment : Fragment() {

    private lateinit var bindingGameScreen : FragmentGameScreenBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        bindingGameScreen = FragmentGameScreenBinding.inflate(inflater, container, false)
        val view = bindingGameScreen.root

        bindingGameScreen.buttonFinish.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_gameScreenFragment_to_resultScreenFragment)
        }

        return view
    }

}