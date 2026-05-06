package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ReplaceOff: ImageVector
    get() {
        if (_replaceOff != null) return _replaceOff!!
        _replaceOff = tablerOutlineIcon(
            name = "ReplaceOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 3h1c.552 0 1 .448 1 1v1M8.697 8.717C8.51 8.898 8.26 9 8 9h-4C3.448 9 3 8.552 3 8v-4c0-.28 .115-.532 .3-.714")
            addPathData("M19 15h1c.552 0 1 .448 1 1v1M20.697 20.717c-.187 .181-.437 .283-.697 .283h-4c-.552 0-1-.448-1-1v-4c0-.28 .115-.532 .3-.714")
            addPathData("M21 11v-3C21 6.895 20.105 6 19 6h-6l3 3M16 3 13 6")
            addPathData("M3 13v3c0 1.105 .895 2 2 2h6L8 15M8 21l3-3")
            addPathData("M3 3 21 21")
        }
        return _replaceOff!!
    }

private var _replaceOff: ImageVector? = null
