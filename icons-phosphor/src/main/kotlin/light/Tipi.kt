package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Tipi: ImageVector
    get() {
        if (_tipi != null) return _tipi!!
        _tipi = phosphorLightIcon(
            name = "Tipi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 237.050 212.770 L 135.120 53.500 L 157.050 19.240 C 158.444 17.447 158.707 15.021 157.728 12.971 C 156.749 10.922 154.697 9.600 152.426 9.558 C 150.155 9.515 148.055 10.759 147.000 12.770 L 128.000 42.370 L 109.000 12.770 C 107.987 10.684 105.862 9.368 103.543 9.391 C 101.224 9.414 99.126 10.772 98.154 12.878 C 97.183 14.984 97.512 17.461 99.000 19.240 L 120.880 53.500 L 19.000 212.770 C 17.825 214.609 17.741 216.940 18.781 218.858 C 19.820 220.776 21.818 221.980 24.000 222.000 L 232.000 222.000 C 234.191 221.998 236.206 220.802 237.257 218.880 C 238.309 216.958 238.229 214.616 237.050 212.770 ZM 82.640 210.000 L 128.000 139.130 L 173.360 210.000 ZM 187.640 210.000 L 133.090 124.770 C 131.987 123.050 130.084 122.010 128.040 122.010 C 125.996 122.010 124.093 123.050 122.990 124.770 L 68.400 210.000 L 35.000 210.000 L 128.000 64.630 L 221.000 210.000 Z"),
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
        return _tipi!!
    }

private var _tipi: ImageVector? = null
