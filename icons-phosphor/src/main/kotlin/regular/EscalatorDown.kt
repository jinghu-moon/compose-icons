package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.EscalatorDown: ImageVector
    get() {
        if (_escalatorDown != null) return _escalatorDown!!
        _escalatorDown = phosphorRegularIcon(
            name = "EscalatorDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 170.340 85.660 C 167.214 82.534 167.214 77.466 170.340 74.340 C 173.466 71.214 178.534 71.214 181.660 74.340 L 192.000 84.690 L 192.000 48.000 C 192.000 43.582 195.582 40.000 200.000 40.000 C 204.418 40.000 208.000 43.582 208.000 48.000 L 208.000 84.690 L 218.340 74.340 C 221.466 71.214 226.534 71.214 229.660 74.340 C 232.786 77.466 232.786 82.534 229.660 85.660 L 205.660 109.660 C 204.159 111.162 202.123 112.006 200.000 112.006 C 197.877 112.006 195.841 111.162 194.340 109.660 ZM 240.000 160.000 L 240.000 200.000 C 240.000 208.837 232.837 216.000 224.000 216.000 L 168.000 216.000 C 165.767 216.001 163.635 215.070 162.120 213.430 L 68.500 112.000 L 32.000 112.000 C 23.163 112.000 16.000 104.837 16.000 96.000 L 16.000 56.000 C 16.000 47.163 23.163 40.000 32.000 40.000 L 88.000 40.000 C 90.233 39.999 92.365 40.930 93.880 42.570 L 187.500 144.000 L 224.000 144.000 C 232.837 144.000 240.000 151.163 240.000 160.000 ZM 224.000 160.000 L 184.000 160.000 C 181.767 160.001 179.635 159.070 178.120 157.430 L 84.500 56.000 L 32.000 56.000 L 32.000 96.000 L 72.000 96.000 C 74.233 95.999 76.365 96.930 77.880 98.570 L 171.500 200.000 L 224.000 200.000 Z"),
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
        return _escalatorDown!!
    }

private var _escalatorDown: ImageVector? = null
