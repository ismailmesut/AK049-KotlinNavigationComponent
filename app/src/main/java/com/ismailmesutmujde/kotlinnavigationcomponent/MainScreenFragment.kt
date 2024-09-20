package com.ismailmesutmujde.kotlinnavigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ismailmesutmujde.kotlinnavigationcomponent.databinding.FragmentMainScreenBinding


class MainScreenFragment : Fragment() {

    private lateinit var bindingMainScreen : FragmentMainScreenBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        bindingMainScreen = FragmentMainScreenBinding.inflate(inflater, container, false)
        val view = bindingMainScreen.root

        bindingMainScreen.buttonStart.setOnClickListener {
            val person = Persons(1, "mesut")
            val transition = MainScreenFragmentDirections.actionMainScreenFragmentToGameScreenFragment("ismail", person,18, 1.78f, true)
            Navigation.findNavController(it).navigate(transition)
        }

        return view
    }

}