package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Waveform: ImageVector
    get() {
        if (_waveform != null) return _waveform!!
        _waveform = phosphorDuotoneIcon(
            name = "Waveform",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 208.000 96.000 L 208.000 160.000 L 48.000 160.000 L 48.000 96.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 56.000 96.000 L 56.000 160.000 C 56.000 164.418 52.418 168.000 48.000 168.000 C 43.582 168.000 40.000 164.418 40.000 160.000 L 40.000 96.000 C 40.000 91.582 43.582 88.000 48.000 88.000 C 52.418 88.000 56.000 91.582 56.000 96.000 ZM 88.000 24.000 C 83.582 24.000 80.000 27.582 80.000 32.000 L 80.000 224.000 C 80.000 228.418 83.582 232.000 88.000 232.000 C 92.418 232.000 96.000 228.418 96.000 224.000 L 96.000 32.000 C 96.000 27.582 92.418 24.000 88.000 24.000 ZM 128.000 56.000 C 123.582 56.000 120.000 59.582 120.000 64.000 L 120.000 192.000 C 120.000 196.418 123.582 200.000 128.000 200.000 C 132.418 200.000 136.000 196.418 136.000 192.000 L 136.000 64.000 C 136.000 59.582 132.418 56.000 128.000 56.000 ZM 168.000 88.000 C 163.582 88.000 160.000 91.582 160.000 96.000 L 160.000 160.000 C 160.000 164.418 163.582 168.000 168.000 168.000 C 172.418 168.000 176.000 164.418 176.000 160.000 L 176.000 96.000 C 176.000 91.582 172.418 88.000 168.000 88.000 ZM 208.000 72.000 C 203.582 72.000 200.000 75.582 200.000 80.000 L 200.000 176.000 C 200.000 180.418 203.582 184.000 208.000 184.000 C 212.418 184.000 216.000 180.418 216.000 176.000 L 216.000 80.000 C 216.000 75.582 212.418 72.000 208.000 72.000 Z"),
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
        return _waveform!!
    }

private var _waveform: ImageVector? = null
