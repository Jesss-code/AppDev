//package DevEra.schoolportalgradule.Adapter
//import DevEra.schoolportalgradule.R
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.recyclerview.widget.RecyclerView
//import com.bumptech.glide.Glide
//import com.bumptech.glide.request.RequestOptions
//import kotlinx.android.synthetic.main.layout_blog_list_item.view.*
//
//import school.portal.kothlinrecyclerviewex.models.Subjects
//
//class BlogRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
//
//    private var items: List<Subjects> = ArrayList()
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
//        return BlogViewHolder(
//
//    }
//
//    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
//
//        when(holder){
//            is BlogViewHolder ->{
//                holder.bind(items.get(position))
//            }
//        }
//    }
//
//    override fun getItemCount(): Int {
//        return  items.size
//    }
//
//    fun submitList(blogList: List<Subjects>){
//        items = blogList
//    }
//
//
//    class BlogViewHolder constructor(
//        itemView: View
//    ): RecyclerView.ViewHolder(itemView){
//        val blogImage  = itemView.blog_image
//        val blogTitle = itemView.blog_title
//        val blogAuthor = itemView.blog_author
//        val blogBody = itemView.blog_body
//
//        fun bind(subjects: Subjects){
//            blogTitle.setText(subjects.subjectName)
//            blogAuthor.setText(subjects.subjectEnd)
//
//            val requestOption = RequestOptions()
//                .placeholder(R.drawable.ic_launcher_background)
//                .error(R.drawable.ic_launcher_background)
//
//            Glide.with(itemView.context)
//                .applyDefaultRequestOptions(requestOption)
//                .load(subjects.subjectImage)
//                .into(blogImage)
//        }
//    }
//}