package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TerminalWindow: ImageVector
    get() {
        if (_terminalWindow != null) return _terminalWindow!!
        _terminalWindow = phosphorFillIcon(
            name = "TerminalWindow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 125.000 134.250 L 85.000 166.250 C 81.548 169.011 76.511 168.452 73.750 165.000 C 70.989 161.548 71.548 156.511 75.000 153.750 L 107.190 128.000 L 75.000 102.250 C 71.548 99.489 70.989 94.452 73.750 91.000 C 76.511 87.548 81.548 86.989 85.000 89.750 L 125.000 121.750 C 126.900 123.268 128.006 125.568 128.006 128.000 C 128.006 130.432 126.900 132.732 125.000 134.250 ZM 176.000 168.000 L 136.000 168.000 C 131.582 168.000 128.000 164.418 128.000 160.000 C 128.000 155.582 131.582 152.000 136.000 152.000 L 176.000 152.000 C 180.418 152.000 184.000 155.582 184.000 160.000 C 184.000 164.418 180.418 168.000 176.000 168.000 Z"),
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
        return _terminalWindow!!
    }

private var _terminalWindow: ImageVector? = null
