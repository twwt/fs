import scala.util.matching.Regex
import scala.xml.{NodeSeq, Node}
import scala.xml.parsing.NoBindingFactoryAdapter
import java.io.StringReader
import org.xml.sax.InputSource
import nu.validator.htmlparser.sax.HtmlParser
import nu.validator.htmlparser.common.XmlViolationPolicy

/**
 * Created by taishi on 2016/01/26.
 */
trait Scrap {
  val baseUrl: String
  val ignoreRegex: String
  val fetchRegex: String
  val cache: String
  val threads: Int
}
