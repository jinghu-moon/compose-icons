package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Servicemark: ImageVector
    get() {
        if (_servicemark != null) return _servicemark!!
        _servicemark = tablerOutlineIcon(
            name = "Servicemark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 9h-2.5C5.672 9 5 9.672 5 10.5 5 11.328 5.672 12 6.5 12h1C8.328 12 9 12.672 9 13.5 9 14.328 8.328 15 7.5 15h-2.5")
            addPathData("M13 15v-6l3 4L19 9v6")
        }
        return _servicemark!!
    }

private var _servicemark: ImageVector? = null
