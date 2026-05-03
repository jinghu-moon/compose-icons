package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TextSubscript: ImageVector
    get() {
        if (_textSubscript != null) return _textSubscript!!
        _textSubscript = phosphorThinIcon(
            name = "TextSubscript",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 244.000 208.000 C 244.000 210.209 242.209 212.000 240.000 212.000 L 192.000 212.000 C 190.485 212.000 189.100 211.144 188.422 209.789 C 187.745 208.434 187.891 206.812 188.800 205.600 L 232.000 148.000 C 238.627 139.163 236.837 126.627 228.000 120.000 C 219.163 113.373 206.627 115.163 200.000 124.000 C 198.771 125.634 197.796 127.444 197.110 129.370 C 196.375 131.455 194.090 132.550 192.005 131.815 C 189.920 131.080 188.825 128.795 189.560 126.710 C 190.507 124.016 191.855 121.481 193.560 119.190 C 202.933 107.052 220.326 104.711 232.573 113.941 C 244.821 123.170 247.365 140.535 238.280 152.890 L 200.000 204.000 L 240.000 204.000 C 242.209 204.000 244.000 205.791 244.000 208.000 ZM 146.620 53.000 C 144.952 51.554 142.427 51.733 140.980 53.400 L 92.000 109.890 L 43.000 53.380 C 42.111 52.150 40.603 51.529 39.106 51.776 C 37.609 52.023 36.381 53.096 35.935 54.546 C 35.488 55.996 35.901 57.574 37.000 58.620 L 86.710 116.000 L 37.000 173.380 C 35.901 174.426 35.488 176.004 35.935 177.454 C 36.381 178.904 37.609 179.977 39.106 180.224 C 40.603 180.471 42.111 179.850 43.000 178.620 L 92.000 122.110 L 141.000 178.620 C 142.497 180.045 144.832 180.095 146.389 178.735 C 147.945 177.376 148.210 175.055 147.000 173.380 L 97.290 116.000 L 147.000 58.620 C 148.437 56.960 148.268 54.451 146.620 53.000 Z"),
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
        return _textSubscript!!
    }

private var _textSubscript: ImageVector? = null
