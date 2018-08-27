package rharj.com.recyclerviewexample.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import kotlinx.android.synthetic.main.item_list.view.*
import rharj.com.recyclerviewexample.model.AnimalModel
import android.view.View
import android.view.ViewGroup
import rharj.com.recyclerviewexample.R
import rharj.com.recyclerviewexample.listeners.OnAnimalClick

class AnimalListAdapter(private val items : ArrayList<AnimalModel>, private val context: Context,private val onAnimalClick: OnAnimalClick):RecyclerView.Adapter<AnimalListAdapter.ViewHolder>(){
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder?.animalType?.text = items[position].animalName
        holder?.animalType?.setOnClickListener(View.OnClickListener {
            onAnimalClick?.onAnimalClick(items[position])
        })
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