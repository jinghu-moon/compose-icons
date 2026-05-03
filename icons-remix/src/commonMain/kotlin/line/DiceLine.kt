package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DiceLine: ImageVector
    get() {
        if (_diceLine != null) return _diceLine!!
        _diceLine = remixIcon(
            name = "DiceLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.998 1.580 C 11.618 1.221 12.382 1.221 13.002 1.580 L 20.502 5.922 C 21.120 6.280 21.500 6.939 21.500 7.653 L 21.500 16.347 C 21.500 17.061 21.120 17.720 20.502 18.078 L 13.002 22.420 C 12.382 22.779 11.618 22.779 10.998 22.420 L 3.498 18.078 C 2.880 17.720 2.500 17.061 2.500 16.347 L 2.500 7.653 C 2.500 6.939 2.880 6.280 3.498 5.922 L 10.998 1.580 ZM 4.500 7.653 L 4.500 7.658 L 11.002 11.422 C 11.620 11.780 12.000 12.439 12.000 13.153 L 12.000 20.689 L 19.500 16.347 L 19.500 7.653 L 12.000 3.311 L 4.500 7.653 ZM 6.132 12.300 C 6.132 11.748 5.744 11.076 5.266 10.800 C 4.788 10.524 4.400 10.748 4.400 11.300 C 4.400 11.852 4.788 12.524 5.266 12.800 C 5.744 13.076 6.132 12.852 6.132 12.300 ZM 8.729 18.798 C 9.207 19.074 9.595 18.851 9.595 18.298 C 9.595 17.746 9.207 17.074 8.729 16.798 C 8.251 16.522 7.863 16.746 7.863 17.298 C 7.863 17.850 8.251 18.522 8.729 18.798 ZM 5.266 16.799 C 5.744 17.075 6.132 16.851 6.132 16.299 C 6.132 15.747 5.744 15.075 5.266 14.799 C 4.788 14.523 4.400 14.747 4.400 15.299 C 4.400 15.851 4.788 16.523 5.266 16.799 ZM 8.729 14.800 C 9.207 15.076 9.594 14.852 9.594 14.300 C 9.594 13.747 9.207 13.076 8.728 12.800 C 8.250 12.523 7.862 12.747 7.862 13.299 C 7.862 13.852 8.250 14.523 8.729 14.800 ZM 14.898 8.000 C 15.376 7.724 15.376 7.276 14.898 7.000 C 14.420 6.724 13.644 6.724 13.166 7.000 C 12.688 7.276 12.688 7.724 13.166 8.000 C 13.644 8.276 14.420 8.276 14.898 8.000 ZM 10.098 7.000 C 10.576 7.276 10.576 7.724 10.098 8.000 C 9.620 8.276 8.844 8.276 8.366 8.000 C 7.888 7.724 7.888 7.276 8.366 7.000 C 8.844 6.724 9.620 6.724 10.098 7.000 ZM 15.995 15.349 C 16.593 15.004 17.078 14.165 17.078 13.474 C 17.078 12.784 16.593 12.504 15.995 12.850 C 15.398 13.195 14.913 14.034 14.913 14.725 C 14.913 15.415 15.398 15.695 15.995 15.349 Z"),
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
        return _diceLine!!
    }

private var _diceLine: ImageVector? = null
