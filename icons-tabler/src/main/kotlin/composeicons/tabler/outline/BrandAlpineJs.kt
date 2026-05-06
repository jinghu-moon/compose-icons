package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAlpineJs: ImageVector
    get() {
        if (_brandAlpineJs != null) return _brandAlpineJs!!
        _brandAlpineJs = tablerOutlineIcon(
            name = "BrandAlpineJs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 11.5 7.5 16h9l-9-9L3 11.5")
            addPathData("M16.5 16 21 11.5 16.5 7 12 11.5")
        }
        return _brandAlpineJs!!
    }

private var _brandAlpineJs: ImageVector? = null
