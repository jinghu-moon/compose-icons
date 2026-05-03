package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.WebcamSlash: ImageVector
    get() {
        if (_webcamSlash != null) return _webcamSlash!!
        _webcamSlash = phosphorDuotoneIcon(
            name = "WebcamSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 128.000 32.000 C 88.235 32.000 56.000 64.235 56.000 104.000 C 56.000 143.764 88.235 176.000 128.000 176.000 C 167.764 176.000 200.000 143.764 200.000 104.000 C 200.000 64.235 167.764 32.000 128.000 32.000 ZM 128.000 136.000 C 110.327 136.000 96.000 121.673 96.000 104.000 C 96.000 86.327 110.327 72.000 128.000 72.000 C 145.673 72.000 160.000 86.327 160.000 104.000 C 160.000 121.673 145.673 136.000 128.000 136.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 213.920 210.620 L 53.920 34.620 C 52.008 32.465 49.085 31.504 46.267 32.105 C 43.450 32.706 41.173 34.775 40.306 37.522 C 39.439 40.270 40.117 43.271 42.080 45.380 L 58.820 63.800 C 45.153 87.315 44.369 116.162 56.739 140.384 C 69.109 164.607 92.938 180.885 120.000 183.600 L 120.000 200.000 L 32.000 200.000 C 27.582 200.000 24.000 203.582 24.000 208.000 C 24.000 212.418 27.582 216.000 32.000 216.000 L 197.190 216.000 L 202.080 221.380 C 203.992 223.535 206.915 224.496 209.733 223.895 C 212.550 223.294 214.827 221.225 215.694 218.478 C 216.561 215.730 215.883 212.729 213.920 210.620 ZM 64.000 104.000 C 63.986 94.440 66.126 85.000 70.260 76.380 L 88.680 96.640 C 86.491 108.335 89.621 120.397 97.221 129.551 C 104.821 138.705 116.102 144.001 128.000 144.000 C 129.200 144.000 130.390 143.940 131.580 143.830 L 150.000 164.110 C 130.370 171.296 108.469 168.442 91.335 156.467 C 74.202 144.491 63.997 124.904 64.000 104.000 ZM 136.000 200.000 L 136.000 183.590 C 144.804 182.711 153.401 180.376 161.440 176.680 L 182.640 200.000 ZM 85.520 45.310 C 84.471 43.465 84.197 41.280 84.760 39.234 C 85.323 37.187 86.675 35.449 88.520 34.400 C 121.055 15.927 162.048 22.471 187.215 50.155 C 212.382 77.838 215.001 119.268 193.520 149.900 C 190.982 153.517 185.992 154.393 182.375 151.855 C 178.758 149.317 177.882 144.327 180.420 140.710 C 197.605 116.204 195.509 83.061 175.376 60.914 C 155.242 38.767 122.448 33.532 96.420 48.310 C 92.581 50.488 87.704 49.146 85.520 45.310 ZM 150.830 111.430 C 153.210 104.121 151.944 96.114 147.427 89.895 C 142.910 83.676 135.687 79.997 128.000 80.000 C 126.238 79.998 124.481 80.190 122.760 80.570 C 119.883 81.453 116.754 80.647 114.661 78.484 C 112.569 76.320 111.868 73.166 112.847 70.320 C 113.826 67.474 116.320 65.418 119.300 65.000 C 133.305 61.899 147.899 66.535 157.547 77.150 C 167.195 87.765 170.420 102.734 166.000 116.380 C 164.556 120.475 160.109 122.670 155.980 121.326 C 151.851 119.982 149.548 115.590 150.790 111.430 Z"),
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
        return _webcamSlash!!
    }

private var _webcamSlash: ImageVector? = null
