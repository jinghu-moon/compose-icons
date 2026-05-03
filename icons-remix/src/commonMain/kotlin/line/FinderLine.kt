package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FinderLine: ImageVector
    get() {
        if (_finderLine != null) return _finderLine!!
        _finderLine = remixIcon(
            name = "FinderLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.001 3.000 C 21.553 3.000 22.001 3.448 22.001 4.000 L 22.001 20.000 C 22.001 20.552 21.553 21.000 21.001 21.000 L 3.001 21.000 C 2.449 21.000 2.001 20.552 2.001 20.000 L 2.001 4.000 C 2.001 3.448 2.449 3.000 3.001 3.000 L 21.001 3.000 ZM 10.482 4.999 L 4.001 5.000 L 4.001 19.000 L 12.747 19.000 C 12.685 18.656 12.631 18.316 12.584 17.980 C 12.287 17.993 12.093 18.000 12.001 18.000 C 9.793 18.000 7.603 17.270 5.446 15.832 L 6.556 14.168 C 8.399 15.397 10.209 16.000 12.001 16.000 C 12.134 16.000 12.266 15.997 12.399 15.990 C 12.375 15.493 12.375 14.580 12.406 14.000 L 9.501 14.000 L 9.501 13.000 C 9.501 9.725 9.821 7.061 10.482 4.999 ZM 12.601 4.999 C 11.936 6.582 11.557 9.411 11.512 12.000 L 14.634 12.000 L 14.493 13.124 C 14.393 13.929 14.357 14.769 14.386 15.644 C 15.399 15.345 16.417 14.854 17.446 14.168 L 18.556 15.832 C 17.236 16.712 15.904 17.327 14.563 17.671 C 14.620 18.105 14.694 18.548 14.782 18.999 L 20.001 19.000 L 20.001 5.000 L 12.601 4.999 ZM 7.001 7.000 C 7.553 7.000 8.001 7.448 8.001 8.000 L 8.001 9.000 C 8.001 9.552 7.553 10.000 7.001 10.000 C 6.449 10.000 6.001 9.552 6.001 9.000 L 6.001 8.000 C 6.001 7.448 6.449 7.000 7.001 7.000 ZM 17.001 7.000 C 17.553 7.000 18.001 7.448 18.001 8.000 L 18.001 9.000 C 18.001 9.552 17.553 10.000 17.001 10.000 C 16.449 10.000 16.001 9.552 16.001 9.000 L 16.001 8.000 C 16.001 7.448 16.449 7.000 17.001 7.000 Z"),
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
        return _finderLine!!
    }

private var _finderLine: ImageVector? = null
