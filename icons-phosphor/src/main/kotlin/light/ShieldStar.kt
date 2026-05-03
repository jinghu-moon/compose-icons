package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ShieldStar: ImageVector
    get() {
        if (_shieldStar != null) return _shieldStar!!
        _shieldStar = phosphorLightIcon(
            name = "ShieldStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 173.570 117.770 C 174.801 120.846 173.306 124.338 170.230 125.570 L 137.500 138.660 L 156.800 164.400 C 158.788 167.051 158.251 170.812 155.600 172.800 C 152.949 174.788 149.188 174.251 147.200 171.600 L 128.000 146.000 L 108.800 171.600 C 106.812 174.251 103.051 174.788 100.400 172.800 C 97.749 170.812 97.212 167.051 99.200 164.400 L 118.500 138.660 L 85.770 125.570 C 82.720 124.321 81.249 120.847 82.473 117.787 C 83.698 114.728 87.161 113.229 90.230 114.430 L 122.000 127.140 L 122.000 96.000 C 122.000 92.686 124.686 90.000 128.000 90.000 C 131.314 90.000 134.000 92.686 134.000 96.000 L 134.000 127.140 L 165.770 114.430 C 168.846 113.199 172.338 114.694 173.570 117.770 ZM 222.000 56.000 L 222.000 112.000 C 222.000 163.940 196.880 195.400 175.800 212.640 C 153.070 231.240 130.530 237.530 129.580 237.790 C 128.546 238.072 127.454 238.072 126.420 237.790 C 125.420 237.530 102.930 231.240 80.200 212.640 C 59.120 195.400 34.000 163.940 34.000 112.000 L 34.000 56.000 C 34.000 48.268 40.268 42.000 48.000 42.000 L 208.000 42.000 C 215.732 42.000 222.000 48.268 222.000 56.000 ZM 210.000 56.000 C 210.000 54.895 209.105 54.000 208.000 54.000 L 48.000 54.000 C 46.895 54.000 46.000 54.895 46.000 56.000 L 46.000 112.000 C 46.000 149.750 59.940 180.390 87.440 203.060 C 99.501 212.971 113.237 220.645 128.000 225.720 C 142.761 220.640 156.496 212.967 168.560 203.060 C 196.060 180.390 210.000 149.750 210.000 112.000 Z"),
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
        return _shieldStar!!
    }

private var _shieldStar: ImageVector? = null
