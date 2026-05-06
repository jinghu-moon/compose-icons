package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Whisk: ImageVector
    get() {
        if (_whisk != null) return _whisk!!
        _whisk = tablerOutlineIcon(
            name = "Whisk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21.015 3.035 4.5 19.5")
            addPathData("M3.173 17.619c.434 1.595 1.686 2.837 3.284 3.26 1.602 .426 3.309-.028 4.487-1.194C12.794 17.849 15.014 9.035 15.014 9.035c0 0-8.88 2.296-10.639 4.132C3.204 14.327 2.745 16.027 3.173 17.619")
        }
        return _whisk!!
    }

private var _whisk: ImageVector? = null
