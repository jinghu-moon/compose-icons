package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Search: ImageVector
    get() {
        if (_search != null) return _search!!
        _search = tablerFilledIcon(
            name = "Search",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.000 3.072 C 16.002 4.228 17.406 6.193 17.851 8.461 C 18.296 10.730 17.737 13.080 16.320 14.906 L 21.707 20.293 C 22.086 20.685 22.081 21.309 21.695 21.695 C 21.309 22.081 20.685 22.086 20.293 21.707 L 14.905 16.320 C 11.729 18.784 7.217 18.509 4.364 15.677 C 1.512 12.845 1.203 8.335 3.645 5.141 C 6.086 1.947 10.518 1.061 14.000 3.071"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _search!!
    }

private var _search: ImageVector? = null
