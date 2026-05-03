package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowsLeftRight: ImageVector
    get() {
        if (_arrowsLeftRight != null) return _arrowsLeftRight!!
        _arrowsLeftRight = phosphorBoldIcon(
            name = "ArrowsLeftRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.490 184.490 L 184.490 216.490 C 179.796 221.184 172.184 221.184 167.490 216.490 C 162.796 211.796 162.796 204.184 167.490 199.490 L 179.000 188.000 L 48.000 188.000 C 41.373 188.000 36.000 182.627 36.000 176.000 C 36.000 169.373 41.373 164.000 48.000 164.000 L 179.000 164.000 L 167.480 152.490 C 162.786 147.796 162.786 140.184 167.480 135.490 C 172.174 130.796 179.786 130.796 184.480 135.490 L 216.480 167.490 C 218.741 169.740 220.013 172.798 220.014 175.988 C 220.016 179.178 218.748 182.237 216.490 184.490 ZM 71.490 120.490 C 76.184 125.184 83.796 125.184 88.490 120.490 C 93.184 115.796 93.184 108.184 88.490 103.490 L 77.000 92.000 L 208.000 92.000 C 214.627 92.000 220.000 86.627 220.000 80.000 C 220.000 73.373 214.627 68.000 208.000 68.000 L 77.000 68.000 L 88.490 56.490 C 93.184 51.796 93.184 44.184 88.490 39.490 C 83.796 34.796 76.184 34.796 71.490 39.490 L 39.490 71.490 C 37.231 73.742 35.961 76.800 35.961 79.990 C 35.961 83.180 37.231 86.238 39.490 88.490 Z"),
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
        return _arrowsLeftRight!!
    }

private var _arrowsLeftRight: ImageVector? = null
