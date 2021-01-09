package com.bishaljung.softuserclone.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bishaljung.softuserclone.R

class AddStdntFragment :Fragment(){
    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
}
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.activity_fragment_add,container, false)
        return view
    }

}