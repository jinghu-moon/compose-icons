package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LogicXnor: ImageVector
    get() {
        if (_logicXnor != null) return _logicXnor!!
        _logicXnor = tablerOutlineIcon(
            name = "LogicXnor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 12h-2")
            addPathData("M2 9h4")
            addPathData("M2 15h4")
            addPathData("M5 19C6.778 14.333 6.778 9.667 5 5")
            addPathData("M8 5C18.667 7.1 18.667 17.6 8 19 9.806 14.333 9.806 9.667 8 5")
            addPathData("M16 12c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
        }
        return _logicXnor!!
    }

private var _logicXnor: ImageVector? = null
