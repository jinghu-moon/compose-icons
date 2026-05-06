package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandWindows: ImageVector
    get() {
        if (_brandWindows != null) return _brandWindows!!
        _brandWindows = tablerOutlineIcon(
            name = "BrandWindows",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17.8 20 5.8 18.5C4.8 18.4 4 17.6 4 16.6v-9.2c0-1 .8-1.8 1.8-1.9L17.8 4C19 3.9 20 4.8 20 5.9v12.1c0 1.2-1.1 2.1-2.2 1.9v.1")
            addPathData("M12 5v14")
            addPathData("M4 12h16")
        }
        return _brandWindows!!
    }

private var _brandWindows: ImageVector? = null
