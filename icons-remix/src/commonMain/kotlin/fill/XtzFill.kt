package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.XtzFill: ImageVector
    get() {
        if (_xtzFill != null) return _xtzFill!!
        _xtzFill = remixIcon(
            name = "XtzFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.631 17.494 C 19.410 13.636 14.481 11.884 14.010 11.703 C 13.990 11.694 13.990 11.675 14.000 11.656 L 19.082 6.634 L 19.082 6.094 C 19.082 6.008 19.006 5.932 18.919 5.932 L 9.553 5.932 L 9.553 2.000 L 6.096 2.711 L 6.096 3.223 L 6.288 3.223 C 6.288 3.223 7.136 3.223 7.136 4.057 L 7.136 5.923 L 4.460 5.923 C 4.412 5.923 4.363 5.970 4.363 6.017 L 4.363 7.203 L 7.145 7.203 L 7.145 13.636 C 7.145 15.655 8.464 17.058 10.774 16.868 C 11.247 16.822 11.703 16.660 12.103 16.395 C 12.188 16.343 12.258 16.270 12.307 16.182 C 12.356 16.094 12.382 15.994 12.383 15.892 L 12.383 15.256 C 11.632 15.749 10.995 15.720 10.995 15.720 C 9.532 15.720 9.562 13.891 9.562 13.891 L 9.562 7.201 L 16.301 7.201 L 11.450 12.015 L 11.429 13.152 C 11.429 13.172 11.439 13.181 11.459 13.181 C 15.906 13.920 17.109 16.753 17.109 17.578 C 17.109 17.578 17.590 21.586 13.519 21.861 C 13.519 21.861 10.851 21.974 10.380 20.923 C 10.361 20.884 10.380 20.847 10.418 20.829 C 10.861 20.629 11.159 20.241 11.159 19.719 C 11.159 18.942 10.678 18.307 9.667 18.307 C 8.850 18.307 8.175 18.942 8.175 19.719 C 8.175 19.719 7.791 23.093 13.510 22.998 C 20.036 22.884 19.631 17.494 19.631 17.494 Z"),
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
        return _xtzFill!!
    }

private var _xtzFill: ImageVector? = null
