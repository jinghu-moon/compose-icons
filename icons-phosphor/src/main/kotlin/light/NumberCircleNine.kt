package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberCircleNine: ImageVector
    get() {
        if (_numberCircleNine != null) return _numberCircleNine!!
        _numberCircleNine = phosphorLightIcon(
            name = "NumberCircleNine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 145.000 78.550 C 132.628 71.412 117.113 72.768 106.167 81.944 C 95.220 91.121 91.176 106.160 96.045 119.589 C 100.914 133.017 113.656 141.971 127.940 142.000 C 129.840 141.997 131.737 141.834 133.610 141.510 L 114.850 172.930 C 113.149 175.774 114.076 179.459 116.920 181.160 C 119.764 182.861 123.449 181.934 125.150 179.090 L 157.450 125.000 C 161.960 117.190 163.182 107.907 160.847 99.196 C 158.512 90.485 152.812 83.058 145.000 78.550 ZM 147.060 119.000 L 147.060 119.000 C 142.625 126.721 133.973 131.008 125.143 129.859 C 116.313 128.709 109.047 122.350 106.736 113.751 C 104.426 105.151 107.527 96.007 114.592 90.587 C 121.657 85.167 131.293 84.541 139.000 89.000 C 149.490 95.075 153.090 108.490 147.050 119.000 ZM 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 128.000 218.000 C 78.294 218.000 38.000 177.706 38.000 128.000 C 38.000 78.294 78.294 38.000 128.000 38.000 C 177.706 38.000 218.000 78.294 218.000 128.000 C 217.945 177.683 177.683 217.945 128.000 218.000 Z"),
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
        return _numberCircleNine!!
    }

private var _numberCircleNine: ImageVector? = null
