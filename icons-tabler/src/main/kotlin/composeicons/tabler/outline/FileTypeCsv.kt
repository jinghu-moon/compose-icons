package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileTypeCsv: ImageVector
    get() {
        if (_fileTypeCsv != null) return _fileTypeCsv!!
        _fileTypeCsv = tablerOutlineIcon(
            name = "FileTypeCsv",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 3v4c0 .552 .448 1 1 1h4")
            addPathData("M5 12v-7C5 3.895 5.895 3 7 3h7l5 5v4")
            addPathData("M7 16.5C7 15.672 6.328 15 5.5 15 4.672 15 4 15.672 4 16.5v3C4 20.328 4.672 21 5.5 21 6.328 21 7 20.328 7 19.5")
            addPathData("M10 20.25c0 .414 .336 .75 .75 .75h1.25c.552 0 1-.448 1-1v-1c0-.552-.448-1-1-1h-1c-.552 0-1-.448-1-1v-1c0-.552 .448-1 1-1h1.25c.414 0 .75 .336 .75 .75")
            addPathData("M16 15l2 6 2-6")
        }
        return _fileTypeCsv!!
    }

private var _fileTypeCsv: ImageVector? = null
