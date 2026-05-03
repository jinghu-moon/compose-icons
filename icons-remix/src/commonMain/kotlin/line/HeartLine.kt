package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.HeartLine: ImageVector
    get() {
        if (_heartLine != null) return _heartLine!!
        _heartLine = remixIcon(
            name = "HeartLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.001 4.529 C 14.350 2.420 17.980 2.490 20.243 4.757 C 22.505 7.025 22.583 10.637 20.479 12.993 L 12.000 21.485 L 3.521 12.993 C 1.417 10.637 1.496 7.019 3.757 4.757 C 6.022 2.493 9.645 2.417 12.001 4.529 ZM 18.827 6.170 C 17.328 4.668 14.908 4.607 13.337 6.017 L 12.002 7.215 L 10.666 6.018 C 9.091 4.606 6.675 4.668 5.172 6.172 C 3.682 7.661 3.607 10.047 4.980 11.623 L 12.000 18.654 L 19.020 11.623 C 20.393 10.047 20.319 7.665 18.827 6.170 Z"),
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
        return _heartLine!!
    }

private var _heartLine: ImageVector? = null
