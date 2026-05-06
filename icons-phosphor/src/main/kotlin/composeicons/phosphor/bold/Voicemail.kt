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
                pathData = parseSvgPathData("M196 68c-22.726 0-43.502 12.84-53.666 33.167C132.171 121.494 134.364 145.819 148 164h-40c16.696-22.261 15.895-53.081-1.935-74.445C88.235 68.191 58.056 61.89 33.167 74.334 8.278 86.779-4.788 114.703 1.605 141.785 7.998 168.867 32.173 188 60 188h136c33.137 0 60-26.863 60-60C256 94.863 229.137 68 196 68ZM24 128C24 108.118 40.118 92 60 92c19.882 0 36 16.118 36 36 0 19.882-16.118 36-36 36C40.118 164 24 147.882 24 128ZM196 164c-19.882 0-36-16.118-36-36 0-19.882 16.118-36 36-36 19.882 0 36 16.118 36 36 0 19.882-16.118 36-36 36Z"),
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
