fun main(args: Array<String>) {



    val ch1="abcde"
    val ch2="ace"

    println(funi(ch1,ch2))


}


fun funi(ch1:String,ch2: String):Int{
    var x=ch1.length
    var y=ch2.length

    val dp=Array(x+1) { IntArray(y+1)}

    for ( i in 0..x){
        for (j in 0..y){
            if ( i ==0 || j==0){
                dp[i][j]=0
            }else
                if ( ch1[i-1] == ch2[j-1]){

                    dp[i][j] =1+dp[i-1][j-1]
                }else
                    dp[i][j]= maxOf(dp[i-1][j],dp[i][j-1])
        }
    }

    return dp[x][y]

}

