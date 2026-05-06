package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileIsr: ImageVector
    get() {
        if (_fileIsr != null) return _fileIsr!!
        _fileIsr = tablerOutlineIcon(
            name = "FileIsr",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 3v4c0 .552 .448 1 1 1h4")
            addPathData("M15 3v4c0 .552 .448 1 1 1h4")
            addPathData("M6 8v-3C6 3.895 6.895 3 8 3h7l5 5v11c0 1.105-.895 2-2 2h-10C6.895 21 6 20.105 6 19v-7")
            addPathData("M3 15 6 12l3 3")
        }
        return _fileIsr!!
    }

private var _fileIsr: ImageVector? = null
