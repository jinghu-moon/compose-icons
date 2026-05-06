package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Slideshow: ImageVector
    get() {
        if (_slideshow != null) return _slideshow!!
        _slideshow = phosphorBoldIcon(
            name = "Slideshow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 44h-112C60.954 44 52 52.954 52 64v128c0 11.046 8.954 20 20 20h112c11.046 0 20-8.954 20-20v-128C204 52.954 195.046 44 184 44ZM180 188h-104v-120h104ZM244 56v144c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-144c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM36 56v144c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-144C12 49.373 17.373 44 24 44c6.627 0 12 5.373 12 12Z"),
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
        return _slideshow!!
    }

private var _slideshow: ImageVector? = null
