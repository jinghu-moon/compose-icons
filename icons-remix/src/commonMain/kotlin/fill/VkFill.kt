package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.VkFill: ImageVector
    get() {
        if (_vkFill != null) return _vkFill!!
        _vkFill = remixIcon(
            name = "VkFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.260 4.260 C 3.000 5.532 3.000 7.566 3.000 11.640 L 3.000 12.360 C 3.000 16.428 3.000 18.462 4.260 19.740 C 5.532 21.000 7.566 21.000 11.640 21.000 L 12.360 21.000 C 16.428 21.000 18.462 21.000 19.740 19.740 C 21.000 18.468 21.000 16.434 21.000 12.360 L 21.000 11.640 C 21.000 7.572 21.000 5.538 19.740 4.260 C 18.468 3.000 16.434 3.000 12.360 3.000 L 11.640 3.000 C 7.572 3.000 5.538 3.000 4.260 4.260 ZM 6.036 8.478 L 8.100 8.478 C 8.166 11.910 9.678 13.362 10.878 13.662 L 10.878 8.478 L 12.816 8.478 L 12.816 11.436 C 13.998 11.310 15.246 9.960 15.666 8.472 L 17.598 8.472 C 17.441 9.242 17.126 9.972 16.674 10.615 C 16.222 11.258 15.642 11.801 14.970 12.210 C 15.719 12.583 16.381 13.111 16.912 13.758 C 17.442 14.406 17.830 15.158 18.048 15.966 L 15.918 15.966 C 15.462 14.544 14.322 13.440 12.816 13.290 L 12.816 15.966 L 12.582 15.966 L 12.576 15.966 C 8.472 15.966 6.132 13.158 6.036 8.478 Z"),
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
        return _vkFill!!
    }

private var _vkFill: ImageVector? = null
