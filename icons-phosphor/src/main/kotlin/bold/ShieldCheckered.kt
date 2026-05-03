package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ShieldCheckered: ImageVector
    get() {
        if (_shieldCheckered != null) return _shieldCheckered!!
        _shieldCheckered = phosphorBoldIcon(
            name = "ShieldCheckered",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 36.000 L 48.000 36.000 C 36.954 36.000 28.000 44.954 28.000 56.000 L 28.000 112.000 C 28.000 166.290 54.320 199.220 76.400 217.290 C 100.110 236.680 123.840 243.290 124.840 243.580 C 126.909 244.140 129.091 244.140 131.160 243.580 C 132.160 243.300 155.890 236.680 179.600 217.290 C 201.680 199.220 228.000 166.290 228.000 112.000 L 228.000 56.000 C 228.000 44.954 219.046 36.000 208.000 36.000 ZM 204.000 112.000 C 204.000 113.340 204.000 114.680 203.940 116.000 L 140.000 116.000 L 140.000 60.000 L 204.000 60.000 ZM 52.000 60.000 L 116.000 60.000 L 116.000 116.000 L 52.060 116.000 C 52.060 114.680 52.000 113.340 52.000 112.000 ZM 55.000 140.000 L 116.000 140.000 L 116.000 214.290 C 107.032 209.914 98.610 204.497 90.910 198.150 C 72.220 182.610 60.200 163.130 55.000 140.000 ZM 165.100 198.150 C 157.397 204.498 148.972 209.915 140.000 214.290 L 140.000 140.000 L 201.000 140.000 C 195.800 163.130 183.780 182.610 165.090 198.150 Z"),
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
        return _shieldCheckered!!
    }

private var _shieldCheckered: ImageVector? = null
