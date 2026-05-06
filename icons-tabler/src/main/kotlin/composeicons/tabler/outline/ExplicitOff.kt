package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ExplicitOff: ImageVector
    get() {
        if (_explicitOff != null) return _explicitOff!!
        _explicitOff = tablerOutlineIcon(
            name = "ExplicitOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 8h-2M10 10v6h4")
            addPathData("M8 4h10c1.105 0 2 .895 2 2v10M19.414 19.414c-.375 .375-.884 .586-1.414 .586h-12C4.895 20 4 19.105 4 18v-12C4 5.453 4.22 4.957 4.576 4.595")
            addPathData("M12 12h-2")
            addPathData("M3 3 21 21")
        }
        return _explicitOff!!
    }

private var _explicitOff: ImageVector? = null
