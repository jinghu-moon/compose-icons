package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Cigarette: ImageVector
    get() {
        if (_cigarette != null) return _cigarette!!
        _cigarette = phosphorRegularIcon(
            name = "Cigarette",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 128.000 L 32.000 128.000 C 23.163 128.000 16.000 135.163 16.000 144.000 L 16.000 176.000 C 16.000 184.837 23.163 192.000 32.000 192.000 L 224.000 192.000 C 232.837 192.000 240.000 184.837 240.000 176.000 L 240.000 144.000 C 240.000 135.163 232.837 128.000 224.000 128.000 ZM 32.000 144.000 L 80.000 144.000 L 80.000 176.000 L 32.000 176.000 ZM 224.000 176.000 L 96.000 176.000 L 96.000 144.000 L 224.000 144.000 L 224.000 176.000 ZM 201.000 60.080 C 209.000 45.850 208.420 38.370 207.360 35.170 C 206.896 33.643 205.975 32.296 204.720 31.310 C 202.095 30.158 200.287 27.688 199.981 24.838 C 199.676 21.987 200.919 19.191 203.240 17.508 C 205.561 15.825 208.606 15.513 211.220 16.690 C 216.654 19.457 220.737 24.305 222.540 30.130 C 225.900 40.270 223.350 52.980 214.940 67.920 C 206.940 82.150 207.520 89.640 208.580 92.830 C 209.044 94.357 209.965 95.704 211.220 96.690 C 213.845 97.842 215.653 100.312 215.959 103.162 C 216.264 106.013 215.021 108.809 212.700 110.492 C 210.379 112.175 207.334 112.487 204.720 111.310 C 199.286 108.543 195.203 103.695 193.400 97.870 C 190.070 87.730 192.620 75.000 201.000 60.080 ZM 161.000 60.080 C 169.000 45.850 168.420 38.370 167.360 35.170 C 166.896 33.643 165.975 32.296 164.720 31.310 C 162.095 30.158 160.287 27.688 159.981 24.838 C 159.676 21.987 160.919 19.191 163.240 17.508 C 165.561 15.825 168.606 15.513 171.220 16.690 C 176.654 19.457 180.737 24.305 182.540 30.130 C 185.900 40.270 183.350 52.980 174.940 67.920 C 166.940 82.150 167.520 89.640 168.580 92.830 C 169.044 94.357 169.965 95.704 171.220 96.690 C 173.845 97.842 175.653 100.312 175.959 103.162 C 176.264 106.013 175.021 108.809 172.700 110.492 C 170.379 112.175 167.334 112.487 164.720 111.310 C 159.286 108.543 155.203 103.695 153.400 97.870 C 150.070 87.730 152.620 75.000 161.000 60.080 Z"),
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
        return _cigarette!!
    }

private var _cigarette: ImageVector? = null
