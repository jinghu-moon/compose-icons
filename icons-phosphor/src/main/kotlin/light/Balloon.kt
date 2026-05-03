package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Balloon: ImageVector
    get() {
        if (_balloon != null) return _balloon!!
        _balloon = phosphorLightIcon(
            name = "Balloon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 18.000 C 80.526 18.055 42.055 56.526 42.000 104.000 C 42.000 127.000 51.240 152.520 66.710 172.270 C 79.080 188.060 93.940 198.690 109.760 203.340 L 98.490 229.640 C 97.697 231.493 97.888 233.619 98.997 235.302 C 100.106 236.984 101.985 237.998 104.000 238.000 L 152.000 238.000 C 154.015 237.998 155.894 236.984 157.003 235.302 C 158.112 233.619 158.303 231.493 157.510 229.640 L 146.240 203.340 C 162.060 198.690 176.920 188.060 189.240 172.270 C 204.760 152.520 214.000 127.000 214.000 104.000 C 213.945 56.526 175.474 18.055 128.000 18.000 ZM 112.170 204.000 L 112.750 204.140 C 112.551 204.122 112.355 204.075 112.170 204.000 ZM 142.900 226.000 L 113.100 226.000 L 121.800 205.690 C 125.923 206.103 130.077 206.103 134.200 205.690 ZM 128.000 194.000 C 94.480 194.000 54.000 153.850 54.000 104.000 C 54.000 63.131 87.131 30.000 128.000 30.000 C 168.869 30.000 202.000 63.131 202.000 104.000 C 202.000 153.850 161.520 194.000 128.000 194.000 ZM 177.000 101.920 C 176.669 101.971 176.335 101.998 176.000 102.000 C 173.074 101.997 170.578 99.885 170.090 97.000 C 166.920 79.099 152.902 65.085 135.000 61.920 C 131.730 61.368 129.528 58.270 130.080 55.000 C 130.632 51.730 133.730 49.528 137.000 50.080 C 159.912 54.151 177.849 72.088 181.920 95.000 C 182.186 96.570 181.817 98.182 180.894 99.480 C 179.972 100.778 178.571 101.656 177.000 101.920 Z"),
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
        return _balloon!!
    }

private var _balloon: ImageVector? = null
