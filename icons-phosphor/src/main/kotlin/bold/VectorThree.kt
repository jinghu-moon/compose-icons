package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.VectorThree: ImageVector
    get() {
        if (_vectorThree != null) return _vectorThree!!
        _vectorThree = phosphorBoldIcon(
            name = "VectorThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 240.490 144.490 L 208.490 176.490 C 203.796 181.184 196.184 181.184 191.490 176.490 C 186.796 171.796 186.796 164.184 191.490 159.490 L 203.000 148.000 L 125.000 148.000 L 77.000 196.000 L 96.000 196.000 C 102.627 196.000 108.000 201.373 108.000 208.000 C 108.000 214.627 102.627 220.000 96.000 220.000 L 48.000 220.000 C 41.373 220.000 36.000 214.627 36.000 208.000 L 36.000 160.000 C 36.000 153.373 41.373 148.000 48.000 148.000 C 54.627 148.000 60.000 153.373 60.000 160.000 L 60.000 179.000 L 108.000 131.000 L 108.000 53.000 L 96.490 64.490 C 91.796 69.184 84.184 69.184 79.490 64.490 C 74.796 59.796 74.796 52.184 79.490 47.490 L 111.490 15.490 C 113.742 13.231 116.800 11.961 119.990 11.961 C 123.180 11.961 126.238 13.231 128.490 15.490 L 160.490 47.490 C 165.184 52.184 165.184 59.796 160.490 64.490 C 155.796 69.184 148.184 69.184 143.490 64.490 L 132.000 53.000 L 132.000 124.000 L 203.000 124.000 L 191.480 112.490 C 186.786 107.796 186.786 100.184 191.480 95.490 C 196.174 90.796 203.786 90.796 208.480 95.490 L 240.480 127.490 C 242.741 129.740 244.013 132.798 244.014 135.988 C 244.016 139.178 242.748 142.237 240.490 144.490 Z"),
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
        return _vectorThree!!
    }

private var _vectorThree: ImageVector? = null
