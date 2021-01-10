package com.bishaljung.softuserclone.Fragments

import android.os.Bundle
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.fragment.app.Fragment
import com.bishaljung.softuserclone.R

class AddStdntFragment :Fragment(){
    private lateinit var etFullName: EditText
    private lateinit var etAge: EditText
    private lateinit var etAddress: EditText
    private lateinit var radioGroup: RadioGroup
    private lateinit var radioMale: RadioButton
    private lateinit var radioFemale: RadioButton
    private lateinit var radioOther: RadioButton
    private lateinit var etImageurl: EditText
    private lateinit var btnAddstdnt: Button
    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
}
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.activity_fragment_add,container, false)

        etFullName= view.findViewById(R.id.etFullName)
        etAge = view.findViewById(R.id.etAge)
        etAddress = view.findViewById(R.id.etAge)
        radioGroup = view.findViewById(R.id.radioGroup)
        radioMale = view.findViewById(R.id.radioMale)
        radioFemale = view.findViewById(R.id.radioFemale)
        radioOther = view.findViewById(R.id.radioOther)
        etImageurl = view.findViewById(R.id.etImageurl)
        btnAddstdnt = view.findViewById(R.id.btnAddstdnt)

        return view
    }

}