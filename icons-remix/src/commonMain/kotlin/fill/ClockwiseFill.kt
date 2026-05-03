package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ClockwiseFill: ImageVector
    get() {
        if (_clockwiseFill != null) return _clockwiseFill!!
        _clockwiseFill = remixIcon(
            name = "ClockwiseFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.000 10.000 L 23.000 10.000 L 19.000 15.000 L 15.000 10.000 L 18.000 10.000 L 18.000 8.000 C 18.000 6.343 16.657 5.000 15.000 5.000 L 11.000 5.000 L 11.000 3.000 L 15.000 3.000 C 17.761 3.000 20.000 5.239 20.000 8.000 L 20.000 10.000 ZM 13.000 9.000 C 13.552 9.000 14.000 9.448 14.000 10.000 L 14.000 20.000 C 14.000 20.552 13.552 21.000 13.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 10.000 C 2.000 9.448 2.448 9.000 3.000 9.000 L 13.000 9.000 Z"),
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
        return _clockwiseFill!!
    }

private var _clockwiseFill: ImageVector? = null
