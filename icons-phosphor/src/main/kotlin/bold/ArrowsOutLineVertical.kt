package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowsOutLineVertical: ImageVector
    get() {
        if (_arrowsOutLineVertical != null) return _arrowsOutLineVertical!!
        _arrowsOutLineVertical = phosphorBoldIcon(
            name = "ArrowsOutLineVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.000 128.000 C 228.000 134.627 222.627 140.000 216.000 140.000 L 40.000 140.000 C 33.373 140.000 28.000 134.627 28.000 128.000 C 28.000 121.373 33.373 116.000 40.000 116.000 L 216.000 116.000 C 222.627 116.000 228.000 121.373 228.000 128.000 ZM 104.490 56.480 L 116.000 45.000 L 116.000 88.000 C 116.000 94.627 121.373 100.000 128.000 100.000 C 134.627 100.000 140.000 94.627 140.000 88.000 L 140.000 45.000 L 151.510 56.510 C 156.204 61.204 163.816 61.204 168.510 56.510 C 173.204 51.816 173.204 44.204 168.510 39.510 L 136.510 7.510 C 134.258 5.251 131.200 3.981 128.010 3.981 C 124.820 3.981 121.762 5.251 119.510 7.510 L 87.510 39.510 C 82.816 44.204 82.816 51.816 87.510 56.510 C 92.204 61.204 99.816 61.204 104.510 56.510 ZM 151.490 199.480 L 140.000 211.000 L 140.000 168.000 C 140.000 161.373 134.627 156.000 128.000 156.000 C 121.373 156.000 116.000 161.373 116.000 168.000 L 116.000 211.000 L 104.490 199.480 C 99.796 194.786 92.184 194.786 87.490 199.480 C 82.796 204.174 82.796 211.786 87.490 216.480 L 119.490 248.480 C 121.742 250.739 124.800 252.009 127.990 252.009 C 131.180 252.009 134.238 250.739 136.490 248.480 L 168.490 216.480 C 173.184 211.786 173.184 204.174 168.490 199.480 C 163.796 194.786 156.184 194.786 151.490 199.480 Z"),
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
        return _arrowsOutLineVertical!!
    }

private var _arrowsOutLineVertical: ImageVector? = null
