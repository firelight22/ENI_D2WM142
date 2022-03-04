package com.example.mod5nav

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(val email : String ="",val password : String="") : Parcelable