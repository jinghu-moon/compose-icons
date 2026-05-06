package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LogicXor: ImageVector
    get() {
        if (_logicXor != null) return _logicXor!!
        _logicXor = tablerOutlineIcon(
            name = "LogicXor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 12h-4")
            addPathData("M2 9h6")
            addPathData("M2 15h6")
            addPathData("M7 19C8.778 14.333 8.778 9.667 7 5")
            addPathData("M10 5c10.667 2.1 10.667 12.6 0 14C11.806 14.333 11.806 9.667 10 5")
        }
        return _logicXor!!
    }

private var _logicXor: ImageVector? = null
