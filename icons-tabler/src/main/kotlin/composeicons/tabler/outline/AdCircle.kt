package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AdCircle: ImageVector
    get() {
        if (_adCircle != null) return _adCircle!!
        _adCircle = tablerOutlineIcon(
            name = "AdCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 12c0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10C22 6.477 17.523 2 12 2 6.477 2 2 6.477 2 12")
            addPathData("M7 15v-4.5C7 9.672 7.672 9 8.5 9 9.328 9 10 9.672 10 10.5v4.5")
            addPathData("M7 13h3")
            addPathData("M14 9v6h1c1.105 0 2-.895 2-2v-2C17 9.895 16.105 9 15 9h-1")
        }
        return _adCircle!!
    }

private var _adCircle: ImageVector? = null
