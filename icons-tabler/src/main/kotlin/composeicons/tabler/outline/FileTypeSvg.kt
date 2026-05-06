package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileTypeSvg: ImageVector
    get() {
        if (_fileTypeSvg != null) return _fileTypeSvg!!
        _fileTypeSvg = tablerOutlineIcon(
            name = "FileTypeSvg",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 3v4c0 .552 .448 1 1 1h4")
            addPathData("M5 12v-7C5 3.895 5.895 3 7 3h7l5 5v4")
            addPathData("M4 20.25c0 .414 .336 .75 .75 .75h1.25c.552 0 1-.448 1-1v-1C7 18.448 6.552 18 6 18h-1C4.448 18 4 17.552 4 17v-1c0-.552 .448-1 1-1h1.25c.414 0 .75 .336 .75 .75")
            addPathData("M10 15l2 6 2-6")
            addPathData("M20 15h-1c-1.105 0-2 .895-2 2v2c0 1.105 .895 2 2 2h1v-3")
        }
        return _fileTypeSvg!!
    }

private var _fileTypeSvg: ImageVector? = null
