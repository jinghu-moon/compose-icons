package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BooksOff: ImageVector
    get() {
        if (_booksOff != null) return _booksOff!!
        _booksOff = tablerOutlineIcon(
            name = "BooksOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 9v10c0 .552-.448 1-1 1h-2C5.448 20 5 19.552 5 19v-14")
            addPathData("M8 4c.552 0 1 .448 1 1")
            addPathData("M9 5C9 4.448 9.448 4 10 4h2c.552 0 1 .448 1 1v4")
            addPathData("M13 13v6c0 .552-.448 1-1 1h-2C9.448 20 9 19.552 9 19v-10")
            addPathData("M5 8h3")
            addPathData("M9 16h4")
            addPathData("M14.254 10.244 13.036 5.82c-.135-.509 .14-1.037 .634-1.219l.133-.041 2.184-.53c.562-.135 1.133 .19 1.282 .732l3.236 11.75")
            addPathData("M19.585 19.589l-1.572 .38c-.562 .136-1.133-.19-1.282-.731l-.952-3.458")
            addPathData("M14 9 18 8")
            addPathData("M19.207 15.199l.716-.18")
            addPathData("M3 3 21 21")
        }
        return _booksOff!!
    }

private var _booksOff: ImageVector? = null
