package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.EscalatorUp: ImageVector
    get() {
        if (_escalatorUp != null) return _escalatorUp!!
        _escalatorUp = phosphorRegularIcon(
            name = "EscalatorUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 40.000 L 168.000 40.000 C 165.767 39.999 163.635 40.930 162.120 42.570 L 68.500 144.000 L 32.000 144.000 C 23.163 144.000 16.000 151.163 16.000 160.000 L 16.000 200.000 C 16.000 208.837 23.163 216.000 32.000 216.000 L 88.000 216.000 C 90.233 216.001 92.365 215.070 93.880 213.430 L 187.500 112.000 L 224.000 112.000 C 232.837 112.000 240.000 104.837 240.000 96.000 L 240.000 56.000 C 240.000 47.163 232.837 40.000 224.000 40.000 ZM 224.000 96.000 L 184.000 96.000 C 181.767 95.999 179.635 96.930 178.120 98.570 L 84.500 200.000 L 32.000 200.000 L 32.000 160.000 L 72.000 160.000 C 74.233 160.001 76.365 159.070 77.880 157.430 L 171.500 56.000 L 224.000 56.000 ZM 229.660 170.340 C 232.786 173.466 232.786 178.534 229.660 181.660 C 226.534 184.786 221.466 184.786 218.340 181.660 L 208.000 171.310 L 208.000 208.000 C 208.000 212.418 204.418 216.000 200.000 216.000 C 195.582 216.000 192.000 212.418 192.000 208.000 L 192.000 171.310 L 181.660 181.660 C 178.534 184.786 173.466 184.786 170.340 181.660 C 167.214 178.534 167.214 173.466 170.340 170.340 L 194.340 146.340 C 195.841 144.838 197.877 143.994 200.000 143.994 C 202.123 143.994 204.159 144.838 205.660 146.340 Z"),
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
        return _escalatorUp!!
    }

private var _escalatorUp: ImageVector? = null
