package com.bishaljung.softuserclone.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bishaljung.softuserclone.Adapter.StudentDetailAdapter
import com.bishaljung.softuserclone.Model.StudentModel

import com.bishaljung.softuserclone.R
import com.bishaljung.softuserclone.UserDataObject.StudentDataObject

class HomeFragment : Fragment() {
    //  private var newPost = ArrayList<StudentNewPost>()
    private var studentList = ArrayList<StudentModel>()
    private lateinit var recyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        StudentDataObject.loadStudent();
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.activity_fragment_home, container, false)
//        studentdata
        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.adapter?.notifyDataSetChanged()

        val adapter = context?.let { StudentDetailAdapter(StudentDataObject.studentList) }
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = adapter

//
//        recyclerView = view.findViewById(R.id.recyclerView)
//        recyclerView.adapter?.notifyDataSetChanged()
//        recyclerView.setHasFixedSize(true)
//        val adapter = context?.let {StudentDetailAdapter(StudentDataObject.studentList)}
//        recyclerView.layoutManager = LinearLayoutManager(requireContext())
//        recyclerView.adapter = adapter
    }
}


























