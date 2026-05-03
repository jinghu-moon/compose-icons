package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.EyedropperSample: ImageVector
    get() {
        if (_eyedropperSample != null) return _eyedropperSample!!
        _eyedropperSample = phosphorFillIcon(
            name = "EyedropperSample",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 67.300 C 223.890 57.572 219.825 48.307 212.740 41.640 C 198.740 28.360 176.020 28.860 162.120 42.770 L 138.800 66.200 C 129.322 57.561 114.727 57.900 105.660 66.970 L 100.660 71.970 C 97.656 74.971 95.967 79.043 95.967 83.290 C 95.967 87.537 97.656 91.609 100.660 94.610 L 102.660 96.670 L 51.660 147.670 C 41.672 157.580 37.667 172.032 41.130 185.670 L 33.130 204.080 C 30.842 209.255 31.983 215.305 36.000 219.290 C 40.637 223.971 47.681 225.308 53.710 222.650 L 71.240 215.000 C 84.617 218.022 98.608 213.962 108.290 204.250 L 159.290 153.250 L 161.350 155.310 C 167.598 161.553 177.722 161.553 183.970 155.310 L 188.970 150.310 C 198.056 141.230 198.382 126.606 189.710 117.130 L 213.460 93.260 C 220.359 86.401 224.165 77.027 224.000 67.300 ZM 138.000 152.000 L 70.070 152.000 L 114.070 108.000 L 148.010 142.000 Z"),
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
        return _eyedropperSample!!
    }

private var _eyedropperSample: ImageVector? = null
