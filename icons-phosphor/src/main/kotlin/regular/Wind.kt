package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Wind: ImageVector
    get() {
        if (_wind != null) return _wind!!
        _wind = phosphorRegularIcon(
            name = "Wind",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 184.000 184.000 C 184.000 201.673 169.673 216.000 152.000 216.000 C 138.300 216.000 125.050 207.070 120.500 194.780 C 119.060 190.664 121.181 186.152 125.271 184.637 C 129.360 183.121 133.909 185.159 135.500 189.220 C 137.740 195.270 145.000 200.000 152.000 200.000 C 160.837 200.000 168.000 192.837 168.000 184.000 C 168.000 175.163 160.837 168.000 152.000 168.000 L 40.000 168.000 C 35.582 168.000 32.000 164.418 32.000 160.000 C 32.000 155.582 35.582 152.000 40.000 152.000 L 152.000 152.000 C 169.673 152.000 184.000 166.327 184.000 184.000 ZM 120.000 104.000 C 137.673 104.000 152.000 89.673 152.000 72.000 C 152.000 54.327 137.673 40.000 120.000 40.000 C 106.300 40.000 93.050 48.930 88.500 61.220 C 87.060 65.336 89.181 69.848 93.271 71.363 C 97.360 72.879 101.909 70.841 103.500 66.780 C 105.740 60.730 113.000 56.000 120.000 56.000 C 128.837 56.000 136.000 63.163 136.000 72.000 C 136.000 80.837 128.837 88.000 120.000 88.000 L 24.000 88.000 C 19.582 88.000 16.000 91.582 16.000 96.000 C 16.000 100.418 19.582 104.000 24.000 104.000 ZM 208.000 72.000 C 194.300 72.000 181.050 80.930 176.500 93.220 C 175.060 97.336 177.181 101.848 181.271 103.363 C 185.360 104.879 189.909 102.841 191.500 98.780 C 193.740 92.730 201.000 88.000 208.000 88.000 C 216.837 88.000 224.000 95.163 224.000 104.000 C 224.000 112.837 216.837 120.000 208.000 120.000 L 32.000 120.000 C 27.582 120.000 24.000 123.582 24.000 128.000 C 24.000 132.418 27.582 136.000 32.000 136.000 L 208.000 136.000 C 225.673 136.000 240.000 121.673 240.000 104.000 C 240.000 86.327 225.673 72.000 208.000 72.000 Z"),
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
        return _wind!!
    }

private var _wind: ImageVector? = null
