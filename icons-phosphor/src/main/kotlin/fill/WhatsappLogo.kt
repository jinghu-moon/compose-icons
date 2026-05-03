package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.WhatsappLogo: ImageVector
    get() {
        if (_whatsappLogo != null) return _whatsappLogo!!
        _whatsappLogo = phosphorFillIcon(
            name = "WhatsappLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 152.580 145.230 L 175.580 156.710 C 173.332 167.944 163.457 176.022 152.000 176.000 C 112.254 175.956 80.044 143.746 80.000 104.000 C 79.997 92.558 88.071 82.705 99.290 80.460 L 110.770 103.460 L 101.000 118.000 C 99.517 120.224 99.243 123.042 100.270 125.510 C 105.994 139.114 116.816 149.936 130.420 155.660 C 132.896 156.733 135.746 156.484 138.000 155.000 ZM 232.000 128.000 C 232.008 164.523 212.857 198.373 181.547 217.178 C 150.237 235.983 111.358 236.986 79.120 219.820 L 45.070 231.170 C 39.320 233.088 32.980 231.591 28.695 227.305 C 24.409 223.020 22.912 216.680 24.830 210.930 L 36.180 176.880 C 15.859 138.673 21.320 91.875 49.893 59.375 C 78.466 26.874 124.179 15.463 164.674 30.723 C 205.169 45.984 231.982 84.725 232.000 128.000 ZM 192.000 152.000 C 192.002 148.969 190.291 146.197 187.580 144.840 L 155.580 128.840 C 153.016 127.562 149.965 127.753 147.580 129.340 L 132.890 139.140 C 126.147 135.433 120.597 129.883 116.890 123.140 L 126.690 108.450 C 128.277 106.065 128.468 103.014 127.190 100.450 L 111.190 68.450 C 109.837 65.718 107.049 63.992 104.000 64.000 C 81.909 64.000 64.000 81.909 64.000 104.000 C 64.055 152.578 103.422 191.945 152.000 192.000 C 174.091 192.000 192.000 174.091 192.000 152.000 Z"),
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
        return _whatsappLogo!!
    }

private var _whatsappLogo: ImageVector? = null
