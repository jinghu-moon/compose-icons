package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GlobeStand: ImageVector
    get() {
        if (_globeStand != null) return _globeStand!!
        _globeStand = phosphorBoldIcon(
            name = "GlobeStand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 136.000 176.000 C 175.764 176.000 208.000 143.764 208.000 104.000 C 208.000 64.235 175.764 32.000 136.000 32.000 C 96.235 32.000 64.000 64.235 64.000 104.000 C 64.044 143.746 96.254 175.956 136.000 176.000 ZM 136.000 56.000 C 162.510 56.000 184.000 77.490 184.000 104.000 C 184.000 130.510 162.510 152.000 136.000 152.000 C 109.490 152.000 88.000 130.510 88.000 104.000 C 88.028 77.502 109.502 56.028 136.000 56.000 ZM 148.000 215.350 L 148.000 228.000 L 168.000 228.000 C 174.627 228.000 180.000 233.373 180.000 240.000 C 180.000 246.627 174.627 252.000 168.000 252.000 L 104.000 252.000 C 97.373 252.000 92.000 246.627 92.000 240.000 C 92.000 233.373 97.373 228.000 104.000 228.000 L 124.000 228.000 L 124.000 215.360 C 81.882 210.823 45.927 182.911 31.090 143.232 C 16.253 103.553 25.072 58.899 53.880 27.840 C 56.769 24.593 61.189 23.162 65.433 24.099 C 69.678 25.037 73.083 28.197 74.336 32.359 C 75.588 36.521 74.492 41.036 71.470 44.160 C 39.205 78.839 40.178 132.835 73.671 166.329 C 107.165 199.822 161.161 200.795 195.840 168.530 C 198.964 165.508 203.479 164.412 207.641 165.664 C 211.803 166.917 214.963 170.322 215.901 174.567 C 216.838 178.811 215.407 183.231 212.160 186.120 C 194.497 202.546 171.985 212.802 148.000 215.350 Z"),
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
        return _globeStand!!
    }

private var _globeStand: ImageVector? = null
