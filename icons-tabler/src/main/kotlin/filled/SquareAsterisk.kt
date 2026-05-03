package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareAsterisk: ImageVector
    get() {
        if (_squareAsterisk != null) return _squareAsterisk!!
        _squareAsterisk = tablerFilledIcon(
            name = "SquareAsterisk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.000 2.000 C 20.657 2.000 22.000 3.343 22.000 5.000 L 22.000 19.000 C 22.000 20.657 20.657 22.000 19.000 22.000 L 5.000 22.000 C 3.343 22.000 2.000 20.657 2.000 19.000 L 2.000 5.000 C 2.000 3.343 3.343 2.000 5.000 2.000 ZM 12.000 7.500 C 11.448 7.500 11.000 7.948 11.000 8.500 L 11.000 10.131 L 9.555 9.168 L 9.454 9.108 C 8.981 8.862 8.398 9.030 8.129 9.490 C 7.860 9.950 7.999 10.540 8.445 10.832 L 10.195 12.000 L 8.445 13.169 L 8.352 13.239 C 7.946 13.582 7.879 14.182 8.199 14.605 C 8.519 15.029 9.114 15.129 9.555 14.833 L 11.000 13.868 L 11.000 15.500 L 11.007 15.617 C 11.069 16.142 11.530 16.528 12.059 16.497 C 12.587 16.466 12.999 16.029 13.000 15.500 L 13.000 13.869 L 14.445 14.832 L 14.546 14.892 C 15.019 15.138 15.602 14.970 15.871 14.510 C 16.140 14.050 16.001 13.460 15.555 13.168 L 13.803 11.999 L 15.555 10.832 L 15.648 10.762 C 16.054 10.419 16.121 9.819 15.801 9.396 C 15.481 8.972 14.886 8.872 14.445 9.168 L 13.000 10.130 L 13.000 8.500 L 12.993 8.383 C 12.934 7.880 12.507 7.500 12.000 7.500 Z"),
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
        return _squareAsterisk!!
    }

private var _squareAsterisk: ImageVector? = null
