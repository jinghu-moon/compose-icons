package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Anticlockwise2Fill: ImageVector
    get() {
        if (_anticlockwise2Fill != null) return _anticlockwise2Fill!!
        _anticlockwise2Fill = remixIcon(
            name = "Anticlockwise2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.000 4.000 L 16.000 4.000 C 18.761 4.000 21.000 6.239 21.000 9.000 L 21.000 13.000 L 19.000 13.000 L 19.000 9.000 C 19.000 7.343 17.657 6.000 16.000 6.000 L 14.000 6.000 L 14.000 9.000 L 9.000 5.000 L 14.000 1.000 L 14.000 4.000 ZM 15.000 11.000 L 15.000 21.000 C 15.000 21.552 14.552 22.000 14.000 22.000 L 4.000 22.000 C 3.448 22.000 3.000 21.552 3.000 21.000 L 3.000 11.000 C 3.000 10.448 3.448 10.000 4.000 10.000 L 14.000 10.000 C 14.552 10.000 15.000 10.448 15.000 11.000 Z"),
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
        return _anticlockwise2Fill!!
    }

private var _anticlockwise2Fill: ImageVector? = null
