package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BowlSpoon: ImageVector
    get() {
        if (_bowlSpoon != null) return _bowlSpoon!!
        _bowlSpoon = tablerFilledIcon(
            name = "BowlSpoon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 10c1.105 0 2 .895 2 2v.5c0 1.694-2.247 5.49-3.983 6.983L18 19.496v.504c0 1.047-.806 1.917-1.85 1.995L16 22h-8C6.895 22 6 21.105 6 20v-.496l-.065-.053C4.175 17.955 2.141 14.486 2.007 12.681L2 12.5v-.5c0-1.105 .895-2 2-2Z")
            addPathData("M8 2c1.71 0 3.237 .787 3.785 2h8.215c.552 0 1 .448 1 1 0 .552-.448 1-1 1l-8.216 .001C11.236 7.214 9.71 8 8 8 5.856 8 4 6.763 4 5 4 3.237 5.856 2 8 2")
        }
        return _bowlSpoon!!
    }

private var _bowlSpoon: ImageVector? = null
