package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CloudSlash: ImageVector
    get() {
        if (_cloudSlash != null) return _cloudSlash!!
        _cloudSlash = phosphorThinIcon(
            name = "CloudSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 51.000 37.310 C 49.514 35.653 46.967 35.514 45.310 37.000 C 43.653 38.486 43.514 41.033 45.000 42.690 L 86.160 87.930 Q 84.780 90.480 83.570 93.120 C 61.175 88.731 38.229 97.427 24.367 115.556 C 10.506 133.685 8.129 158.108 18.235 178.569 C 28.340 199.031 49.179 211.988 72.000 212.000 L 160.000 212.000 C 171.301 212.026 182.488 209.750 192.880 205.310 L 205.000 218.690 C 205.956 219.768 207.417 220.248 208.826 219.948 C 210.235 219.647 211.374 218.613 211.807 217.239 C 212.240 215.865 211.902 214.364 210.920 213.310 ZM 160.000 204.000 L 72.000 204.000 C 43.281 204.000 20.000 180.719 20.000 152.000 C 20.000 123.281 43.281 100.000 72.000 100.000 C 74.861 100.009 77.717 100.250 80.540 100.720 C 77.534 109.501 76.000 118.719 76.000 128.000 C 76.000 130.209 77.791 132.000 80.000 132.000 C 82.209 132.000 84.000 130.209 84.000 128.000 C 83.997 116.288 86.701 104.734 91.900 94.240 L 187.130 199.000 C 178.471 202.322 169.274 204.017 160.000 204.000 ZM 244.000 128.000 C 244.012 148.637 236.414 168.554 222.660 183.940 C 221.188 185.597 218.652 185.747 216.995 184.275 C 215.338 182.803 215.188 180.267 216.660 178.610 C 242.512 149.579 242.291 105.720 216.146 76.952 C 190.001 48.184 146.363 43.783 115.000 66.750 C 113.219 68.059 110.714 67.676 109.405 65.895 C 108.096 64.114 108.479 61.609 110.260 60.300 C 135.781 41.546 169.681 38.741 197.938 53.045 C 226.194 67.349 244.004 96.329 244.000 128.000 Z"),
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
        return _cloudSlash!!
    }

private var _cloudSlash: ImageVector? = null
