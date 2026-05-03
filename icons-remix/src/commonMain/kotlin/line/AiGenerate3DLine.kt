package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AiGenerate3DLine: ImageVector
    get() {
        if (_aiGenerate3DLine != null) return _aiGenerate3DLine!!
        _aiGenerate3DLine = remixIcon(
            name = "AiGenerate3DLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.142 2.818 L 13.102 3.948 L 12.000 3.311 L 4.500 7.652 L 4.500 7.658 L 12.000 12.000 L 12.000 20.690 L 19.500 16.347 L 19.500 11.500 L 21.500 10.329 L 21.500 17.500 L 12.000 23.000 L 2.500 17.500 L 2.500 6.500 L 12.000 1.000 L 15.142 2.818 ZM 18.529 2.319 C 18.706 1.893 19.294 1.893 19.471 2.319 L 19.724 2.931 C 20.156 3.973 20.962 4.806 21.975 5.257 L 22.692 5.576 C 23.103 5.759 23.103 6.356 22.692 6.539 L 21.933 6.877 C 20.945 7.316 20.153 8.119 19.714 9.128 L 19.467 9.693 C 19.286 10.108 18.714 10.108 18.533 9.693 L 18.287 9.128 C 17.848 8.119 17.055 7.316 16.067 6.877 L 15.308 6.539 C 14.897 6.356 14.897 5.759 15.308 5.576 L 16.025 5.257 C 17.038 4.806 17.844 3.973 18.276 2.931 L 18.529 2.319 Z"),
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
        return _aiGenerate3DLine!!
    }

private var _aiGenerate3DLine: ImageVector? = null
