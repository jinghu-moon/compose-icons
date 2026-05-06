package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FreezeRow: ImageVector
    get() {
        if (_freezeRow != null) return _freezeRow!!
        _freezeRow = tablerOutlineIcon(
            name = "FreezeRow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 5C3 3.895 3.895 3 5 3h14c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-14C3.895 21 3 20.105 3 19v-14")
            addPathData("M21 9h-18")
            addPathData("M15 3 9 9")
            addPathData("M9.5 3l-6 6")
            addPathData("M20 3.5 14.5 9")
        }
        return _freezeRow!!
    }

private var _freezeRow: ImageVector? = null
