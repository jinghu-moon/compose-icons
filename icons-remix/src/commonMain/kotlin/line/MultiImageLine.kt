package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MultiImageLine: ImageVector
    get() {
        if (_multiImageLine != null) return _multiImageLine!!
        _multiImageLine = remixIcon(
            name = "MultiImageLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.000 3.000 C 6.448 3.000 6.000 3.448 6.000 4.000 L 6.000 7.000 L 3.000 7.000 C 2.448 7.000 2.000 7.448 2.000 8.000 L 2.000 20.000 C 2.000 20.552 2.448 21.000 3.000 21.000 L 17.000 21.000 C 17.552 21.000 18.000 20.552 18.000 20.000 L 18.000 17.000 L 21.000 17.000 C 21.552 17.000 22.000 16.552 22.000 16.000 L 22.000 4.000 C 22.000 3.448 21.552 3.000 21.000 3.000 L 7.000 3.000 ZM 17.000 7.000 L 8.000 7.000 L 8.000 5.000 L 20.000 5.000 L 20.000 15.000 L 18.000 15.000 L 18.000 8.000 C 18.000 7.448 17.552 7.000 17.000 7.000 ZM 16.000 9.000 L 16.000 15.739 L 11.491 11.640 L 4.000 18.632 L 4.000 9.000 L 16.000 9.000 ZM 11.509 14.360 L 16.000 18.442 L 16.000 19.000 L 6.537 19.000 L 11.509 14.360 ZM 7.000 13.500 C 7.828 13.500 8.500 12.828 8.500 12.000 C 8.500 11.172 7.828 10.500 7.000 10.500 C 6.172 10.500 5.500 11.172 5.500 12.000 C 5.500 12.828 6.172 13.500 7.000 13.500 Z"),
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
        return _multiImageLine!!
    }

private var _multiImageLine: ImageVector? = null
