package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.InputX: ImageVector
    get() {
        if (_inputX != null) return _inputX!!
        _inputX = tablerOutlineIcon(
            name = "InputX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 13v-4C20 7.895 19.105 7 18 7h-12C4.895 7 4 7.895 4 9v5c0 1.105 .895 2 2 2h7")
            addPathData("M22 22 17 17")
            addPathData("M17 22l5-5")
        }
        return _inputX!!
    }

private var _inputX: ImageVector? = null
