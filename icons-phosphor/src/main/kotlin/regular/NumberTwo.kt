package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.NumberTwo: ImageVector
    get() {
        if (_numberTwo != null) return _numberTwo!!
        _numberTwo = phosphorRegularIcon(
            name = "NumberTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 176.000 208.000 C 176.000 212.418 172.418 216.000 168.000 216.000 L 88.000 216.000 C 84.970 216.000 82.200 214.288 80.845 211.578 C 79.489 208.867 79.782 205.624 81.600 203.200 L 153.540 107.280 C 160.526 98.158 162.085 85.991 157.625 75.403 C 153.165 64.814 143.371 57.429 131.964 56.054 C 120.557 54.679 109.288 59.525 102.440 68.750 C 100.935 70.751 99.667 72.918 98.660 75.210 C 96.890 79.258 92.173 81.105 88.125 79.335 C 84.077 77.565 82.230 72.848 84.000 68.800 C 91.402 51.855 107.880 40.669 126.360 40.043 C 144.841 39.417 162.038 49.462 170.570 65.867 C 179.103 82.271 177.453 102.119 166.330 116.890 L 104.000 200.000 L 168.000 200.000 C 172.418 200.000 176.000 203.582 176.000 208.000 Z"),
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
        return _numberTwo!!
    }

private var _numberTwo: ImageVector? = null
