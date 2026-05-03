package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Projector2Fill: ImageVector
    get() {
        if (_projector2Fill != null) return _projector2Fill!!
        _projector2Fill = remixIcon(
            name = "Projector2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 22.000 19.000 L 22.000 21.000 L 20.000 21.000 L 20.000 19.000 L 4.000 19.000 L 4.000 21.000 L 2.000 21.000 L 2.000 19.000 C 1.448 19.000 1.000 18.552 1.000 18.000 L 1.000 6.000 C 1.000 5.448 1.448 5.000 2.000 5.000 L 11.810 5.000 C 12.993 3.767 14.657 3.000 16.500 3.000 C 18.343 3.000 20.007 3.767 21.190 5.000 L 22.000 5.000 C 22.552 5.000 23.000 5.448 23.000 6.000 L 23.000 18.000 C 23.000 18.552 22.552 19.000 22.000 19.000 ZM 16.500 14.000 C 18.985 14.000 21.000 11.985 21.000 9.500 C 21.000 7.015 18.985 5.000 16.500 5.000 C 14.015 5.000 12.000 7.015 12.000 9.500 C 12.000 11.985 14.015 14.000 16.500 14.000 ZM 16.500 12.000 C 15.119 12.000 14.000 10.881 14.000 9.500 C 14.000 8.119 15.119 7.000 16.500 7.000 C 17.881 7.000 19.000 8.119 19.000 9.500 C 19.000 10.881 17.881 12.000 16.500 12.000 ZM 4.000 13.000 L 4.000 15.000 L 6.000 15.000 L 6.000 13.000 L 4.000 13.000 ZM 8.000 13.000 L 8.000 15.000 L 10.000 15.000 L 10.000 13.000 L 8.000 13.000 Z"),
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
        return _projector2Fill!!
    }

private var _projector2Fill: ImageVector? = null
