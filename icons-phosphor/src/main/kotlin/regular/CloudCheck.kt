package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CloudCheck: ImageVector
    get() {
        if (_cloudCheck != null) return _cloudCheck!!
        _cloudCheck = phosphorRegularIcon(
            name = "CloudCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 160.000 40.000 C 126.668 40.026 96.206 58.862 81.290 88.670 C 57.575 85.211 33.915 95.292 19.981 114.792 C 6.048 134.291 4.177 159.941 15.132 181.256 C 26.088 202.572 48.034 215.980 72.000 216.000 L 160.000 216.000 C 208.601 216.000 248.000 176.601 248.000 128.000 C 248.000 79.399 208.601 40.000 160.000 40.000 ZM 160.000 200.000 L 72.000 200.000 C 45.490 200.000 24.000 178.510 24.000 152.000 C 24.000 125.490 45.490 104.000 72.000 104.000 C 73.100 104.000 74.200 104.000 75.290 104.110 C 73.102 111.885 71.995 119.923 72.000 128.000 C 72.000 132.418 75.582 136.000 80.000 136.000 C 84.418 136.000 88.000 132.418 88.000 128.000 C 88.000 88.235 120.235 56.000 160.000 56.000 C 199.764 56.000 232.000 88.235 232.000 128.000 C 232.000 167.764 199.764 200.000 160.000 200.000 ZM 197.660 106.340 C 199.162 107.841 200.006 109.877 200.006 112.000 C 200.006 114.123 199.162 116.159 197.660 117.660 L 149.660 165.660 C 148.159 167.162 146.123 168.006 144.000 168.006 C 141.877 168.006 139.841 167.162 138.340 165.660 L 114.340 141.660 C 111.214 138.534 111.214 133.466 114.340 130.340 C 117.466 127.214 122.534 127.214 125.660 130.340 L 144.000 148.690 L 186.340 106.340 C 187.841 104.838 189.877 103.994 192.000 103.994 C 194.123 103.994 196.159 104.838 197.660 106.340 Z"),
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
        return _cloudCheck!!
    }

private var _cloudCheck: ImageVector? = null
