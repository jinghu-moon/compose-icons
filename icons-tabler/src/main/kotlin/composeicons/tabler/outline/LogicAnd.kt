package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LogicAnd: ImageVector
    get() {
        if (_logicAnd != null) return _logicAnd!!
        _logicAnd = tablerOutlineIcon(
            name = "LogicAnd",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 12h-5")
            addPathData("M2 9h5")
            addPathData("M2 15h5")
            addPathData("M9 5c6 0 8 3.5 8 7 0 3.5-2 7-8 7h-2v-14h2")
        }
        return _logicAnd!!
    }

private var _logicAnd: ImageVector? = null
