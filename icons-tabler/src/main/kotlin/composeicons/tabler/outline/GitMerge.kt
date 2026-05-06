package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GitMerge: ImageVector
    get() {
        if (_gitMerge != null) return _gitMerge!!
        _gitMerge = tablerOutlineIcon(
            name = "GitMerge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 18c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C9 16.895 8.105 16 7 16c-1.105 0-2 .895-2 2")
            addPathData("M5 6c0 1.105 .895 2 2 2C8.105 8 9 7.105 9 6 9 4.895 8.105 4 7 4 5.895 4 5 4.895 5 6")
            addPathData("M15 12c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M7 8v8")
            addPathData("M7 8c0 2.209 1.791 4 4 4h4")
        }
        return _gitMerge!!
    }

private var _gitMerge: ImageVector? = null
