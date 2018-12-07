/*
# Program      : Streaming the data.scala
# Date Created : 07/03/2018
# Description  : This is a Main class for Streaming Job
# Parameters   :
#
# Modification history:
#
# Date         Author               Description
# ===========  ===================  ============================================
# 09/03/2018   Anand Ayyasamy        Creation
# ===========  ===================  ============================================
*/
package com.org.data.spark.app

import org.apache.spark.sql.SparkSession





object Hello_spark {
    // run it in windows
    System.setProperty("hadoop.home.dir", "C:\\software\\hadoop");

    def main(args: Array[String]): Unit = {

    val spark = SparkSession
      .builder()
      .appName("Welcome to Spark 2.+++")
      .master("local[*]")
      .getOrCreate();

    import spark.implicits._

      Seq(("Honda","accord",2012),("Honda","civic",2009)).toDF("Make","Model","Year").show(false)





  }

}
