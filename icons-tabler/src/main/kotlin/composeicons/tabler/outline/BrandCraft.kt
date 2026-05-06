package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandCraft: ImageVector
    get() {
        if (_brandCraft != null) return _brandCraft!!
        _brandCraft = tablerOutlineIcon(
            name = "BrandCraft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 4h-8C7.582 4 4 7.582 4 12c0 4.418 3.582 8 8 8h8c0-4.418-3.582-8-8-8 4.418 0 8-3.582 8-8")
            addPathData("M4 12h8")
            addPathData("M12 4v16")
        }
        return _brandCraft!!
    }

private var _brandCraft: ImageVector? = null
