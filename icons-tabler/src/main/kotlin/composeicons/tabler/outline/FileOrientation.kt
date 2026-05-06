package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileOrientation: ImageVector
    get() {
        if (_fileOrientation != null) return _fileOrientation!!
        _fileOrientation = tablerOutlineIcon(
            name = "FileOrientation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 3v4c0 .552 .448 1 1 1h4")
            addPathData("M10 21h-3C5.895 21 5 20.105 5 19v-14C5 3.895 5.895 3 7 3h7l5 5v2")
            addPathData("M13 20h5c1.105 0 2-.895 2-2v-5")
            addPathData("M15 22 13 20l2-2")
            addPathData("M18 15l2-2 2 2")
        }
        return _fileOrientation!!
    }

private var _fileOrientation: ImageVector? = null
