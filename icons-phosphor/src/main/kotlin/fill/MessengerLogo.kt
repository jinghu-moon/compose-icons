package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MessengerLogo: ImageVector
    get() {
        if (_messengerLogo != null) return _messengerLogo!!
        _messengerLogo = phosphorFillIcon(
            name = "MessengerLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 24.000 C 91.477 23.992 57.627 43.143 38.822 74.453 C 20.017 105.763 19.014 144.642 36.180 176.880 L 24.830 210.930 C 22.912 216.680 24.409 223.020 28.695 227.305 C 32.980 231.591 39.320 233.088 45.070 231.170 L 79.120 219.820 C 117.327 240.141 164.125 234.680 196.625 206.107 C 229.126 177.534 240.537 131.821 225.277 91.326 C 210.016 50.831 171.275 24.018 128.000 24.000 ZM 181.660 117.660 L 149.660 149.660 C 148.159 151.162 146.123 152.006 144.000 152.006 C 141.877 152.006 139.841 151.162 138.340 149.660 L 112.000 123.310 L 85.660 149.660 C 82.534 152.786 77.466 152.786 74.340 149.660 C 71.214 146.534 71.214 141.466 74.340 138.340 L 106.340 106.340 C 107.841 104.838 109.877 103.994 112.000 103.994 C 114.123 103.994 116.159 104.838 117.660 106.340 L 144.000 132.690 L 170.340 106.340 C 173.466 103.214 178.534 103.214 181.660 106.340 C 184.786 109.466 184.786 114.534 181.660 117.660 Z"),
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
