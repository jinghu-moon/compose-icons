package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandBadoo: ImageVector
    get() {
        if (_brandBadoo != null) return _brandBadoo!!
        _brandBadoo = tablerOutlineIcon(
            name = "BrandBadoo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 9.43C22 15.268 17.523 20 12 20 6.477 20 2 15.338 2 9.5 2 6.833 3.83 4.49 6.322 4.071 8.814 3.653 11.222 5.463 12 8c.768-2.54 3.177-4.354 5.668-3.931C20.163 4.486 22 6.759 22 9.429")
            addPathData("M7.5 10c0 2.761 2.015 5 4.5 5 2.485 0 4.5-2.239 4.5-5")
        }
        return _brandBadoo!!
    }

private var _brandBadoo: ImageVector? = null
