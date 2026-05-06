package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LogicNand: ImageVector
    get() {
        if (_logicNand != null) return _logicNand!!
        _logicNand = tablerOutlineIcon(
            name = "LogicNand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 12h-3")
            addPathData("M2 9h3")
            addPathData("M2 15h3")
            addPathData("M7 5c6 0 8 3.5 8 7 0 3.5-2 7-8 7h-2v-14h2")
            addPathData("M15 12c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
        }
        return _logicNand!!
    }

private var _logicNand: ImageVector? = null
