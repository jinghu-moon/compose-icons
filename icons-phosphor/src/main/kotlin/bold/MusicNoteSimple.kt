package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MusicNoteSimple: ImageVector
    get() {
        if (_musicNoteSimple != null) return _musicNoteSimple!!
        _musicNoteSimple = phosphorBoldIcon(
            name = "MusicNoteSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 211.450 52.510 L 131.450 28.510 C 127.817 27.420 123.883 28.111 120.839 30.374 C 117.795 32.638 116.001 36.207 116.000 40.000 L 116.000 140.220 C 95.981 127.428 69.839 129.829 52.486 146.055 C 35.133 162.280 30.982 188.202 42.402 209.034 C 53.822 229.866 77.908 240.310 100.920 234.407 C 123.932 228.505 140.017 207.757 140.000 184.000 L 140.000 56.130 L 204.550 75.490 C 210.901 77.395 217.595 73.791 219.500 67.440 C 221.405 61.089 217.801 54.395 211.450 52.490 ZM 88.000 212.000 C 72.536 212.000 60.000 199.464 60.000 184.000 C 60.000 168.536 72.536 156.000 88.000 156.000 C 103.464 156.000 116.000 168.536 116.000 184.000 C 116.000 199.464 103.464 212.000 88.000 212.000 Z"),
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
        return _musicNoteSimple!!
    }

private var _musicNoteSimple: ImageVector? = null
