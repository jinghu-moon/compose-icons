package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ChatSmileAi3Fill: ImageVector
    get() {
        if (_chatSmileAi3Fill != null) return _chatSmileAi3Fill!!
        _chatSmileAi3Fill = remixIcon(
            name = "ChatSmileAi3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 12.906 2.000 13.783 2.122 14.617 2.348 C 14.222 3.147 14.000 4.048 14.000 5.000 C 14.000 8.314 16.686 11.000 20.000 11.000 C 20.669 11.000 21.311 10.888 21.911 10.686 C 21.968 11.116 22.000 11.555 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 L 2.000 22.000 L 4.929 19.071 C 3.119 17.262 2.000 14.761 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 8.000 13.000 C 8.000 15.209 9.791 17.000 12.000 17.000 C 14.209 17.000 16.000 15.209 16.000 13.000 L 8.000 13.000 ZM 19.529 1.319 C 19.706 0.893 20.294 0.893 20.471 1.319 L 20.724 1.931 C 21.156 2.973 21.962 3.806 22.975 4.257 L 23.691 4.576 C 24.102 4.759 24.102 5.356 23.691 5.539 L 22.933 5.877 C 21.945 6.316 21.153 7.119 20.714 8.128 L 20.467 8.693 C 20.286 9.107 19.714 9.107 19.533 8.693 L 19.286 8.128 C 18.847 7.119 18.055 6.316 17.067 5.877 L 16.308 5.539 C 15.897 5.356 15.897 4.759 16.308 4.576 L 17.025 4.257 C 18.038 3.806 18.844 2.973 19.276 1.931 L 19.529 1.319 Z"),
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
        return _chatSmileAi3Fill!!
    }

private var _chatSmileAi3Fill: ImageVector? = null
