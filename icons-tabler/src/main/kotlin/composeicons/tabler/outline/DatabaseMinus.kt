package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DatabaseMinus: ImageVector
    get() {
        if (_databaseMinus != null) return _databaseMinus!!
        _databaseMinus = tablerOutlineIcon(
            name = "DatabaseMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 6c0 1.657 3.582 3 8 3 4.418 0 8-1.343 8-3C20 4.343 16.418 3 12 3 7.582 3 4 4.343 4 6")
            addPathData("M4 6v6c0 1.657 3.582 3 8 3 4.418 0 8-1.343 8-3v-6")
            addPathData("M4 12v6c0 1.657 3.582 3 8 3 .164 0 .328-.002 .49-.006")
            addPathData("M20 15v-3")
            addPathData("M16 19h6")
        }
        return _databaseMinus!!
    }

private var _databaseMinus: ImageVector? = null
