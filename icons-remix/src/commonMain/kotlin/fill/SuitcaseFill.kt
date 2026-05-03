package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SuitcaseFill: ImageVector
    get() {
        if (_suitcaseFill != null) return _suitcaseFill!!
        _suitcaseFill = remixIcon(
            name = "SuitcaseFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.000 3.000 C 15.552 3.000 16.000 3.448 16.000 4.000 L 16.000 6.000 L 21.000 6.000 C 21.552 6.000 22.000 6.448 22.000 7.000 L 22.000 20.000 C 22.000 20.552 21.552 21.000 21.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 7.000 C 2.000 6.448 2.448 6.000 3.000 6.000 L 8.000 6.000 L 8.000 4.000 C 8.000 3.448 8.448 3.000 9.000 3.000 L 15.000 3.000 ZM 8.000 8.000 L 6.000 8.000 L 6.000 19.000 L 8.000 19.000 L 8.000 8.000 ZM 18.000 8.000 L 16.000 8.000 L 16.000 19.000 L 18.000 19.000 L 18.000 8.000 ZM 14.000 5.000 L 10.000 5.000 L 10.000 6.000 L 14.000 6.000 L 14.000 5.000 Z"),
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
        return _suitcaseFill!!
    }

private var _suitcaseFill: ImageVector? = null
