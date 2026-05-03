package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GitlabFill: ImageVector
    get() {
        if (_gitlabFill != null) return _gitlabFill!!
        _gitlabFill = remixIcon(
            name = "GitlabFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.663 9.987 L 21.635 9.915 L 18.916 2.821 C 18.861 2.682 18.763 2.564 18.637 2.483 C 18.510 2.403 18.361 2.364 18.210 2.372 C 18.060 2.380 17.916 2.435 17.798 2.528 C 17.681 2.622 17.597 2.750 17.557 2.895 L 15.719 8.520 L 8.282 8.520 L 6.443 2.895 C 6.404 2.750 6.319 2.622 6.202 2.528 C 6.085 2.434 5.941 2.379 5.791 2.371 C 5.640 2.363 5.491 2.402 5.364 2.483 C 5.237 2.563 5.139 2.681 5.084 2.821 L 2.362 9.925 L 2.334 9.995 C 1.943 11.018 1.895 12.141 2.197 13.193 C 2.499 14.246 3.134 15.172 4.008 15.833 L 4.018 15.840 L 4.042 15.859 L 8.189 18.963 L 10.239 20.516 L 11.486 21.460 C 11.632 21.570 11.810 21.630 11.994 21.630 C 12.177 21.630 12.356 21.570 12.502 21.460 L 13.749 20.516 L 15.800 18.963 L 19.971 15.840 L 19.982 15.832 C 20.858 15.172 21.497 14.245 21.800 13.190 C 22.103 12.136 22.055 11.012 21.663 9.987 Z"),
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
        return _gitlabFill!!
    }

private var _gitlabFill: ImageVector? = null
