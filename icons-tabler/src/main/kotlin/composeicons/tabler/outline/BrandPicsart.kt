package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandPicsart: ImageVector
    get() {
        if (_brandPicsart != null) return _brandPicsart!!
        _brandPicsart = tablerOutlineIcon(
            name = "BrandPicsart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 9c0 3.866 3.134 7 7 7 3.866 0 7-3.134 7-7C19 5.134 15.866 2 12 2 8.134 2 5 5.134 5 9")
            addPathData("M9 9c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C15 7.343 13.657 6 12 6 10.343 6 9 7.343 9 9")
            addPathData("M5 9v11c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2v-4.5")
        }
        return _brandPicsart!!
    }

private var _brandPicsart: ImageVector? = null
