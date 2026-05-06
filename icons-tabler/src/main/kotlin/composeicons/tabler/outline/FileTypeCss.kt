package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileTypeCss: ImageVector
    get() {
        if (_fileTypeCss != null) return _fileTypeCss!!
        _fileTypeCss = tablerOutlineIcon(
            name = "FileTypeCss",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 3v4c0 .552 .448 1 1 1h4")
            addPathData("M5 12v-7C5 3.895 5.895 3 7 3h7l5 5v4")
            addPathData("M8 16.5C8 15.672 7.328 15 6.5 15 5.672 15 5 15.672 5 16.5v3C5 20.328 5.672 21 6.5 21 7.328 21 8 20.328 8 19.5")
            addPathData("M11 20.25c0 .414 .336 .75 .75 .75h1.25c.552 0 1-.448 1-1v-1c0-.552-.448-1-1-1h-1c-.552 0-1-.448-1-1v-1c0-.552 .448-1 1-1h1.25c.414 0 .75 .336 .75 .75")
            addPathData("M17 20.25c0 .414 .336 .75 .75 .75h1.25c.552 0 1-.448 1-1v-1c0-.552-.448-1-1-1h-1c-.552 0-1-.448-1-1v-1c0-.552 .448-1 1-1h1.25c.414 0 .75 .336 .75 .75")
        }
        return _fileTypeCss!!
    }

private var _fileTypeCss: ImageVector? = null
