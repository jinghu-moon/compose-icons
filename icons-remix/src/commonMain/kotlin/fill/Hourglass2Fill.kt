package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Hourglass2Fill: ImageVector
    get() {
        if (_hourglass2Fill != null) return _hourglass2Fill!!
        _hourglass2Fill = remixIcon(
            name = "Hourglass2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.000 2.000 L 20.000 2.000 L 20.000 6.460 L 13.537 12.000 L 20.000 17.540 L 20.000 22.000 L 4.000 22.000 L 4.000 17.540 L 10.463 12.000 L 4.000 6.460 L 4.000 2.000 ZM 16.297 7.000 L 18.000 5.540 L 18.000 4.000 L 6.000 4.000 L 6.000 5.540 L 7.703 7.000 L 16.297 7.000 ZM 12.000 13.317 L 6.000 18.460 L 6.000 20.000 L 7.000 20.000 L 12.000 17.000 L 17.000 20.000 L 18.000 20.000 L 18.000 18.460 L 12.000 13.317 Z"),
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
        return _hourglass2Fill!!
    }

private var _hourglass2Fill: ImageVector? = null
