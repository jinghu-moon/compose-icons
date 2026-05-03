package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CircleNotch: ImageVector
    get() {
        if (_circleNotch != null) return _circleNotch!!
        _circleNotch = phosphorFillIcon(
            name = "CircleNotch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 128.000 200.000 C 95.408 200.005 66.877 178.116 58.442 146.634 C 50.007 115.153 63.772 81.931 92.000 65.640 C 95.811 63.571 100.576 64.914 102.745 68.669 C 104.914 72.424 103.696 77.223 100.000 79.490 C 78.050 92.163 67.348 117.999 73.908 142.481 C 80.468 166.964 102.654 183.987 128.000 183.987 C 153.346 183.987 175.532 166.964 182.092 142.481 C 188.652 117.999 177.950 92.163 156.000 79.490 C 152.304 77.223 151.086 72.424 153.255 68.669 C 155.424 64.914 160.189 63.571 164.000 65.640 C 192.228 81.931 205.993 115.153 197.558 146.634 C 189.123 178.116 160.592 200.005 128.000 200.000 Z"),
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
        return _circleNotch!!
    }

private var _circleNotch: ImageVector? = null
