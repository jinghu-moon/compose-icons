package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DatabaseSmile: ImageVector
    get() {
        if (_databaseSmile != null) return _databaseSmile!!
        _databaseSmile = tablerOutlineIcon(
            name = "DatabaseSmile",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 14h.01")
            addPathData("M14 14h.01")
            addPathData("M10 17c1.202 .837 2.798 .837 4 0")
            addPathData("M4 6c0 1.657 3.582 3 8 3 4.418 0 8-1.343 8-3C20 4.343 16.418 3 12 3 7.582 3 4 4.343 4 6")
            addPathData("M4 6v12c0 1.657 3.582 3 8 3 4.418 0 8-1.343 8-3v-12")
        }
        return _databaseSmile!!
    }

private var _databaseSmile: ImageVector? = null
