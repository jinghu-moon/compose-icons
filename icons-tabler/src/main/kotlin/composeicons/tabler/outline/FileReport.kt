package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileReport: ImageVector
    get() {
        if (_fileReport != null) return _fileReport!!
        _fileReport = tablerOutlineIcon(
            name = "FileReport",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 17c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4")
            addPathData("M17 13v4h4")
            addPathData("M12 3v4c0 .552 .448 1 1 1h4")
            addPathData("M11.5 21h-6.5C3.895 21 3 20.105 3 19v-14C3 3.895 3.895 3 5 3h7l5 5v2M17 13v4")
        }
        return _fileReport!!
    }

private var _fileReport: ImageVector? = null
