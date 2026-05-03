package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.UsersThree: ImageVector
    get() {
        if (_usersThree != null) return _usersThree!!
        _usersThree = phosphorFillIcon(
            name = "UsersThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 64.120 147.800 C 64.175 148.895 63.778 149.965 63.022 150.759 C 62.265 151.553 61.216 152.001 60.120 152.000 L 16.000 152.000 C 12.282 152.006 9.050 149.449 8.200 145.830 C 7.679 143.394 8.273 140.853 9.820 138.900 C 16.878 129.540 26.243 122.170 37.000 117.510 C 24.025 105.680 20.282 86.773 27.770 70.892 C 35.259 55.011 52.228 45.870 69.610 48.354 C 86.991 50.838 100.720 64.367 103.460 81.710 C 103.725 83.454 102.797 85.162 101.190 85.890 C 78.534 96.364 64.021 119.040 64.000 144.000 C 64.000 145.280 64.000 146.540 64.120 147.800 ZM 246.120 138.890 C 239.078 129.541 229.735 122.175 219.000 117.510 C 231.975 105.680 235.718 86.773 228.230 70.892 C 220.741 55.011 203.772 45.870 186.390 48.354 C 169.009 50.838 155.280 64.367 152.540 81.710 C 152.275 83.454 153.203 85.162 154.810 85.890 C 177.466 96.364 191.979 119.040 192.000 144.000 C 192.000 145.280 192.000 146.540 191.880 147.800 C 191.825 148.895 192.222 149.965 192.978 150.759 C 193.735 151.553 194.784 152.001 195.880 152.000 L 240.000 152.000 C 243.718 152.006 246.950 149.449 247.800 145.830 C 248.324 143.389 247.726 140.842 246.170 138.890 ZM 157.120 182.070 C 173.452 169.562 179.998 148.037 173.395 128.554 C 166.791 109.071 148.507 95.962 127.935 95.962 C 107.363 95.962 89.079 109.071 82.475 128.554 C 75.872 148.037 82.418 169.562 98.750 182.070 C 84.615 188.194 72.813 198.683 65.070 212.000 C 63.641 214.475 63.641 217.525 65.070 220.001 C 66.500 222.476 69.142 224.001 72.000 224.000 L 184.000 224.000 C 186.858 224.001 189.500 222.476 190.930 220.001 C 192.359 217.525 192.359 214.475 190.930 212.000 C 183.171 198.674 171.346 188.185 157.190 182.070 Z"),
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
        return _usersThree!!
    }

private var _usersThree: ImageVector? = null
