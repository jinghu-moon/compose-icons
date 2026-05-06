package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandRevolut: ImageVector
    get() {
        if (_brandRevolut != null) return _brandRevolut!!
        _brandRevolut = tablerOutlineIcon(
            name = "BrandRevolut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 10h3v10h-3v-10")
            addPathData("M14.5 4h-9.5v3h9.4c.828 0 1.5 .672 1.5 1.5 0 .828-.672 1.5-1.5 1.5h-3.4v4l4 6h4L14 13h.5C16.985 13 19 10.985 19 8.5 19 6.015 16.985 4 14.5 4")
        }
        return _brandRevolut!!
    }

private var _brandRevolut: ImageVector? = null
