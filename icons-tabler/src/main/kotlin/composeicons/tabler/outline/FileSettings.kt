package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileSettings: ImageVector
    get() {
        if (_fileSettings != null) return _fileSettings!!
        _fileSettings = tablerOutlineIcon(
            name = "FileSettings",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 14c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M12 10.5v1.5")
            addPathData("M12 16v1.5")
            addPathData("M15.031 12.25 13.732 13")
            addPathData("M10.268 15l-1.3 .75")
            addPathData("M15 15.803l-1.285-.773")
            addPathData("M10.285 12.97 9 12.197")
            addPathData("M14 3v4c0 .552 .448 1 1 1h4")
            addPathData("M17 21h-10C5.895 21 5 20.105 5 19v-14C5 3.895 5.895 3 7 3h7l5 5v11c0 1.105-.895 2-2 2")
        }
        return _fileSettings!!
    }

private var _fileSettings: ImageVector? = null
