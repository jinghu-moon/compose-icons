package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.HeartAddLine: ImageVector
    get() {
        if (_heartAddLine != null) return _heartAddLine!!
        _heartAddLine = remixIcon(
            name = "HeartAddLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 14.000 L 19.000 17.000 L 22.000 17.000 L 22.000 19.000 L 18.999 19.000 L 19.000 22.000 L 17.000 22.000 L 16.999 19.000 L 14.000 19.000 L 14.000 17.000 L 17.000 17.000 L 17.000 14.000 L 19.000 14.000 ZM 20.243 4.757 C 22.505 7.025 22.583 10.636 20.479 12.992 L 19.060 11.574 C 20.390 10.050 20.320 7.660 18.827 6.170 C 17.324 4.671 14.908 4.607 13.337 6.017 L 12.002 7.215 L 10.666 6.018 C 9.091 4.606 6.675 4.668 5.172 6.172 C 3.682 7.661 3.607 10.047 4.980 11.623 L 13.412 20.069 L 12.000 21.485 L 3.521 12.993 C 1.417 10.637 1.496 7.019 3.757 4.757 C 6.022 2.493 9.645 2.417 12.001 4.529 C 14.350 2.420 17.980 2.490 20.243 4.757 Z"),
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
        return _heartAddLine!!
    }

private var _heartAddLine: ImageVector? = null
