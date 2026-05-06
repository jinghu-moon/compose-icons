package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GitBranchDeleted: ImageVector
    get() {
        if (_gitBranchDeleted != null) return _gitBranchDeleted!!
        _gitBranchDeleted = tablerOutlineIcon(
            name = "GitBranchDeleted",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 18c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C9 16.895 8.105 16 7 16c-1.105 0-2 .895-2 2")
            addPathData("M5 6c0 1.105 .895 2 2 2C8.105 8 9 7.105 9 6 9 4.895 8.105 4 7 4 5.895 4 5 4.895 5 6")
            addPathData("M7 8v8")
            addPathData("M9 18h6c1.105 0 2-.895 2-2v-5")
            addPathData("M14 14l3-3 3 3")
            addPathData("M15 4l4 4")
            addPathData("M15 8 19 4")
        }
        return _gitBranchDeleted!!
    }

private var _gitBranchDeleted: ImageVector? = null
