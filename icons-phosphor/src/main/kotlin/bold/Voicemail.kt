package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Voicemail: ImageVector
    get() {
        if (_voicemail != null) return _voicemail!!
        _voicemail = phosphorBoldIcon(
            name = "Voicemail",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 196.000 68.000 C 173.274 68.000 152.498 80.840 142.334 101.167 C 132.171 121.494 134.364 145.819 148.000 164.000 L 108.000 164.000 C 124.696 141.739 123.895 110.919 106.065 89.555 C 88.235 68.191 58.056 61.890 33.167 74.334 C 8.278 86.779 -4.788 114.703 1.605 141.785 C 7.998 168.867 32.173 188.000 60.000 188.000 L 196.000 188.000 C 229.137 188.000 256.000 161.137 256.000 128.000 C 256.000 94.863 229.137 68.000 196.000 68.000 ZM 24.000 128.000 C 24.000 108.118 40.118 92.000 60.000 92.000 C 79.882 92.000 96.000 108.118 96.000 128.000 C 96.000 147.882 79.882 164.000 60.000 164.000 C 40.118 164.000 24.000 147.882 24.000 128.000 ZM 196.000 164.000 C 176.118 164.000 160.000 147.882 160.000 128.000 C 160.000 108.118 176.118 92.000 196.000 92.000 C 215.882 92.000 232.000 108.118 232.000 128.000 C 232.000 147.882 215.882 164.000 196.000 164.000 Z"),
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
        return _voicemail!!
    }

private var _voicemail: ImageVector? = null
