package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAmigo: ImageVector
    get() {
        if (_brandAmigo != null) return _brandAmigo!!
        _brandAmigo = tablerOutlineIcon(
            name = "BrandAmigo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 12c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M9.591 3.635 2.461 17.717c-1.712 3.38 1.759 5.45 3.69 3.573L8.011 19.48c3.142-3.054 4.959-2.99 8.039 .11l1.329 1.337c2.372 2.387 5.865 .078 4.176-3.225L14.36 3.635C13.246 1.455 10.694 1.455 9.59 3.635")
        }
        return _brandAmigo!!
    }

private var _brandAmigo: ImageVector? = null
