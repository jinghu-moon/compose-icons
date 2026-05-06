package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandYoutube: ImageVector
    get() {
        if (_brandYoutube != null) return _brandYoutube!!
        _brandYoutube = tablerOutlineIcon(
            name = "BrandYoutube",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 8C2 5.791 3.791 4 6 4h12c2.209 0 4 1.791 4 4v8c0 2.209-1.791 4-4 4h-12C3.791 20 2 18.209 2 16v-8")
            addPathData("M10 9l5 3-5 3v-6")
        }
        return _brandYoutube!!
    }

private var _brandYoutube: ImageVector? = null
