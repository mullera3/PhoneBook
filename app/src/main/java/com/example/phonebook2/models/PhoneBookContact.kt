package com.example.phonebook2.models

class PhoneBookContact(private val contactName: String, private val phoneBookNumber: String ) {
    fun getContactName(): String {
        return contactName
    }

    fun getPhoneBookNumber(): String {
        return phoneBookNumber
    }
}