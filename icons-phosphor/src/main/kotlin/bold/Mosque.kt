package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Mosque: ImageVector
    get() {
        if (_mosque != null) return _mosque!!
        _mosque = phosphorBoldIcon(
            name = "Mosque",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 220.000 124.000 C 217.282 123.990 214.573 124.326 211.940 125.000 C 210.650 83.460 182.590 62.680 161.940 47.420 C 150.180 38.730 140.000 31.210 140.000 24.000 C 140.000 17.373 134.627 12.000 128.000 12.000 C 121.373 12.000 116.000 17.373 116.000 24.000 C 116.000 31.210 105.820 38.730 94.000 47.450 C 73.370 62.710 45.310 83.450 44.000 125.030 C 34.419 122.556 24.233 124.654 16.410 130.711 C 8.586 136.769 4.004 146.105 4.000 156.000 L 4.000 208.000 C 4.000 214.627 9.373 220.000 16.000 220.000 L 240.000 220.000 C 246.627 220.000 252.000 214.627 252.000 208.000 L 252.000 156.000 C 252.000 138.327 237.673 124.000 220.000 124.000 ZM 44.000 196.000 L 28.000 196.000 L 28.000 156.000 C 28.000 151.582 31.582 148.000 36.000 148.000 C 40.418 148.000 44.000 151.582 44.000 156.000 ZM 108.310 66.740 C 115.310 61.600 122.310 56.380 128.000 50.470 C 133.680 56.380 140.740 61.600 147.690 66.740 C 164.800 79.400 182.400 92.440 186.900 116.000 L 69.100 116.000 C 73.600 92.440 91.200 79.400 108.310 66.740 ZM 188.000 196.000 L 164.000 196.000 L 164.000 168.000 C 164.000 161.373 158.627 156.000 152.000 156.000 C 145.373 156.000 140.000 161.373 140.000 168.000 L 140.000 196.000 L 116.000 196.000 L 116.000 168.000 C 116.000 161.373 110.627 156.000 104.000 156.000 C 97.373 156.000 92.000 161.373 92.000 168.000 L 92.000 196.000 L 68.000 196.000 L 68.000 140.000 L 188.000 140.000 ZM 228.000 196.000 L 212.000 196.000 L 212.000 156.000 C 212.000 151.582 215.582 148.000 220.000 148.000 C 224.418 148.000 228.000 151.582 228.000 156.000 Z"),
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
        return _mosque!!
    }

private var _mosque: ImageVector? = null
