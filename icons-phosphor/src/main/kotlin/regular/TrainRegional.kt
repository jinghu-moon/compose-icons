package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TrainRegional: ImageVector
    get() {
        if (_trainRegional != null) return _trainRegional!!
        _trainRegional = phosphorRegularIcon(
            name = "TrainRegional",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 223.720 117.900 L 201.330 35.790 C 199.431 28.828 193.107 23.998 185.890 24.000 L 70.110 24.000 C 62.893 23.998 56.569 28.828 54.670 35.790 L 32.280 117.900 C 31.910 119.276 31.910 120.724 32.280 122.100 L 54.670 204.210 C 56.569 211.172 62.893 216.002 70.110 216.000 L 80.000 216.000 L 65.600 235.200 C 62.949 238.735 63.665 243.749 67.200 246.400 C 70.735 249.051 75.749 248.335 78.400 244.800 L 100.000 216.000 L 156.000 216.000 L 177.600 244.800 C 180.251 248.335 185.265 249.051 188.800 246.400 C 192.335 243.749 193.051 238.735 190.400 235.200 L 176.000 216.000 L 185.890 216.000 C 193.107 216.002 199.431 211.172 201.330 204.210 L 223.720 122.100 C 224.090 120.724 224.090 119.276 223.720 117.900 ZM 70.110 40.000 L 185.890 40.000 L 206.000 113.690 L 128.000 127.870 L 50.000 113.690 ZM 51.110 130.140 L 120.000 142.680 L 120.000 200.000 L 70.110 200.000 ZM 185.890 200.000 L 136.000 200.000 L 136.000 142.680 L 204.940 130.140 ZM 88.000 88.000 C 88.000 83.582 91.582 80.000 96.000 80.000 L 160.000 80.000 C 164.418 80.000 168.000 83.582 168.000 88.000 C 168.000 92.418 164.418 96.000 160.000 96.000 L 96.000 96.000 C 91.582 96.000 88.000 92.418 88.000 88.000 Z"),
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
