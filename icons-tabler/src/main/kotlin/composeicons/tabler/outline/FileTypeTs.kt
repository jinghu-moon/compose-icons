package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileTypeTs: ImageVector
    get() {
        if (_fileTypeTs != null) return _fileTypeTs!!
        _fileTypeTs = tablerOutlineIcon(
            name = "FileTypeTs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 3v4c0 .552 .448 1 1 1h4")
            addPathData("M5 12v-7C5 3.895 5.895 3 7 3h7l5 5v11c0 1.105-.895 2-2 2h-1")
            addPathData("M14 3v4c0 .552 .448 1 1 1h4")
            addPathData("M9 20.25c0 .414 .336 .75 .75 .75h1.25c.552 0 1-.448 1-1v-1c0-.552-.448-1-1-1h-1C9.448 18 9 17.552 9 17v-1c0-.552 .448-1 1-1h1.25c.414 0 .75 .336 .75 .75")
            addPathData("M3.5 15h3")
            addPathData("M5 15v6")
        }
        return _fileTypeTs!!
    }

private var _fileTypeTs: ImageVector? = null
