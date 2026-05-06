package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LogicNor: ImageVector
    get() {
        if (_logicNor != null) return _logicNor!!
        _logicNor = tablerOutlineIcon(
            name = "LogicNor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 12h-4")
            addPathData("M2 9h5")
            addPathData("M2 15h5")
            addPathData("M6 5C16.667 7.1 16.667 17.6 6 19 7.806 14.333 7.806 9.667 6 5")
            addPathData("M14 12c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
        }
        return _logicNor!!
    }

private var _logicNor: ImageVector? = null
