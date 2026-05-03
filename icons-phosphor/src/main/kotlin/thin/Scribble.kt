package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Scribble: ImageVector
    get() {
        if (_scribble != null) return _scribble!!
        _scribble = phosphorThinIcon(
            name = "Scribble",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 202.840 186.830 C 199.343 190.321 197.379 195.059 197.379 200.000 C 197.379 204.941 199.343 209.679 202.840 213.170 C 204.403 214.733 204.403 217.267 202.840 218.830 C 201.277 220.393 198.743 220.393 197.180 218.830 C 186.781 208.430 186.781 191.570 197.180 181.170 L 206.560 171.800 C 211.357 167.112 213.264 160.207 211.552 153.721 C 209.840 147.235 204.773 142.171 198.287 140.461 C 191.801 138.752 184.896 140.661 180.210 145.460 L 113.450 212.200 C 103.035 222.508 86.249 222.464 75.887 212.103 C 65.526 201.741 65.482 184.955 75.790 174.540 L 174.550 75.800 C 179.347 71.112 181.254 64.207 179.542 57.721 C 177.830 51.235 172.763 46.171 166.277 44.461 C 159.791 42.752 152.886 44.661 148.200 49.460 L 81.450 116.200 C 71.035 126.508 54.249 126.464 43.887 116.103 C 33.526 105.741 33.482 88.955 43.790 78.540 L 85.170 37.170 C 86.172 36.117 87.666 35.691 89.073 36.056 C 90.480 36.422 91.578 37.521 91.941 38.929 C 92.304 40.336 91.875 41.830 90.820 42.830 L 49.440 84.200 C 44.643 88.888 42.736 95.793 44.448 102.279 C 46.160 108.765 51.227 113.829 57.713 115.539 C 64.199 117.248 71.104 115.339 75.790 110.540 L 142.550 43.800 C 152.965 33.492 169.751 33.536 180.113 43.897 C 190.474 54.259 190.518 71.045 180.210 81.460 L 81.450 180.200 C 76.653 184.888 74.746 191.793 76.458 198.279 C 78.170 204.765 83.237 209.829 89.723 211.539 C 96.209 213.248 103.114 211.339 107.800 206.540 L 174.550 139.800 C 184.965 129.492 201.751 129.536 212.113 139.897 C 222.474 150.259 222.518 167.045 212.210 177.460 Z"),
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
        return _scribble!!
    }

private var _scribble: ImageVector? = null
