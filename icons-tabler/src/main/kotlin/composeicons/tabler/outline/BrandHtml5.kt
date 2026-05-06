package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandHtml5: ImageVector
    get() {
        if (_brandHtml5 != null) return _brandHtml5!!
        _brandHtml5 = tablerOutlineIcon(
            name = "BrandHtml5",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 4 18 18.5l-6 2-6-2L4 4h16")
            addPathData("M15.5 8h-7L9 12h6l-.5 3.5L12 16.25 9.5 15.5 9.4 15")
        }
        return _brandHtml5!!
    }

private var _brandHtml5: ImageVector? = null
