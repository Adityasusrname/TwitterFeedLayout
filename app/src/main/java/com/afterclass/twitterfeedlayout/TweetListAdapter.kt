package com.afterclass.twitterfeedlayout

import android.content.Context
import android.graphics.BitmapFactory
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.net.toUri
import androidx.recyclerview.widget.RecyclerView
import com.afterclass.twitterfeedlayout.data.tweetModel

class TweetListAdapter(private val tweets:List<tweetModel>,private val context: Context):RecyclerView.Adapter<TweetListAdapter.ViewHolder>() {

    class ViewHolder(view:View):RecyclerView.ViewHolder(view){

                    val ivDp:ImageView
                    val tvName:TextView
                    val tvUsername:TextView
                    val tvDate:TextView
                    val tvTweet:TextView

                    init {
                        ivDp=view.findViewById(R.id.ivDp)
                        tvName=view.findViewById(R.id.tvName)
                        tvUsername=view.findViewById(R.id.tvUsername)
                        tvDate=view.findViewById(R.id.tvDate)
                        tvTweet=view.findViewById(R.id.tvTweet)
                    }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view=LayoutInflater.from(parent.context).inflate(R.layout.tweet,parent,false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val imageRes=context.resources.getIdentifier(tweets[position].image,"drawable","com.afterclass.twitterfeedlayout")
        holder.ivDp.setImageResource(imageRes)
        holder.tvName.text=tweets[position].name
        holder.tvUsername.text=tweets[position].username
        holder.tvDate.text=tweets[position].date
        holder.tvTweet.text=tweets[position].tweet


    }

    override fun getItemCount()=tweets.size
}