package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandDigg: ImageVector
    get() {
        if (_brandDigg != null) return _brandDigg!!
        _brandDigg = tablerOutlineIcon(
            name = "BrandDigg",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 15h-3v-4h3")
            addPathData("M15 15h-3v-4h3")
            addPathData("M9 15v-4")
            addPathData("M15 11v7h-3")
            addPathData("M6 7v8")
            addPathData("M21 15h-3v-4h3")
            addPathData("M21 11v7h-3")
        }
        return _brandDigg!!
    }

private var _brandDigg: ImageVector? = null
