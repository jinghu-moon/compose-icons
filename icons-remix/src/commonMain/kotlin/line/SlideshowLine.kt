package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SlideshowLine: ImageVector
    get() {
        if (_slideshowLine != null) return _slideshowLine!!
        _slideshowLine = remixIcon(
            name = "SlideshowLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.000 21.000 L 13.000 23.000 L 11.000 23.000 L 11.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 6.000 L 22.000 6.000 L 22.000 20.000 C 22.000 20.552 21.552 21.000 21.000 21.000 L 13.000 21.000 ZM 4.000 19.000 L 20.000 19.000 L 20.000 8.000 L 4.000 8.000 L 4.000 19.000 ZM 13.000 10.000 L 18.000 10.000 L 18.000 12.000 L 13.000 12.000 L 13.000 10.000 ZM 13.000 14.000 L 18.000 14.000 L 18.000 16.000 L 13.000 16.000 L 13.000 14.000 ZM 9.000 10.000 L 9.000 13.000 L 12.000 13.000 C 12.000 14.657 10.657 16.000 9.000 16.000 C 7.343 16.000 6.000 14.657 6.000 13.000 C 6.000 11.343 7.343 10.000 9.000 10.000 ZM 2.000 3.000 L 22.000 3.000 L 22.000 5.000 L 2.000 5.000 L 2.000 3.000 Z"),
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
        return _slideshowLine!!
    }

private var _slideshowLine: ImageVector? = null
