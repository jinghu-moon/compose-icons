package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Storefront: ImageVector
    get() {
        if (_storefront != null) return _storefront!!
        _storefront = phosphorThinIcon(
            name = "Storefront",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 28.150 95.000 C 28.056 95.325 28.005 95.661 28.000 96.000 L 28.000 112.000 C 28.004 124.019 34.007 135.243 44.000 141.920 L 44.000 216.000 C 44.000 218.209 45.791 220.000 48.000 220.000 L 208.000 220.000 C 210.209 220.000 212.000 218.209 212.000 216.000 L 212.000 141.920 C 221.993 135.243 227.996 124.019 228.000 112.000 L 228.000 96.000 C 227.996 95.634 227.938 95.270 227.830 94.920 L 213.500 44.700 C 212.031 39.563 207.343 36.017 202.000 36.000 L 54.000 36.000 C 48.657 36.017 43.969 39.563 42.500 44.700 ZM 50.150 46.920 C 50.634 45.194 52.207 44.001 54.000 44.000 L 202.000 44.000 C 203.783 44.003 205.350 45.185 205.840 46.900 L 218.700 92.000 L 37.300 92.000 ZM 100.000 100.000 L 156.000 100.000 L 156.000 112.000 C 156.000 127.464 143.464 140.000 128.000 140.000 C 112.536 140.000 100.000 127.464 100.000 112.000 ZM 36.000 112.000 L 36.000 100.000 L 92.000 100.000 L 92.000 112.000 C 91.996 121.872 86.793 131.013 78.307 136.057 C 69.820 141.102 59.304 141.304 50.630 136.590 C 50.246 136.256 49.801 135.998 49.320 135.830 C 41.046 130.736 36.005 121.716 36.000 112.000 ZM 204.000 212.000 L 52.000 212.000 L 52.000 145.940 C 68.974 151.934 87.766 144.468 96.000 128.460 C 102.174 140.440 114.523 147.968 128.000 147.968 C 141.477 147.968 153.826 140.440 160.000 128.460 C 168.234 144.468 187.026 151.934 204.000 145.940 ZM 206.680 135.830 C 206.202 135.997 205.760 136.255 205.380 136.590 C 196.705 141.309 186.186 141.109 177.696 136.064 C 169.206 131.019 164.002 121.875 164.000 112.000 L 164.000 100.000 L 220.000 100.000 L 220.000 112.000 C 219.995 121.716 214.954 130.736 206.680 135.830 Z"),
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
        return _storefront!!
    }

private var _storefront: ImageVector? = null
