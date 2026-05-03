package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BinocularsFill: ImageVector
    get() {
        if (_binocularsFill != null) return _binocularsFill!!
        _binocularsFill = remixIcon(
            name = "BinocularsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.490 3.330 C 17.624 2.759 19.817 4.026 20.389 6.159 L 22.848 15.335 C 23.491 17.735 22.066 20.203 19.666 20.847 C 17.266 21.490 14.798 20.064 14.154 17.664 C 14.069 17.345 14.021 17.024 14.006 16.707 C 13.370 16.897 12.697 17.000 12.001 17.000 C 11.304 17.000 10.631 16.897 9.995 16.707 C 9.980 17.024 9.933 17.345 9.848 17.664 C 9.204 20.064 6.736 21.490 4.336 20.847 C 1.936 20.203 0.511 17.735 1.154 15.335 L 3.613 6.159 C 4.185 4.026 6.378 2.759 8.512 3.330 C 10.243 3.794 11.403 5.327 11.474 7.028 C 11.647 7.010 11.823 7.000 12.001 7.000 C 12.179 7.000 12.354 7.010 12.527 7.028 C 12.598 5.327 13.759 3.794 15.490 3.330 ZM 5.501 14.000 C 4.120 14.000 3.001 15.119 3.001 16.500 C 3.001 17.881 4.120 19.000 5.501 19.000 C 6.882 19.000 8.001 17.881 8.001 16.500 C 8.001 15.119 6.882 14.000 5.501 14.000 ZM 18.501 14.000 C 17.120 14.000 16.001 15.119 16.001 16.500 C 16.001 17.881 17.120 19.000 18.501 19.000 C 19.882 19.000 21.001 17.881 21.001 16.500 C 21.001 15.119 19.882 14.000 18.501 14.000 Z"),
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
        return _binocularsFill!!
    }

private var _binocularsFill: ImageVector? = null
