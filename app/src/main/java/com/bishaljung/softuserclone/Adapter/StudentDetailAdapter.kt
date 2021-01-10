package com.bishaljung.softuserclone.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bishaljung.softuserclone.Model.StudentModel
import com.bishaljung.softuserclone.R
import com.bumptech.glide.Glide
import de.hdodenhof.circleimageview.CircleImageView


class StudentDetailAdapter(
    val studentList: ArrayList<StudentModel>,
    val context: Context
) : RecyclerView.Adapter<StudentDetailAdapter.StudentDetailViewHolder>() {
    class StudentDetailViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imgstudent: CircleImageView
        val tvstudentname: TextView
        val tvStudentAge: TextView
        val tvstudentLocation: TextView
        val tvGender: TextView

        init {
            imgstudent = view?.findViewById(R.id.imgstudent)
            tvstudentname = view?.findViewById(R.id.tvstudentname)
            tvStudentAge = view?.findViewById(R.id.tvStudentAge)
            tvstudentLocation = view?.findViewById(R.id.tvstudentLocation)
            tvGender = view?.findViewById(R.id.tvGender)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentDetailViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_students, parent, false)
        return StudentDetailViewHolder(view)
    }

    override fun onBindViewHolder(holder: StudentDetailViewHolder, position: Int) {
        val studentDetail = studentList[position]
        Glide.with(context).load(studentDetail.studentImage).into(holder.imgstudent)
        holder.tvstudentname.text = studentDetail.studentName
        holder.tvStudentAge.text = studentDetail.studentAge
        holder.tvstudentLocation.text = studentDetail.studentLocation
        holder.tvGender.text = studentDetail.sudentGender
    }

    override fun getItemCount(): Int {
        return studentList.size
    }
}