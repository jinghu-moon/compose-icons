package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CloudRain: ImageVector
    get() {
        if (_cloudRain != null) return _cloudRain!!
        _cloudRain = phosphorLightIcon(
            name = "CloudRain",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 157.000 195.330 L 125.000 243.330 C 123.161 246.091 119.431 246.839 116.670 245.000 C 113.909 243.161 113.161 239.431 115.000 236.670 L 147.000 188.670 C 148.839 185.909 152.569 185.161 155.330 187.000 C 158.091 188.839 158.839 192.569 157.000 195.330 ZM 230.000 92.000 C 229.950 132.849 196.849 165.950 156.000 166.000 L 131.210 166.000 L 101.000 211.330 C 99.161 214.091 95.431 214.839 92.670 213.000 C 89.909 211.161 89.161 207.431 91.000 204.670 L 116.790 166.000 L 76.000 166.000 C 56.969 165.904 39.644 155.012 31.307 137.905 C 22.969 120.797 25.067 100.440 36.717 85.392 C 48.367 70.344 67.550 63.214 86.200 67.000 C 98.369 33.116 133.138 12.887 168.609 19.054 C 204.079 25.221 229.981 55.997 230.000 92.000 ZM 218.000 92.000 C 217.891 58.515 191.237 31.154 157.766 30.169 C 124.296 29.184 96.078 54.929 94.000 88.350 C 93.807 91.664 90.964 94.193 87.650 94.000 C 84.336 93.807 81.807 90.964 82.000 87.650 C 82.177 84.631 82.534 81.626 83.070 78.650 C 68.907 75.996 54.462 81.582 45.768 93.072 C 37.074 104.563 35.627 119.983 42.032 132.890 C 48.437 145.798 61.591 153.973 76.000 154.000 L 156.000 154.000 C 190.226 153.961 217.961 126.226 218.000 92.000 Z"),
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
        return _cloudRain!!
    }

private var _cloudRain: ImageVector? = null
