package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FileAi2Line: ImageVector
    get() {
        if (_fileAi2Line != null) return _fileAi2Line!!
        _fileAi2Line = remixIcon(
            name = "FileAi2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.529 15.319 C 18.706 14.894 19.294 14.894 19.471 15.319 L 19.724 15.931 C 20.156 16.973 20.962 17.806 21.975 18.257 L 22.692 18.576 C 23.103 18.759 23.103 19.356 22.692 19.539 L 21.933 19.877 C 20.945 20.316 20.153 21.119 19.714 22.128 L 19.467 22.693 C 19.286 23.108 18.714 23.108 18.533 22.693 L 18.287 22.128 C 17.848 21.119 17.055 20.316 16.067 19.877 L 15.308 19.539 C 14.897 19.356 14.897 18.759 15.308 18.576 L 16.025 18.257 C 17.038 17.806 17.844 16.973 18.276 15.931 L 18.529 15.319 ZM 19.998 2.000 C 20.551 2.000 21.000 2.456 21.000 2.992 L 21.000 13.000 L 19.000 13.000 L 19.000 4.000 L 10.000 4.000 L 10.000 9.000 L 5.000 9.000 L 5.000 20.000 L 13.000 20.000 L 13.000 22.000 L 3.993 22.000 C 3.445 22.000 3.000 21.550 3.000 20.993 L 3.000 8.000 L 9.003 2.000 L 19.998 2.000 Z"),
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
        return _fileAi2Line!!
    }

private var _fileAi2Line: ImageVector? = null
