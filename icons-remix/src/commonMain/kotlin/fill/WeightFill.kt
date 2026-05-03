package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.WeightFill: ImageVector
    get() {
        if (_weightFill != null) return _weightFill!!
        _weightFill = remixIcon(
            name = "WeightFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.000 6.000 C 14.000 7.105 13.105 8.000 12.000 8.000 C 10.896 8.000 10.000 7.105 10.000 6.000 C 10.000 4.895 10.896 4.000 12.000 4.000 C 13.105 4.000 14.000 4.895 14.000 6.000 ZM 15.465 8.000 C 15.806 7.412 16.000 6.729 16.000 6.000 C 16.000 3.791 14.210 2.000 12.000 2.000 C 9.791 2.000 8.000 3.791 8.000 6.000 C 8.000 6.729 8.195 7.412 8.535 8.000 L 5.066 8.000 C 4.579 8.000 4.163 8.351 4.080 8.832 L 2.200 19.831 C 2.096 20.442 2.566 21.000 3.186 21.000 L 20.815 21.000 C 21.434 21.000 21.905 20.442 21.801 19.831 L 19.920 8.832 C 19.838 8.351 19.422 8.000 18.935 8.000 L 15.465 8.000 Z"),
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
        return _weightFill!!
    }

private var _weightFill: ImageVector? = null
