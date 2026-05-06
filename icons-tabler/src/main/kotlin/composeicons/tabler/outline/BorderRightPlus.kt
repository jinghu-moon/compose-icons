package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BorderRightPlus: ImageVector
    get() {
        if (_borderRightPlus != null) return _borderRightPlus!!
        _borderRightPlus = tablerOutlineIcon(
            name = "BorderRightPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 20v-16")
            addPathData("M16 4v.01")
            addPathData("M12 4v.01")
            addPathData("M8 4v.01")
            addPathData("M4 4v.01")
            addPathData("M4 8v.01")
            addPathData("M4 12v.01")
            addPathData("M4 16v.01")
            addPathData("M16 20v.01")
            addPathData("M12 20v.01")
            addPathData("M8 20v.01")
            addPathData("M4 20v.01")
            addPathData("M15 12h-6")
            addPathData("M12 9v6")
        }
        return _borderRightPlus!!
    }

private var _borderRightPlus: ImageVector? = null
