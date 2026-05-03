package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChartDots: ImageVector
    get() {
        if (_chartDots != null) return _chartDots!!
        _chartDots = tablerFilledIcon(
            name = "ChartDots",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.000 2.000 C 3.552 2.000 4.000 2.448 4.000 3.000 L 4.000 20.000 L 21.000 20.000 C 21.507 20.000 21.934 20.380 21.993 20.883 L 22.000 21.000 C 22.000 21.552 21.552 22.000 21.000 22.000 L 3.000 22.000 C 2.448 22.000 2.000 21.552 2.000 21.000 L 2.000 3.000 C 2.000 2.448 2.448 2.000 3.000 2.000 Z"),
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
        pathData = parseSvgPathData("M 19.000 4.000 C 20.149 4.003 21.195 4.661 21.695 5.695 C 22.194 6.730 22.059 7.958 21.347 8.860 C 20.635 9.761 19.471 10.177 18.349 9.930 L 16.347 13.132 C 17.292 14.319 17.202 16.024 16.138 17.105 C 15.073 18.186 13.370 18.302 12.168 17.376 C 10.967 16.450 10.646 14.773 11.420 13.469 L 10.042 11.814 C 8.672 12.321 7.136 11.768 6.404 10.504 C 5.672 9.239 5.957 7.632 7.079 6.696 C 8.202 5.761 9.834 5.770 10.946 6.717 C 12.058 7.665 12.326 9.276 11.580 10.532 L 12.958 12.186 C 13.499 11.985 14.087 11.945 14.651 12.071 L 16.653 8.868 C 15.936 7.967 15.798 6.735 16.298 5.697 C 16.798 4.660 17.848 4.000 19.000 4.000 Z"),
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
        return _chartDots!!
    }

private var _chartDots: ImageVector? = null
