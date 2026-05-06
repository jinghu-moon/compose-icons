package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SpeakerSimpleSlash: ImageVector
    get() {
        if (_speakerSimpleSlash != null) return _speakerSimpleSlash!!
        _speakerSimpleSlash = phosphorBoldIcon(
            name = "SpeakerSimpleSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 88v80c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-80c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM224.88 207.93c2.945 3.163 3.961 7.665 2.661 11.786-1.3 4.121-4.716 7.225-8.942 8.126-4.227 .901-8.611-.54-11.479-3.773L172 185.44v38.56c-0 4.584-2.611 8.767-6.729 10.78-4.118 2.013-9.023 1.505-12.641-1.31L83.88 180h-43.88C28.954 180 20 171.046 20 160v-64C20 84.954 28.954 76 40 76h32.51L47.12 48.07C42.759 43.154 43.163 35.645 48.026 31.226c4.863-4.42 12.376-4.106 16.854 .704ZM148 159 94.33 100h-50.33v56h44c2.67 0 5.263 .89 7.37 2.53L148 199.46ZM133.85 67.5 148 56.5v38.4c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-62.9c-0-4.584-2.611-8.767-6.729-10.78-4.118-2.013-9.023-1.505-12.641 1.31L119.12 48.6c-3.496 2.593-5.315 6.876-4.752 11.192 .563 4.316 3.42 7.989 7.464 9.598 4.045 1.609 8.643 .901 12.017-1.85ZM200 150.94c6.627 0 12-5.373 12-12v-34.94c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v34.94c0 6.627 5.373 12 12 12Z"),
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
        return _speakerSimpleSlash!!
    }

private var _speakerSimpleSlash: ImageVector? = null
