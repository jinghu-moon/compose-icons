package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BloggerLine: ImageVector
    get() {
        if (_bloggerLine != null) return _bloggerLine!!
        _bloggerLine = remixIcon(
            name = "BloggerLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.000 9.009 C 3.000 5.690 5.691 3.000 9.009 3.000 L 12.000 3.000 C 15.309 3.000 17.994 5.675 18.009 8.981 L 18.953 8.981 C 20.104 8.981 21.000 9.877 21.000 11.028 L 21.000 14.990 C 21.000 18.309 18.309 21.000 14.991 21.000 L 9.009 21.000 C 5.691 21.000 3.000 18.309 3.000 14.990 L 3.000 9.009 ZM 9.009 5.000 C 6.795 5.000 5.000 6.795 5.000 9.009 L 5.000 14.990 C 5.000 17.204 6.795 19.000 9.009 19.000 L 14.991 19.000 C 17.205 19.000 19.000 17.204 19.000 14.990 L 19.000 11.000 L 18.000 11.000 C 16.924 11.000 16.000 10.076 16.000 9.000 C 16.000 6.786 14.214 5.000 12.000 5.000 L 9.009 5.000 ZM 8.000 9.000 C 8.000 8.448 8.448 8.000 9.000 8.000 L 12.500 8.000 C 13.052 8.000 13.500 8.448 13.500 9.000 C 13.500 9.552 13.052 10.000 12.500 10.000 L 9.000 10.000 C 8.448 10.000 8.000 9.552 8.000 9.000 ZM 9.000 14.000 C 8.448 14.000 8.000 14.448 8.000 15.000 C 8.000 15.552 8.448 16.000 9.000 16.000 L 15.000 16.000 C 15.552 16.000 16.000 15.552 16.000 15.000 C 16.000 14.448 15.552 14.000 15.000 14.000 L 9.000 14.000 Z"),
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
        return _bloggerLine!!
    }

private var _bloggerLine: ImageVector? = null
