package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowsVertical: ImageVector
    get() {
        if (_arrowsVertical != null) return _arrowsVertical!!
        _arrowsVertical = phosphorBoldIcon(
            name = "ArrowsVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 168.490 191.510 C 170.749 193.762 172.019 196.820 172.019 200.010 C 172.019 203.200 170.749 206.258 168.490 208.510 L 136.490 240.510 C 134.238 242.769 131.180 244.039 127.990 244.039 C 124.800 244.039 121.742 242.769 119.490 240.510 L 87.490 208.510 C 82.796 203.816 82.796 196.204 87.490 191.510 C 92.184 186.816 99.796 186.816 104.490 191.510 L 116.000 203.000 L 116.000 53.000 L 104.490 64.490 C 99.796 69.184 92.184 69.184 87.490 64.490 C 82.796 59.796 82.796 52.184 87.490 47.490 L 119.490 15.490 C 121.742 13.231 124.800 11.961 127.990 11.961 C 131.180 11.961 134.238 13.231 136.490 15.490 L 168.490 47.490 C 173.184 52.184 173.184 59.796 168.490 64.490 C 163.796 69.184 156.184 69.184 151.490 64.490 L 140.000 53.000 L 140.000 203.000 L 151.510 191.480 C 153.765 189.231 156.821 187.970 160.006 187.976 C 163.191 187.981 166.243 189.253 168.490 191.510 Z"),
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
        return _arrowsVertical!!
    }

private var _arrowsVertical: ImageVector? = null
