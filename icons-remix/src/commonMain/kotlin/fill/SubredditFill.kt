package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SubredditFill: ImageVector
    get() {
        if (_subredditFill != null) return _subredditFill!!
        _subredditFill = remixIcon(
            name = "SubredditFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 13.994 2.000 15.849 2.585 17.409 3.591 L 12.027 16.211 L 14.200 16.211 L 19.016 4.876 C 20.857 6.690 22.000 9.211 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 12.188 7.788 C 11.677 7.779 11.174 7.907 10.731 8.160 C 10.308 8.408 9.957 8.723 9.678 9.105 L 9.639 9.105 L 9.639 7.912 L 7.555 7.912 L 7.555 16.211 L 9.693 16.211 L 9.693 11.811 C 9.693 11.403 9.788 11.051 9.980 10.757 C 10.158 10.475 10.408 10.246 10.704 10.095 C 10.996 9.947 11.292 9.873 11.592 9.873 L 11.591 9.872 C 11.721 9.872 11.851 9.884 11.979 9.908 C 12.073 9.920 12.165 9.947 12.250 9.989 L 13.110 7.936 C 13.027 7.899 12.900 7.866 12.731 7.835 C 12.561 7.804 12.379 7.788 12.188 7.788 Z"),
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
        return _subredditFill!!
    }

private var _subredditFill: ImageVector? = null
