package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Slideshow: ImageVector
    get() {
        if (_slideshow != null) return _slideshow!!
        _slideshow = tablerOutlineIcon(
            name = "Slideshow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 6h.01")
            addPathData("M3 6C3 4.343 4.343 3 6 3h12c1.657 0 3 1.343 3 3v8c0 1.657-1.343 3-3 3h-12C4.343 17 3 15.657 3 14v-8")
            addPathData("M3 13 7 9c.928-.893 2.072-.893 3 0l4 4")
            addPathData("M13 12l2-2c.928-.893 2.072-.893 3 0l3 3")
            addPathData("M8 21h.01")
            addPathData("M12 21h.01")
            addPathData("M16 21h.01")
        }
        return _slideshow!!
    }

private var _slideshow: ImageVector? = null
