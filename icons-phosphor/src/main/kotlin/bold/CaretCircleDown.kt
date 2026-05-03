package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CaretCircleDown: ImageVector
    get() {
        if (_caretCircleDown != null) return _caretCircleDown!!
        _caretCircleDown = phosphorBoldIcon(
            name = "CaretCircleDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 128.000 212.000 C 81.608 212.000 44.000 174.392 44.000 128.000 C 44.000 81.608 81.608 44.000 128.000 44.000 C 174.392 44.000 212.000 81.608 212.000 128.000 C 211.950 174.371 174.371 211.950 128.000 212.000 ZM 176.490 103.510 C 178.749 105.762 180.019 108.820 180.019 112.010 C 180.019 115.200 178.749 118.258 176.490 120.510 L 136.490 160.510 C 134.238 162.769 131.180 164.039 127.990 164.039 C 124.800 164.039 121.742 162.769 119.490 160.510 L 79.490 120.510 C 74.796 115.816 74.796 108.204 79.490 103.510 C 84.184 98.816 91.796 98.816 96.490 103.510 L 128.000 135.000 L 159.510 103.480 C 161.765 101.231 164.821 99.970 168.006 99.976 C 171.191 99.981 174.243 101.253 176.490 103.510 Z"),
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
        return _caretCircleDown!!
    }

private var _caretCircleDown: ImageVector? = null
