package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ComponentsOff: ImageVector
    get() {
        if (_componentsOff != null) return _componentsOff!!
        _componentsOff = tablerOutlineIcon(
            name = "ComponentsOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12l3 3L9 12 6 9 3 12")
            addPathData("M18.5 14.5 21 12 18 9l-2.5 2.5")
            addPathData("M12.499 8.501 15 6 12 3 9.5 5.5")
            addPathData("M9 18l3 3 3-3L12 15 9 18")
            addPathData("M3 3 21 21")
        }
        return _componentsOff!!
    }

private var _componentsOff: ImageVector? = null
