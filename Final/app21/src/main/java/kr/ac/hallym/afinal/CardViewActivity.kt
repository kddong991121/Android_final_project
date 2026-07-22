package kr.ac.hallym.afinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kr.ac.hallym.afinal.databinding.ActivityCardViewBinding

class CardViewActivity : AppCompatActivity() {
    lateinit var binding: ActivityCardViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_card_view)
        binding = ActivityCardViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val contents1 = mutableListOf(R.drawable.baseball, R.drawable.lake, R.drawable.test)
        val contents2 = mutableListOf<String>("야구장", "호수", "등산열차")
        val contents3 = mutableListOf<String>("야구장은..", "호수는...", "등산열차는...")


        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = MyAdapter(contents1, contents2, contents3)
        binding.recyclerView.addItemDecoration(
            DividerItemDecoration(this, LinearLayoutManager.VERTICAL)
        )
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {// 액션바에 [로그아웃]버튼 삽입
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId //item id를 가져와서
        if(id ==R.id.logout){ // id가 로그아웃버튼의 id와 일치하면 인트로화면으로 이동
            val intent = Intent(this,IntroActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "인트로 화면으로 돌아갑니다.", Toast.LENGTH_SHORT).show();
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
}

