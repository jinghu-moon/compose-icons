package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AlignBoxCenterTop: ImageVector
    get() {
        if (_alignBoxCenterTop != null) return _alignBoxCenterTop!!
        _alignBoxCenterTop = tablerOutlineIcon(
            name = "AlignBoxCenterTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 19v-14C3 3.895 3.895 3 5 3h14c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-14C3.895 21 3 20.105 3 19")
            addPathData("M11 13h2")
            addPathData("M9 10h6")
            addPathData("M10 7h4")
        }
        return _alignBoxCenterTop!!
    }

private var _alignBoxCenterTop: ImageVector? = null
