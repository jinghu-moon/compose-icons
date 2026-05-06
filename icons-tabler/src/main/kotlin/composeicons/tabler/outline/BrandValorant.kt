package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandValorant: ImageVector
    get() {
        if (_brandValorant != null) return _brandValorant!!
        _brandValorant = tablerOutlineIcon(
            name = "BrandValorant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14.5 14h4.5l2-2v-6l-6.5 8")
            addPathData("M9 19h5L3 6v6l6 7")
        }
        return _brandValorant!!
    }

private var _brandValorant: ImageVector? = null
