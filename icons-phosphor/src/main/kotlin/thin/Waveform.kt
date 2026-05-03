package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Waveform: ImageVector
    get() {
        if (_waveform != null) return _waveform!!
        _waveform = phosphorThinIcon(
            name = "Waveform",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 52.000 96.000 L 52.000 160.000 C 52.000 162.209 50.209 164.000 48.000 164.000 C 45.791 164.000 44.000 162.209 44.000 160.000 L 44.000 96.000 C 44.000 93.791 45.791 92.000 48.000 92.000 C 50.209 92.000 52.000 93.791 52.000 96.000 ZM 88.000 28.000 C 85.791 28.000 84.000 29.791 84.000 32.000 L 84.000 224.000 C 84.000 226.209 85.791 228.000 88.000 228.000 C 90.209 228.000 92.000 226.209 92.000 224.000 L 92.000 32.000 C 92.000 29.791 90.209 28.000 88.000 28.000 ZM 128.000 60.000 C 125.791 60.000 124.000 61.791 124.000 64.000 L 124.000 192.000 C 124.000 194.209 125.791 196.000 128.000 196.000 C 130.209 196.000 132.000 194.209 132.000 192.000 L 132.000 64.000 C 132.000 61.791 130.209 60.000 128.000 60.000 ZM 168.000 92.000 C 165.791 92.000 164.000 93.791 164.000 96.000 L 164.000 160.000 C 164.000 162.209 165.791 164.000 168.000 164.000 C 170.209 164.000 172.000 162.209 172.000 160.000 L 172.000 96.000 C 172.000 93.791 170.209 92.000 168.000 92.000 ZM 208.000 76.000 C 205.791 76.000 204.000 77.791 204.000 80.000 L 204.000 176.000 C 204.000 178.209 205.791 180.000 208.000 180.000 C 210.209 180.000 212.000 178.209 212.000 176.000 L 212.000 80.000 C 212.000 77.791 210.209 76.000 208.000 76.000 Z"),
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
