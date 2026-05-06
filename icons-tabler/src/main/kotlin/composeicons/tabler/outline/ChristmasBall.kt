package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChristmasBall: ImageVector
    get() {
        if (_christmasBall != null) return _christmasBall!!
        _christmasBall = tablerOutlineIcon(
            name = "ChristmasBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 13c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8C20 8.582 16.418 5 12 5 7.582 5 4 8.582 4 13")
            addPathData("M11 5 12 3l1 2")
            addPathData("M4.512 10.161C7.008 9.056 9.504 9.336 12 11c2.627 1.752 5.255 1.97 7.882 .653")
            addPathData("M4.315 15.252C6.876 14.042 9.438 14.292 12 16c2.293 1.528 4.585 1.889 6.878 1.081")
        }
        return _christmasBall!!
    }

private var _christmasBall: ImageVector? = null
