package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PencilAi2Line: ImageVector
    get() {
        if (_pencilAi2Line != null) return _pencilAi2Line!!
        _pencilAi2Line = remixIcon(
            name = "PencilAi2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.529 15.319 C 18.706 14.893 19.294 14.893 19.471 15.319 L 19.724 15.931 C 20.156 16.973 20.962 17.806 21.975 18.257 L 22.691 18.576 C 23.102 18.759 23.102 19.356 22.691 19.539 L 21.933 19.877 C 20.945 20.316 20.153 21.119 19.714 22.128 L 19.467 22.693 C 19.286 23.108 18.714 23.108 18.533 22.693 L 18.286 22.128 C 17.847 21.119 17.055 20.316 16.067 19.877 L 15.308 19.539 C 14.897 19.356 14.897 18.759 15.308 18.576 L 16.025 18.257 C 17.038 17.806 17.844 16.973 18.276 15.931 L 18.529 15.319 ZM 16.435 3.212 C 16.825 2.821 17.459 2.821 17.850 3.212 L 20.678 6.041 C 21.068 6.432 21.068 7.065 20.678 7.455 L 7.242 20.890 L 3.000 20.890 L 3.000 16.647 L 16.435 3.212 ZM 5.000 17.476 L 5.000 18.890 L 6.414 18.890 L 15.727 9.576 L 14.314 8.162 L 5.000 17.476 ZM 15.727 6.748 L 17.143 8.162 L 18.557 6.748 L 17.143 5.334 L 15.727 6.748 Z"),
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
        return _pencilAi2Line!!
    }

private var _pencilAi2Line: ImageVector? = null
