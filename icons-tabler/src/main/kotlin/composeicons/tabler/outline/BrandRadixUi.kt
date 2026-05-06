package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandRadixUi: ImageVector
    get() {
        if (_brandRadixUi != null) return _brandRadixUi!!
        _brandRadixUi = tablerOutlineIcon(
            name = "BrandRadixUi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 5.5C14 6.881 15.119 8 16.5 8 17.881 8 19 6.881 19 5.5 19 4.119 17.881 3 16.5 3 15.119 3 14 4.119 14 5.5")
            addPathData("M6 3h5v5h-5v-5")
            addPathData("M11 11v10C8.283 20.996 6.067 18.825 6.008 16.109c-.059-2.716 2.061-4.982 4.775-5.104L11 11")
        }
        return _brandRadixUi!!
    }

private var _brandRadixUi: ImageVector? = null
