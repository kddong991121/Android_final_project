package kr.ac.hallym.afinal

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class Adapter( //일반적인 RecyclerView의 Adapter를 구현
    private val personList: List<Person>
) : RecyclerView.Adapter<Adapter.MyViewHolder>() {

    class MyViewHolder(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {
        fun bind(person: Person) {
            val txtName = itemView.findViewById<TextView>(R.id.txt_name)
            val imgPhoto = itemView.findViewById<CircleImageView>(R.id.img_photo)
            val imgMore = itemView.findViewById<ImageButton>(R.id.img_more)
            val layoutExpand = itemView.findViewById<LinearLayout>(R.id.layout_expand)
            val txtContent = itemView.findViewById<TextView>(R.id.txt_content)

            txtName.text = person.name
            imgPhoto.setImageResource(person.image)
            txtContent.text = person.content

            imgMore.setOnClickListener {
                // 처음에 화살표 이미지를 클릭하면 toggleLayout() 함수를 호출
                // togglerLayout() 함수를 통해 expand와 collpase를 구현.
                val show = toggleLayout(!person.isExpanded, it, layoutExpand)
                person.isExpanded = show
            }
        }

        private fun toggleLayout(isExpanded: Boolean, view: View, layoutExpand: LinearLayout): Boolean {
            //  ToggleAnimation의 toggleArrow를 호출.
            //  toggleLayout메서드는 isExpaned의 여부에 따라 화살표를 회전.
            ToggleAnimation.toggleArrow(view, isExpanded)
            if (isExpanded) {
                ToggleAnimation.expand(layoutExpand)
            } else {
                ToggleAnimation.collapse(layoutExpand)
            }
            return isExpanded
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_row, parent, false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(personList[position])
    }

    override fun getItemCount(): Int {
        return personList.size
    }

}