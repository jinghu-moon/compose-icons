package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowLineUpLeft: ImageVector
    get() {
        if (_arrowLineUpLeft != null) return _arrowLineUpLeft!!
        _arrowLineUpLeft = phosphorRegularIcon(
            name = "ArrowLineUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 208.000 C 232.000 212.418 228.418 216.000 224.000 216.000 L 48.000 216.000 C 43.582 216.000 40.000 212.418 40.000 208.000 C 40.000 203.582 43.582 200.000 48.000 200.000 L 224.000 200.000 C 228.418 200.000 232.000 203.582 232.000 208.000 ZM 72.000 152.000 C 76.418 152.000 80.000 148.418 80.000 144.000 L 80.000 67.310 L 178.340 165.660 C 181.466 168.786 186.534 168.786 189.660 165.660 C 192.786 162.534 192.786 157.466 189.660 154.340 L 91.310 56.000 L 168.000 56.000 C 172.418 56.000 176.000 52.418 176.000 48.000 C 176.000 43.582 172.418 40.000 168.000 40.000 L 72.000 40.000 C 67.582 40.000 64.000 43.582 64.000 48.000 L 64.000 144.000 C 64.000 148.418 67.582 152.000 72.000 152.000 Z"),
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
        return _arrowLineUpLeft!!
    }

private var _arrowLineUpLeft: ImageVector? = null
