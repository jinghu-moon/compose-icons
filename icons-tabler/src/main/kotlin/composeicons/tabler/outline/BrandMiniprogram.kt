package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandMiniprogram: ImageVector
    get() {
        if (_brandMiniprogram != null) return _brandMiniprogram!!
        _brandMiniprogram = tablerOutlineIcon(
            name = "BrandMiniprogram",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 12c0 4.971-4.029 9-9 9C7.029 21 3 16.971 3 12 3 7.029 7.029 3 12 3c4.971 0 9 4.029 9 9")
            addPathData("M8 11.503c-.941 .705-1.262 1.971-.773 3.04 .489 1.069 1.657 1.653 2.806 1.403C11.181 15.695 12 14.679 12 13.503v-3c0-1.176 .819-2.192 1.968-2.443 1.149-.25 2.317 .334 2.806 1.403 .489 1.069 .167 2.335-.773 3.04")
        }
        return _brandMiniprogram!!
    }

private var _brandMiniprogram: ImageVector? = null
