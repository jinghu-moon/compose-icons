package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RobotFace: ImageVector
    get() {
        if (_robotFace != null) return _robotFace!!
        _robotFace = tablerOutlineIcon(
            name = "RobotFace",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 5h12c1.105 0 2 .895 2 2v12c0 1.105-.895 2-2 2h-12C4.895 21 4 20.105 4 19v-12C4 5.895 4.895 5 6 5")
            addPathData("M9 16c1 .667 2 1 3 1 1 0 2-.333 3-1")
            addPathData("M9 7 8 3")
            addPathData("M15 7 16 3")
            addPathData("M9 12v-1")
            addPathData("M15 12v-1")
        }
        return _robotFace!!
    }

private var _robotFace: ImageVector? = null
