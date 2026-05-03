package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SubredditLine: ImageVector
    get() {
        if (_subredditLine != null) return _subredditLine!!
        _subredditLine = remixIcon(
            name = "SubredditLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.592 9.873 C 11.292 9.873 10.997 9.947 10.704 10.094 C 10.408 10.246 10.158 10.475 9.980 10.757 C 9.788 11.051 9.693 11.402 9.693 11.810 L 9.693 16.211 L 7.554 16.211 L 7.554 7.912 L 9.639 7.912 L 9.639 9.106 L 9.678 9.106 C 9.957 8.723 10.308 8.408 10.731 8.160 C 11.174 7.907 11.677 7.778 12.188 7.788 C 12.379 7.788 12.560 7.803 12.730 7.834 C 12.900 7.866 13.027 7.899 13.110 7.936 L 12.250 9.989 C 12.165 9.947 12.073 9.920 11.979 9.908 C 11.851 9.884 11.721 9.872 11.591 9.872 L 11.592 9.873 ZM 22.000 12.000 C 22.000 14.652 20.946 17.196 19.071 19.071 C 17.196 20.946 14.652 22.000 12.000 22.000 C 9.348 22.000 6.804 20.946 4.929 19.071 C 3.054 17.196 2.000 14.652 2.000 12.000 C 2.000 9.348 3.054 6.804 4.929 4.929 C 6.804 3.054 9.348 2.000 12.000 2.000 C 14.652 2.000 17.196 3.054 19.071 4.929 C 20.946 6.804 22.000 9.348 22.000 12.000 ZM 20.000 12.000 C 20.001 10.135 19.348 8.329 18.154 6.896 L 14.200 16.211 L 12.028 16.211 L 16.592 5.459 C 15.249 4.509 13.645 3.999 12.000 4.000 C 7.589 4.000 4.000 7.589 4.000 12.000 C 4.000 16.411 7.589 20.000 12.000 20.000 C 16.411 20.000 20.000 16.411 20.000 12.000 Z"),
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
        return _subredditLine!!
    }

private var _subredditLine: ImageVector? = null
