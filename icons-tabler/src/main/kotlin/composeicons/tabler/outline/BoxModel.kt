package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BoxModel: ImageVector
    get() {
        if (_boxModel != null) return _boxModel!!
        _boxModel = tablerOutlineIcon(
            name = "BoxModel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 8h8v8h-8v-8")
            addPathData("M4 6C4 4.895 4.895 4 6 4h12c1.105 0 2 .895 2 2v12c0 1.105-.895 2-2 2h-12C4.895 20 4 19.105 4 18v-12")
            addPathData("M16 16l3.3 3.3")
            addPathData("M16 8 19.3 4.7")
            addPathData("M8 8 4.7 4.7")
            addPathData("M8 16 4.7 19.3")
        }
        return _boxModel!!
    }

private var _boxModel: ImageVector? = null
