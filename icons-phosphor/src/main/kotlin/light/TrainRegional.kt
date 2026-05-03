package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TrainRegional: ImageVector
    get() {
        if (_trainRegional != null) return _trainRegional!!
        _trainRegional = phosphorLightIcon(
            name = "TrainRegional",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 221.790 118.420 L 199.400 36.320 C 197.740 30.227 192.206 25.999 185.890 26.000 L 70.110 26.000 C 63.794 25.999 58.260 30.227 56.600 36.320 L 34.210 118.420 C 33.928 119.454 33.928 120.546 34.210 121.580 L 56.600 203.680 C 58.260 209.773 63.794 214.001 70.110 214.000 L 84.000 214.000 L 67.200 236.400 C 65.212 239.051 65.749 242.812 68.400 244.800 C 71.051 246.788 74.812 246.251 76.800 243.600 L 99.000 214.000 L 157.000 214.000 L 179.200 243.600 C 181.188 246.251 184.949 246.788 187.600 244.800 C 190.251 242.812 190.788 239.051 188.800 236.400 L 172.000 214.000 L 185.890 214.000 C 192.206 214.001 197.740 209.773 199.400 203.680 L 221.790 121.580 C 222.072 120.546 222.072 119.454 221.790 118.420 ZM 68.180 39.470 C 68.419 38.601 69.209 37.999 70.110 38.000 L 185.890 38.000 C 186.791 37.999 187.581 38.601 187.820 39.470 L 208.490 115.270 L 128.000 129.900 L 47.510 115.270 ZM 68.180 200.530 L 48.290 127.610 L 122.000 141.000 L 122.000 202.000 L 70.110 202.000 C 69.209 202.001 68.419 201.399 68.180 200.530 ZM 187.820 200.530 C 187.581 201.399 186.791 202.001 185.890 202.000 L 134.000 202.000 L 134.000 141.000 L 207.710 127.600 ZM 90.000 88.000 C 90.000 84.686 92.686 82.000 96.000 82.000 L 160.000 82.000 C 163.314 82.000 166.000 84.686 166.000 88.000 C 166.000 91.314 163.314 94.000 160.000 94.000 L 96.000 94.000 C 92.686 94.000 90.000 91.314 90.000 88.000 Z"),
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
        return _trainRegional!!
    }

private var _trainRegional: ImageVector? = null
