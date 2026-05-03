package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowsDownUp: ImageVector
    get() {
        if (_arrowsDownUp != null) return _arrowsDownUp!!
        _arrowsDownUp = phosphorBoldIcon(
            name = "ArrowsDownUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 120.490 167.510 C 122.749 169.762 124.019 172.820 124.019 176.010 C 124.019 179.200 122.749 182.258 120.490 184.510 L 88.490 216.510 C 86.238 218.769 83.180 220.039 79.990 220.039 C 76.800 220.039 73.742 218.769 71.490 216.510 L 39.490 184.510 C 34.796 179.816 34.796 172.204 39.490 167.510 C 44.184 162.816 51.796 162.816 56.490 167.510 L 68.000 179.000 L 68.000 48.000 C 68.000 41.373 73.373 36.000 80.000 36.000 C 86.627 36.000 92.000 41.373 92.000 48.000 L 92.000 179.000 L 103.510 167.480 C 105.765 165.231 108.821 163.970 112.006 163.976 C 115.191 163.981 118.243 165.253 120.490 167.510 ZM 216.490 71.510 L 184.490 39.510 C 182.238 37.251 179.180 35.981 175.990 35.981 C 172.800 35.981 169.742 37.251 167.490 39.510 L 135.490 71.510 C 130.796 76.204 130.796 83.816 135.490 88.510 C 140.184 93.204 147.796 93.204 152.490 88.510 L 164.000 77.000 L 164.000 208.000 C 164.000 214.627 169.373 220.000 176.000 220.000 C 182.627 220.000 188.000 214.627 188.000 208.000 L 188.000 77.000 L 199.510 88.520 C 204.204 93.214 211.816 93.214 216.510 88.520 C 221.204 83.826 221.204 76.214 216.510 71.520 Z"),
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
        return _arrowsDownUp!!
    }

private var _arrowsDownUp: ImageVector? = null
