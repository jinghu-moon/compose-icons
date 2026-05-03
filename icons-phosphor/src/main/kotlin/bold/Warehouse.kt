package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Warehouse: ImageVector
    get() {
        if (_warehouse != null) return _warehouse!!
        _warehouse = phosphorBoldIcon(
            name = "Warehouse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 180.000 L 236.000 180.000 L 236.000 61.130 L 242.510 59.740 C 246.764 58.907 250.238 55.845 251.599 51.730 C 252.959 47.614 251.994 43.084 249.074 39.881 C 246.155 36.677 241.734 35.296 237.510 36.270 L 13.510 84.270 C 7.521 85.562 3.467 91.159 4.106 97.252 C 4.746 103.346 9.873 107.979 16.000 108.000 C 16.850 108.002 17.698 107.915 18.530 107.740 L 20.010 107.420 L 20.010 180.000 L 16.000 180.000 C 9.373 180.000 4.000 185.373 4.000 192.000 C 4.000 198.627 9.373 204.000 16.000 204.000 L 240.000 204.000 C 246.627 204.000 252.000 198.627 252.000 192.000 C 252.000 185.373 246.627 180.000 240.000 180.000 ZM 44.000 102.270 L 212.000 66.270 L 212.000 180.000 L 192.000 180.000 L 192.000 120.000 C 192.000 113.373 186.627 108.000 180.000 108.000 L 76.000 108.000 C 69.373 108.000 64.000 113.373 64.000 120.000 L 64.000 180.000 L 44.000 180.000 ZM 168.000 144.000 L 88.000 144.000 L 88.000 132.000 L 168.000 132.000 ZM 88.000 168.000 L 168.000 168.000 L 168.000 180.000 L 88.000 180.000 Z"),
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
        return _warehouse!!
    }

private var _warehouse: ImageVector? = null
