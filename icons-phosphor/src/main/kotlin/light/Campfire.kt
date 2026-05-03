package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Campfire: ImageVector
    get() {
        if (_campfire != null) return _campfire!!
        _campfire = phosphorLightIcon(
            name = "Campfire",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 221.720 225.820 C 221.238 227.337 220.172 228.601 218.758 229.333 C 217.344 230.064 215.697 230.203 214.180 229.720 L 128.000 202.300 L 41.820 229.720 C 38.661 230.725 35.285 228.979 34.280 225.820 C 33.275 222.661 35.021 219.285 38.180 218.280 L 108.180 196.000 L 38.180 173.720 C 35.021 172.715 33.275 169.339 34.280 166.180 C 35.285 163.021 38.661 161.275 41.820 162.280 L 128.000 189.700 L 214.180 162.280 C 217.339 161.275 220.715 163.021 221.720 166.180 C 222.725 169.339 220.979 172.715 217.820 173.720 L 147.820 196.000 L 217.820 218.280 C 219.337 218.762 220.601 219.828 221.333 221.242 C 222.064 222.656 222.203 224.303 221.720 225.820 ZM 70.000 108.000 C 70.000 61.190 122.620 28.270 124.860 26.890 C 126.786 25.707 129.214 25.707 131.140 26.890 C 133.380 28.270 186.000 61.190 186.000 108.000 C 186.000 140.033 160.033 166.000 128.000 166.000 C 95.967 166.000 70.000 140.033 70.000 108.000 ZM 128.000 154.000 C 137.941 154.000 146.000 145.941 146.000 136.000 C 146.000 120.520 134.000 108.570 128.000 103.560 C 122.000 108.560 110.000 120.560 110.000 136.000 C 110.000 145.941 118.059 154.000 128.000 154.000 ZM 82.000 108.000 C 82.001 121.844 88.247 134.950 99.000 143.670 C 98.336 141.167 97.999 138.589 98.000 136.000 C 98.000 109.100 123.580 91.730 124.670 91.000 C 126.686 89.655 129.314 89.655 131.330 91.000 C 132.420 91.720 158.000 109.090 158.000 136.000 C 158.001 138.589 157.664 141.167 157.000 143.670 C 167.753 134.950 173.999 121.844 174.000 108.000 C 174.000 73.940 138.850 46.780 128.000 39.220 C 117.150 46.780 82.000 73.930 82.000 108.000 Z"),
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
        return _campfire!!
    }

private var _campfire: ImageVector? = null
