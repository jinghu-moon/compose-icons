package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowsInLineVertical: ImageVector
    get() {
        if (_arrowsInLineVertical != null) return _arrowsInLineVertical!!
        _arrowsInLineVertical = phosphorBoldIcon(
            name = "ArrowsInLineVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 228.000 128.000 C 228.000 134.627 222.627 140.000 216.000 140.000 L 40.000 140.000 C 33.373 140.000 28.000 134.627 28.000 128.000 C 28.000 121.373 33.373 116.000 40.000 116.000 L 216.000 116.000 C 222.627 116.000 228.000 121.373 228.000 128.000 ZM 119.510 96.490 C 121.762 98.749 124.820 100.019 128.010 100.019 C 131.200 100.019 134.258 98.749 136.510 96.490 L 168.510 64.490 C 173.204 59.796 173.204 52.184 168.510 47.490 C 163.816 42.796 156.204 42.796 151.510 47.490 L 140.000 59.000 L 140.000 16.000 C 140.000 9.373 134.627 4.000 128.000 4.000 C 121.373 4.000 116.000 9.373 116.000 16.000 L 116.000 59.000 L 104.490 47.510 C 99.796 42.816 92.184 42.816 87.490 47.510 C 82.796 52.204 82.796 59.816 87.490 64.510 ZM 136.510 159.490 C 134.258 157.231 131.200 155.961 128.010 155.961 C 124.820 155.961 121.762 157.231 119.510 159.490 L 87.510 191.490 C 82.816 196.184 82.816 203.796 87.510 208.490 C 92.204 213.184 99.816 213.184 104.510 208.490 L 116.000 197.000 L 116.000 240.000 C 116.000 246.627 121.373 252.000 128.000 252.000 C 134.627 252.000 140.000 246.627 140.000 240.000 L 140.000 197.000 L 151.510 208.520 C 156.204 213.214 163.816 213.214 168.510 208.520 C 173.204 203.826 173.204 196.214 168.510 191.520 Z"),
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
        return _arrowsInLineVertical!!
    }

private var _arrowsInLineVertical: ImageVector? = null
