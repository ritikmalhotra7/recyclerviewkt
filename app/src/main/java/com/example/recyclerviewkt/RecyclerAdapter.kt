package com.example.recyclerviewkt

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewkt.databinding.EmployeeItemsBinding

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    private var name = arrayOf("one", "two", "three", "four", "five","six")
    private var gender = arrayOf("female", "male", "female", "male", "male","female")
    private var role = arrayOf("technical intern", "management department", "product executive", "software developer", "sales","accountant")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val binding = EmployeeItemsBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.binding.gender.setText(gender[position])
        holder.binding.name.setText(name[position])
        holder.binding.role.setText(role[position])
    }

    override fun getItemCount(): Int {
        return name.size
    }
    inner class ViewHolder (val binding : EmployeeItemsBinding) : RecyclerView.ViewHolder(binding.root){

    }
}