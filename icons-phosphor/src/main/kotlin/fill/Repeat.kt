package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Repeat: ImageVector
    get() {
        if (_repeat != null) return _repeat!!
        _repeat = phosphorFillIcon(
            name = "Repeat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 24.000 128.000 C 24.044 88.254 56.254 56.044 96.000 56.000 L 192.000 56.000 L 192.000 40.000 C 191.997 36.762 193.947 33.842 196.938 32.603 C 199.929 31.364 203.372 32.049 205.660 34.340 L 229.660 58.340 C 231.162 59.841 232.006 61.877 232.006 64.000 C 232.006 66.123 231.162 68.159 229.660 69.660 L 205.660 93.660 C 203.372 95.951 199.929 96.636 196.938 95.397 C 193.947 94.158 191.997 91.238 192.000 88.000 L 192.000 72.000 L 96.000 72.000 C 65.086 72.033 40.033 97.086 40.000 128.000 C 40.000 132.418 36.418 136.000 32.000 136.000 C 27.582 136.000 24.000 132.418 24.000 128.000 ZM 224.000 120.000 C 219.582 120.000 216.000 123.582 216.000 128.000 C 215.967 158.914 190.914 183.967 160.000 184.000 L 64.000 184.000 L 64.000 168.000 C 64.003 164.762 62.053 161.842 59.062 160.603 C 56.071 159.364 52.628 160.049 50.340 162.340 L 26.340 186.340 C 24.838 187.841 23.994 189.877 23.994 192.000 C 23.994 194.123 24.838 196.159 26.340 197.660 L 50.340 221.660 C 52.628 223.951 56.071 224.636 59.062 223.397 C 62.053 222.158 64.003 219.238 64.000 216.000 L 64.000 200.000 L 160.000 200.000 C 199.746 199.956 231.956 167.746 232.000 128.000 C 232.000 123.582 228.418 120.000 224.000 120.000 Z"),
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
        return _repeat!!
    }

private var _repeat: ImageVector? = null
