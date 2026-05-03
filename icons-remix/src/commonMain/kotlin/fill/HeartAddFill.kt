package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.HeartAddFill: ImageVector
    get() {
        if (_heartAddFill != null) return _heartAddFill!!
        _heartAddFill = remixIcon(
            name = "HeartAddFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 14.000 L 19.000 17.000 L 22.000 17.000 L 22.000 19.000 L 18.999 19.000 L 19.000 22.000 L 17.000 22.000 L 16.999 19.000 L 14.000 19.000 L 14.000 17.000 L 17.000 17.000 L 17.000 14.000 L 19.000 14.000 ZM 20.243 4.757 C 22.403 6.923 22.572 10.314 20.750 12.667 C 19.926 12.240 18.991 12.000 18.000 12.000 C 14.686 12.000 12.000 14.686 12.000 18.000 C 12.000 19.009 12.249 19.960 12.689 20.794 L 12.000 21.485 L 3.521 12.993 C 1.417 10.637 1.496 7.019 3.757 4.757 C 6.022 2.493 9.645 2.417 12.001 4.529 C 14.350 2.420 17.980 2.490 20.243 4.757 Z"),
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
        return _heartAddFill!!
    }

private var _heartAddFill: ImageVector? = null
