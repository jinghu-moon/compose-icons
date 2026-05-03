package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PencilAi2Fill: ImageVector
    get() {
        if (_pencilAi2Fill != null) return _pencilAi2Fill!!
        _pencilAi2Fill = remixIcon(
            name = "PencilAi2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.529 15.319 C 18.706 14.893 19.294 14.893 19.471 15.319 L 19.724 15.931 C 20.156 16.973 20.962 17.806 21.975 18.257 L 22.691 18.576 C 23.102 18.759 23.102 19.356 22.691 19.539 L 21.933 19.877 C 20.945 20.316 20.153 21.119 19.714 22.128 L 19.467 22.693 C 19.286 23.108 18.714 23.108 18.533 22.693 L 18.286 22.128 C 17.847 21.119 17.055 20.316 16.067 19.877 L 15.308 19.539 C 14.897 19.356 14.897 18.759 15.308 18.576 L 16.025 18.257 C 17.038 17.806 17.844 16.973 18.276 15.931 L 18.529 15.319 ZM 17.143 11.097 L 7.242 20.996 L 3.000 20.996 L 3.000 16.754 L 12.899 6.855 L 17.143 11.097 ZM 16.435 3.318 C 16.825 2.928 17.459 2.928 17.850 3.318 L 20.678 6.147 C 21.068 6.538 21.068 7.171 20.678 7.562 L 18.557 9.683 L 14.314 5.440 L 16.435 3.318 Z"),
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
        return _pencilAi2Fill!!
    }

private var _pencilAi2Fill: ImageVector? = null
