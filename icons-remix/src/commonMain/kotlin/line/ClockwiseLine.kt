package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ClockwiseLine: ImageVector
    get() {
        if (_clockwiseLine != null) return _clockwiseLine!!
        _clockwiseLine = remixIcon(
            name = "ClockwiseLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.000 10.586 L 21.828 8.757 L 23.243 10.172 L 19.000 14.414 L 14.757 10.172 L 16.172 8.757 L 18.000 10.586 L 18.000 8.000 C 18.000 6.343 16.657 5.000 15.000 5.000 L 11.000 5.000 L 11.000 3.000 L 15.000 3.000 C 17.761 3.000 20.000 5.239 20.000 8.000 L 20.000 10.586 ZM 13.000 9.000 C 13.552 9.000 14.000 9.448 14.000 10.000 L 14.000 20.000 C 14.000 20.552 13.552 21.000 13.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 10.000 C 2.000 9.448 2.448 9.000 3.000 9.000 L 13.000 9.000 ZM 12.000 11.000 L 4.000 11.000 L 4.000 19.000 L 12.000 19.000 L 12.000 11.000 Z"),
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
        return _clockwiseLine!!
    }

private var _clockwiseLine: ImageVector? = null
