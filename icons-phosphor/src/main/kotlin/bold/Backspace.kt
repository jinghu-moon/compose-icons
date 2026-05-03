package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Backspace: ImageVector
    get() {
        if (_backspace != null) return _backspace!!
        _backspace = phosphorBoldIcon(
            name = "Backspace",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 36.000 L 68.530 36.000 C 61.509 36.018 55.007 39.699 51.380 45.710 L 5.710 121.830 C 3.433 125.628 3.433 130.372 5.710 134.170 L 51.380 210.290 C 55.007 216.301 61.509 219.982 68.530 220.000 L 216.000 220.000 C 227.046 220.000 236.000 211.046 236.000 200.000 L 236.000 56.000 C 236.000 44.954 227.046 36.000 216.000 36.000 ZM 212.000 196.000 L 70.800 196.000 L 30.000 128.000 L 70.800 60.000 L 212.000 60.000 ZM 103.510 143.510 L 119.000 128.000 L 103.480 112.490 C 98.786 107.796 98.786 100.184 103.480 95.490 C 108.174 90.796 115.786 90.796 120.480 95.490 L 136.000 111.000 L 151.510 95.480 C 156.204 90.786 163.816 90.786 168.510 95.480 C 173.204 100.174 173.204 107.786 168.510 112.480 L 153.000 128.000 L 168.520 143.510 C 173.214 148.204 173.214 155.816 168.520 160.510 C 163.826 165.204 156.214 165.204 151.520 160.510 L 136.000 145.000 L 120.490 160.520 C 115.796 165.214 108.184 165.214 103.490 160.520 C 98.796 155.826 98.796 148.214 103.490 143.520 Z"),
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
        return _backspace!!
    }

private var _backspace: ImageVector? = null
