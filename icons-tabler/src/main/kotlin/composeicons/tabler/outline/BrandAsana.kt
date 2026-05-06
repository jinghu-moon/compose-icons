package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAsana: ImageVector
    get() {
        if (_brandAsana != null) return _brandAsana!!
        _brandAsana = tablerOutlineIcon(
            name = "BrandAsana",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 7c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C15 5.343 13.657 4 12 4 10.343 4 9 5.343 9 7")
            addPathData("M14 16c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3")
            addPathData("M4 16c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C10 14.343 8.657 13 7 13 5.343 13 4 14.343 4 16")
        }
        return _brandAsana!!
    }

private var _brandAsana: ImageVector? = null
