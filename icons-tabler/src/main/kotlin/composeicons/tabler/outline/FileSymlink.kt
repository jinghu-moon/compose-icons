package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileSymlink: ImageVector
    get() {
        if (_fileSymlink != null) return _fileSymlink!!
        _fileSymlink = tablerOutlineIcon(
            name = "FileSymlink",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 21v-4C4 15.343 5.343 14 7 14h5")
            addPathData("M9 17l3-3L9 11")
            addPathData("M14 3v4c0 .552 .448 1 1 1h4")
            addPathData("M5 11v-6C5 3.895 5.895 3 7 3h7l5 5v11c0 1.105-.895 2-2 2h-9.5")
        }
        return _fileSymlink!!
    }

private var _fileSymlink: ImageVector? = null
