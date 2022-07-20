package com.afterclass.twitterfeedlayout.data

class tweetModel {
    val image:String
    val name:String
    val username:String
    val date:String
    val tweet:String

    constructor(image: String, name: String, username: String, date: String, tweet: String) {
        this.image = image
        this.name = name
        this.username = username
        this.date = date
        this.tweet = tweet
    }

}