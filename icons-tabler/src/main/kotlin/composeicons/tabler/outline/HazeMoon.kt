package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HazeMoon: ImageVector
    get() {
        if (_hazeMoon != null) return _hazeMoon!!
        _hazeMoon = tablerOutlineIcon(
            name = "HazeMoon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 16h18")
            addPathData("M3 20h18")
            addPathData("M8.296 16C6.028 14.6 4.698 11.913 5.059 9.084 5.502 5.604 8.367 3.001 11.757 3v.006h.296c-1.991 1.916-2.377 5.03-.918 7.405 1.459 2.374 4.346 3.33 6.865 2.275-.546 1.374-1.52 2.536-2.777 3.314")
        }
        return _hazeMoon!!
    }

private var _hazeMoon: ImageVector? = null
