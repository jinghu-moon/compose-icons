package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FlagOffFill: ImageVector
    get() {
        if (_flagOffFill != null) return _flagOffFill!!
        _flagOffFill = remixIcon(
            name = "FlagOffFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.586 18.000 L 21.192 22.607 L 22.607 21.192 L 2.808 1.393 L 1.394 2.808 L 3.000 4.414 L 3.000 22.000 L 5.000 22.000 L 5.000 16.000 L 12.000 16.000 L 12.724 17.447 C 12.893 17.786 13.239 18.000 13.618 18.000 L 16.586 18.000 ZM 21.000 6.000 L 21.000 16.758 L 7.242 3.000 L 12.382 3.000 C 12.761 3.000 13.107 3.214 13.276 3.553 L 14.000 5.000 L 20.000 5.000 C 20.552 5.000 21.000 5.448 21.000 6.000 Z"),
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
        return _flagOffFill!!
    }

private var _flagOffFill: ImageVector? = null
