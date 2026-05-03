package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ChatAi2Fill: ImageVector
    get() {
        if (_chatAi2Fill != null) return _chatAi2Fill!!
        _chatAi2Fill = remixIcon(
            name = "ChatAi2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.343 3.000 C 14.122 3.626 14.000 4.299 14.000 5.000 C 14.000 8.314 16.686 11.000 20.000 11.000 C 20.701 11.000 21.374 10.878 22.000 10.657 L 22.000 18.000 C 22.000 18.552 21.552 19.000 21.000 19.000 L 14.450 19.000 L 12.000 22.500 L 9.550 19.000 L 3.000 19.000 C 2.448 19.000 2.000 18.552 2.000 18.000 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 14.343 3.000 ZM 19.529 1.319 C 19.706 0.894 20.294 0.893 20.471 1.319 L 20.724 1.931 C 21.156 2.973 21.962 3.806 22.975 4.257 L 23.691 4.576 C 24.102 4.759 24.102 5.356 23.691 5.539 L 22.933 5.877 C 21.945 6.316 21.153 7.119 20.714 8.128 L 20.467 8.693 C 20.286 9.107 19.714 9.107 19.533 8.693 L 19.286 8.128 C 18.847 7.119 18.055 6.316 17.067 5.877 L 16.308 5.539 C 15.897 5.356 15.897 4.759 16.308 4.576 L 17.025 4.257 C 18.038 3.806 18.844 2.973 19.276 1.931 L 19.529 1.319 Z"),
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
        return _chatAi2Fill!!
    }

private var _chatAi2Fill: ImageVector? = null
