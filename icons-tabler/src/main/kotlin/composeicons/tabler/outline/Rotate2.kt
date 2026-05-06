package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Rotate2: ImageVector
    get() {
        if (_rotate2 != null) return _rotate2!!
        _rotate2 = tablerOutlineIcon(
            name = "Rotate2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 4.55C10.885 2.893 6.207 4.885 4.55 9 2.893 13.115 4.885 17.793 9 19.45M9 15v5h-5")
            addPathData("M18.37 7.16v.01")
            addPathData("M13 19.94v.01")
            addPathData("M16.84 18.37v.01")
            addPathData("M19.37 15.1v.01")
            addPathData("M19.94 11v.01")
        }
        return _rotate2!!
    }

private var _rotate2: ImageVector? = null
