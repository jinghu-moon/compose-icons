package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Flashlight: ImageVector
    get() {
        if (_flashlight != null) return _flashlight!!
        _flashlight = phosphorThinIcon(
            name = "Flashlight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 20h-112C65.373 20 60 25.373 60 32v45.33c.004 2.596 .845 5.121 2.4 7.2l20.8 27.74c.519 .692 .8 1.535 .8 2.4v109.33c0 6.627 5.373 12 12 12h64c6.627 0 12-5.373 12-12v-109.33c0-.865 .281-1.708 .8-2.4L193.6 84.53c1.555-2.079 2.396-4.604 2.4-7.2v-45.33c0-6.627-5.373-12-12-12ZM72 28h112c2.209 0 4 1.791 4 4v28h-120v-28c0-2.209 1.791-4 4-4ZM187.2 79.73l-20.8 27.74c-1.555 2.079-2.396 4.604-2.4 7.2v109.33c0 2.209-1.791 4-4 4h-64c-2.209 0-4-1.791-4-4v-109.33c-.004-2.596-.845-5.121-2.4-7.2L68.8 79.73C68.281 79.038 68 78.195 68 77.33v-9.33h120v9.33c0 .865-.281 1.708-.8 2.4ZM132 120v32c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-32c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4Z"),
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
        return _flashlight!!
    }

private var _flashlight: ImageVector? = null
