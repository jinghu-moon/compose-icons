package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CloudFog: ImageVector
    get() {
        if (_cloudFog != null) return _cloudFog!!
        _cloudFog = phosphorLightIcon(
            name = "CloudFog",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 120.000 206.000 L 72.000 206.000 C 68.686 206.000 66.000 203.314 66.000 200.000 C 66.000 196.686 68.686 194.000 72.000 194.000 L 120.000 194.000 C 123.314 194.000 126.000 196.686 126.000 200.000 C 126.000 203.314 123.314 206.000 120.000 206.000 ZM 184.000 194.000 L 160.000 194.000 C 156.686 194.000 154.000 196.686 154.000 200.000 C 154.000 203.314 156.686 206.000 160.000 206.000 L 184.000 206.000 C 187.314 206.000 190.000 203.314 190.000 200.000 C 190.000 196.686 187.314 194.000 184.000 194.000 ZM 160.000 226.000 L 104.000 226.000 C 100.686 226.000 98.000 228.686 98.000 232.000 C 98.000 235.314 100.686 238.000 104.000 238.000 L 160.000 238.000 C 163.314 238.000 166.000 235.314 166.000 232.000 C 166.000 228.686 163.314 226.000 160.000 226.000 ZM 230.000 100.000 C 229.950 140.849 196.849 173.950 156.000 174.000 L 76.000 174.000 C 56.969 173.904 39.644 163.012 31.307 145.905 C 22.969 128.797 25.067 108.440 36.717 93.392 C 48.367 78.344 67.550 71.214 86.200 75.000 C 98.369 41.116 133.138 20.887 168.609 27.054 C 204.079 33.221 229.981 63.997 230.000 100.000 ZM 218.000 100.000 C 217.891 66.515 191.237 39.154 157.766 38.169 C 124.296 37.184 96.078 62.929 94.000 96.350 C 93.807 99.664 90.964 102.193 87.650 102.000 C 84.336 101.807 81.807 98.964 82.000 95.650 C 82.177 92.631 82.534 89.626 83.070 86.650 C 68.907 83.996 54.462 89.582 45.768 101.072 C 37.074 112.563 35.627 127.983 42.032 140.890 C 48.437 153.798 61.591 161.973 76.000 162.000 L 156.000 162.000 C 190.226 161.961 217.961 134.226 218.000 100.000 Z"),
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
        return _cloudFog!!
    }

private var _cloudFog: ImageVector? = null
