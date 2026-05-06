package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandBandlab: ImageVector
    get() {
        if (_brandBandlab != null) return _brandBandlab!!
        _brandBandlab = tablerOutlineIcon(
            name = "BrandBandlab",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6.885 7 4.349 11.907C2.328 15.752 1.85 20.682 8.17 21h6.808c4.86-.207 7.989-2.975 4.607-9.093L16.597 7")
            addPathData("M15.078 4h-5.136l3.678 8.768c.547 1.14 .847 1.822 .162 2.676-.053 .093-1.332 1.907-3.053 1.495C9.904 16.752 9.345 16.013 9.409 15.199c.04-.91 .62-1.717 1.488-2.074 .847-.403 1.8-.528 2.723-.358")
        }
        return _brandBandlab!!
    }

private var _brandBandlab: ImageVector? = null
