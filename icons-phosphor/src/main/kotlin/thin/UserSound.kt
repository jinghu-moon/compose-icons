package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.UserSound: ImageVector
    get() {
        if (_userSound != null) return _userSound!!
        _userSound = phosphorThinIcon(
            name = "UserSound",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 133.170 166.840 C 161.115 154.886 176.798 124.927 170.697 95.151 C 164.596 65.375 138.394 43.997 108.000 43.997 C 77.606 43.997 51.404 65.375 45.303 95.151 C 39.202 124.927 54.885 154.886 82.830 166.840 C 59.070 172.300 37.650 185.530 20.940 205.430 C 19.945 206.514 19.625 208.056 20.107 209.447 C 20.589 210.837 21.795 211.850 23.248 212.085 C 24.700 212.319 26.165 211.738 27.060 210.570 C 48.000 185.700 76.710 172.000 108.000 172.000 C 139.290 172.000 168.000 185.700 188.940 210.570 C 190.388 212.146 192.820 212.303 194.458 210.927 C 196.097 209.551 196.362 207.128 195.060 205.430 C 178.350 185.530 156.930 172.300 133.170 166.840 ZM 52.000 108.000 C 52.000 77.072 77.072 52.000 108.000 52.000 C 138.928 52.000 164.000 77.072 164.000 108.000 C 164.000 138.928 138.928 164.000 108.000 164.000 C 77.086 163.967 52.033 138.914 52.000 108.000 ZM 203.680 67.170 C 214.773 93.260 214.773 122.740 203.680 148.830 C 203.051 150.304 201.603 151.260 200.000 151.260 C 199.461 151.257 198.927 151.148 198.430 150.940 C 197.454 150.524 196.683 149.737 196.287 148.752 C 195.892 147.768 195.903 146.666 196.320 145.690 C 206.560 121.607 206.560 94.393 196.320 70.310 C 195.453 68.278 196.398 65.927 198.430 65.060 C 200.462 64.193 202.813 65.138 203.680 67.170 ZM 244.000 108.000 C 244.022 126.423 240.279 144.656 233.000 161.580 C 232.368 163.050 230.920 164.002 229.320 164.000 C 228.780 164.002 228.246 163.893 227.750 163.680 C 226.773 163.262 226.003 162.472 225.609 161.486 C 225.215 160.499 225.230 159.396 225.650 158.420 C 239.397 126.212 239.397 89.788 225.650 57.580 C 224.777 55.550 225.715 53.198 227.745 52.325 C 229.775 51.452 232.127 52.390 233.000 54.420 C 240.279 71.344 244.022 89.577 244.000 108.000 Z"),
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
        return _userSound!!
    }

private var _userSound: ImageVector? = null
