package rharj.com.recyclerviewexample.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import rharj.com.recyclerviewexample.R
import rharj.com.recyclerviewexample.adapter.AnimalListAdapter
import rharj.com.recyclerviewexample.model.AnimalModel

class MainActivity : AppCompatActivity() {

   var animalList :  ArrayList<AnimalModel> = ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializeControls()
    }

    private fun initializeControls() {

        animal_list.layoutManager = LinearLayoutManager(this)
        animal_list.adapter = AnimalListAdapter(animalList,this)

        itemList();
    }

    private fun itemList(){
        var animalModel : AnimalModel = AnimalModel("Lion")
        animalList.add(animalModel)

        animalModel = AnimalModel("Wolf")
        animalList.add(animalModel)

        animalModel = AnimalModel("Cheetah")
        animalList.add(animalModel)

        animalModel = AnimalModel("Zebra")
        animalList.add(animalModel)

        animalModel = AnimalModel("Porcupine")
        animalList.add(animalModel)

        animalModel = AnimalModel("rat")
        animalList.add(animalModel)

        animalModel = AnimalModel("goose")
        animalList.add(animalModel)

        animalModel = AnimalModel("deer")
        animalList.add(animalModel)

        animalModel = AnimalModel("mouse")
        animalList.add(animalModel)

        animalModel = AnimalModel("porcupine")
        animalList.add(animalModel)

        animalModel = AnimalModel("bison")
        animalList.add(animalModel)

        animalModel = AnimalModel("Snake")
        animalList.add(animalModel)

        animalModel = AnimalModel("fox")
        animalList.add(animalModel)

        animalModel = AnimalModel("moose")
        animalList.add(animalModel)

        animalModel = AnimalModel("buffalo")
        animalList.add(animalModel)

        animalModel = AnimalModel("monkey")
        animalList.add(animalModel)

        animalModel = AnimalModel("penguin")
        animalList.add(animalModel)

        animalModel = AnimalModel("parrot")
        animalList.add(animalModel)
    }
}
