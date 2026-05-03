package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowLineUpLeft: ImageVector
    get() {
        if (_arrowLineUpLeft != null) return _arrowLineUpLeft!!
        _arrowLineUpLeft = phosphorFillIcon(
            name = "ArrowLineUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 64.000 144.000 L 64.000 48.000 C 64.000 43.582 67.582 40.000 72.000 40.000 L 168.000 40.000 C 171.238 39.997 174.158 41.947 175.397 44.938 C 176.636 47.929 175.951 51.372 173.660 53.660 L 131.310 96.000 L 189.660 154.340 C 192.786 157.466 192.786 162.534 189.660 165.660 C 186.534 168.786 181.466 168.786 178.340 165.660 L 120.000 107.310 L 77.660 149.660 C 75.372 151.951 71.929 152.636 68.938 151.397 C 65.947 150.158 63.997 147.238 64.000 144.000 ZM 224.000 200.000 L 48.000 200.000 C 43.582 200.000 40.000 203.582 40.000 208.000 C 40.000 212.418 43.582 216.000 48.000 216.000 L 224.000 216.000 C 228.418 216.000 232.000 212.418 232.000 208.000 C 232.000 203.582 228.418 200.000 224.000 200.000 Z"),
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
        return _arrowLineUpLeft!!
    }

private var _arrowLineUpLeft: ImageVector? = null
