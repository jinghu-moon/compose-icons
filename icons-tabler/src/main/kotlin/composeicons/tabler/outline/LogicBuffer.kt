package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LogicBuffer: ImageVector
    get() {
        if (_logicBuffer != null) return _logicBuffer!!
        _logicBuffer = tablerOutlineIcon(
            name = "LogicBuffer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 12h-5")
            addPathData("M2 9h5")
            addPathData("M2 15h5")
            addPathData("M7 5l10 7L7 19v-14")
        }
        return _logicBuffer!!
    }

private var _logicBuffer: ImageVector? = null
