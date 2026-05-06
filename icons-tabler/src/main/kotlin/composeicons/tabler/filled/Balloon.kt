package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Balloon: ImageVector
    get() {
        if (_balloon != null) return _balloon!!
        _balloon = tablerFilledIcon(
            name = "Balloon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 1c3.866 0 7 3.134 7 7 0 5.457-3.028 10-7 10C8.1 18 5.11 13.621 5.003 8.297L5 8l.004-.24C5.133 3.99 8.227 1 12 1ZM12 5c-.552 0-1 .448-1 1 0 .552 .448 1 1 1l.117 .007c.503 .059 .883 .486 .883 .993l.007 .117c.062 .525 .523 .911 1.052 .88C14.587 8.966 14.999 8.529 15 8 15 6.343 13.657 5 12 5Z")
            addPathData("M12 16c.507 0 .934 .38 .993 .883L13 17v1c0 1.589-1.238 2.902-2.824 2.995L10 21h-3c-.507 0-.934 .38-.993 .883L6 22c0 .552-.448 1-1 1C4.448 23 4 22.552 4 22 4 20.411 5.238 19.098 6.824 19.005L7 19h3c.507-0 .934-.38 .993-.883L11 18v-1c0-.552 .448-1 1-1Z")
        }
        return _balloon!!
    }

private var _balloon: ImageVector? = null
