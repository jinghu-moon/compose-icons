package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SteamLogo: ImageVector
    get() {
        if (_steamLogo != null) return _steamLogo!!
        _steamLogo = phosphorRegularIcon(
            name = "SteamLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 117.390 185.920 L 179.390 135.370 C 189.842 126.559 194.402 112.588 191.160 99.307 C 187.918 86.026 177.433 75.728 164.096 72.724 C 150.759 69.721 136.872 74.531 128.250 85.140 L 85.250 137.870 L 45.280 98.000 C 60.851 55.100 106.634 31.223 150.724 43.008 C 194.815 54.793 222.579 98.329 214.668 143.277 C 206.757 188.224 165.797 219.665 120.333 215.689 C 74.868 211.712 39.988 173.638 40.000 128.000 C 40.003 124.027 40.270 120.058 40.800 116.120 L 75.370 150.690 C 69.103 162.375 71.892 176.854 82.051 185.375 C 92.210 193.897 106.953 194.124 117.370 185.920 ZM 121.580 118.550 C 125.110 129.958 134.042 138.890 145.450 142.420 L 127.190 157.310 C 124.679 147.208 116.792 139.321 106.690 136.810 ZM 156.000 128.000 C 144.954 128.000 136.000 119.046 136.000 108.000 C 136.000 96.954 144.954 88.000 156.000 88.000 C 167.046 88.000 176.000 96.954 176.000 108.000 C 176.000 119.046 167.046 128.000 156.000 128.000 ZM 100.000 152.000 C 106.627 152.000 112.000 157.373 112.000 164.000 C 112.000 170.627 106.627 176.000 100.000 176.000 C 93.373 176.000 88.000 170.627 88.000 164.000 C 88.000 157.373 93.373 152.000 100.000 152.000 Z"),
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
        return _steamLogo!!
    }

private var _steamLogo: ImageVector? = null
