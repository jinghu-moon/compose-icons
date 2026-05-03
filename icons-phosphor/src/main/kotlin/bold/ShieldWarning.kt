package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ShieldWarning: ImageVector
    get() {
        if (_shieldWarning != null) return _shieldWarning!!
        _shieldWarning = phosphorBoldIcon(
            name = "ShieldWarning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 116.000 132.000 L 116.000 96.000 C 116.000 89.373 121.373 84.000 128.000 84.000 C 134.627 84.000 140.000 89.373 140.000 96.000 L 140.000 132.000 C 140.000 138.627 134.627 144.000 128.000 144.000 C 121.373 144.000 116.000 138.627 116.000 132.000 ZM 128.000 188.000 C 136.837 188.000 144.000 180.837 144.000 172.000 C 144.000 163.163 136.837 156.000 128.000 156.000 C 119.163 156.000 112.000 163.163 112.000 172.000 C 112.000 180.837 119.163 188.000 128.000 188.000 ZM 228.000 56.000 L 228.000 112.000 C 228.000 166.290 201.680 199.220 179.600 217.290 C 155.890 236.680 132.160 243.290 131.160 243.580 C 129.091 244.140 126.909 244.140 124.840 243.580 C 123.840 243.300 100.110 236.680 76.400 217.290 C 54.320 199.220 28.000 166.290 28.000 112.000 L 28.000 56.000 C 28.000 44.954 36.954 36.000 48.000 36.000 L 208.000 36.000 C 219.046 36.000 228.000 44.954 228.000 56.000 ZM 204.000 60.000 L 52.000 60.000 L 52.000 112.000 C 52.000 147.710 65.090 176.690 90.910 198.150 C 101.976 207.285 114.519 214.464 128.000 219.380 C 141.480 214.462 154.023 207.282 165.090 198.150 C 190.910 176.690 204.000 147.710 204.000 112.000 Z"),
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
        return _shieldWarning!!
    }

private var _shieldWarning: ImageVector? = null
