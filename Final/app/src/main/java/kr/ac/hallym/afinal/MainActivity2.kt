package kr.ac.hallym.afinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {
    private lateinit var personList: List<Person>
    private lateinit var adapter: Adapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_list)

        personList = ArrayList()
        personList = loadData()

        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = Adapter(personList)
        recyclerView.adapter = adapter
    }

    private fun loadData(): List<Person> {
        val people = ArrayList<Person>()

        val title = resources.getStringArray(R.array.titles)
        val images = resources.obtainTypedArray(R.array.images)
        val contents = resources.getStringArray(R.array.contents)

        for (i in title.indices) {
            val person = Person().apply {
                name = title[i]
                image = images.getResourceId(i, -1)
                content = contents[i]
            }
            people.add(person)
        }
        return people
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle presses on the action bar items
        when (item.itemId) {
            R.id.logout -> {
                val intent = Intent(this, IntroActivity::class.java)
                startActivity(intent)
                return true
            }
            else -> {
                return super.onOptionsItemSelected(item)
            }
        }
    }
}