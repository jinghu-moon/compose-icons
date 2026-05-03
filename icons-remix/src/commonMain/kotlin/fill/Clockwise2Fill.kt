package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Clockwise2Fill: ImageVector
    get() {
        if (_clockwise2Fill != null) return _clockwise2Fill!!
        _clockwise2Fill = remixIcon(
            name = "Clockwise2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.000 4.000 L 10.000 1.000 L 15.000 5.000 L 10.000 9.000 L 10.000 6.000 L 8.000 6.000 C 6.343 6.000 5.000 7.343 5.000 9.000 L 5.000 13.000 L 3.000 13.000 L 3.000 9.000 C 3.000 6.239 5.239 4.000 8.000 4.000 L 10.000 4.000 ZM 9.000 11.000 C 9.000 10.448 9.448 10.000 10.000 10.000 L 20.000 10.000 C 20.552 10.000 21.000 10.448 21.000 11.000 L 21.000 21.000 C 21.000 21.552 20.552 22.000 20.000 22.000 L 10.000 22.000 C 9.448 22.000 9.000 21.552 9.000 21.000 L 9.000 11.000 Z"),
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
        return _clockwise2Fill!!
    }

private var _clockwise2Fill: ImageVector? = null
