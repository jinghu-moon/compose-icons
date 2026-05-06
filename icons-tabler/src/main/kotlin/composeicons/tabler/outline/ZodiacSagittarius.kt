package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ZodiacSagittarius: ImageVector
    get() {
        if (_zodiacSagittarius != null) return _zodiacSagittarius!!
        _zodiacSagittarius = tablerOutlineIcon(
            name = "ZodiacSagittarius",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 20 20 4")
            addPathData("M13 4h7v7")
            addPathData("M6.5 12.5l5 5")
        }
        return _zodiacSagittarius!!
    }

private var _zodiacSagittarius: ImageVector? = null
