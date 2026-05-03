package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.EscalatorUp: ImageVector
    get() {
        if (_escalatorUp != null) return _escalatorUp!!
        _escalatorUp = phosphorFillIcon(
            name = "EscalatorUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 240.000 56.000 L 240.000 96.000 C 240.000 104.837 232.837 112.000 224.000 112.000 L 187.500 112.000 L 93.880 213.430 C 92.365 215.070 90.233 216.001 88.000 216.000 L 32.000 216.000 C 23.163 216.000 16.000 208.837 16.000 200.000 L 16.000 160.000 C 16.000 151.163 23.163 144.000 32.000 144.000 L 68.500 144.000 L 162.120 42.570 C 163.635 40.930 165.767 39.999 168.000 40.000 L 224.000 40.000 C 232.837 40.000 240.000 47.163 240.000 56.000 ZM 205.660 146.340 C 204.159 144.838 202.123 143.994 200.000 143.994 C 197.877 143.994 195.841 144.838 194.340 146.340 L 170.340 170.340 C 167.214 173.466 167.214 178.534 170.340 181.660 C 173.466 184.786 178.534 184.786 181.660 181.660 L 192.000 171.310 L 192.000 208.000 C 192.000 212.418 195.582 216.000 200.000 216.000 C 204.418 216.000 208.000 212.418 208.000 208.000 L 208.000 171.310 L 218.340 181.660 C 221.466 184.786 226.534 184.786 229.660 181.660 C 232.786 178.534 232.786 173.466 229.660 170.340 Z"),
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
