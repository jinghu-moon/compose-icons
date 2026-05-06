package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BowlChopsticks: ImageVector
    get() {
        if (_bowlChopsticks != null) return _bowlChopsticks!!
        _bowlChopsticks = tablerFilledIcon(
            name = "BowlChopsticks",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 10c1.105 0 2 .895 2 2v.5c0 1.694-2.247 5.49-3.983 6.983L18 19.496v.504c0 1.047-.806 1.917-1.85 1.995L16 22h-8C6.895 22 6 21.105 6 20v-.496l-.065-.053C4.175 17.955 2.141 14.486 2.007 12.681L2 12.5v-.5c0-1.105 .895-2 2-2Z")
            addPathData("M18.929 6.003c.363-.037 .717 .126 .924 .426 .207 .3 .235 .689 .072 1.015-.163 .326-.49 .538-.855 .553L5.071 8.997c-.363 .037-.717-.126-.924-.426C3.939 8.271 3.912 7.882 4.074 7.556c.163-.326 .49-.538 .855-.553Z")
            addPathData("M18.79 1.022c.54-.116 1.072 .228 1.188 .768 .116 .54-.228 1.072-.768 1.188L5.21 5.978C4.67 6.094 4.138 5.75 4.022 5.21 3.906 4.67 4.25 4.138 4.79 4.022Z")
        }
        return _bowlChopsticks!!
    }

private var _bowlChopsticks: ImageVector? = null
