package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MicrophoneSlash: ImageVector
    get() {
        if (_microphoneSlash != null) return _microphoneSlash!!
        _microphoneSlash = phosphorLightIcon(
            name = "MicrophoneSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 212.440 220.000 L 52.440 44.000 C 50.163 41.887 46.650 41.861 44.342 43.940 C 42.034 46.019 41.695 49.516 43.560 52.000 L 82.000 94.320 L 82.000 128.000 C 81.998 144.141 90.457 159.103 104.289 167.423 C 118.120 175.744 135.301 176.205 149.560 168.640 L 163.310 183.760 C 152.765 190.487 140.508 194.041 128.000 194.000 C 91.567 193.956 62.044 164.433 62.000 128.000 C 62.000 124.686 59.314 122.000 56.000 122.000 C 52.686 122.000 50.000 124.686 50.000 128.000 C 50.053 168.727 81.397 202.574 122.000 205.750 L 122.000 240.000 C 122.000 243.314 124.686 246.000 128.000 246.000 C 131.314 246.000 134.000 243.314 134.000 240.000 L 134.000 205.770 C 147.415 204.788 160.338 200.305 171.480 192.770 L 203.560 228.000 C 205.791 230.452 209.588 230.631 212.040 228.400 C 214.492 226.169 214.671 222.372 212.440 219.920 ZM 128.000 162.000 C 109.222 162.000 94.000 146.778 94.000 128.000 L 94.000 107.520 L 141.120 159.360 C 136.966 161.105 132.506 162.003 128.000 162.000 ZM 187.320 157.000 C 191.746 147.975 194.032 138.052 194.000 128.000 C 194.000 124.686 196.686 122.000 200.000 122.000 C 203.314 122.000 206.000 124.686 206.000 128.000 C 206.031 139.872 203.327 151.591 198.100 162.250 C 197.216 164.265 195.300 165.635 193.107 165.819 C 190.914 166.003 188.796 164.972 187.589 163.132 C 186.381 161.292 186.278 158.939 187.320 157.000 ZM 85.800 45.670 C 94.479 25.665 116.010 14.503 137.360 18.940 C 158.710 23.377 174.011 42.194 174.000 64.000 L 174.000 128.000 C 174.002 129.607 173.919 131.212 173.750 132.810 C 173.431 135.879 170.836 138.207 167.750 138.190 Q 167.440 138.190 167.120 138.190 C 163.826 137.844 161.436 134.894 161.780 131.600 C 161.914 130.405 161.988 129.203 162.000 128.000 L 162.000 64.000 C 162.018 47.874 150.707 33.954 134.918 30.673 C 119.130 27.392 103.208 35.652 96.800 50.450 C 95.414 53.376 91.956 54.675 88.986 53.384 C 86.017 52.094 84.607 48.680 85.800 45.670 Z"),
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
        return _microphoneSlash!!
    }

private var _microphoneSlash: ImageVector? = null
