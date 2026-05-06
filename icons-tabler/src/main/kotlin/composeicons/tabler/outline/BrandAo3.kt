package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAo3: ImageVector
    get() {
        if (_brandAo3 != null) return _brandAo3!!
        _brandAo3 = tablerOutlineIcon(
            name = "BrandAo3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 5C9.109 9.1 12.956 15.131 14 19c1.074-4.67 4.49-8.94 8-11")
            addPathData("M12 8c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C16 6.895 15.105 6 14 6c-1.105 0-2 .895-2 2")
            addPathData("M7 9C6.722 14.494 4.663 16.33 3 19 7.013 17 9.02 14 18.05 14c4.012 0 3.51 2.5 1 3 2 .5 2.508 5-2.007 2")
        }
        return _brandAo3!!
    }

private var _brandAo3: ImageVector? = null
