package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ShuffleAngular: ImageVector
    get() {
        if (_shuffleAngular != null) return _shuffleAngular!!
        _shuffleAngular = phosphorLightIcon(
            name = "ShuffleAngular",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 236.240 179.760 C 238.580 182.103 238.580 185.897 236.240 188.240 L 212.240 212.240 C 209.876 214.443 206.192 214.378 203.907 212.093 C 201.622 209.808 201.557 206.124 203.760 203.760 L 217.520 190.000 L 168.000 190.000 C 166.064 190.000 164.246 189.065 163.120 187.490 L 84.910 78.000 L 32.000 78.000 C 28.686 78.000 26.000 75.314 26.000 72.000 C 26.000 68.686 28.686 66.000 32.000 66.000 L 88.000 66.000 C 89.936 66.000 91.754 66.935 92.880 68.510 L 171.090 178.000 L 217.520 178.000 L 203.760 164.240 C 201.557 161.876 201.622 158.192 203.907 155.907 C 206.192 153.622 209.876 153.557 212.240 155.760 ZM 144.170 105.360 C 145.466 106.284 147.075 106.656 148.645 106.394 C 150.215 106.131 151.616 105.256 152.540 103.960 L 171.090 77.960 L 217.520 77.960 L 203.760 91.760 C 202.155 93.256 201.494 95.508 202.037 97.634 C 202.580 99.760 204.240 101.420 206.366 101.963 C 208.492 102.506 210.744 101.845 212.240 100.240 L 236.240 76.240 C 238.580 73.897 238.580 70.103 236.240 67.760 L 212.240 43.760 C 209.876 41.557 206.192 41.622 203.907 43.907 C 201.622 46.192 201.557 49.876 203.760 52.240 L 217.520 66.000 L 168.000 66.000 C 166.064 66.000 164.246 66.935 163.120 68.510 L 142.780 97.000 C 140.860 99.693 141.481 103.433 144.170 105.360 ZM 111.830 150.640 C 110.534 149.716 108.925 149.344 107.355 149.606 C 105.785 149.869 104.384 150.744 103.460 152.040 L 84.910 178.000 L 32.000 178.000 C 28.686 178.000 26.000 180.686 26.000 184.000 C 26.000 187.314 28.686 190.000 32.000 190.000 L 88.000 190.000 C 89.936 190.000 91.754 189.065 92.880 187.490 L 113.220 159.000 C 115.140 156.307 114.519 152.567 111.830 150.640 Z"),
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
        return _shuffleAngular!!
    }

private var _shuffleAngular: ImageVector? = null
