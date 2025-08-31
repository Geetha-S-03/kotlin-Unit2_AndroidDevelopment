var favoriteActor: String? = "Sandra Oh"
println(favoriteActor!!.length)  // 9

favoriteActor = null
println(favoriteActor!!.length)  // ❌ NullPointerException
