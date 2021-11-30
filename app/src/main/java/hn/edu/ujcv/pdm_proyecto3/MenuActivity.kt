package hn.edu.ujcv.pdm_proyecto3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_menu.*
import kotlin.random.Random


class MenuActivity : AppCompatActivity() {

    private val exampleList = generateDummyList(500)
    private val adapter = Adapter(exampleList)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        setSupportActionBar(findViewById(R.id.my_toolbar))


        recycler_view.adapter = adapter
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.setHasFixedSize(true)
    }




    private fun generateDummyList(size: Int): ArrayList<ExampleItem> {

        val list = ArrayList<ExampleItem>()

        for (i in 0 until size) {
            val drawable = when (i % 3) {
                0 -> R.drawable.
                1 -> R.drawable.
                2 -> R.drawable.
                3 -> R.drawable.
                4 -> R.drawable.
                5 -> R.drawable.
                        else ->


            }

            val item = ExampleItem(drawable, "Item $i", "Line 2")

            list += item
        }

        return list
    }
}


}