package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Waveform: ImageVector
    get() {
        if (_waveform != null) return _waveform!!
        _waveform = phosphorFillIcon(
            name = "Waveform",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 72.000 152.000 C 72.000 156.418 68.418 160.000 64.000 160.000 C 59.582 160.000 56.000 156.418 56.000 152.000 L 56.000 104.000 C 56.000 99.582 59.582 96.000 64.000 96.000 C 68.418 96.000 72.000 99.582 72.000 104.000 ZM 104.000 184.000 C 104.000 188.418 100.418 192.000 96.000 192.000 C 91.582 192.000 88.000 188.418 88.000 184.000 L 88.000 72.000 C 88.000 67.582 91.582 64.000 96.000 64.000 C 100.418 64.000 104.000 67.582 104.000 72.000 ZM 136.000 168.000 C 136.000 172.418 132.418 176.000 128.000 176.000 C 123.582 176.000 120.000 172.418 120.000 168.000 L 120.000 88.000 C 120.000 83.582 123.582 80.000 128.000 80.000 C 132.418 80.000 136.000 83.582 136.000 88.000 ZM 168.000 152.000 C 168.000 156.418 164.418 160.000 160.000 160.000 C 155.582 160.000 152.000 156.418 152.000 152.000 L 152.000 104.000 C 152.000 99.582 155.582 96.000 160.000 96.000 C 164.418 96.000 168.000 99.582 168.000 104.000 ZM 200.000 160.000 C 200.000 164.418 196.418 168.000 192.000 168.000 C 187.582 168.000 184.000 164.418 184.000 160.000 L 184.000 96.000 C 184.000 91.582 187.582 88.000 192.000 88.000 C 196.418 88.000 200.000 91.582 200.000 96.000 Z"),
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
        return _waveform!!
    }

private var _waveform: ImageVector? = null
