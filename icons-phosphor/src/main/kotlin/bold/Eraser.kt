package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Eraser: ImageVector
    get() {
        if (_eraser != null) return _eraser!!
        _eraser = phosphorBoldIcon(
            name = "Eraser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 204.000 L 141.000 204.000 L 227.840 117.160 C 233.092 111.909 236.042 104.787 236.042 97.360 C 236.042 89.933 233.092 82.811 227.840 77.560 L 186.430 36.190 C 181.179 30.938 174.057 27.988 166.630 27.988 C 159.203 27.988 152.081 30.938 146.830 36.190 L 28.190 154.820 C 22.938 160.071 19.988 167.193 19.988 174.620 C 19.988 182.047 22.938 189.169 28.190 194.420 L 58.250 224.490 C 60.502 226.740 63.556 228.003 66.740 228.000 L 216.000 228.000 C 222.627 228.000 228.000 222.627 228.000 216.000 C 228.000 209.373 222.627 204.000 216.000 204.000 ZM 163.800 53.160 C 164.550 52.409 165.568 51.987 166.630 51.987 C 167.692 51.987 168.710 52.409 169.460 53.160 L 210.840 94.540 C 212.398 96.101 212.398 98.629 210.840 100.190 L 160.000 151.000 L 113.000 104.000 ZM 71.710 204.000 L 45.160 177.450 C 43.602 175.889 43.602 173.361 45.160 171.800 L 96.000 121.000 L 143.000 168.000 L 107.000 204.000 Z"),
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
        return _eraser!!
    }

private var _eraser: ImageVector? = null
