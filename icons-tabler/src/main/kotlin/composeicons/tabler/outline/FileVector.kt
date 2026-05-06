package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileVector: ImageVector
    get() {
        if (_fileVector != null) return _fileVector!!
        _fileVector = tablerOutlineIcon(
            name = "FileVector",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 3v4c0 .552 .448 1 1 1h4")
            addPathData("M8 16.5C8 17.328 8.672 18 9.5 18 10.328 18 11 17.328 11 16.5 11 15.672 10.328 15 9.5 15 8.672 15 8 15.672 8 16.5")
            addPathData("M13 12.5c0 .828 .672 1.5 1.5 1.5C15.328 14 16 13.328 16 12.5 16 11.672 15.328 11 14.5 11 13.672 11 13 11.672 13 12.5")
            addPathData("M17 21h-10C5.895 21 5 20.105 5 19v-14C5 3.895 5.895 3 7 3h7l5 5v11c0 1.105-.895 2-2 2")
            addPathData("M9.5 15c0-1.381 1.119-2.5 2.5-2.5h1")
        }
        return _fileVector!!
    }

private var _fileVector: ImageVector? = null
