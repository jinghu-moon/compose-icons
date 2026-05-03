package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TrainRegional: ImageVector
    get() {
        if (_trainRegional != null) return _trainRegional!!
        _trainRegional = phosphorFillIcon(
            name = "TrainRegional",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 168.000 88.000 C 168.000 92.418 164.418 96.000 160.000 96.000 L 96.000 96.000 C 91.582 96.000 88.000 92.418 88.000 88.000 C 88.000 83.582 91.582 80.000 96.000 80.000 L 160.000 80.000 C 164.418 80.000 168.000 83.582 168.000 88.000 ZM 223.720 122.100 L 201.330 204.210 C 199.431 211.172 193.107 216.002 185.890 216.000 L 176.000 216.000 L 190.400 235.200 C 193.051 238.735 192.335 243.749 188.800 246.400 C 185.265 249.051 180.251 248.335 177.600 244.800 L 156.000 216.000 L 100.000 216.000 L 78.400 244.800 C 75.749 248.335 70.735 249.051 67.200 246.400 C 63.665 243.749 62.949 238.735 65.600 235.200 L 80.000 216.000 L 70.110 216.000 C 62.893 216.002 56.569 211.172 54.670 204.210 L 32.280 122.100 C 31.910 120.724 31.910 119.276 32.280 117.900 L 54.670 35.790 C 56.569 28.828 62.893 23.998 70.110 24.000 L 185.890 24.000 C 193.107 23.998 199.431 28.828 201.330 35.790 L 223.720 117.900 C 224.090 119.276 224.090 120.724 223.720 122.100 ZM 136.000 152.000 C 136.000 147.582 132.418 144.000 128.000 144.000 C 123.582 144.000 120.000 147.582 120.000 152.000 L 120.000 192.000 C 120.000 196.418 123.582 200.000 128.000 200.000 C 132.418 200.000 136.000 196.418 136.000 192.000 ZM 206.000 113.690 L 185.890 40.000 L 70.110 40.000 L 50.000 113.690 L 128.000 127.870 Z"),
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
        return _trainRegional!!
    }

private var _trainRegional: ImageVector? = null
