package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowsOutLineHorizontal: ImageVector
    get() {
        if (_arrowsOutLineHorizontal != null) return _arrowsOutLineHorizontal!!
        _arrowsOutLineHorizontal = phosphorBoldIcon(
            name = "ArrowsOutLineHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 140.000 40.000 L 140.000 216.000 C 140.000 222.627 134.627 228.000 128.000 228.000 C 121.373 228.000 116.000 222.627 116.000 216.000 L 116.000 40.000 C 116.000 33.373 121.373 28.000 128.000 28.000 C 134.627 28.000 140.000 33.373 140.000 40.000 ZM 88.000 116.000 L 45.000 116.000 L 56.520 104.490 C 61.214 99.796 61.214 92.184 56.520 87.490 C 51.826 82.796 44.214 82.796 39.520 87.490 L 7.520 119.490 C 5.261 121.742 3.991 124.800 3.991 127.990 C 3.991 131.180 5.261 134.238 7.520 136.490 L 39.520 168.490 C 44.214 173.184 51.826 173.184 56.520 168.490 C 61.214 163.796 61.214 156.184 56.520 151.490 L 45.000 140.000 L 88.000 140.000 C 94.627 140.000 100.000 134.627 100.000 128.000 C 100.000 121.373 94.627 116.000 88.000 116.000 ZM 248.490 119.510 L 216.490 87.510 C 211.796 82.816 204.184 82.816 199.490 87.510 C 194.796 92.204 194.796 99.816 199.490 104.510 L 211.000 116.000 L 168.000 116.000 C 161.373 116.000 156.000 121.373 156.000 128.000 C 156.000 134.627 161.373 140.000 168.000 140.000 L 211.000 140.000 L 199.480 151.510 C 194.786 156.204 194.786 163.816 199.480 168.510 C 204.174 173.204 211.786 173.204 216.480 168.510 L 248.480 136.510 C 250.741 134.260 252.013 131.202 252.014 128.012 C 252.016 124.822 250.748 121.763 248.490 119.510 Z"),
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
        return _arrowsOutLineHorizontal!!
    }

private var _arrowsOutLineHorizontal: ImageVector? = null
