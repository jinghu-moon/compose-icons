package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowsHorizontal: ImageVector
    get() {
        if (_arrowsHorizontal != null) return _arrowsHorizontal!!
        _arrowsHorizontal = phosphorBoldIcon(
            name = "ArrowsHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.490 136.490 L 208.490 168.490 C 203.796 173.184 196.184 173.184 191.490 168.490 C 186.796 163.796 186.796 156.184 191.490 151.490 L 203.000 140.000 L 53.000 140.000 L 64.520 151.510 C 69.214 156.204 69.214 163.816 64.520 168.510 C 59.826 173.204 52.214 173.204 47.520 168.510 L 15.520 136.510 C 13.261 134.258 11.991 131.200 11.991 128.010 C 11.991 124.820 13.261 121.762 15.520 119.510 L 47.520 87.510 C 52.214 82.816 59.826 82.816 64.520 87.510 C 69.214 92.204 69.214 99.816 64.520 104.510 L 53.000 116.000 L 203.000 116.000 L 191.480 104.490 C 186.786 99.796 186.786 92.184 191.480 87.490 C 196.174 82.796 203.786 82.796 208.480 87.490 L 240.480 119.490 C 242.741 121.740 244.013 124.798 244.014 127.988 C 244.016 131.178 242.748 134.237 240.490 136.490 Z"),
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
        return _arrowsHorizontal!!
    }

private var _arrowsHorizontal: ImageVector? = null
