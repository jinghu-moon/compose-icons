package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Outlet2Fill: ImageVector
    get() {
        if (_outlet2Fill != null) return _outlet2Fill!!
        _outlet2Fill = remixIcon(
            name = "Outlet2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 ZM 11.000 7.000 L 11.000 11.000 L 13.000 11.000 L 13.000 7.000 L 11.000 7.000 ZM 14.000 12.000 L 14.000 16.000 L 16.000 16.000 L 16.000 12.000 L 14.000 12.000 ZM 8.000 12.000 L 8.000 16.000 L 10.000 16.000 L 10.000 12.000 L 8.000 12.000 Z"),
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
        return _outlet2Fill!!
    }

private var _outlet2Fill: ImageVector? = null
