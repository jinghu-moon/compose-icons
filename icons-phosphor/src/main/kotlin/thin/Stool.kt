package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Stool: ImageVector
    get() {
        if (_stool != null) return _stool!!
        _stool = phosphorThinIcon(
            name = "Stool",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 196.000 64.000 L 196.000 40.000 C 196.000 33.373 190.627 28.000 184.000 28.000 L 72.000 28.000 C 65.373 28.000 60.000 33.373 60.000 40.000 L 60.000 64.000 C 60.000 70.627 65.373 76.000 72.000 76.000 L 83.320 76.000 L 60.050 223.380 C 59.871 224.435 60.123 225.518 60.749 226.386 C 61.375 227.255 62.322 227.836 63.380 228.000 C 63.586 228.014 63.794 228.014 64.000 228.000 C 65.988 228.024 67.692 226.584 68.000 224.620 L 76.260 172.000 L 179.740 172.000 L 188.050 224.620 C 188.355 226.565 190.031 227.999 192.000 228.000 C 192.211 227.998 192.421 227.982 192.630 227.950 C 194.811 227.607 196.301 225.561 195.960 223.380 L 172.680 76.000 L 184.000 76.000 C 190.627 76.000 196.000 70.627 196.000 64.000 ZM 68.000 64.000 L 68.000 40.000 C 68.000 37.791 69.791 36.000 72.000 36.000 L 184.000 36.000 C 186.209 36.000 188.000 37.791 188.000 40.000 L 188.000 64.000 C 188.000 66.209 186.209 68.000 184.000 68.000 L 72.000 68.000 C 69.791 68.000 68.000 66.209 68.000 64.000 ZM 178.480 164.000 L 77.480 164.000 L 91.380 76.000 L 164.540 76.000 Z"),
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
        return _stool!!
    }

private var _stool: ImageVector? = null
