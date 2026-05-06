package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Needle: ImageVector
    get() {
        if (_needle != null) return _needle!!
        _needle = tablerOutlineIcon(
            name = "Needle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 21C2.333 20.333 6.262 14.764 14.785 4.291c.828-1.017 2.155-1.486 3.438-1.214 1.283 .271 2.307 1.237 2.652 2.502 .345 1.265-.045 2.617-1.012 3.503C9.288 17.694 3.667 21.667 3 21")
            addPathData("M17.5 6.5l-1 1")
        }
        return _needle!!
    }

private var _needle: ImageVector? = null
