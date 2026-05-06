package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandShazam: ImageVector
    get() {
        if (_brandShazam != null) return _brandShazam!!
        _brandShazam = tablerOutlineIcon(
            name = "BrandShazam",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 12l2-2c.53-.531 1.25-.829 2-.829 .75 0 1.47 .298 2 .829 .531 .53 .829 1.25 .829 2 0 .75-.298 1.47-.829 2l-3 3")
            addPathData("M14 12l-2 2c-1.105 1.105-2.895 1.105-4 0C6.895 12.895 6.895 11.105 8 10L11 7")
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
        }
        return _brandShazam!!
    }

private var _brandShazam: ImageVector? = null
