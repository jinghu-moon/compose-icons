package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAppstore: ImageVector
    get() {
        if (_brandAppstore != null) return _brandAppstore!!
        _brandAppstore = tablerOutlineIcon(
            name = "BrandAppstore",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M8 16 9.106 14.01 10.506 11.488 13 7")
            addPathData("M7 14h5M14.9 14h2.1")
            addPathData("M16 16 13.49 11.482 12.003 8.805 11.003 7")
        }
        return _brandAppstore!!
    }

private var _brandAppstore: ImageVector? = null
