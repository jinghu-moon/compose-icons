package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FlagFill: ImageVector
    get() {
        if (_flagFill != null) return _flagFill!!
        _flagFill = remixIcon(
            name = "FlagFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.000 3.000 L 12.382 3.000 C 12.761 3.000 13.107 3.214 13.276 3.553 L 14.000 5.000 L 20.000 5.000 C 20.552 5.000 21.000 5.448 21.000 6.000 L 21.000 17.000 C 21.000 17.552 20.552 18.000 20.000 18.000 L 13.618 18.000 C 13.239 18.000 12.893 17.786 12.724 17.447 L 12.000 16.000 L 5.000 16.000 L 5.000 22.000 L 3.000 22.000 L 3.000 3.000 Z"),
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
        return _flagFill!!
    }

private var _flagFill: ImageVector? = null
