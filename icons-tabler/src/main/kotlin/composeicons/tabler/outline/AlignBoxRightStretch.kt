package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AlignBoxRightStretch: ImageVector
    get() {
        if (_alignBoxRightStretch != null) return _alignBoxRightStretch!!
        _alignBoxRightStretch = tablerOutlineIcon(
            name = "AlignBoxRightStretch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 17h2")
            addPathData("M3 5C3 3.895 3.895 3 5 3h14c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-14C3.895 21 3 20.105 3 19v-14")
            addPathData("M11 12h6")
            addPathData("M13 7h4")
        }
        return _alignBoxRightStretch!!
    }

private var _alignBoxRightStretch: ImageVector? = null
