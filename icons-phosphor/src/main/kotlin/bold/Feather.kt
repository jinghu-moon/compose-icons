package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Feather: ImageVector
    get() {
        if (_feather != null) return _feather!!
        _feather = phosphorBoldIcon(
            name = "Feather",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.110 31.920 C 197.575 5.388 154.563 5.366 128.000 31.870 L 57.880 101.170 C 54.113 104.911 51.996 110.001 52.000 115.310 L 52.000 187.000 L 23.520 215.510 C 18.826 220.204 18.826 227.816 23.520 232.510 C 28.214 237.204 35.826 237.204 40.520 232.510 L 69.000 204.000 L 140.700 204.000 C 146.010 204.016 151.106 201.906 154.850 198.140 L 154.900 198.140 L 224.110 128.140 C 250.668 101.565 250.668 58.495 224.110 31.920 ZM 144.900 48.920 C 161.481 32.219 188.268 31.521 205.695 47.337 C 223.122 63.153 225.019 89.882 210.000 108.000 L 165.000 108.000 L 192.520 80.490 C 197.214 75.796 197.214 68.184 192.520 63.490 C 187.826 58.796 180.214 58.796 175.520 63.490 L 124.000 115.000 L 124.000 69.540 ZM 76.000 117.000 L 100.000 93.280 L 100.000 139.000 L 76.000 163.000 ZM 139.000 180.000 L 93.000 180.000 L 141.000 132.000 L 186.500 132.000 Z"),
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
        return _feather!!
    }

private var _feather: ImageVector? = null
