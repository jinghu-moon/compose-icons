package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Cursor: ImageVector
    get() {
        if (_cursor != null) return _cursor!!
        _cursor = phosphorFillIcon(
            name = "Cursor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 220.490 207.800 L 207.800 220.490 C 205.548 222.749 202.490 224.019 199.300 224.019 C 196.110 224.019 193.052 222.749 190.800 220.490 L 134.230 163.920 L 115.000 214.080 L 114.870 214.410 C 112.364 220.247 106.612 224.022 100.260 224.000 L 99.480 224.000 C 92.844 223.722 87.088 219.328 85.070 213.000 L 32.800 52.920 C 30.931 47.208 32.431 40.930 36.680 36.680 C 40.930 32.431 47.208 30.931 52.920 32.800 L 213.000 85.070 C 219.262 87.165 223.594 92.891 223.906 99.487 C 224.218 106.083 220.446 112.193 214.410 114.870 L 214.080 115.000 L 163.920 134.270 L 220.490 190.830 C 225.176 195.516 225.176 203.114 220.490 207.800 Z"),
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
        return _cursor!!
    }

private var _cursor: ImageVector? = null
