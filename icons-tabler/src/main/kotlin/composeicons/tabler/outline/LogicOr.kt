package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LogicOr: ImageVector
    get() {
        if (_logicOr != null) return _logicOr!!
        _logicOr = tablerOutlineIcon(
            name = "LogicOr",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 12h-6")
            addPathData("M2 9h7")
            addPathData("M2 15h7")
            addPathData("M8 5C18.667 7.1 18.667 17.6 8 19 9.806 14.333 9.806 9.667 8 5")
        }
        return _logicOr!!
    }

private var _logicOr: ImageVector? = null
