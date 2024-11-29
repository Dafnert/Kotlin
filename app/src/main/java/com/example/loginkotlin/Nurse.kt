package com.example.loginkotlin

import android.provider.ContactsContract.CommonDataKinds.Email

class Nurse {
    var email: String  = ""
    var password: String  = ""


        get() {
            return field
        }
        set(value) {
               field = value
        }

    constructor(email: String, password: String)
}