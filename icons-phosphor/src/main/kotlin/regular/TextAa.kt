package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TextAa: ImageVector
    get() {
        if (_textAa != null) return _textAa!!
        _textAa = phosphorRegularIcon(
            name = "TextAa",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 87.240 52.590 C 85.921 49.784 83.100 47.993 80.000 47.993 C 76.900 47.993 74.079 49.784 72.760 52.590 L 8.760 188.590 C 6.879 192.589 8.596 197.354 12.595 199.235 C 16.594 201.116 21.359 199.399 23.240 195.400 L 39.900 160.000 L 120.100 160.000 L 136.760 195.400 C 138.641 199.399 143.406 201.116 147.405 199.235 C 151.404 197.354 153.121 192.589 151.240 188.590 ZM 47.430 144.000 L 80.000 74.790 L 112.570 144.000 ZM 200.000 96.000 C 187.240 96.000 177.270 99.470 170.370 106.320 C 167.366 109.452 167.406 114.408 170.461 117.490 C 173.517 120.572 178.472 120.656 181.630 117.680 C 185.430 113.910 191.630 112.000 200.000 112.000 C 213.230 112.000 224.000 121.000 224.000 132.000 L 224.000 135.220 C 216.901 130.470 208.542 127.956 200.000 128.000 C 177.940 128.000 160.000 144.150 160.000 164.000 C 160.000 183.850 177.940 200.000 200.000 200.000 C 208.545 200.037 216.905 197.512 224.000 192.750 C 224.207 197.168 227.957 200.582 232.375 200.375 C 236.793 200.168 240.207 196.418 240.000 192.000 L 240.000 132.000 C 240.000 112.150 222.060 96.000 200.000 96.000 ZM 200.000 184.000 C 186.770 184.000 176.000 175.000 176.000 164.000 C 176.000 153.000 186.770 144.000 200.000 144.000 C 213.230 144.000 224.000 153.000 224.000 164.000 C 224.000 175.000 213.230 184.000 200.000 184.000 Z"),
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
        return _textAa!!
    }

private var _textAa: ImageVector? = null
