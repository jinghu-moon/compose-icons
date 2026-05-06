package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SquareToggleHorizontal: ImageVector
    get() {
        if (_squareToggleHorizontal != null) return _squareToggleHorizontal!!
        _squareToggleHorizontal = tablerOutlineIcon(
            name = "SquareToggleHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 12h-20")
            addPathData("M4 14v-8C4 4.895 4.895 4 6 4h12c1.105 0 2 .895 2 2v8")
            addPathData("M18 20c1.105 0 2-.895 2-2")
            addPathData("M4 18c0 1.105 .895 2 2 2")
            addPathData("M14 20h-4")
        }
        return _squareToggleHorizontal!!
    }

private var _squareToggleHorizontal: ImageVector? = null
