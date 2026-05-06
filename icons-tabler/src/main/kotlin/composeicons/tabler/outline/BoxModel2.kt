package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BoxModel2: ImageVector
    get() {
        if (_boxModel2 != null) return _boxModel2!!
        _boxModel2 = tablerOutlineIcon(
            name = "BoxModel2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 8h8v8h-8v-8")
            addPathData("M4 6C4 4.895 4.895 4 6 4h12c1.105 0 2 .895 2 2v12c0 1.105-.895 2-2 2h-12C4.895 20 4 19.105 4 18v-12")
        }
        return _boxModel2!!
    }

private var _boxModel2: ImageVector? = null
