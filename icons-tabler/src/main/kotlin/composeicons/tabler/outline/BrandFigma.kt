package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandFigma: ImageVector
    get() {
        if (_brandFigma != null) return _brandFigma!!
        _brandFigma = tablerOutlineIcon(
            name = "BrandFigma",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 12c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C18 10.343 16.657 9 15 9c-1.657 0-3 1.343-3 3")
            addPathData("M6 6C6 4.343 7.343 3 9 3h6c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3h-6C7.343 9 6 7.657 6 6")
            addPathData("M9 9C7.343 9 6 10.343 6 12c0 1.657 1.343 3 3 3h3M9 15C7.343 15 6 16.343 6 18c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3v-15")
        }
        return _brandFigma!!
    }

private var _brandFigma: ImageVector? = null
