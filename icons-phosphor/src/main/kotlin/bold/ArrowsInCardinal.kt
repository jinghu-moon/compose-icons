package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowsInCardinal: ImageVector
    get() {
        if (_arrowsInCardinal != null) return _arrowsInCardinal!!
        _arrowsInCardinal = phosphorBoldIcon(
            name = "ArrowsInCardinal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 87.510 72.490 C 82.816 67.796 82.816 60.184 87.510 55.490 C 92.204 50.796 99.816 50.796 104.510 55.490 L 116.000 67.000 L 116.000 24.000 C 116.000 17.373 121.373 12.000 128.000 12.000 C 134.627 12.000 140.000 17.373 140.000 24.000 L 140.000 67.000 L 151.510 55.480 C 156.204 50.786 163.816 50.786 168.510 55.480 C 173.204 60.174 173.204 67.786 168.510 72.480 L 136.510 104.480 C 134.258 106.739 131.200 108.009 128.010 108.009 C 124.820 108.009 121.762 106.739 119.510 104.480 ZM 136.510 151.490 C 134.258 149.231 131.200 147.961 128.010 147.961 C 124.820 147.961 121.762 149.231 119.510 151.490 L 87.510 183.490 C 82.816 188.184 82.816 195.796 87.510 200.490 C 92.204 205.184 99.816 205.184 104.510 200.490 L 116.000 189.000 L 116.000 232.000 C 116.000 238.627 121.373 244.000 128.000 244.000 C 134.627 244.000 140.000 238.627 140.000 232.000 L 140.000 189.000 L 151.510 200.520 C 156.204 205.214 163.816 205.214 168.510 200.520 C 173.204 195.826 173.204 188.214 168.510 183.520 ZM 232.000 116.000 L 189.000 116.000 L 200.520 104.490 C 205.214 99.796 205.214 92.184 200.520 87.490 C 195.826 82.796 188.214 82.796 183.520 87.490 L 151.520 119.490 C 149.261 121.742 147.991 124.800 147.991 127.990 C 147.991 131.180 149.261 134.238 151.520 136.490 L 183.520 168.490 C 188.214 173.184 195.826 173.184 200.520 168.490 C 205.214 163.796 205.214 156.184 200.520 151.490 L 189.000 140.000 L 232.000 140.000 C 238.627 140.000 244.000 134.627 244.000 128.000 C 244.000 121.373 238.627 116.000 232.000 116.000 ZM 104.490 119.510 L 72.490 87.510 C 67.796 82.816 60.184 82.816 55.490 87.510 C 50.796 92.204 50.796 99.816 55.490 104.510 L 67.000 116.000 L 24.000 116.000 C 17.373 116.000 12.000 121.373 12.000 128.000 C 12.000 134.627 17.373 140.000 24.000 140.000 L 67.000 140.000 L 55.510 151.510 C 50.816 156.204 50.816 163.816 55.510 168.510 C 60.204 173.204 67.816 173.204 72.510 168.510 L 104.510 136.510 C 106.767 134.256 108.033 131.196 108.029 128.006 C 108.026 124.816 106.752 121.759 104.490 119.510 Z"),
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
        return _arrowsInCardinal!!
    }

private var _arrowsInCardinal: ImageVector? = null
