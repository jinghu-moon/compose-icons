package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Hamburger: ImageVector
    get() {
        if (_hamburger != null) return _hamburger!!
        _hamburger = phosphorBoldIcon(
            name = "Hamburger",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 227.900 152.720 L 188.200 167.160 L 152.460 152.860 C 149.597 151.714 146.403 151.714 143.540 152.860 L 108.000 167.080 L 72.460 152.860 C 69.721 151.762 66.674 151.713 63.900 152.720 L 19.900 168.720 C 13.670 170.984 10.456 177.870 12.720 184.100 C 14.984 190.330 21.870 193.544 28.100 191.280 L 36.220 188.330 C 38.473 210.828 57.390 227.969 80.000 228.000 L 176.000 228.000 C 200.289 227.972 219.972 208.289 220.000 184.000 L 220.000 181.130 L 236.100 175.280 C 242.330 173.016 245.544 166.130 243.280 159.900 C 241.016 153.670 234.130 150.456 227.900 152.720 ZM 176.000 204.000 L 80.000 204.000 C 68.954 204.000 60.000 195.046 60.000 184.000 L 60.000 179.680 L 67.800 176.840 L 103.540 191.140 C 106.403 192.286 109.597 192.286 112.460 191.140 L 148.000 176.920 L 183.540 191.140 C 186.279 192.238 189.327 192.287 192.100 191.280 L 194.990 190.220 C 192.302 198.434 184.642 203.992 176.000 204.000 ZM 12.000 128.000 C 12.000 121.373 17.373 116.000 24.000 116.000 L 232.000 116.000 C 238.627 116.000 244.000 121.373 244.000 128.000 C 244.000 134.627 238.627 140.000 232.000 140.000 L 24.000 140.000 C 17.373 140.000 12.000 134.627 12.000 128.000 ZM 48.200 104.000 L 207.800 104.000 C 214.267 103.995 220.346 100.918 224.180 95.710 C 227.926 90.634 228.998 84.064 227.060 78.060 C 216.120 43.880 175.390 20.000 128.000 20.000 C 80.610 20.000 39.890 43.870 28.940 78.050 C 26.997 84.053 28.069 90.626 31.820 95.700 C 35.647 100.917 41.730 103.999 48.200 104.000 ZM 128.000 44.000 C 161.700 44.000 191.610 58.850 202.000 80.000 L 54.000 80.000 C 64.400 58.850 94.310 44.000 128.000 44.000 Z"),
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
        return _hamburger!!
    }

private var _hamburger: ImageVector? = null
