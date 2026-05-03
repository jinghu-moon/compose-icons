package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Ghost: ImageVector
    get() {
        if (_ghost != null) return _ghost!!
        _ghost = phosphorBoldIcon(
            name = "Ghost",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 116.000 116.000 C 116.000 124.837 108.837 132.000 100.000 132.000 C 91.163 132.000 84.000 124.837 84.000 116.000 C 84.000 107.163 91.163 100.000 100.000 100.000 C 108.837 100.000 116.000 107.163 116.000 116.000 ZM 156.000 100.000 C 147.163 100.000 140.000 107.163 140.000 116.000 C 140.000 124.837 147.163 132.000 156.000 132.000 C 164.837 132.000 172.000 124.837 172.000 116.000 C 172.000 107.163 164.837 100.000 156.000 100.000 ZM 228.000 120.000 L 228.000 216.000 C 228.001 220.638 225.330 224.861 221.140 226.847 C 216.949 228.833 211.989 228.227 208.400 225.290 L 186.670 207.500 L 164.930 225.290 C 160.509 228.908 154.151 228.908 149.730 225.290 L 128.000 207.500 L 106.270 225.290 C 101.849 228.908 95.491 228.908 91.070 225.290 L 69.330 207.500 L 47.600 225.290 C 44.011 228.227 39.051 228.833 34.860 226.847 C 30.670 224.861 27.999 220.638 28.000 216.000 L 28.000 120.000 C 28.000 64.772 72.772 20.000 128.000 20.000 C 183.228 20.000 228.000 64.772 228.000 120.000 ZM 204.000 120.000 C 204.000 78.026 169.974 44.000 128.000 44.000 C 86.026 44.000 52.000 78.026 52.000 120.000 L 52.000 190.680 L 61.730 182.680 C 66.151 179.062 72.509 179.062 76.930 182.680 L 98.670 200.500 L 120.400 182.710 C 124.821 179.092 131.179 179.092 135.600 182.710 L 157.330 200.500 L 179.070 182.710 C 183.491 179.092 189.849 179.092 194.270 182.710 L 204.000 190.710 Z"),
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
        return _ghost!!
    }

private var _ghost: ImageVector? = null
