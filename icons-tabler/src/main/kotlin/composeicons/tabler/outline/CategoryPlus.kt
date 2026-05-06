package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CategoryPlus: ImageVector
    get() {
        if (_categoryPlus != null) return _categoryPlus!!
        _categoryPlus = tablerOutlineIcon(
            name = "CategoryPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 4h6v6h-6v-6")
            addPathData("M14 4h6v6h-6v-6")
            addPathData("M4 14h6v6h-6v-6")
            addPathData("M14 17h6M17 14v6")
        }
        return _categoryPlus!!
    }

private var _categoryPlus: ImageVector? = null
