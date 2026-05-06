package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DiamondOff: ImageVector
    get() {
        if (_diamondOff != null) return _diamondOff!!
        _diamondOff = tablerOutlineIcon(
            name = "DiamondOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 5h9l3 5-3.308 3.697M15.809 15.801l-3.309 3.699c-.132 .134-.312 .21-.5 .21-.188 0-.368-.076-.5-.21L3 10 5.62 5.632")
            addPathData("M10 12 8 9.8l.6-1")
            addPathData("M3 3 21 21")
        }
        return _diamondOff!!
    }

private var _diamondOff: ImageVector? = null
