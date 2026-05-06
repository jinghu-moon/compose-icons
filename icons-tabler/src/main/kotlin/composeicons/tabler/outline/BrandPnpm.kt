package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandPnpm: ImageVector
    get() {
        if (_brandPnpm != null) return _brandPnpm!!
        _brandPnpm = tablerOutlineIcon(
            name = "BrandPnpm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 17h4v4h-4v-4")
            addPathData("M10 17h4v4h-4v-4")
            addPathData("M17 17h4v4h-4v-4")
            addPathData("M17 10h4v4h-4v-4")
            addPathData("M17 3h4v4h-4v-4")
            addPathData("M10 10h4v4h-4v-4")
            addPathData("M10 3h4v4h-4v-4")
            addPathData("M3 3h4v4h-4v-4")
        }
        return _brandPnpm!!
    }

private var _brandPnpm: ImageVector? = null
