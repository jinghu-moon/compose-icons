package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TextSuperscript: ImageVector
    get() {
        if (_textSuperscript != null) return _textSuperscript!!
        _textSuperscript = phosphorThinIcon(
            name = "TextSuperscript",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 244.000 144.000 C 244.000 146.209 242.209 148.000 240.000 148.000 L 192.000 148.000 C 190.485 148.000 189.100 147.144 188.422 145.789 C 187.745 144.434 187.891 142.812 188.800 141.600 L 232.000 84.050 C 236.879 77.586 237.379 68.818 233.265 61.842 C 229.152 54.866 221.238 51.059 213.220 52.200 C 205.828 53.236 199.628 58.303 197.140 65.340 C 196.403 67.425 194.115 68.517 192.030 67.780 C 189.945 67.043 188.853 64.755 189.590 62.670 C 190.537 59.976 191.885 57.441 193.590 55.150 C 199.563 47.028 209.440 42.744 219.452 43.933 C 229.463 45.123 238.062 51.603 241.965 60.898 C 245.867 70.194 244.471 80.870 238.310 88.850 L 200.000 140.000 L 240.000 140.000 C 242.209 140.000 244.000 141.791 244.000 144.000 ZM 146.620 77.000 C 144.952 75.554 142.427 75.733 140.980 77.400 L 92.000 133.890 L 43.000 77.380 C 41.503 75.955 39.168 75.905 37.611 77.265 C 36.055 78.624 35.790 80.945 37.000 82.620 L 86.710 140.000 L 37.000 197.380 C 35.901 198.426 35.488 200.004 35.935 201.454 C 36.381 202.904 37.609 203.977 39.106 204.224 C 40.603 204.471 42.111 203.850 43.000 202.620 L 92.000 146.110 L 141.000 202.620 C 142.497 204.045 144.832 204.095 146.389 202.735 C 147.945 201.376 148.210 199.055 147.000 197.380 L 97.290 140.000 L 147.000 82.620 C 148.437 80.960 148.268 78.451 146.620 77.000 Z"),
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
        return _textSuperscript!!
    }

private var _textSuperscript: ImageVector? = null
