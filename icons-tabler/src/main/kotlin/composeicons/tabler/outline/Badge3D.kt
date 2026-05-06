package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Badge3D: ImageVector
    get() {
        if (_badge3D != null) return _badge3D!!
        _badge3D = tablerOutlineIcon(
            name = "Badge3D",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 7C3 5.895 3.895 5 5 5h14c1.105 0 2 .895 2 2v10c0 1.105-.895 2-2 2h-14C3.895 19 3 18.105 3 17v-10")
            addPathData("M7 9h1.5C9.328 9 10 9.672 10 10.5 10 11.328 9.328 12 8.5 12h-.5 .5c.828 0 1.5 .672 1.5 1.5C10 14.328 9.328 15 8.5 15h-1.5")
            addPathData("M14 9v6h1c1.105 0 2-.895 2-2v-2C17 9.895 16.105 9 15 9h-1")
        }
        return _badge3D!!
    }

private var _badge3D: ImageVector? = null
