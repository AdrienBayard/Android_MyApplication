package com.example.mod5tp02unehistoire

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Histoire(var prenom: String = "Simon", var lieu: String = "Chateau"): Parcelable

