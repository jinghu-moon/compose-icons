package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowsInLineHorizontal: ImageVector
    get() {
        if (_arrowsInLineHorizontal != null) return _arrowsInLineHorizontal!!
        _arrowsInLineHorizontal = phosphorBoldIcon(
            name = "ArrowsInLineHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 140.000 40.000 L 140.000 216.000 C 140.000 222.627 134.627 228.000 128.000 228.000 C 121.373 228.000 116.000 222.627 116.000 216.000 L 116.000 40.000 C 116.000 33.373 121.373 28.000 128.000 28.000 C 134.627 28.000 140.000 33.373 140.000 40.000 ZM 64.490 87.510 C 59.796 82.816 52.184 82.816 47.490 87.510 C 42.796 92.204 42.796 99.816 47.490 104.510 L 59.000 116.000 L 16.000 116.000 C 9.373 116.000 4.000 121.373 4.000 128.000 C 4.000 134.627 9.373 140.000 16.000 140.000 L 59.000 140.000 L 47.510 151.510 C 42.816 156.204 42.816 163.816 47.510 168.510 C 52.204 173.204 59.816 173.204 64.510 168.510 L 96.510 136.510 C 98.769 134.258 100.039 131.200 100.039 128.010 C 100.039 124.820 98.769 121.762 96.510 119.510 ZM 240.000 116.000 L 197.000 116.000 L 208.520 104.490 C 213.214 99.796 213.214 92.184 208.520 87.490 C 203.826 82.796 196.214 82.796 191.520 87.490 L 159.520 119.490 C 157.261 121.742 155.991 124.800 155.991 127.990 C 155.991 131.180 157.261 134.238 159.520 136.490 L 191.520 168.490 C 196.214 173.184 203.826 173.184 208.520 168.490 C 213.214 163.796 213.214 156.184 208.520 151.490 L 197.000 140.000 L 240.000 140.000 C 246.627 140.000 252.000 134.627 252.000 128.000 C 252.000 121.373 246.627 116.000 240.000 116.000 Z"),
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
        return _arrowsInLineHorizontal!!
    }

private var _arrowsInLineHorizontal: ImageVector? = null
