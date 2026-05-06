package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SupersetOf: ImageVector
    get() {
        if (_supersetOf != null) return _supersetOf!!
        _supersetOf = phosphorBoldIcon(
            name = "SupersetOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220 200c0 6.627-5.373 12-12 12h-152c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h152c6.627 0 12 5.373 12 12ZM152 148h-96c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h96c37.555 0 68-30.445 68-68C220 66.445 189.555 36 152 36h-96C49.373 36 44 41.373 44 48c0 6.627 5.373 12 12 12h96c24.301 0 44 19.699 44 44 0 24.301-19.699 44-44 44Z"),
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
        return _supersetOf!!
    }

private var _supersetOf: ImageVector? = null
