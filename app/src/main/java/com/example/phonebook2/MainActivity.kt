package com.example.phonebook2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.phonebook2.Adapter.ContactAdapter
import com.example.phonebook2.models.PhoneBookContact

class MainActivity : AppCompatActivity() {
    val contacts : MutableList<PhoneBookContact> = mutableListOf()
    var adapter: ContactAdapter? = null

    companion object {
        fun getContacts(): List<PhoneBookContact> {
            val contacts = mutableListOf<PhoneBookContact>()
            contacts.add(PhoneBookContact("Name: Amani","Phone Number: 9907869078"))
            contacts.add(PhoneBookContact("Name: Amani","Phone Number: 9907869078"))
            contacts.add(PhoneBookContact("Name: Amani","Phone Number: 9907869078"))
            contacts.add(PhoneBookContact("Name: Amani","Phone Number: 9907869078"))
            contacts.add(PhoneBookContact("Name: Amani","Phone Number: 9907869078"))
            return contacts
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        contacts.addAll(getContacts())

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        adapter = ContactAdapter(contacts)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        val contactTextView: TextView = findViewById(R.id.contactNameView)
        val phoneNumberTextView: TextView = findViewById(R.id.phoneNumberView)
        contactTextView.text = "Amani"
        phoneNumberTextView.text = "809i90"

    }
}