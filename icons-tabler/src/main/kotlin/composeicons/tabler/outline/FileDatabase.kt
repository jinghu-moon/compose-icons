package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileDatabase: ImageVector
    get() {
        if (_fileDatabase != null) return _fileDatabase!!
        _fileDatabase = tablerOutlineIcon(
            name = "FileDatabase",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 12.75c0 .966 1.791 1.75 4 1.75 2.209 0 4-.784 4-1.75C16 11.784 14.209 11 12 11c-2.209 0-4 .784-4 1.75")
            addPathData("M8 12.5v3.75C8 17.216 9.79 18 12 18c2.21 0 4-.784 4-1.75v-3.75")
            addPathData("M14 3v4c0 .552 .448 1 1 1h4")
            addPathData("M17 21h-10C5.895 21 5 20.105 5 19v-14C5 3.895 5.895 3 7 3h7l5 5v11c0 1.105-.895 2-2 2")
        }
        return _fileDatabase!!
    }

private var _fileDatabase: ImageVector? = null
