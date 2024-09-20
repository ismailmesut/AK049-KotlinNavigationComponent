package com.ismailmesutmujde.kotlinnavigationcomponent

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.ismailmesutmujde.kotlinnavigationcomponent.databinding.FragmentGameScreenBinding


class GameScreenFragment : Fragment() {

    private lateinit var bindingGameScreen : FragmentGameScreenBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        bindingGameScreen = FragmentGameScreenBinding.inflate(inflater, container, false)
        val view = bindingGameScreen.root

        val bundle : GameScreenFragmentArgs by navArgs()

        val incomingName = bundle.name
        val incomingAge = bundle.age
        val incomingHeight = bundle.height
        val incomingAreYouSingle = bundle.areYouSingle
        val incomingObject = bundle.obj

        Log.e("Incoming Name", incomingName)
        Log.e("Incoming Age", incomingAge.toString())
        Log.e("Incoming Height", incomingHeight.toString())
        Log.e("Incoming Are You Single", incomingAreYouSingle.toString())
        Log.e("Incoming Person No", incomingObject.person_no.toString())
        Log.e("Incoming Person Name", incomingObject.person_name)

        bindingGameScreen.buttonFinish.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_gameScreenFragment_to_resultScreenFragment)
        }

        return view
    }

}