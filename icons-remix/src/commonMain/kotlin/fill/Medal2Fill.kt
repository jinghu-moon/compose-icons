package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Medal2Fill: ImageVector
    get() {
        if (_medal2Fill != null) return _medal2Fill!!
        _medal2Fill = remixIcon(
            name = "Medal2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 8.500 L 14.116 13.587 L 19.608 14.028 L 15.424 17.612 L 16.702 22.972 L 12.000 20.100 L 7.298 22.972 L 8.576 17.612 L 4.392 14.028 L 9.884 13.587 L 12.000 8.500 ZM 8.000 2.000 L 8.000 11.000 L 6.000 11.000 L 6.000 2.000 L 8.000 2.000 ZM 18.000 2.000 L 18.000 11.000 L 16.000 11.000 L 16.000 2.000 L 18.000 2.000 ZM 13.000 2.000 L 13.000 7.000 L 11.000 7.000 L 11.000 2.000 L 13.000 2.000 Z"),
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
        return _medal2Fill!!
    }

private var _medal2Fill: ImageVector? = null
