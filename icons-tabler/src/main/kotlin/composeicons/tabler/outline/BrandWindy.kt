package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandWindy: ImageVector
    get() {
        if (_brandWindy != null) return _brandWindy!!
        _brandWindy = tablerOutlineIcon(
            name = "BrandWindy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 4c0 5.5-.33 16 4 16C17.33 20 20.546 8.73 21 7")
            addPathData("M3 4c.253 5.44 1.449 16 5.894 16C13.338 20 17.314 9.964 18 6")
        }
        return _brandWindy!!
    }

private var _brandWindy: ImageVector? = null
