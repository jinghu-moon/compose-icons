package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DislikeLine: ImageVector
    get() {
        if (_dislikeLine != null) return _dislikeLine!!
        _dislikeLine = remixIcon(
            name = "DislikeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.808 1.393 L 21.192 19.778 L 19.778 21.192 L 16.032 17.445 L 12.000 21.485 L 3.522 12.993 C 1.482 10.709 1.493 7.240 3.555 4.970 L 1.394 2.808 L 2.808 1.393 ZM 4.980 11.623 L 12.000 18.654 L 14.618 16.031 L 4.972 6.386 C 3.678 7.883 3.671 10.121 4.980 11.623 ZM 20.243 4.757 C 22.505 7.025 22.583 10.637 20.479 12.993 L 18.844 14.629 L 17.430 13.215 L 19.020 11.623 C 20.394 10.047 20.319 7.665 18.827 6.170 C 17.328 4.668 14.908 4.607 13.337 6.017 L 12.002 7.215 L 10.666 6.018 C 10.316 5.704 9.925 5.463 9.511 5.295 L 7.260 3.046 C 8.929 2.839 10.668 3.334 12.001 4.529 C 14.350 2.420 17.980 2.490 20.243 4.757 Z"),
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
        return _dislikeLine!!
    }

private var _dislikeLine: ImageVector? = null
