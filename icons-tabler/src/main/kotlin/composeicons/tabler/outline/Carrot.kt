package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Carrot: ImageVector
    get() {
        if (_carrot != null) return _carrot!!
        _carrot = tablerOutlineIcon(
            name = "Carrot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 21c0 0 9.834-3.489 12.684-6.34 1.751-1.752 1.751-4.592 0-6.344C14.843 7.475 13.702 7.002 12.513 7.002c-1.189 0-2.33 .473-3.171 1.314C6.482 11.177 2.995 21.005 2.995 21.005L3 21")
            addPathData("M9 13 7.5 11.5")
            addPathData("M16 14 14 12")
            addPathData("M22 8C22 8 20.86 6 19 6 17.594 6 16 8 16 8c0 0 1.14 2 3 2 1.86 0 3-2 3-2")
            addPathData("M16 2c0 0-2 1.14-2 3 0 1.86 2 3 2 3 0 0 2-1.577 2-3C18 3.14 16 2 16 2")
        }
        return _carrot!!
    }

private var _carrot: ImageVector? = null
