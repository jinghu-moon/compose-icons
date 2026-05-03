package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AnticlockwiseLine: ImageVector
    get() {
        if (_anticlockwiseLine != null) return _anticlockwiseLine!!
        _anticlockwiseLine = remixIcon(
            name = "AnticlockwiseLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.000 9.000 L 21.000 9.000 C 21.552 9.000 22.000 9.448 22.000 10.000 L 22.000 20.000 C 22.000 20.552 21.552 21.000 21.000 21.000 L 11.000 21.000 C 10.448 21.000 10.000 20.552 10.000 20.000 L 10.000 10.000 C 10.000 9.448 10.448 9.000 11.000 9.000 ZM 12.000 11.000 L 12.000 19.000 L 20.000 19.000 L 20.000 11.000 L 12.000 11.000 ZM 6.000 10.586 L 7.828 8.757 L 9.243 10.172 L 5.000 14.414 L 0.757 10.172 L 2.172 8.757 L 4.000 10.586 L 4.000 8.000 C 4.000 5.239 6.239 3.000 9.000 3.000 L 13.000 3.000 L 13.000 5.000 L 9.000 5.000 C 7.343 5.000 6.000 6.343 6.000 8.000 L 6.000 10.586 Z"),
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
        return _anticlockwiseLine!!
    }

private var _anticlockwiseLine: ImageVector? = null
