package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Pinwheel: ImageVector
    get() {
        if (_pinwheel != null) return _pinwheel!!
        _pinwheel = phosphorThinIcon(
            name = "Pinwheel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 226.830 221.170 L 173.350 167.700 C 176.684 167.126 179.961 166.256 183.140 165.100 C 212.200 154.522 227.184 122.391 216.610 93.330 C 216.247 92.332 215.503 91.520 214.540 91.072 C 213.578 90.624 212.477 90.576 211.480 90.940 L 156.170 111.070 C 158.964 107.568 161.334 103.749 163.230 99.690 C 172.794 79.164 169.056 54.899 153.757 38.204 C 138.458 21.509 114.611 15.670 93.330 23.410 C 91.258 24.166 90.189 26.456 90.940 28.530 L 111.070 83.850 C 107.571 81.053 103.751 78.682 99.690 76.790 C 79.164 67.226 54.899 70.964 38.204 86.263 C 21.509 101.562 15.670 125.409 23.410 146.690 C 23.759 147.705 24.501 148.538 25.470 149.000 C 26.432 149.448 27.533 149.494 28.530 149.130 L 83.850 129.000 C 68.135 148.593 67.388 176.252 82.021 196.665 C 96.654 217.078 123.089 225.251 146.690 216.660 C 147.688 216.297 148.500 215.552 148.948 214.590 C 149.396 213.628 149.444 212.527 149.080 211.530 L 129.000 156.170 C 132.500 158.966 136.320 161.336 140.380 163.230 C 147.427 166.522 155.084 168.307 162.860 168.470 L 221.220 226.830 C 222.783 228.393 225.317 228.393 226.880 226.830 C 228.443 225.267 228.443 222.733 226.880 221.170 ZM 99.880 29.710 C 123.968 23.146 149.066 36.144 157.605 59.605 C 166.143 83.066 155.272 109.155 132.600 119.610 ZM 125.090 122.380 L 117.640 125.090 L 114.920 117.640 L 122.380 114.920 ZM 29.710 140.140 C 23.146 116.052 36.144 90.954 59.605 82.415 C 83.066 73.877 109.155 84.748 119.610 107.420 ZM 140.140 210.310 C 116.052 216.874 90.954 203.876 82.415 180.415 C 73.877 156.954 84.748 130.865 107.420 120.410 ZM 164.430 160.490 C 145.561 160.633 128.353 149.725 120.430 132.600 L 210.330 99.880 C 214.236 114.223 211.276 129.566 202.316 141.427 C 193.355 153.288 179.404 160.328 164.540 160.490 Z"),
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
        return _pinwheel!!
    }

private var _pinwheel: ImageVector? = null
