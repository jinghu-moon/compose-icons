package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandSpeedtest: ImageVector
    get() {
        if (_brandSpeedtest != null) return _brandSpeedtest!!
        _brandSpeedtest = tablerOutlineIcon(
            name = "BrandSpeedtest",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5.636 19.364C2.121 15.849 2.121 10.151 5.636 6.636c3.515-3.515 9.213-3.515 12.728 0 3.515 3.515 3.515 9.213 0 12.728")
            addPathData("M16 9l-4 4")
        }
        return _brandSpeedtest!!
    }

private var _brandSpeedtest: ImageVector? = null
