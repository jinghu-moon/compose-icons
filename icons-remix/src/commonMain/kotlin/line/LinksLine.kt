package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.LinksLine: ImageVector
    get() {
        if (_linksLine != null) return _linksLine!!
        _linksLine = remixIcon(
            name = "LinksLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.061 8.111 L 14.475 9.525 C 17.209 12.259 17.209 16.691 14.475 19.425 L 14.121 19.778 C 11.388 22.512 6.956 22.512 4.222 19.778 C 1.488 17.045 1.488 12.612 4.222 9.879 L 5.636 11.293 C 3.683 13.246 3.683 16.411 5.636 18.364 C 7.589 20.317 10.755 20.317 12.707 18.364 L 13.061 18.010 C 15.013 16.058 15.013 12.892 13.061 10.939 L 11.646 9.525 L 13.061 8.111 ZM 19.778 14.121 L 18.364 12.707 C 20.317 10.755 20.317 7.589 18.364 5.636 C 16.411 3.683 13.246 3.683 11.293 5.636 L 10.939 5.990 C 8.987 7.942 8.987 11.108 10.939 13.061 L 12.354 14.475 L 10.939 15.889 L 9.525 14.475 C 6.792 11.741 6.792 7.309 9.525 4.575 L 9.879 4.222 C 12.612 1.488 17.045 1.488 19.778 4.222 C 22.512 6.956 22.512 11.388 19.778 14.121 Z"),
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
        return _linksLine!!
    }

private var _linksLine: ImageVector? = null
