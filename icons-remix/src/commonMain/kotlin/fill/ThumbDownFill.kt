package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ThumbDownFill: ImageVector
    get() {
        if (_thumbDownFill != null) return _thumbDownFill!!
        _thumbDownFill = remixIcon(
            name = "ThumbDownFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 22.000 15.000 L 19.000 15.000 L 19.000 3.000 L 22.000 3.000 C 22.552 3.000 23.000 3.448 23.000 4.000 L 23.000 14.000 C 23.000 14.552 22.552 15.000 22.000 15.000 ZM 16.707 16.293 L 10.307 22.693 C 10.131 22.869 9.852 22.889 9.653 22.740 L 8.800 22.100 C 8.316 21.737 8.097 21.117 8.247 20.530 L 9.400 16.000 L 3.000 16.000 C 1.895 16.000 1.000 15.105 1.000 14.000 L 1.000 11.896 C 1.000 11.634 1.051 11.376 1.151 11.134 L 4.245 3.619 C 4.399 3.245 4.764 3.000 5.170 3.000 L 16.000 3.000 C 16.552 3.000 17.000 3.448 17.000 4.000 L 17.000 15.586 C 17.000 15.851 16.895 16.105 16.707 16.293 Z"),
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
        return _thumbDownFill!!
    }

private var _thumbDownFill: ImageVector? = null
