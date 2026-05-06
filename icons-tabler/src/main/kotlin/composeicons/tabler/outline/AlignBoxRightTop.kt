package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AlignBoxRightTop: ImageVector
    get() {
        if (_alignBoxRightTop != null) return _alignBoxRightTop!!
        _alignBoxRightTop = tablerOutlineIcon(
            name = "AlignBoxRightTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 5C3 3.895 3.895 3 5 3h14c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-14C3.895 21 3 20.105 3 19v-14")
            addPathData("M15 13h2")
            addPathData("M11 10h6")
            addPathData("M13 7h4")
        }
        return _alignBoxRightTop!!
    }

private var _alignBoxRightTop: ImageVector? = null
