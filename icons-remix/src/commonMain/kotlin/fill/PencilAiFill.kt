package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PencilAiFill: ImageVector
    get() {
        if (_pencilAiFill != null) return _pencilAiFill!!
        _pencilAiFill = remixIcon(
            name = "PencilAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.143 11.097 L 7.242 20.996 L 3.000 20.996 L 3.000 16.754 L 12.899 6.854 L 17.143 11.097 ZM 16.436 3.318 C 16.826 2.928 17.459 2.928 17.850 3.318 L 20.678 6.147 C 21.068 6.538 21.068 7.171 20.678 7.562 L 18.557 9.683 L 14.314 5.440 L 16.436 3.318 ZM 4.529 1.319 C 4.706 0.894 5.294 0.894 5.471 1.319 L 5.724 1.931 C 6.156 2.973 6.962 3.806 7.975 4.257 L 8.692 4.576 C 9.103 4.759 9.103 5.356 8.692 5.539 L 7.933 5.877 C 6.945 6.316 6.153 7.119 5.714 8.128 L 5.467 8.693 C 5.286 9.107 4.714 9.107 4.533 8.693 L 4.286 8.128 C 3.847 7.119 3.055 6.316 2.067 5.877 L 1.308 5.539 C 0.897 5.356 0.897 4.759 1.308 4.576 L 2.025 4.257 C 3.038 3.806 3.844 2.973 4.276 1.931 L 4.529 1.319 Z"),
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
        return _pencilAiFill!!
    }

private var _pencilAiFill: ImageVector? = null
