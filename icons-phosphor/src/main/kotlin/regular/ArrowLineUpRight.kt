package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowLineUpRight: ImageVector
    get() {
        if (_arrowLineUpRight != null) return _arrowLineUpRight!!
        _arrowLineUpRight = phosphorRegularIcon(
            name = "ArrowLineUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 216.000 C 224.000 220.418 220.418 224.000 216.000 224.000 L 40.000 224.000 C 35.582 224.000 32.000 220.418 32.000 216.000 C 32.000 211.582 35.582 208.000 40.000 208.000 L 216.000 208.000 C 220.418 208.000 224.000 211.582 224.000 216.000 ZM 80.000 176.000 C 82.122 176.002 84.158 175.160 85.660 173.660 L 184.000 75.310 L 184.000 152.000 C 184.000 156.418 187.582 160.000 192.000 160.000 C 196.418 160.000 200.000 156.418 200.000 152.000 L 200.000 56.000 C 200.000 51.582 196.418 48.000 192.000 48.000 L 96.000 48.000 C 91.582 48.000 88.000 51.582 88.000 56.000 C 88.000 60.418 91.582 64.000 96.000 64.000 L 172.690 64.000 L 74.340 162.340 C 72.049 164.628 71.364 168.071 72.603 171.062 C 73.842 174.053 76.762 176.003 80.000 176.000 Z"),
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
        return _arrowLineUpRight!!
    }

private var _arrowLineUpRight: ImageVector? = null
