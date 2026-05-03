package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.YinYang: ImageVector
    get() {
        if (_yinYang != null) return _yinYang!!
        _yinYang = tablerFilledIcon(
            name = "YinYang",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.000 3.340 C 21.167 5.746 23.030 10.779 21.433 15.319 C 19.836 19.858 15.232 22.617 10.476 21.883 C 5.720 21.150 2.161 17.134 2.005 12.324 L 2.000 12.000 L 2.005 11.676 C 2.119 8.163 4.069 4.968 7.141 3.260 C 10.213 1.552 13.956 1.582 17.000 3.340 ZM 8.000 5.072 C 4.864 6.883 3.336 10.573 4.273 14.071 C 5.210 17.568 8.379 20.000 12.000 20.000 L 12.200 19.995 C 14.329 19.888 16.000 18.131 16.000 16.000 C 16.000 13.869 14.329 12.112 12.200 12.005 L 12.000 12.000 C 9.830 12.000 8.055 10.270 8.001 8.100 C 7.947 5.931 9.633 4.113 11.800 4.005 L 12.000 4.000 C 10.596 4.000 9.216 4.370 8.000 5.072 ZM 12.000 6.500 C 11.172 6.500 10.500 7.172 10.500 8.000 C 10.500 8.828 11.172 9.500 12.000 9.500 C 12.828 9.500 13.500 8.828 13.500 8.000 C 13.500 7.172 12.828 6.500 12.000 6.500"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 12.000 14.500 C 12.828 14.500 13.500 15.172 13.500 16.000 C 13.500 16.828 12.828 17.500 12.000 17.500 C 11.172 17.500 10.500 16.828 10.500 16.000 C 10.500 15.172 11.172 14.500 12.000 14.500"),
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
        return _yinYang!!
    }

private var _yinYang: ImageVector? = null
