package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Books: ImageVector
    get() {
        if (_books != null) return _books!!
        _books = tablerOutlineIcon(
            name = "Books",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 5C5 4.448 5.448 4 6 4h2c.552 0 1 .448 1 1v14c0 .552-.448 1-1 1h-2C5.448 20 5 19.552 5 19v-14")
            addPathData("M9 5C9 4.448 9.448 4 10 4h2c.552 0 1 .448 1 1v14c0 .552-.448 1-1 1h-2C9.448 20 9 19.552 9 19v-14")
            addPathData("M5 8h4")
            addPathData("M9 16h4")
            addPathData("M13.803 4.56l2.184-.53c.562-.135 1.133 .19 1.282 .732l3.695 13.418c.135 .509-.14 1.037-.634 1.219l-.133 .041-2.184 .53c-.562 .135-1.133-.19-1.282-.732L13.036 5.82c-.135-.509 .14-1.037 .634-1.219l.133-.041")
            addPathData("M14 9 18 8")
            addPathData("M16 16l3.923-.98")
        }
        return _books!!
    }

private var _books: ImageVector? = null
