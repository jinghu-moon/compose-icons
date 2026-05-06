package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileOff: ImageVector
    get() {
        if (_fileOff != null) return _fileOff!!
        _fileOff = tablerOutlineIcon(
            name = "FileOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 3 21 21")
            addPathData("M7 3h7l5 5v7M19 19c0 1.105-.895 2-2 2h-10C5.895 21 5 20.105 5 19v-14")
        }
        return _fileOff!!
    }

private var _fileOff: ImageVector? = null
