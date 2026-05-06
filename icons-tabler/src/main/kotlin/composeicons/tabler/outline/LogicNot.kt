package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LogicNot: ImageVector
    get() {
        if (_logicNot != null) return _logicNot!!
        _logicNot = tablerOutlineIcon(
            name = "LogicNot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 12h-3")
            addPathData("M2 9h3")
            addPathData("M2 15h3")
            addPathData("M5 5l10 7L5 19v-14")
            addPathData("M15 12c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
        }
        return _logicNot!!
    }

private var _logicNot: ImageVector? = null
