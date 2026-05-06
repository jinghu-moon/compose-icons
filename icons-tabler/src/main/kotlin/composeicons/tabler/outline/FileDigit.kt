package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileDigit: ImageVector
    get() {
        if (_fileDigit != null) return _fileDigit!!
        _fileDigit = tablerOutlineIcon(
            name = "FileDigit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 3v4c0 .552 .448 1 1 1h4")
            addPathData("M9 13c0-.552 .448-1 1-1h1c.552 0 1 .448 1 1v3c0 .552-.448 1-1 1h-1C9.448 17 9 16.552 9 16v-3")
            addPathData("M17 21h-10C5.895 21 5 20.105 5 19v-14C5 3.895 5.895 3 7 3h7l5 5v11c0 1.105-.895 2-2 2")
            addPathData("M15 12v5")
        }
        return _fileDigit!!
    }

private var _fileDigit: ImageVector? = null
