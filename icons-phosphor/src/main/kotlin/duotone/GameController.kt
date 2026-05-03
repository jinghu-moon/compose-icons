package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.GameController: ImageVector
    get() {
        if (_gameController != null) return _gameController!!
        _gameController = phosphorDuotoneIcon(
            name = "GameController",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 216.860 207.570 C 207.865 209.157 198.661 206.257 192.200 199.800 L 150.090 152.000 L 172.000 152.000 C 187.370 152.017 201.958 145.225 211.840 133.452 C 221.721 121.679 225.881 106.135 223.200 91.000 L 223.200 91.000 L 239.560 175.170 C 242.223 190.382 232.067 204.878 216.860 207.570 Z"),
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
        pathData = parseSvgPathData("M 176.000 112.000 L 152.000 112.000 C 147.582 112.000 144.000 108.418 144.000 104.000 C 144.000 99.582 147.582 96.000 152.000 96.000 L 176.000 96.000 C 180.418 96.000 184.000 99.582 184.000 104.000 C 184.000 108.418 180.418 112.000 176.000 112.000 ZM 104.000 96.000 L 96.000 96.000 L 96.000 88.000 C 96.000 83.582 92.418 80.000 88.000 80.000 C 83.582 80.000 80.000 83.582 80.000 88.000 L 80.000 96.000 L 72.000 96.000 C 67.582 96.000 64.000 99.582 64.000 104.000 C 64.000 108.418 67.582 112.000 72.000 112.000 L 80.000 112.000 L 80.000 120.000 C 80.000 124.418 83.582 128.000 88.000 128.000 C 92.418 128.000 96.000 124.418 96.000 120.000 L 96.000 112.000 L 104.000 112.000 C 108.418 112.000 112.000 108.418 112.000 104.000 C 112.000 99.582 108.418 96.000 104.000 96.000 ZM 241.480 200.650 C 235.377 209.365 225.731 214.935 215.131 215.863 C 204.532 216.791 194.065 212.982 186.540 205.460 C 186.420 205.340 186.300 205.220 186.190 205.090 L 146.480 160.000 L 109.480 160.000 L 69.810 205.090 L 69.460 205.460 C 62.702 212.203 53.547 215.993 44.000 216.000 C 33.361 215.996 23.269 211.287 16.432 203.136 C 9.595 194.985 6.713 184.227 8.560 173.750 C 8.555 173.703 8.555 173.657 8.560 173.610 L 24.930 89.520 C 29.959 60.891 54.822 40.008 83.890 40.000 L 172.000 40.000 C 200.968 40.046 225.778 60.756 231.000 89.250 C 231.000 89.310 231.000 89.370 231.000 89.430 L 247.370 173.600 C 247.375 173.647 247.375 173.693 247.370 173.740 C 249.081 183.137 246.960 192.827 241.480 200.650 ZM 172.000 144.000 C 196.301 144.000 216.000 124.301 216.000 100.000 C 216.000 75.699 196.301 56.000 172.000 56.000 L 83.890 56.000 C 62.565 56.019 44.338 71.361 40.680 92.370 L 40.680 92.500 L 24.300 176.590 C 22.815 185.143 27.016 193.678 34.701 197.716 C 42.386 201.755 51.798 200.375 58.000 194.300 L 99.920 146.710 C 101.438 144.987 103.624 144.000 105.920 144.000 ZM 231.700 176.590 L 222.960 131.590 C 212.031 149.237 192.757 159.983 172.000 160.000 L 167.800 160.000 L 198.000 194.310 C 202.619 198.803 209.112 200.807 215.460 199.700 C 226.313 197.784 233.572 187.449 231.690 176.590 Z"),
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
        return _gameController!!
    }

private var _gameController: ImageVector? = null
