package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CloudArrowUp: ImageVector
    get() {
        if (_cloudArrowUp != null) return _cloudArrowUp!!
        _cloudArrowUp = phosphorBoldIcon(
            name = "CloudArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 196.490 151.510 C 201.184 156.204 201.184 163.816 196.490 168.510 C 191.796 173.204 184.184 173.204 179.490 168.510 L 168.000 157.000 L 168.000 208.000 C 168.000 214.627 162.627 220.000 156.000 220.000 C 149.373 220.000 144.000 214.627 144.000 208.000 L 144.000 157.000 L 132.490 168.520 C 127.796 173.214 120.184 173.214 115.490 168.520 C 110.796 163.826 110.796 156.214 115.490 151.520 L 147.490 119.520 C 149.742 117.261 152.800 115.991 155.990 115.991 C 159.180 115.991 162.238 117.261 164.490 119.520 ZM 160.000 36.000 C 126.164 36.016 95.062 54.589 79.000 84.370 C 53.986 81.750 29.568 93.151 15.517 114.012 C 1.466 134.872 0.077 161.784 11.906 183.980 C 23.735 206.177 46.849 220.031 72.000 220.000 L 100.000 220.000 C 106.627 220.000 112.000 214.627 112.000 208.000 C 112.000 201.373 106.627 196.000 100.000 196.000 L 72.000 196.000 C 48.158 195.854 28.770 176.744 28.279 152.906 C 27.788 129.068 46.374 109.177 70.190 108.050 C 68.732 114.600 67.998 121.290 68.000 128.000 C 68.000 134.627 73.373 140.000 80.000 140.000 C 86.627 140.000 92.000 134.627 92.000 128.000 C 92.023 101.122 107.875 76.780 132.447 65.889 C 157.020 54.999 185.701 59.604 205.629 77.639 C 225.558 95.675 232.993 123.756 224.600 149.290 C 222.526 155.586 225.949 162.371 232.245 164.445 C 238.541 166.519 245.326 163.096 247.400 156.800 C 256.613 128.762 251.826 98.007 234.527 74.097 C 217.227 50.186 189.513 36.019 160.000 36.000 Z"),
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
        return _cloudArrowUp!!
    }

private var _cloudArrowUp: ImageVector? = null
