package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SignLeft: ImageVector
    get() {
        if (_signLeft != null) return _signLeft!!
        _signLeft = tablerOutlineIcon(
            name = "SignLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 21h-4")
            addPathData("M14 21v-10")
            addPathData("M14 6v-3")
            addPathData("M18 6h-10L6 8.5 8 11h10v-5")
        }
        return _signLeft!!
    }

private var _signLeft: ImageVector? = null
