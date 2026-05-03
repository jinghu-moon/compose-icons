package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ShieldChevron: ImageVector
    get() {
        if (_shieldChevron != null) return _shieldChevron!!
        _shieldChevron = phosphorBoldIcon(
            name = "ShieldChevron",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 36.000 L 48.000 36.000 C 36.954 36.000 28.000 44.954 28.000 56.000 L 28.000 112.000 C 28.000 166.290 54.320 199.220 76.400 217.290 C 100.110 236.680 123.840 243.290 124.840 243.580 C 126.909 244.140 129.091 244.140 131.160 243.580 C 132.160 243.300 155.890 236.680 179.600 217.290 C 201.680 199.220 228.000 166.290 228.000 112.000 L 228.000 56.000 C 228.000 44.954 219.046 36.000 208.000 36.000 ZM 52.000 60.000 L 204.000 60.000 L 204.000 112.000 C 204.156 126.185 201.786 140.285 197.000 153.640 L 134.890 110.170 C 130.759 107.279 125.261 107.279 121.130 110.170 L 59.000 153.640 C 54.214 140.285 51.844 126.185 52.000 112.000 ZM 165.090 198.150 C 154.023 207.282 141.480 214.462 128.000 219.380 C 114.519 214.464 101.976 207.285 90.910 198.150 C 82.883 191.546 75.841 183.828 70.000 175.230 L 128.000 134.650 L 186.000 175.230 C 180.159 183.828 173.117 191.546 165.090 198.150 Z"),
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
        return _shieldChevron!!
    }

private var _shieldChevron: ImageVector? = null
