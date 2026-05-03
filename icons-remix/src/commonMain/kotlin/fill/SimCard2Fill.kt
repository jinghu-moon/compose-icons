package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SimCard2Fill: ImageVector
    get() {
        if (_simCard2Fill != null) return _simCard2Fill!!
        _simCard2Fill = remixIcon(
            name = "SimCard2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.000 2.000 L 15.000 2.000 L 19.707 6.707 C 19.895 6.895 20.000 7.149 20.000 7.414 L 20.000 21.000 C 20.000 21.552 19.552 22.000 19.000 22.000 L 5.000 22.000 C 4.448 22.000 4.000 21.552 4.000 21.000 L 4.000 3.000 C 4.000 2.448 4.448 2.000 5.000 2.000 ZM 13.000 18.000 L 13.000 10.000 L 8.000 10.000 L 8.000 12.000 L 11.000 12.000 L 11.000 18.000 L 13.000 18.000 ZM 8.000 13.000 L 8.000 15.000 L 10.000 15.000 L 10.000 13.000 L 8.000 13.000 ZM 14.000 13.000 L 14.000 15.000 L 16.000 15.000 L 16.000 13.000 L 14.000 13.000 ZM 14.000 10.000 L 14.000 12.000 L 16.000 12.000 L 16.000 10.000 L 14.000 10.000 ZM 8.000 16.000 L 8.000 18.000 L 10.000 18.000 L 10.000 16.000 L 8.000 16.000 ZM 14.000 16.000 L 14.000 18.000 L 16.000 18.000 L 16.000 16.000 L 14.000 16.000 Z"),
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
        return _simCard2Fill!!
    }

private var _simCard2Fill: ImageVector? = null
