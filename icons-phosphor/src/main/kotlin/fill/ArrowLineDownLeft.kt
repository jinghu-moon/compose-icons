package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowLineDownLeft: ImageVector
    get() {
        if (_arrowLineDownLeft != null) return _arrowLineDownLeft!!
        _arrowLineDownLeft = phosphorFillIcon(
            name = "ArrowLineDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 189.660 90.340 C 191.162 91.841 192.006 93.877 192.006 96.000 C 192.006 98.123 191.162 100.159 189.660 101.660 L 131.310 160.000 L 173.660 202.340 C 175.951 204.628 176.636 208.071 175.397 211.062 C 174.158 214.053 171.238 216.003 168.000 216.000 L 72.000 216.000 C 67.582 216.000 64.000 212.418 64.000 208.000 L 64.000 112.000 C 63.997 108.762 65.947 105.842 68.938 104.603 C 71.929 103.364 75.372 104.049 77.660 106.340 L 120.000 148.690 L 178.340 90.340 C 179.841 88.838 181.877 87.994 184.000 87.994 C 186.123 87.994 188.159 88.838 189.660 90.340 ZM 224.000 40.000 L 48.000 40.000 C 43.582 40.000 40.000 43.582 40.000 48.000 C 40.000 52.418 43.582 56.000 48.000 56.000 L 224.000 56.000 C 228.418 56.000 232.000 52.418 232.000 48.000 C 232.000 43.582 228.418 40.000 224.000 40.000 Z"),
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
        return _arrowLineDownLeft!!
    }

private var _arrowLineDownLeft: ImageVector? = null
