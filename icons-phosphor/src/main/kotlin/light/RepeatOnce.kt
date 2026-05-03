package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.RepeatOnce: ImageVector
    get() {
        if (_repeatOnce != null) return _repeatOnce!!
        _repeatOnce = phosphorLightIcon(
            name = "RepeatOnce",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 26.000 128.000 C 26.044 89.358 57.358 58.044 96.000 58.000 L 209.510 58.000 L 195.760 44.240 C 193.557 41.876 193.622 38.192 195.907 35.907 C 198.192 33.622 201.876 33.557 204.240 35.760 L 228.240 59.760 C 230.580 62.103 230.580 65.897 228.240 68.240 L 204.240 92.240 C 201.876 94.443 198.192 94.378 195.907 92.093 C 193.622 89.808 193.557 86.124 195.760 83.760 L 209.510 70.000 L 96.000 70.000 C 63.983 70.039 38.039 95.983 38.000 128.000 C 38.000 131.314 35.314 134.000 32.000 134.000 C 28.686 134.000 26.000 131.314 26.000 128.000 ZM 224.000 122.000 C 220.686 122.000 218.000 124.686 218.000 128.000 C 217.961 160.017 192.017 185.961 160.000 186.000 L 46.490 186.000 L 60.240 172.240 C 62.443 169.876 62.378 166.192 60.093 163.907 C 57.808 161.622 54.124 161.557 51.760 163.760 L 27.760 187.760 C 25.420 190.103 25.420 193.897 27.760 196.240 L 51.760 220.240 C 54.124 222.443 57.808 222.378 60.093 220.093 C 62.378 217.808 62.443 214.124 60.240 211.760 L 46.490 198.000 L 160.000 198.000 C 198.642 197.956 229.956 166.642 230.000 128.000 C 230.000 124.686 227.314 122.000 224.000 122.000 ZM 136.000 158.000 C 139.314 158.000 142.000 155.314 142.000 152.000 L 142.000 104.000 C 142.001 101.921 140.925 99.990 139.157 98.896 C 137.389 97.802 135.180 97.701 133.320 98.630 L 117.320 106.630 C 115.334 107.547 114.003 109.472 113.849 111.654 C 113.695 113.837 114.740 115.930 116.578 117.118 C 118.416 118.305 120.754 118.398 122.680 117.360 L 130.000 113.700 L 130.000 152.000 C 130.000 155.314 132.686 158.000 136.000 158.000 Z"),
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
        return _repeatOnce!!
    }

private var _repeatOnce: ImageVector? = null
