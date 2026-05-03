package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CigaretteSlash: ImageVector
    get() {
        if (_cigaretteSlash != null) return _cigaretteSlash!!
        _cigaretteSlash = phosphorDuotoneIcon(
            name = "CigaretteSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 88.000 136.000 L 88.000 184.000 L 32.000 184.000 C 27.582 184.000 24.000 180.418 24.000 176.000 L 24.000 144.000 C 24.000 139.582 27.582 136.000 32.000 136.000 Z"),
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
        pathData = parseSvgPathData("M 201.000 60.080 C 209.000 45.850 208.420 38.370 207.360 35.170 C 206.896 33.643 205.975 32.296 204.720 31.310 C 202.095 30.158 200.287 27.688 199.981 24.838 C 199.676 21.987 200.919 19.191 203.240 17.508 C 205.561 15.825 208.606 15.513 211.220 16.690 C 216.654 19.457 220.737 24.305 222.540 30.130 C 225.900 40.270 223.350 52.980 214.940 67.920 C 206.940 82.150 207.520 89.640 208.580 92.840 C 209.046 94.363 209.967 95.707 211.220 96.690 C 213.845 97.842 215.653 100.312 215.959 103.162 C 216.264 106.013 215.021 108.809 212.700 110.492 C 210.379 112.175 207.334 112.487 204.720 111.310 C 199.283 108.547 195.199 103.697 193.400 97.870 C 190.070 87.730 192.620 75.000 201.000 60.080 ZM 153.400 97.870 C 155.199 103.697 159.283 108.547 164.720 111.310 C 167.334 112.487 170.379 112.175 172.700 110.492 C 175.021 108.809 176.264 106.013 175.959 103.162 C 175.653 100.312 173.845 97.842 171.220 96.690 C 169.967 95.707 169.046 94.363 168.580 92.840 C 167.520 89.640 166.940 82.150 174.940 67.920 C 183.350 52.980 185.940 40.270 182.540 30.130 C 180.737 24.305 176.654 19.457 171.220 16.690 C 168.606 15.513 165.561 15.825 163.240 17.508 C 160.919 19.191 159.676 21.987 159.981 24.838 C 160.287 27.688 162.095 30.158 164.720 31.310 C 165.975 32.296 166.896 33.643 167.360 35.170 C 168.420 38.370 169.000 45.850 161.000 60.080 C 152.620 75.000 150.070 87.730 153.430 97.870 ZM 213.890 210.620 C 215.853 212.729 216.531 215.730 215.664 218.478 C 214.797 221.225 212.520 223.294 209.703 223.895 C 206.885 224.496 203.962 223.535 202.050 221.380 L 175.370 192.000 L 32.000 192.000 C 23.163 192.000 16.000 184.837 16.000 176.000 L 16.000 144.000 C 16.000 135.163 23.163 128.000 32.000 128.000 L 117.190 128.000 L 42.080 45.380 C 40.117 43.271 39.439 40.270 40.306 37.522 C 41.173 34.775 43.450 32.706 46.267 32.105 C 49.085 31.504 52.008 32.465 53.920 34.620 ZM 32.000 176.000 L 80.000 176.000 L 80.000 144.000 L 32.000 144.000 ZM 160.820 176.000 L 131.730 144.000 L 96.000 144.000 L 96.000 176.000 ZM 224.000 128.000 L 178.520 128.000 C 174.102 128.000 170.520 131.582 170.520 136.000 C 170.520 140.418 174.102 144.000 178.520 144.000 L 224.000 144.000 L 224.000 176.000 L 222.160 176.000 C 217.742 176.000 214.160 179.582 214.160 184.000 C 214.160 188.418 217.742 192.000 222.160 192.000 L 224.000 192.000 C 232.837 192.000 240.000 184.837 240.000 176.000 L 240.000 144.000 C 240.000 135.163 232.837 128.000 224.000 128.000 Z"),
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
        return _cigaretteSlash!!
    }

private var _cigaretteSlash: ImageVector? = null
