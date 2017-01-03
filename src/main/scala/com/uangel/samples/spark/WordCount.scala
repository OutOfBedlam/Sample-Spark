package com.uangel.samples.spark

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._

object WordCount {


  def main(args: Array[String]): Unit = {
    println("Hello, world!")

    val conf = new SparkConf().setMaster("local").setAppName("My App")
    val sc = new SparkContext(conf)

    val input = sc.textFile("/Users/eirny/Work/Data/README.md")
    val words = input.flatMap(line => line.split(" "))
    val counts = words.map(word => (word, 1)).reduceByKey{ case (x, y) => x + y }

    counts.foreach{ case (k, count) => println(s"$k : $count") }

  }
}
