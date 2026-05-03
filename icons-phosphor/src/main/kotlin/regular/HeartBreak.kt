package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.HeartBreak: ImageVector
    get() {
        if (_heartBreak != null) return _heartBreak!!
        _heartBreak = phosphorRegularIcon(
            name = "HeartBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 178.000 40.000 C 161.548 39.956 145.762 46.495 134.160 58.160 L 128.000 64.320 L 121.840 58.160 C 104.108 40.429 77.441 35.124 54.274 44.721 C 31.106 54.317 16.001 76.924 16.000 102.000 C 16.000 172.000 119.790 228.670 124.210 231.000 C 126.576 232.273 129.424 232.273 131.790 231.000 C 136.210 228.670 240.000 172.000 240.000 102.000 C 239.961 67.774 212.226 40.039 178.000 40.000 ZM 128.000 214.800 C 109.740 204.160 32.000 155.690 32.000 102.000 C 31.998 83.393 43.205 66.617 60.396 59.496 C 77.586 52.375 97.374 56.311 110.530 69.470 L 116.690 75.630 L 106.340 86.000 C 103.218 89.124 103.218 94.186 106.340 97.310 L 130.870 121.840 L 114.340 138.360 C 111.214 141.486 111.214 146.554 114.340 149.680 C 117.466 152.806 122.534 152.806 125.660 149.680 L 147.840 127.490 C 150.962 124.366 150.962 119.304 147.840 116.180 L 123.310 91.630 L 145.470 69.470 C 158.626 56.311 178.414 52.375 195.604 59.496 C 212.795 66.617 224.003 83.393 224.000 102.000 C 224.000 155.610 146.240 204.150 128.000 214.800 Z"),
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
        return _heartBreak!!
    }

private var _heartBreak: ImageVector? = null
