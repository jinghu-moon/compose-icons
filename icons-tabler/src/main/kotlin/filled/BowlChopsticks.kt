package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BowlChopsticks: ImageVector
    get() {
        if (_bowlChopsticks != null) return _bowlChopsticks!!
        _bowlChopsticks = tablerFilledIcon(
            name = "BowlChopsticks",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.000 10.000 C 21.105 10.000 22.000 10.895 22.000 12.000 L 22.000 12.500 C 22.000 14.194 19.753 17.990 18.017 19.483 L 18.000 19.496 L 18.000 20.000 C 18.000 21.047 17.194 21.917 16.150 21.995 L 16.000 22.000 L 8.000 22.000 C 6.895 22.000 6.000 21.105 6.000 20.000 L 6.000 19.504 L 5.935 19.451 C 4.175 17.955 2.141 14.486 2.007 12.681 L 2.000 12.500 L 2.000 12.000 C 2.000 10.895 2.895 10.000 4.000 10.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 18.929 6.003 C 19.292 5.966 19.646 6.129 19.853 6.429 C 20.061 6.729 20.088 7.118 19.926 7.444 C 19.763 7.771 19.435 7.982 19.071 7.997 L 5.071 8.997 C 4.708 9.034 4.354 8.871 4.147 8.571 C 3.939 8.271 3.912 7.882 4.074 7.556 C 4.237 7.229 4.565 7.018 4.929 7.003 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 18.790 1.022 C 19.330 0.906 19.862 1.250 19.978 1.790 C 20.094 2.330 19.750 2.862 19.210 2.978 L 5.210 5.978 C 4.670 6.094 4.138 5.750 4.022 5.210 C 3.906 4.670 4.250 4.138 4.790 4.022 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _bowlChopsticks!!
    }

private var _bowlChopsticks: ImageVector? = null
