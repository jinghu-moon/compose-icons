package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CategoryMinus: ImageVector
    get() {
        if (_categoryMinus != null) return _categoryMinus!!
        _categoryMinus = tablerOutlineIcon(
            name = "CategoryMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 4h6v6h-6v-6")
            addPathData("M14 4h6v6h-6v-6")
            addPathData("M4 14h6v6h-6v-6")
            addPathData("M14 17h6")
        }
        return _categoryMinus!!
    }

private var _categoryMinus: ImageVector? = null
