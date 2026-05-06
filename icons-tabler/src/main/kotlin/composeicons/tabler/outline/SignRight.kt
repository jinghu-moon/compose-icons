package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SignRight: ImageVector
    get() {
        if (_signRight != null) return _signRight!!
        _signRight = tablerOutlineIcon(
            name = "SignRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 21h4")
            addPathData("M10 21v-10")
            addPathData("M10 6v-3")
            addPathData("M6 6h10l2 2.5L16 11h-10v-5")
        }
        return _signRight!!
    }

private var _signRight: ImageVector? = null
