import edu.uci.ics.crawler4j.crawler.{CrawlController, CrawlConfig}
import edu.uci.ics.crawler4j.fetcher.PageFetcher
import edu.uci.ics.crawler4j.robotstxt.{RobotstxtServer, RobotstxtConfig}

/**
 * Created by taishi on 2016/01/24.
 */
class Main{
  def main(args: Array[String]): Unit ={
    val crawler = new SearchCrawler
    crawler.siteName = "fashionsnap"
    crawler.start()
  }
}
