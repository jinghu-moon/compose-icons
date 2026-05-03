package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.MessengerLogo: ImageVector
    get() {
        if (_messengerLogo != null) return _messengerLogo!!
        _messengerLogo = phosphorRegularIcon(
            name = "MessengerLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 181.660 106.340 C 183.162 107.841 184.006 109.877 184.006 112.000 C 184.006 114.123 183.162 116.159 181.660 117.660 L 149.660 149.660 C 148.159 151.162 146.123 152.006 144.000 152.006 C 141.877 152.006 139.841 151.162 138.340 149.660 L 112.000 123.310 L 85.660 149.660 C 82.534 152.786 77.466 152.786 74.340 149.660 C 71.214 146.534 71.214 141.466 74.340 138.340 L 106.340 106.340 C 107.841 104.838 109.877 103.994 112.000 103.994 C 114.123 103.994 116.159 104.838 117.660 106.340 L 144.000 132.690 L 170.340 106.340 C 171.841 104.838 173.877 103.994 176.000 103.994 C 178.123 103.994 180.159 104.838 181.660 106.340 ZM 232.000 128.000 C 232.008 164.523 212.857 198.373 181.547 217.178 C 150.237 235.983 111.358 236.986 79.120 219.820 L 45.070 231.170 C 39.320 233.088 32.980 231.591 28.695 227.305 C 24.409 223.020 22.912 216.680 24.830 210.930 L 36.180 176.880 C 15.859 138.673 21.320 91.875 49.893 59.375 C 78.466 26.874 124.179 15.463 164.674 30.723 C 205.169 45.984 231.982 84.725 232.000 128.000 ZM 216.000 128.000 C 215.990 91.003 192.840 57.964 158.069 45.322 C 123.299 32.680 84.335 43.136 60.565 71.487 C 36.796 99.838 33.297 140.028 51.810 172.060 C 52.957 174.045 53.197 176.426 52.470 178.600 L 40.000 216.000 L 77.400 203.520 C 79.575 202.796 81.957 203.040 83.940 204.190 C 111.168 219.939 144.731 219.957 171.976 204.238 C 199.221 188.520 216.005 159.454 216.000 128.000 Z"),
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
        return _messengerLogo!!
    }

private var _messengerLogo: ImageVector? = null
