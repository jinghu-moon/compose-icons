package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Circuitry: ImageVector
    get() {
        if (_circuitry != null) return _circuitry!!
        _circuitry = phosphorBoldIcon(
            name = "Circuitry",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 28.000 L 48.000 28.000 C 36.954 28.000 28.000 36.954 28.000 48.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 208.000 228.000 C 219.046 228.000 228.000 219.046 228.000 208.000 L 228.000 48.000 C 228.000 36.954 219.046 28.000 208.000 28.000 ZM 52.000 52.000 L 76.000 52.000 L 76.000 147.220 C 66.593 152.651 62.006 163.724 64.818 174.216 C 67.629 184.709 77.137 192.005 88.000 192.005 C 98.863 192.005 108.371 184.709 111.182 174.216 C 113.994 163.724 109.407 152.651 100.000 147.220 L 100.000 125.000 L 140.000 165.000 L 140.000 204.000 L 52.000 204.000 ZM 204.000 204.000 L 164.000 204.000 L 164.000 160.000 C 164.003 156.816 162.740 153.762 160.490 151.510 L 100.000 91.000 L 100.000 52.000 L 124.000 52.000 L 124.000 72.000 C 123.997 75.184 125.260 78.238 127.510 80.490 L 144.820 97.790 C 142.020 108.281 146.613 119.345 156.019 124.769 C 165.425 130.193 177.301 128.627 184.979 120.949 C 192.657 113.271 194.223 101.395 188.799 91.989 C 183.375 82.583 172.311 77.990 161.820 80.790 L 148.000 67.000 L 148.000 52.000 L 204.000 52.000 Z"),
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
        return _circuitry!!
    }

private var _circuitry: ImageVector? = null
