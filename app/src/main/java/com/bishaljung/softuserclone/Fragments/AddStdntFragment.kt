package com.bishaljung.softuserclone.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import com.bishaljung.softuserclone.Model.StudentModel
import com.bishaljung.softuserclone.R
import com.bishaljung.softuserclone.UserDataObject.StudentDataObject

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
    var usergender=""

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
        etAddress = view.findViewById(R.id.etAddress)
        radioGroup = view.findViewById(R.id.radioGroup)
        radioMale = view.findViewById(R.id.radioMale)
        radioFemale = view.findViewById(R.id.radioFemale)
        radioOther = view.findViewById(R.id.radioOther)
        etImageurl = view.findViewById(R.id.etImageurl)
        btnAddstdnt = view.findViewById(R.id.btnAddstdnt)

        if(radioMale.isChecked){
            usergender="Male"
        }
        else if(radioFemale.isChecked){
            usergender="Female"
        }
        else if(radioOther.isChecked){
            usergender="other"
        }

        btnAddstdnt.setOnClickListener {
            StudentDataObject.studentList.add(StudentModel(etFullName.text.toString(),etAge.text.toString(), usergender ,etAddress.text.toString(),etImageurl.text.toString()))
            etFullName.setText("")
            etAge.setText("")
            radioMale.isChecked=false
            radioFemale.isChecked=false
            radioOther.isChecked=false
            etImageurl.setText("")
            etAddress.setText("")
        }
        return view
    }


}