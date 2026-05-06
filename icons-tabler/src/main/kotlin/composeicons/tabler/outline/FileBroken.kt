package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileBroken: ImageVector
    get() {
        if (_fileBroken != null) return _fileBroken!!
        _fileBroken = tablerOutlineIcon(
            name = "FileBroken",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 3v4c0 .552 .448 1 1 1h4")
            addPathData("M5 7v-2C5 3.895 5.895 3 7 3h7l5 5v2")
            addPathData("M19 19c0 1.105-.895 2-2 2h-10C5.895 21 5 20.105 5 19")
            addPathData("M5 16h.01")
            addPathData("M5 13h.01")
            addPathData("M5 10h.01")
            addPathData("M19 13h.01")
            addPathData("M19 16h.01")
        }
        return _fileBroken!!
    }

private var _fileBroken: ImageVector? = null
