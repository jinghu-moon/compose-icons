package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ShieldStar: ImageVector
    get() {
        if (_shieldStar != null) return _shieldStar!!
        _shieldStar = phosphorBoldIcon(
            name = "ShieldStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 76.860 115.540 C 79.323 109.388 86.308 106.397 92.460 108.860 L 116.000 118.280 L 116.000 96.000 C 116.000 89.373 121.373 84.000 128.000 84.000 C 134.627 84.000 140.000 89.373 140.000 96.000 L 140.000 118.280 L 163.540 108.860 C 169.678 106.458 176.604 109.456 179.053 115.575 C 181.503 121.693 178.559 128.643 172.460 131.140 L 147.000 141.330 L 161.600 160.800 C 165.576 166.102 164.502 173.624 159.200 177.600 C 153.898 181.576 146.376 180.502 142.400 175.200 L 128.000 156.000 L 113.600 175.200 C 109.624 180.502 102.102 181.576 96.800 177.600 C 91.498 173.624 90.424 166.102 94.400 160.800 L 109.000 141.330 L 83.540 131.140 C 77.388 128.677 74.397 121.692 76.860 115.540 ZM 228.000 56.000 L 228.000 112.000 C 228.000 166.290 201.680 199.220 179.600 217.290 C 155.890 236.680 132.160 243.290 131.160 243.580 C 129.091 244.140 126.909 244.140 124.840 243.580 C 123.840 243.300 100.110 236.680 76.400 217.290 C 54.320 199.220 28.000 166.290 28.000 112.000 L 28.000 56.000 C 28.000 44.954 36.954 36.000 48.000 36.000 L 208.000 36.000 C 219.046 36.000 228.000 44.954 228.000 56.000 ZM 204.000 60.000 L 52.000 60.000 L 52.000 112.000 C 52.000 147.710 65.090 176.690 90.910 198.150 C 101.976 207.285 114.519 214.464 128.000 219.380 C 141.480 214.462 154.023 207.282 165.090 198.150 C 190.910 176.690 204.000 147.710 204.000 112.000 Z"),
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
        return _shieldStar!!
    }

private var _shieldStar: ImageVector? = null
