package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SprayBottle: ImageVector
    get() {
        if (_sprayBottle != null) return _sprayBottle!!
        _sprayBottle = phosphorBoldIcon(
            name = "SprayBottle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 84.000 C 206.627 84.000 212.000 78.627 212.000 72.000 C 211.961 38.879 185.121 12.039 152.000 12.000 L 80.000 12.000 C 68.954 12.000 60.000 20.954 60.000 32.000 L 60.000 80.000 C 60.000 91.046 51.046 100.000 40.000 100.000 C 33.373 100.000 28.000 105.373 28.000 112.000 C 28.000 118.627 33.373 124.000 40.000 124.000 C 62.740 123.973 81.725 106.644 83.820 84.000 L 108.000 84.000 L 108.000 104.620 C 108.012 110.700 105.246 116.452 100.490 120.240 L 84.510 133.000 C 74.044 141.337 67.963 154.000 68.000 167.380 L 68.000 224.000 C 68.000 235.046 76.954 244.000 88.000 244.000 L 192.000 244.000 C 203.046 244.000 212.000 235.046 212.000 224.000 L 212.000 211.470 C 212.011 167.074 201.265 123.336 180.680 84.000 ZM 84.000 36.000 L 152.000 36.000 C 167.256 36.000 180.855 45.617 185.940 60.000 L 84.000 60.000 ZM 188.000 211.470 L 188.000 220.000 L 92.000 220.000 L 92.000 167.380 C 91.988 161.300 94.754 155.548 99.510 151.760 L 115.510 138.980 C 125.963 130.644 132.036 117.990 132.000 104.620 L 132.000 84.000 L 153.240 84.000 C 176.006 122.622 188.009 166.638 188.000 211.470 Z"),
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
        return _sprayBottle!!
    }

private var _sprayBottle: ImageVector? = null
