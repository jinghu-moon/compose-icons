package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TerminalWindow: ImageVector
    get() {
        if (_terminalWindow != null) return _terminalWindow!!
        _terminalWindow = phosphorDuotoneIcon(
            name = "TerminalWindow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 224.000 56.000 L 224.000 200.000 C 224.000 204.418 220.418 208.000 216.000 208.000 L 40.000 208.000 C 35.582 208.000 32.000 204.418 32.000 200.000 L 32.000 56.000 C 32.000 51.582 35.582 48.000 40.000 48.000 L 216.000 48.000 C 220.418 48.000 224.000 51.582 224.000 56.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 128.000 128.000 C 128.002 130.431 126.898 132.731 125.000 134.250 L 85.000 166.250 C 81.548 169.011 76.511 168.452 73.750 165.000 C 70.989 161.548 71.548 156.511 75.000 153.750 L 107.190 128.000 L 75.000 102.250 C 71.548 99.489 70.989 94.452 73.750 91.000 C 76.511 87.548 81.548 86.989 85.000 89.750 L 125.000 121.750 C 126.898 123.269 128.002 125.569 128.000 128.000 ZM 176.000 152.000 L 136.000 152.000 C 131.582 152.000 128.000 155.582 128.000 160.000 C 128.000 164.418 131.582 168.000 136.000 168.000 L 176.000 168.000 C 180.418 168.000 184.000 164.418 184.000 160.000 C 184.000 155.582 180.418 152.000 176.000 152.000 ZM 232.000 56.000 L 232.000 200.000 C 232.000 208.837 224.837 216.000 216.000 216.000 L 40.000 216.000 C 31.163 216.000 24.000 208.837 24.000 200.000 L 24.000 56.000 C 24.000 47.163 31.163 40.000 40.000 40.000 L 216.000 40.000 C 224.837 40.000 232.000 47.163 232.000 56.000 ZM 216.000 200.000 L 216.000 56.000 L 40.000 56.000 L 40.000 200.000 L 216.000 200.000 Z"),
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
        return _terminalWindow!!
    }

private var _terminalWindow: ImageVector? = null
