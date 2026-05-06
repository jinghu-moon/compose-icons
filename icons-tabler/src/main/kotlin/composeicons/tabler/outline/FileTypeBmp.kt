package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileTypeBmp: ImageVector
    get() {
        if (_fileTypeBmp != null) return _fileTypeBmp!!
        _fileTypeBmp = tablerOutlineIcon(
            name = "FileTypeBmp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 3v4c0 .552 .448 1 1 1h4")
            addPathData("M5 12v-7C5 3.895 5.895 3 7 3h7l5 5v4")
            addPathData("M18 18h1.5C20.328 18 21 17.328 21 16.5 21 15.672 20.328 15 19.5 15h-1.5v6")
            addPathData("M4 21h1.5C6.328 21 7 20.328 7 19.5 7 18.672 6.328 18 5.5 18h-1.5 1.5C6.328 18 7 17.328 7 16.5 7 15.672 6.328 15 5.5 15h-1.5v6")
            addPathData("M10 21v-6l2.5 3L15 15v6")
        }
        return _fileTypeBmp!!
    }

private var _fileTypeBmp: ImageVector? = null
