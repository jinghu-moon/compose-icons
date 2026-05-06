package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandSpacehey: ImageVector
    get() {
        if (_brandSpacehey != null) return _brandSpacehey!!
        _brandSpacehey = tablerOutlineIcon(
            name = "BrandSpacehey",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 6c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C19 4.895 18.105 4 17 4c-1.105 0-2 .895-2 2")
            addPathData("M14 20h6v-6c0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3v6")
            addPathData("M11 8v2.5C11 12.433 9.433 14 7.5 14h-.5C5.343 14 4 12.657 4 11 4 9.343 5.343 8 7 8h4")
        }
        return _brandSpacehey!!
    }

private var _brandSpacehey: ImageVector? = null
