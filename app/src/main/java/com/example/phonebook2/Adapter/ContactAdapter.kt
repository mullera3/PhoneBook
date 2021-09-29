package com.example.phonebook2.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.phonebook2.R
import com.example.phonebook2.models.PhoneBookContact

class ContactAdapter(private val contacts: List<PhoneBookContact>): RecyclerView.Adapter<ContactAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactAdapter.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val contactItemView = inflater.inflate(R.layout.contact_item_list, parent, false)
        return ViewHolder(contactItemView)
    }

    override fun onBindViewHolder(holder: ContactAdapter.ViewHolder, position: Int) {
        val contact = contacts.get(position)
        holder.contactName.text = contact.getContactName()
        holder.phoneNumber.text = contact.getPhoneBookNumber()
    }



    override fun getItemCount(): Int {
       return contacts.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val contactName = itemView.findViewById<TextView>(R.id.name)
        val phoneNumber = itemView.findViewById<TextView>(R.id.phoneNumber)

    }
}