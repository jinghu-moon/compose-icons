package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowsMerge: ImageVector
    get() {
        if (_arrowsMerge != null) return _arrowsMerge!!
        _arrowsMerge = phosphorBoldIcon(
            name = "ArrowsMerge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 196.000 40.000 L 196.000 104.000 C 196.003 107.184 194.740 110.238 192.490 112.490 L 140.000 165.000 L 140.000 203.000 L 151.510 191.480 C 156.204 186.786 163.816 186.786 168.510 191.480 C 173.204 196.174 173.204 203.786 168.510 208.480 L 136.510 240.480 C 134.258 242.739 131.200 244.009 128.010 244.009 C 124.820 244.009 121.762 242.739 119.510 240.480 L 87.510 208.480 C 82.816 203.786 82.816 196.174 87.510 191.480 C 92.204 186.786 99.816 186.786 104.510 191.480 L 116.000 203.000 L 116.000 165.000 L 63.510 112.490 C 61.260 110.238 59.997 107.184 60.000 104.000 L 60.000 40.000 C 60.000 33.373 65.373 28.000 72.000 28.000 C 78.627 28.000 84.000 33.373 84.000 40.000 L 84.000 99.000 L 128.000 143.000 L 172.000 99.000 L 172.000 40.000 C 172.000 33.373 177.373 28.000 184.000 28.000 C 190.627 28.000 196.000 33.373 196.000 40.000 Z"),
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
        return _arrowsMerge!!
    }

private var _arrowsMerge: ImageVector? = null
