package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PhoneLine: ImageVector
    get() {
        if (_phoneLine != null) return _phoneLine!!
        _phoneLine = remixIcon(
            name = "PhoneLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.366 10.682 C 10.302 12.329 11.671 13.698 13.318 14.634 L 14.202 13.396 C 14.497 12.984 15.052 12.857 15.496 13.100 C 16.902 13.868 18.457 14.335 20.079 14.464 C 20.599 14.505 21.000 14.939 21.000 15.461 L 21.000 19.923 C 21.000 20.436 20.612 20.866 20.102 20.918 C 19.572 20.973 19.038 21.000 18.500 21.000 C 9.940 21.000 3.000 14.060 3.000 5.500 C 3.000 4.962 3.027 4.428 3.082 3.898 C 3.134 3.388 3.564 3.000 4.077 3.000 L 8.539 3.000 C 9.061 3.000 9.495 3.401 9.536 3.921 C 9.665 5.543 10.132 7.098 10.900 8.504 C 11.143 8.948 11.016 9.504 10.604 9.798 L 9.366 10.682 ZM 6.844 10.025 L 8.744 8.668 C 8.205 7.505 7.836 6.272 7.647 5.000 L 5.009 5.000 C 5.003 5.166 5.000 5.333 5.000 5.500 C 5.000 12.956 11.044 19.000 18.500 19.000 C 18.667 19.000 18.834 18.997 19.000 18.991 L 19.000 16.353 C 17.728 16.164 16.495 15.795 15.332 15.256 L 13.975 17.156 C 13.426 16.942 12.896 16.691 12.387 16.406 L 12.329 16.373 C 10.370 15.259 8.741 13.630 7.627 11.671 L 7.594 11.613 C 7.308 11.104 7.058 10.574 6.844 10.025 Z"),
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
        return _phoneLine!!
    }

private var _phoneLine: ImageVector? = null
