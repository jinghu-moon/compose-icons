package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandComedyCentral: ImageVector
    get() {
        if (_brandComedyCentral != null) return _brandComedyCentral!!
        _brandComedyCentral = tablerOutlineIcon(
            name = "BrandComedyCentral",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5.343 17.657c3.124 3.124 8.189 3.124 11.314-0 3.124-3.124 3.124-8.189 0-11.314C13.532 3.219 8.467 3.219 5.343 6.343")
            addPathData("M13.828 9.172C12.684 8.028 10.964 7.685 9.469 8.304 7.974 8.923 6.999 10.382 6.999 12c0 1.618 .975 3.077 2.47 3.696 1.495 .619 3.215 .277 4.359-.868")
        }
        return _brandComedyCentral!!
    }

private var _brandComedyCentral: ImageVector? = null
