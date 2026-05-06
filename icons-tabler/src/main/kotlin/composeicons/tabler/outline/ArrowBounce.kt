package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowBounce: ImageVector
    get() {
        if (_arrowBounce != null) return _arrowBounce!!
        _arrowBounce = tablerOutlineIcon(
            name = "ArrowBounce",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 18h4")
            addPathData("M3 8c4.971 0 9 4.029 9 9v1l1.428-4.285c1.007-3.019 3.171-5.515 6.018-6.938L20 6.5")
            addPathData("M15 6h5v5")
        }
        return _arrowBounce!!
    }

private var _arrowBounce: ImageVector? = null
