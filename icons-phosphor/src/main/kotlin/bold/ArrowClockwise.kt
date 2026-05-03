package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowClockwise: ImageVector
    get() {
        if (_arrowClockwise != null) return _arrowClockwise!!
        _arrowClockwise = phosphorBoldIcon(
            name = "ArrowClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 244.000 56.000 L 244.000 104.000 C 244.000 110.627 238.627 116.000 232.000 116.000 L 184.000 116.000 C 177.373 116.000 172.000 110.627 172.000 104.000 C 172.000 97.373 177.373 92.000 184.000 92.000 L 201.100 92.000 L 182.100 74.620 C 181.970 74.500 181.840 74.380 181.720 74.250 C 157.479 50.024 120.022 45.019 90.271 62.031 C 60.520 79.043 45.835 113.863 54.419 147.042 C 63.003 180.221 92.731 203.551 127.000 204.000 L 128.000 204.000 C 147.399 204.047 166.073 196.628 180.150 183.280 C 184.969 178.726 192.566 178.941 197.120 183.760 C 201.674 188.579 201.459 196.176 196.640 200.730 C 178.109 218.294 153.532 228.058 128.000 228.000 L 126.630 228.000 C 81.590 227.365 42.534 196.697 31.236 153.092 C 19.938 109.488 39.187 63.713 78.251 41.286 C 117.315 18.859 166.551 25.317 198.510 57.060 L 220.000 76.720 L 220.000 56.000 C 220.000 49.373 225.373 44.000 232.000 44.000 C 238.627 44.000 244.000 49.373 244.000 56.000 Z"),
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
        return _arrowClockwise!!
    }

private var _arrowClockwise: ImageVector? = null
