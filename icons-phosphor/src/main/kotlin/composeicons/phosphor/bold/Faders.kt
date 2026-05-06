package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Faders: ImageVector
    get() {
        if (_faders != null) return _faders!!
        _faders = phosphorBoldIcon(
            name = "Faders",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M140 124v92c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-92c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM200 192c-6.627 0-12 5.373-12 12v12c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-12c0-6.627-5.373-12-12-12ZM224 152h-12v-112c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v112h-12c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h48c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM56 160c-6.627 0-12 5.373-12 12v44c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-44c0-6.627-5.373-12-12-12ZM80 120h-12v-80C68 33.373 62.627 28 56 28 49.373 28 44 33.373 44 40v80h-12c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h48c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM152 72h-12v-32c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v32h-12C97.373 72 92 77.373 92 84c0 6.627 5.373 12 12 12h48c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12Z"),
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
        return _faders!!
    }

private var _faders: ImageVector? = null
