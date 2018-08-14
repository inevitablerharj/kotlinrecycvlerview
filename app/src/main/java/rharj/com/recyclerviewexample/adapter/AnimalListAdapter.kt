package rharj.com.recyclerviewexample.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import kotlinx.android.synthetic.main.item_list.view.*
import rharj.com.recyclerviewexample.model.AnimalModel
import android.view.View
import android.view.ViewGroup
import rharj.com.recyclerviewexample.R

class AnimalListAdapter(val items : ArrayList<AnimalModel>, val context: Context) :RecyclerView.Adapter<AnimalListAdapter.ViewHolder>(){
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder?.animalType?.text = items[position].animalName
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_list, parent, false))
    }

    override fun getItemCount(): Int {

        return items.size
    }

    class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
        // Holds the TextView that will add each animal to
        val animalType = view.animal_text
    }
}