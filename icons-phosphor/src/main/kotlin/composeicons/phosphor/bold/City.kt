package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.City: ImageVector
    get() {
        if (_city != null) return _city!!
        _city = phosphorBoldIcon(
            name = "City",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 204h-4v-116c0-6.627-5.373-12-12-12h-72c-6.627 0-12 5.373-12 12v36h-24v-84c0-6.627-5.373-12-12-12h-72C25.373 28 20 33.373 20 40v164h-4C9.373 204 4 209.373 4 216c0 6.627 5.373 12 12 12h224c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM164 100h48v104h-48ZM140 148v56h-24v-56ZM44 52h48v152h-48ZM80 76v8c0 6.627-5.373 12-12 12C61.373 96 56 90.627 56 84v-8C56 69.373 61.373 64 68 64c6.627 0 12 5.373 12 12ZM80 124v8c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-8c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM80 172v8c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-8c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM176 180v-8c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v8c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12ZM176 132v-8c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v8c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12Z"),
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
        return _city!!
    }

private var _city: ImageVector? = null
