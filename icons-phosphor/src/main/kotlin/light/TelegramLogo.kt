package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TelegramLogo: ImageVector
    get() {
        if (_telegramLogo != null) return _telegramLogo!!
        _telegramLogo = phosphorLightIcon(
            name = "TelegramLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 227.570 27.700 C 225.604 26.002 222.859 25.532 220.440 26.480 L 17.780 105.790 C 12.717 107.771 9.569 112.857 10.055 118.273 C 10.542 123.688 14.545 128.132 19.880 129.180 L 74.000 139.810 L 74.000 200.000 C 74.002 205.708 77.470 210.844 82.764 212.978 C 88.058 215.113 94.119 213.820 98.080 209.710 L 124.720 182.080 L 166.300 218.530 C 168.839 220.776 172.110 222.017 175.500 222.020 C 176.980 222.017 178.451 221.784 179.860 221.330 C 184.561 219.843 188.117 215.970 189.200 211.160 L 229.820 34.570 C 230.402 32.040 229.536 29.396 227.570 27.700 ZM 22.050 117.370 L 22.050 117.370 C 22.012 117.267 22.012 117.153 22.050 117.050 C 22.095 117.015 22.146 116.988 22.200 116.970 L 181.910 54.450 L 78.610 128.450 L 22.200 117.410 ZM 89.440 201.370 C 88.876 201.955 88.015 202.141 87.260 201.840 C 86.505 201.540 86.007 200.812 86.000 200.000 L 86.000 148.110 L 115.690 174.110 ZM 177.510 208.450 C 177.360 209.139 176.846 209.691 176.170 209.890 C 175.480 210.132 174.713 209.979 174.170 209.490 L 89.640 135.340 L 215.000 45.500 Z"),
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
        return _telegramLogo!!
    }

private var _telegramLogo: ImageVector? = null
