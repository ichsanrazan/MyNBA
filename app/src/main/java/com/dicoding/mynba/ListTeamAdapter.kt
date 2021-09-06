package com.dicoding.mynba

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListTeamAdapter(private val listTeam: ArrayList<Team>) : RecyclerView.Adapter<ListTeamAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.layout_listteam, viewGroup, false)
        return ListViewHolder(view)
    }
    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val team = listTeam[position]
        Glide.with(holder.itemView.context)
            .load(team.photo)
            .apply(RequestOptions())
            .into(holder.imgPhoto)
        holder.tvName.text = team.name
        holder.tvDetail.text = team.detail
        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listTeam[holder.adapterPosition]) }

        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener {
            val moveDetail = Intent(mContext, detail_team::class.java)
            moveDetail.putExtra(detail_team.EXTRA_NAME, team.name)
            moveDetail.putExtra(detail_team.EXTRA_PHOTO, team.photo)
            moveDetail.putExtra(detail_team.EXTRA_IDENTITY, team.detail)
            moveDetail.putExtra(detail_team.EXTRA_OVERVIEW, team.overview)
            mContext.startActivity(moveDetail)
        }

    }

    override fun getItemCount(): Int {
        return listTeam.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)

    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Team)
    }
}