package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AnticlockwiseFill: ImageVector
    get() {
        if (_anticlockwiseFill != null) return _anticlockwiseFill!!
        _anticlockwiseFill = remixIcon(
            name = "AnticlockwiseFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.000 10.000 L 9.000 10.000 L 5.000 15.000 L 1.000 10.000 L 4.000 10.000 L 4.000 8.000 C 4.000 5.239 6.239 3.000 9.000 3.000 L 13.000 3.000 L 13.000 5.000 L 9.000 5.000 C 7.343 5.000 6.000 6.343 6.000 8.000 L 6.000 10.000 ZM 11.000 9.000 L 21.000 9.000 C 21.552 9.000 22.000 9.448 22.000 10.000 L 22.000 20.000 C 22.000 20.552 21.552 21.000 21.000 21.000 L 11.000 21.000 C 10.448 21.000 10.000 20.552 10.000 20.000 L 10.000 10.000 C 10.000 9.448 10.448 9.000 11.000 9.000 Z"),
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
        return _anticlockwiseFill!!
    }

private var _anticlockwiseFill: ImageVector? = null
