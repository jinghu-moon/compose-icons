package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowLineDownLeft: ImageVector
    get() {
        if (_arrowLineDownLeft != null) return _arrowLineDownLeft!!
        _arrowLineDownLeft = phosphorRegularIcon(
            name = "ArrowLineDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 48.000 C 232.000 52.418 228.418 56.000 224.000 56.000 L 48.000 56.000 C 43.582 56.000 40.000 52.418 40.000 48.000 C 40.000 43.582 43.582 40.000 48.000 40.000 L 224.000 40.000 C 228.418 40.000 232.000 43.582 232.000 48.000 ZM 178.340 90.340 L 80.000 188.690 L 80.000 112.000 C 80.000 107.582 76.418 104.000 72.000 104.000 C 67.582 104.000 64.000 107.582 64.000 112.000 L 64.000 208.000 C 64.000 212.418 67.582 216.000 72.000 216.000 L 168.000 216.000 C 172.418 216.000 176.000 212.418 176.000 208.000 C 176.000 203.582 172.418 200.000 168.000 200.000 L 91.310 200.000 L 189.660 101.660 C 192.786 98.534 192.786 93.466 189.660 90.340 C 186.534 87.214 181.466 87.214 178.340 90.340 Z"),
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
