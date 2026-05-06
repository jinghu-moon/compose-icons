package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileDislike: ImageVector
    get() {
        if (_fileDislike != null) return _fileDislike!!
        _fileDislike = tablerOutlineIcon(
            name = "FileDislike",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 15c0-.552 .448-1 1-1h1c.552 0 1 .448 1 1v3c0 .552-.448 1-1 1h-1C3.448 19 3 18.552 3 18v-3")
            addPathData("M6 15c0-.552 .448-1 1-1h3.756c.442-0 .831 .29 .958 .713l1.2 3c.09 .303 .133 .63-.056 .884C12.67 18.851 12.316 19 12 19h-2v2.467c-0 .485-.318 .912-.781 1.052-.464 .14-.965-.039-1.234-.442L6 19v-4")
            addPathData("M14 3v4c0 .552 .448 1 1 1h4")
            addPathData("M5 11v-6C5 3.895 5.895 3 7 3h7l5 5v11c0 1.105-.895 2-2 2h-2.5")
        }
        return _fileDislike!!
    }

private var _fileDislike: ImageVector? = null
