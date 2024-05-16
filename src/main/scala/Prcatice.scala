import org.apache.log4j.{Level, Logger}
import org.apache.spark.sql.DataFrame


object Prcatice extends App{

  import org.apache.spark.sql.SparkSession
  import org.apache.log4j._

  Logger.getLogger("org").setLevel(Level.ERROR)

  // Create a SparkSession
  val spark = SparkSession.builder()
    .appName("DataFrameExample")
    .master("local[*]")
    .getOrCreate()

  // Create a DataFrame from a sequence of tuples
  val data = Seq(("John", 25), ("Alice", 30), ("Bob", 35))
  val df:DataFrame = spark.createDataFrame(data).toDF("Name", "Age")

  // Show the DataFrame
  df.show()


}
