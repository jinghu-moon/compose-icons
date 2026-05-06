package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Chalkboard: ImageVector
    get() {
        if (_chalkboard != null) return _chalkboard!!
        _chalkboard = phosphorBoldIcon(
            name = "Chalkboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 188h-4v-132C236 44.954 227.046 36 216 36h-176C28.954 36 20 44.954 20 56v132h-4C9.373 188 4 193.373 4 200c0 6.627 5.373 12 12 12h224c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM44 60h168v128h-16v-28c0-6.627-5.373-12-12-12h-64c-6.627 0-12 5.373-12 12v28h-24v-88h88v20c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-32c0-6.627-5.373-12-12-12h-112C65.373 76 60 81.373 60 88v100h-16ZM172 188h-40v-16h40Z"),
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
        return _chalkboard!!
    }

private var _chalkboard: ImageVector? = null
