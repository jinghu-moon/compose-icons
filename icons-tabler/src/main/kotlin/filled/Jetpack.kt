package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Jetpack: ImageVector
    get() {
        if (_jetpack != null) return _jetpack!!
        _jetpack = tablerFilledIcon(
            name = "Jetpack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.000 2.000 C 19.209 2.000 21.000 3.791 21.000 6.000 L 21.000 13.000 C 21.000 13.552 20.552 14.000 20.000 14.000 L 14.000 14.000 C 13.448 14.000 13.000 13.552 13.000 13.000 L 13.000 12.000 L 11.000 12.000 L 11.000 13.000 C 11.000 13.552 10.552 14.000 10.000 14.000 L 4.000 14.000 C 3.448 14.000 3.000 13.552 3.000 13.000 L 3.000 6.000 C 3.000 3.791 4.791 2.000 7.000 2.000 C 9.209 2.000 11.000 3.791 11.000 6.000 L 11.000 7.000 L 13.000 7.000 L 13.000 6.000 C 13.000 3.791 14.791 2.000 17.000 2.000M 13.000 10.000 L 13.000 9.000 L 11.000 9.000 L 11.000 10.000 ZM 9.000 15.000 C 9.552 15.000 10.000 15.448 10.000 16.000 C 10.000 18.623 9.213 20.590 7.600 21.800 C 7.244 22.067 6.756 22.067 6.400 21.800 C 4.787 20.590 4.000 18.623 4.000 16.000 C 4.000 15.448 4.448 15.000 5.000 15.000 C 5.552 15.000 6.000 15.448 6.000 16.000 C 6.000 17.532 6.308 18.684 6.906 19.498 L 7.000 19.617 L 7.094 19.497 C 7.652 18.738 7.958 17.684 7.996 16.301 L 8.000 16.000 C 8.000 15.448 8.448 15.000 9.000 15.000M 19.000 15.000 C 19.552 15.000 20.000 15.448 20.000 16.000 C 20.000 18.623 19.213 20.590 17.600 21.800 C 17.244 22.067 16.756 22.067 16.400 21.800 C 14.787 20.590 14.000 18.623 14.000 16.000 C 14.000 15.448 14.448 15.000 15.000 15.000 C 15.552 15.000 16.000 15.448 16.000 16.000 C 16.000 17.532 16.308 18.684 16.906 19.498 L 17.000 19.617 L 17.094 19.497 C 17.652 18.738 17.958 17.684 17.996 16.301 L 18.000 16.000 C 18.000 15.448 18.448 15.000 19.000 15.000"),
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
        return _jetpack!!
    }

private var _jetpack: ImageVector? = null
