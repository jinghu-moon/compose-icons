package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileExport: ImageVector
    get() {
        if (_fileExport != null) return _fileExport!!
        _fileExport = tablerOutlineIcon(
            name = "FileExport",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 3v4c0 .552 .448 1 1 1h4")
            addPathData("M11.5 21h-4.5C5.895 21 5 20.105 5 19v-14C5 3.895 5.895 3 7 3h7l5 5v5M14 19h7M18 16l3 3-3 3")
        }
        return _fileExport!!
    }

private var _fileExport: ImageVector? = null
