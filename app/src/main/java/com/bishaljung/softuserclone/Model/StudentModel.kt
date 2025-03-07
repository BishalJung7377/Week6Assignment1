package com.bishaljung.softuserclone.Model

import android.os.Parcel
import android.os.Parcelable

class StudentModel(
    val studentName: String? = null,
    val studentAge: String? = null,
    val sudentGender: String? = null,
    val studentLocation: String?= null,
    val studentImage: String? = null,
        ):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(studentName)
        parcel.writeString(studentAge)
        parcel.writeString(sudentGender)
        parcel.writeString(studentLocation)
        parcel.writeString(studentImage)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<StudentModel> {
        override fun createFromParcel(parcel: Parcel): StudentModel {
            return StudentModel(parcel)
        }

        override fun newArray(size: Int): Array<StudentModel?> {
            return arrayOfNulls(size)
        }
    }
}