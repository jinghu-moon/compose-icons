package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberSquareNine: ImageVector
    get() {
        if (_numberSquareNine != null) return _numberSquareNine!!
        _numberSquareNine = phosphorLightIcon(
            name = "NumberSquareNine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 34.000 L 48.000 34.000 C 40.268 34.000 34.000 40.268 34.000 48.000 L 34.000 208.000 C 34.000 215.732 40.268 222.000 48.000 222.000 L 208.000 222.000 C 215.732 222.000 222.000 215.732 222.000 208.000 L 222.000 48.000 C 222.000 40.268 215.732 34.000 208.000 34.000 ZM 210.000 208.000 C 210.000 209.105 209.105 210.000 208.000 210.000 L 48.000 210.000 C 46.895 210.000 46.000 209.105 46.000 208.000 L 46.000 48.000 C 46.000 46.895 46.895 46.000 48.000 46.000 L 208.000 46.000 C 209.105 46.000 210.000 46.895 210.000 48.000 ZM 145.000 78.550 C 132.628 71.412 117.113 72.768 106.167 81.944 C 95.220 91.121 91.176 106.160 96.045 119.589 C 100.914 133.017 113.656 141.971 127.940 142.000 C 129.840 141.997 131.737 141.834 133.610 141.510 L 114.850 172.930 C 113.149 175.774 114.076 179.459 116.920 181.160 C 119.764 182.861 123.449 181.934 125.150 179.090 L 157.450 125.000 C 161.960 117.190 163.182 107.907 160.847 99.196 C 158.512 90.485 152.812 83.058 145.000 78.550 ZM 147.060 119.000 L 147.060 119.000 C 142.625 126.721 133.973 131.008 125.143 129.859 C 116.313 128.709 109.047 122.350 106.736 113.751 C 104.426 105.151 107.527 96.007 114.592 90.587 C 121.657 85.167 131.293 84.541 139.000 89.000 C 149.490 95.075 153.090 108.490 147.050 119.000 Z"),
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
        return _numberSquareNine!!
    }

private var _numberSquareNine: ImageVector? = null
