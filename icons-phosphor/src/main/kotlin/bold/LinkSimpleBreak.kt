package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LinkSimpleBreak: ImageVector
    get() {
        if (_linkSimpleBreak != null) return _linkSimpleBreak!!
        _linkSimpleBreak = phosphorBoldIcon(
            name = "LinkSimpleBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 218.450 122.430 L 188.370 152.490 C 183.676 157.184 176.064 157.184 171.370 152.490 C 166.676 147.796 166.676 140.184 171.370 135.490 L 201.450 105.420 C 215.511 91.356 215.509 68.556 201.445 54.495 C 187.381 40.434 164.581 40.436 150.520 54.500 L 120.480 84.590 C 115.786 89.284 108.174 89.284 103.480 84.590 C 98.786 79.896 98.786 72.284 103.480 67.590 L 133.550 37.530 C 156.989 14.094 194.989 14.096 218.425 37.535 C 241.861 60.974 241.859 98.974 218.420 122.410 ZM 135.520 171.430 L 105.450 201.510 C 91.386 215.571 68.586 215.569 54.525 201.505 C 40.464 187.441 40.466 164.641 54.530 150.580 L 84.590 120.510 C 89.284 115.816 89.284 108.204 84.590 103.510 C 79.896 98.816 72.284 98.816 67.590 103.510 L 37.550 133.580 C 14.114 157.019 14.116 195.019 37.555 218.455 C 60.994 241.891 98.994 241.889 122.430 218.450 L 152.490 188.380 C 157.184 183.686 157.184 176.074 152.490 171.380 C 147.796 166.686 140.184 166.686 135.490 171.380 Z"),
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
        return _linkSimpleBreak!!
    }

private var _linkSimpleBreak: ImageVector? = null
