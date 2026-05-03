package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.EscalatorDown: ImageVector
    get() {
        if (_escalatorDown != null) return _escalatorDown!!
        _escalatorDown = phosphorFillIcon(
            name = "EscalatorDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 170.340 85.660 C 167.214 82.534 167.214 77.466 170.340 74.340 C 173.466 71.214 178.534 71.214 181.660 74.340 L 192.000 84.690 L 192.000 48.000 C 192.000 43.582 195.582 40.000 200.000 40.000 C 204.418 40.000 208.000 43.582 208.000 48.000 L 208.000 84.690 L 218.340 74.340 C 221.466 71.214 226.534 71.214 229.660 74.340 C 232.786 77.466 232.786 82.534 229.660 85.660 L 205.660 109.660 C 204.159 111.162 202.123 112.006 200.000 112.006 C 197.877 112.006 195.841 111.162 194.340 109.660 ZM 224.000 144.000 L 187.500 144.000 L 93.880 42.570 C 92.365 40.930 90.233 39.999 88.000 40.000 L 32.000 40.000 C 23.163 40.000 16.000 47.163 16.000 56.000 L 16.000 96.000 C 16.000 104.837 23.163 112.000 32.000 112.000 L 68.500 112.000 L 162.120 213.430 C 163.635 215.070 165.767 216.001 168.000 216.000 L 224.000 216.000 C 232.837 216.000 240.000 208.837 240.000 200.000 L 240.000 160.000 C 240.000 151.163 232.837 144.000 224.000 144.000 Z"),
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
