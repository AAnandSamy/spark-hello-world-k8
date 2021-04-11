/*
# Program      : Hello_Spark.scala
# Date Created : 07/03/2018
# Description  : Hello to spark app
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

  def main(args: Array[String]): Unit = {

    val spark = SparkSession
      .builder()
      .appName("Welcome to Spark 2.+++")
      .getOrCreate();

    import spark.implicits._

    Seq(("Honda", "accord", 2012), ("Honda", "civic", 2009))
      .toDF("Make", "Model", "Year")
      .show(false)


  }

}
