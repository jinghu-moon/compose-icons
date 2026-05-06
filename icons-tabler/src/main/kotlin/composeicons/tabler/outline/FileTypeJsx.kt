package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileTypeJsx: ImageVector
    get() {
        if (_fileTypeJsx != null) return _fileTypeJsx!!
        _fileTypeJsx = tablerOutlineIcon(
            name = "FileTypeJsx",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 3v4c0 .552 .448 1 1 1h4")
            addPathData("M5 12v-7C5 3.895 5.895 3 7 3h7l5 5v4")
            addPathData("M4 15h3v4.5C7 20.328 6.328 21 5.5 21 4.672 21 4 20.328 4 19.5")
            addPathData("M10 20.25c0 .414 .336 .75 .75 .75h1.25c.552 0 1-.448 1-1v-1c0-.552-.448-1-1-1h-1c-.552 0-1-.448-1-1v-1c0-.552 .448-1 1-1h1.25c.414 0 .75 .336 .75 .75")
            addPathData("M16 15l4 6")
            addPathData("M16 21l4-6")
        }
        return _fileTypeJsx!!
    }

private var _fileTypeJsx: ImageVector? = null
