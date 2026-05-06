package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandSugarizer: ImageVector
    get() {
        if (_brandSugarizer != null) return _brandSugarizer!!
        _brandSugarizer = tablerOutlineIcon(
            name = "BrandSugarizer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14.277 16l3.252-3.252c.609-.632 .6-1.635-.021-2.256-.621-.62-1.624-.629-2.256-.02L12 13.723 8.748 10.472C8.115 9.873 7.12 9.887 6.503 10.503c-.616 .616-.63 1.611-.031 2.245L9.723 16 6.472 19.252c-.419 .404-.588 1.003-.441 1.566 .147 .563 .587 1.003 1.15 1.151 .563 .147 1.162-.021 1.566-.44L12 18.277l3.252 3.252c.629 .629 1.648 .629 2.277 0 .629-.629 .629-1.648 0-2.277L14.277 16")
            addPathData("M9 5c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C15 3.343 13.657 2 12 2 10.343 2 9 3.343 9 5")
        }
        return _brandSugarizer!!
    }

private var _brandSugarizer: ImageVector? = null
